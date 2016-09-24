package com.frame.test.ifspdl;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.frame.test.util.IfsPreDeal;

public class ContentTran {
	@IfsPreDeal(infname = "uselogin")
	public String UserAddLogin(String inputdata) throws JsonGenerationException, JsonMappingException, IOException
	{
		ObjectMapper objectMapper = new ObjectMapper();
		String retdata=null;
		HashMap<String,String> hmap = new HashMap<String,String>();
		String[] item = inputdata.split("\n");
		for(String a:item)
		{
			String[] tm = a.split("=");
			hmap.put(tm[0], tm[1]);
		}
		retdata = objectMapper.writeValueAsString(hmap);
		return retdata;
	}
	@IfsPreDeal(infname = "contentadd")
	public String UserAddContent(String inputdata) throws JsonGenerationException, JsonMappingException, IOException
	{
		ObjectMapper objectMapper = new ObjectMapper();
		String retdata=null;
		HashMap<String,String> hmap = new HashMap<String,String>();
		String[] item = inputdata.split("\n");
		for(String a:item)
		{
			String[] tm = a.split("=");
			hmap.put(tm[0], tm[1]);
		}
		retdata = objectMapper.writeValueAsString(hmap);
		return retdata;
	}
	@IfsPreDeal(infname = "userdel")
	public String UserDelData(String inputdata) throws JsonGenerationException, JsonMappingException, IOException
	{
		String retdata=null;
		JSONObject jsb = new JSONObject();
		String[] item = inputdata.split("=");
		if(item[1].split(",").length>1)
		{
			JSONArray jsay = new JSONArray();
			int[] a=null;
			a = stringTranint(inputdata,",");
			jsay.addAll(Arrays.asList(a));
			jsb.put("ids", jsay);
		}
		else
		{
			jsb.put("ids", Integer.parseInt(item[1]));
		}
		retdata = jsb.toJSONString();
		return retdata;
	}
	public static int[] stringTranint(String a,String split)
	{
		String[] str = a.split(split);
		int array[] = new int[str.length];  
		for(int i=0;i<str.length;i++){  
		    array[i]=Integer.parseInt(str[i]);  
	     }
		return array;
	}
}

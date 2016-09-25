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
	@IfsPreDeal(infname = "contentadd")
	public String UserAddLogin(String inputdata) throws JsonGenerationException, JsonMappingException, IOException
	{
		String[] cte  = {"视频","图片","文字","动画","直播","体育","视频","政治",""};
		String[] cls  = {"点播","教育","世界杯","迪士尼","国际"};
		HashMap<String,Integer> contenttype = new HashMap<String,Integer>();
		HashMap<String,Integer> columns = new HashMap<String,Integer>();
		for(int i=0;i<cte.length;i++)
			contenttype.put(cte[i], i);
		for(int j=0;j<cls.length;j++)
			contenttype.put(cls[j], j);
		ObjectMapper objectMapper = new ObjectMapper();
		String retdata=null;
		HashMap<String,Object> hmap = new HashMap<String,Object>();
		String[] item = inputdata.split("\n");
		for(String a:item)
		{
			String[] tm = a.split("=");
		   if(tm[0].equals("contenttype"))
		   {
			   hmap.put(tm[0], contenttype.get(tm[1]));
		   }
		   else
			   if(tm[0].equals("columns"))
			   {
				   hmap.put(tm[0], columns.get(tm[1]));
			   }
			   else
			      hmap.put(tm[0], tm[1]);
		}
		retdata = objectMapper.writeValueAsString(hmap);
		return retdata;
	}
	@IfsPreDeal(infname = "userlogin")
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
			a = stringTranint(item[1],",");
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

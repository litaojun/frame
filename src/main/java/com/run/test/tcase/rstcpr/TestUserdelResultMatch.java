package com.run.test.tcase.rstcpr;

import java.io.IOException;
import java.util.HashMap;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.run.test.tcase.infs.UserAddInfo;
import com.run.test.util.ResultCompare;

public class TestUserdelResultMatch
{
	private ObjectMapper objectMapper = new ObjectMapper();
	@ResultCompare(ifname = "userdel", cstype = 0,rule = {}, cls = Class.class)
	 public String matchparamUserdel0(String rspinf,UserAddInfo uaif,String yqrst) throws JsonGenerationException, JsonMappingException, IOException 
	 {
//		    System.out.println("matchparamfunsstt0");
//	    	System.out.println(String.format("name=%s,age=%s,nickname=%s", new String[]{uaif.getUsername(),uaif.getPassword(),uaif.getNickname()}));
	        HashMap<String,Object> hmp = new 	HashMap<String,Object>();
	        hmp.put("retcode", 1);
	        hmp.put("user", uaif);
	        hmp.put("function", "matchparamUserdel0");
	        String stra = objectMapper.writeValueAsString(hmp);
	        return stra ;
	 }
}

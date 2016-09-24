package com.run.test.tcase.infs;

import java.io.IOException;
import java.util.HashMap;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.run.test.tcase.data.input.ContentInfo;
import com.run.test.util.TestCase;

public class TestUserdelInterface {
	private ObjectMapper objectMapper = new ObjectMapper();
	 @TestCase(ifname = "userdel", cstype = 0,rule = {}, cls = Class.class)
	 public String userdelIface(String uaif) throws JsonGenerationException, JsonMappingException, IOException 
	 {
//		   System.out.println("paramfunsstt0");
//	    	System.out.println(String.format("name=%s,age=%s,nickname=%s", new String[]{uaif.getUsername(),uaif.getPassword(),uaif.getNickname()}));
	        HashMap<String,Object> hmp = new 	HashMap<String,Object>();
	        hmp.put("retcode", 2);
	        hmp.put("user", uaif);
	        hmp.put("function", "userdelIface");
	        String stra = objectMapper.writeValueAsString(hmp);
	        return stra ;
	 }

}

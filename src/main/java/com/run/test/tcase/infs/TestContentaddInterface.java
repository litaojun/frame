package com.run.test.tcase.infs;

import java.io.IOException;
import java.util.HashMap;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.run.test.tcase.data.input.ContentInfo;
import com.run.test.util.TestCase;

public class TestContentaddInterface {
	private ObjectMapper objectMapper = new ObjectMapper();
	 @TestCase(ifname = "contentadd", cstype = 0,rule = {}, cls = ContentInfo.class)
	 public String contentaddifces(ContentInfo uaif) throws JsonGenerationException, JsonMappingException, IOException 
	 {
//		   System.out.println("paramfunsstt0");
//	    	System.out.println(String.format("name=%s,age=%s,nickname=%s", new String[]{uaif.getUsername(),uaif.getPassword(),uaif.getNickname()}));
	        HashMap<String,Object> hmp = new 	HashMap<String,Object>();
	        hmp.put("retcode", 2);
	        hmp.put("user", uaif);
	        hmp.put("function", "contentaddifces");
	        String stra = objectMapper.writeValueAsString(hmp);
	        return stra ;
	 }
}

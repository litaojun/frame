package com.run.test.tcase.rstcpr;

import java.io.IOException;
import java.util.HashMap;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.run.test.tcase.infs.UserAddInfo;
import com.run.test.util.ResultCompare;

public class TestUserloginResultMatch 
{

	private ObjectMapper objectMapper = new ObjectMapper();

	@ResultCompare(ifname = "userlogin", cstype = 0,rule = {}, cls = Class.class)
	 public String matchparamUserlogin0(String rspinf,UserAddInfo uaif,String yqrst) throws JsonGenerationException, JsonMappingException, IOException 
	 {
//		    System.out.println("matchparamfunsstt0");
//	    	System.out.println(String.format("name=%s,age=%s,nickname=%s", new String[]{uaif.getUsername(),uaif.getPassword(),uaif.getNickname()}));
	        HashMap<String,Object> hmp = new 	HashMap<String,Object>();
	        hmp.put("retcode", 1);
	        hmp.put("user", uaif);
	        hmp.put("function", "matchparamUserlogin0");
	        String stra = objectMapper.writeValueAsString(hmp);
	        return stra ;
	 }
	 @ResultCompare(ifname = "userlogin", cstype = 1,rule = {1,2}, cls = Class.class)
	 public String matchparamUserlogin1(String rspinf,UserAddInfo uaif,String yqrst) throws JsonGenerationException, JsonMappingException, IOException 
	 {
//		    System.out.println("matchparamfunsstt1");
//	    	System.out.println(String.format("name=%s,age=%s,nickname=%s", new String[]{uaif.getUsername(),uaif.getPassword(),uaif.getNickname()}));
	        HashMap<String,Object> hmp = new HashMap<String,Object>();
	        hmp.put("retcode", 2);
	        hmp.put("user", uaif);
	        hmp.put("function", "matchparamUserlogin1");
	        String stra = objectMapper.writeValueAsString(hmp);
	        return stra ;
	 }
	 @ResultCompare(ifname = "userlogin", cstype = 2,rule = {3,6}, cls = Class.class)
	 public String matchparamUserlogin2(String rspinf,UserAddInfo uaif,String yqrst) throws JsonGenerationException, JsonMappingException, IOException 
	 {
//		 System.out.println("matchparamfunsstt11");
//	    	System.out.println(String.format("name=%s,age=%s,nickname=%s", new String[]{uaif.getUsername(),uaif.getPassword(),uaif.getNickname()}));
	        HashMap<String,Object> hmp = new 	HashMap<String,Object>();
	        hmp.put("retcode", 0);
	        hmp.put("user", uaif);
	        hmp.put("function", "matchparamUserlogin2");
	        String stra = objectMapper.writeValueAsString(hmp);
	        return stra ;
	 }
}

package com.run.test.tcase.rstcpr;

import java.io.IOException;
import java.util.HashMap;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.run.test.tcase.infs.UserAddInfo;
import com.run.test.util.ResultCompare;

public class TestContentresultResultMatch 
{
	private ObjectMapper objectMapper = new ObjectMapper();

	@ResultCompare(ifname = "contentadd", cstype = 0,rule = {}, cls = Class.class)
	 public String matchparamContentadd0(String rspinf,UserAddInfo uaif,String yqrst) throws JsonGenerationException, JsonMappingException, IOException 
	 {
//		    System.out.println("matchparamfunsstt0");
//	    	System.out.println(String.format("name=%s,age=%s,nickname=%s", new String[]{uaif.getUsername(),uaif.getPassword(),uaif.getNickname()}));
	        HashMap<String,Object> hmp = new 	HashMap<String,Object>();
	        hmp.put("retcode", 1);
	        hmp.put("user", uaif);
	        hmp.put("function", "matchparamContentadd0");
	        String stra = objectMapper.writeValueAsString(hmp);
	        return stra ;
	 }
	 @ResultCompare(ifname = "contentadd", cstype = 1,rule = {3,12}, cls = Class.class)
	 public String matchparamContentadd1(String rspinf,UserAddInfo uaif,String yqrst) throws JsonGenerationException, JsonMappingException, IOException 
	 {
//		    System.out.println("matchparamfunsstt1");
//	    	System.out.println(String.format("name=%s,age=%s,nickname=%s", new String[]{uaif.getUsername(),uaif.getPassword(),uaif.getNickname()}));
	        HashMap<String,Object> hmp = new HashMap<String,Object>();
	        hmp.put("retcode", 2);
	        hmp.put("user", uaif);
	        hmp.put("function", "matchparamContentadd1");
	        String stra = objectMapper.writeValueAsString(hmp);
	        return stra ;
	 }
	 @ResultCompare(ifname = "contentadd", cstype = 1,rule = {14}, cls = Class.class)
	 public String matchparamContentadd2(String rspinf,UserAddInfo uaif,String yqrst) throws JsonGenerationException, JsonMappingException, IOException 
	 {
//		 System.out.println("matchparamfunsstt11");
//	    	System.out.println(String.format("name=%s,age=%s,nickname=%s", new String[]{uaif.getUsername(),uaif.getPassword(),uaif.getNickname()}));
	        HashMap<String,Object> hmp = new 	HashMap<String,Object>();
	        hmp.put("retcode", 0);
	        hmp.put("user", uaif);
	        hmp.put("function", "matchparamContentadd2");
	        String stra = objectMapper.writeValueAsString(hmp);
	        return stra ;
	 }
	 @ResultCompare(ifname = "contentadd", cstype = 2,rule = {4,12}, cls = Class.class)
	 public String matchparamContentadd3(String rspinf,UserAddInfo uaif,String yqrst) throws JsonGenerationException, JsonMappingException, IOException 
	 {
//		 System.out.println("matchparamfunsstt2");
//	    	System.out.println(String.format("name=%s,age=%s,nickname=%s", new String[]{uaif.getUsername(),uaif.getPassword(),uaif.getNickname()}));
	        HashMap<String,Object> hmp = new 	HashMap<String,Object>();
	        hmp.put("retcode", 1);
	        hmp.put("user", uaif);
	        hmp.put("function", "matchparamContentadd3");
	        String stra = objectMapper.writeValueAsString(hmp);
	        return stra ;
	 }
	 @ResultCompare(ifname = "contentadd", cstype = 3,rule = {13,22,1}, cls = Class.class)
	 public String matchparamContentadd4(String rspinf,UserAddInfo uaif,String yqrst) throws JsonGenerationException, JsonMappingException, IOException 
	 {
//		 System.out.println("matchparamfunsstt2");
//	    	System.out.println(String.format("name=%s,age=%s,nickname=%s", new String[]{uaif.getUsername(),uaif.getPassword(),uaif.getNickname()}));
	        HashMap<String,Object> hmp = new 	HashMap<String,Object>();
	        hmp.put("retcode", 1);
	        hmp.put("user", uaif);
	        hmp.put("function", "matchparamContentadd4");
	        String stra = objectMapper.writeValueAsString(hmp);
	        return stra ;
	 }
}

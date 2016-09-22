package com.run.test.tcase.data.input;

public class ContentInfo {
	private String contentname        ; 
	private String contentdes         ; 
	private int contenttype        ; 
	private int columns            ; 
	private String contenturl         ; 
	private String contentdate        ; 
	public String getContentname()     
	{
		return this.contentname;
	}
	public String getContentdes()      
	{
		return this.contentdes;
	}
	public int    getContenttype()     
	{
		return this.contenttype;
	}
	public int    getColumns()  
	{
		return this.columns;
	}
	public String getContenturl()      
	{
		return this.contenturl;
	}
	public String getContentdate()     
	{
		return this.contentdate;
	}
	
	public void setContentname(String a) 
	{
		this.contentname = a;
	}
	public void setContentdes(String a)  
	{
		this.contentdes =a ;
	}
	public void setContenttype(int a) 
	{
		this.contenttype = a;
	}
	public void setColumns(int a)     
	{
		this.columns = a;
	}
	public void setContenturl(String a)  
	{
		this.contenturl = a;
	}
	public void setContentdate(String a) 
	{
		this.contentdate = a;
	}

}

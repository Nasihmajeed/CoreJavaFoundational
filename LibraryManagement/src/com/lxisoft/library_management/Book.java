package com.lxisoft.library_management;
import com.lxisoft.library_management.*;
public class Book
{
	private String id;
	private String name;
	private String auther;
	private String publisher;
	public Issue issue;
	

	public void setId(String id)
	{
		this.id = id;
	}
	public String getId()
	{
		return id;
	}	


	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}	


	public void setAuther(String auther)
	{
		this.auther = auther;
	}
	public String getAuther()
	{
		return auther;
	}	


	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}
	public String getPublisher()
	{
		return publisher;
	}	

	public String toString()
	{
		return String.format(name+","+auther+","+publisher) ;
	}
	
	
}
package com.lxisoft.cast;

public class Comedian extends Actor
{
	
	private String comedianName;
	
/*	public void setComedianName(String comedianName)
	{
		this.comedianName=comedianName;
	}
*/	
	

   public Comedian(String comedianName, String comedianCharName)
   {
   	this.comedianName=comedianName;
   	this.comedianCharName=comedianCharName;
   }




	public String getComedianName()
	{
		return comedianName;
	}
	
/*	public void setComedianCharName(String comedianCharName)
	{
		this.comedianCharName=comedianCharName;
	}
*/	
	public String getComedianCharName()
	{
		return comedianCharName;
	}
	
}
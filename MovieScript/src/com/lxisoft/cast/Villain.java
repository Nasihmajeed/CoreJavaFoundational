package com.lxisoft.cast;

public class Villain extends Actor
{

   private String villainName;

/*   public void setVillainName(String villainName)
	{
		this.villainName=villainName;
	}
*/
	
 public Villain(String villainName,String villainCharName)
 {
    this.villainName=villainName;
    this.villainCharName=villainCharName;
 }



	public String getVillainName()
	{
		return villainName;
	}
/*
    public void setVillainCharName(String villainCharName)
	{
		this.villainCharName=villainCharName;
	}
*/
	public String getVillainCharName()
	{
		return villainCharName;
	}


}
package com.lxisoft.cast;

public class Heroine extends Actor
{


	private String heroineName;
	
/*	public void setHeroineName(String heroineName)
	{
		this.heroineName=heroineName;
	}
*/

    public Heroine(String heroineName,String heroineCharName)
    {
    	this.heroineName=heroineName;
    	this.heroineCharName=heroineCharName;
    }



	public String getHeroineName()
	{
		return heroineName;
	}
	
/*	public void setHeroineCharName(String heroineCharName)
	{
		this.heroineCharName=heroineCharName;
	}
*/	
	public String getHeroineCharName()
	{
		return heroineCharName;
	}
	
	
}
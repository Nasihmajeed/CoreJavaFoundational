
package com.lxisoft.waterpurifier.website ;

public class Technician
{
	private String name ;
	private int locationX,locationY ;
	private boolean isFree=true ;
	private final int range = 20 ;

	public Technician(String name)
	{
		setName(name) ;

		setLocationX(10 + (int) (Math.random()*50)) ;
		setLocationY(10 + (int) (Math.random()*50)) ;
	}

	public boolean getIsFree()
	{
		return isFree ;
	}
	public void setIsFree(boolean isFree)
	{
		this.isFree = isFree ;
	}

	public int getRange()
	{
		return range ;
	}

	public String getName()
	{
		return name ;
	}
	public void setName(String name)
	{
		this.name = name ;
	}

	public int getLocationX()
	{
		return locationX ;
	}
	public void setLocationX(int locationX)
	{
		this.locationX = locationX ;
	}

	public int getLocationY()
	{
		return locationY ;
	}
	public void setLocationY(int locationY)
	{
		this.locationY = locationY ;
	}


}

package com.lxisoft.waterpurifier.website ;

public class Customer
{
	private String name ;
	private int locationX,locationY ;
	private Bill bill = new Bill() ;

	public Customer()
	{
		locationX = 10 + (int) (Math.random()*50);
		locationY = 10 + (int) (Math.random()*50);
	}

	public Bill getBill()
	{
		return bill ;
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
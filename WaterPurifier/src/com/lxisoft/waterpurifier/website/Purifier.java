
package com.lxisoft.waterpurifier.website ;

public class Purifier
{
	private String name ;
	private int price ;
	private int pHTolerance ;

	public Purifier(String name,int price,int pHTolerance)
	{
		setName(name) ;
		setPrice(price) ;
		setPHTolerance(pHTolerance) ;
	}

	public String getName()
	{
		return name ;
	}
	public void setName(String n)
	{
		name = n ;
	}

	public int getPrice()
	{
		return price ;
	}
	public void setPrice(int p)
	{
		price = p ;
	}

	
	public int getPHTolerance()
	{
		return pHTolerance ;
	}
	public void setPHTolerance(int pHT)
	{
		pHTolerance = pHT ;
	}

}
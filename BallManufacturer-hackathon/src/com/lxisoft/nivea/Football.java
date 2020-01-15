package com.lxisoft.nivea;
public class Football extends Ball implements Airfillable
{
	String name="Nivea";
	String size="Medium";
	String Style="Hexagonal shaped stitches";
	int price=1500;
	public void fillAir()
	{
		System.out.println("Air fillable and extra rigged Blader");	
	}
}
package com.lxisoft.nivea;
public class Volleyball extends Ball implements Airfillable
{
	String name="Nivea";
	String size="Medium";
	String Style="Three set of line shaped stitches";
	int price=900;
	public void fillAir()
	{
		System.out.println("Air fillable and extra more lighter weight");
	}
}
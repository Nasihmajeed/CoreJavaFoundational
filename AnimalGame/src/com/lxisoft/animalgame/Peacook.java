package com.lxisoft.animalgame;
public class Peacook extends Animal implements Herbivores
{
	int luckFactor=0;

	public boolean isLucky()
	{
		boolean escape=false;
		
		int luckyfactor=(int)(10* Math.random());

		if(luckyfactor<=luckFactor)
		{
			System.out.println("lucky b day animal escapped");
			escape=true;
		}
		else
			escape=false;
		return escape;
	}	

	public int[] getGraze()
	{
		int[] one=new int[2];
		for(int i=0; i<2; i++)
		{
			one[i]=(int)(50* Math.random());
		}
		return one;
	}
	
	public void eat()
	{
		System.out.println("Peacook eats");
	}
	public void run()
	{
		System.out.println("Peacook runs");
	}
	

}
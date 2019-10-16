package com.lxisoft.animalgame;

public class Zeebra extends Animal implements Herbivores
{

	

	public boolean luck()
	{
		boolean escape=false;
		int luckyfactor=(int)(10* Math.random());
		if(luckyfactor<=(this).luckyfact)
		{
			System.out.println("luckyfact  " +this.luckyfact);
			System.out.println("luckfactor  "+ luckyfactor);
			System.out.println("lucky animal  " +((this)).name+"  escapped \n");
			escape=true;
		}
		else
		{
			escape=false;
		}
		return escape;
	}
	public int[] graze()
	{
		int[] position=new int[2];
		for(int i=0;i<position.length;i++)
		{
			position[i]=(int)(Math.random() *50);
		}
		return position;
	}	

}
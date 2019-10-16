package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
public class Animalherbivores extends Animal implements Herbivores
{
	public int luckyfact;

	public boolean luck()
	{
		boolean escape=false;
		int luckyfactor=(int)(10* Math.random());
		if(luckyfactor<=((Animalherbivores)(this)).luckyfact)
		{
			System.out.println("luckyfact  " +this.luckyfact);
			System.out.println("luckfactor  "+ luckyfactor);
			System.out.println("lucky animal  " +((Animalherbivores)(this)).name+"  escapped \n");
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

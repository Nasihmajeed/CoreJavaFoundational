package com.lxisoft.animalgame;
import java.lang.Math;
import com.lxisoft.animalgame.*;

public abstract class Hanimal extends Animal implements Herbivores
{
	public int luckFactor;

	public boolean luck()
	{
		boolean escape=false;
		
		int luckyfactor=(int)(10* Math.random());

		if(luckyfactor<=((Hanimal)(this)).luckFactor)
		{
			System.out.println("lucky b day animal escapped");
			escape=true;
		}
		else
			escape=false;
		return escape;
	}		

			
	

}
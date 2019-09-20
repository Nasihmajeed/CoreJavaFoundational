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
			System.out.println("lucky animal  " +((Animalherbivores)(this)).name+"  escapped");
			escape=true;
		}
		else
		{
			escape=false;
		}
		return escape;
	}	

}

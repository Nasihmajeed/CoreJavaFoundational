package com.LxiSoft.Game;
import com.lxisoft.Game.*;
import java.util.*;

public class Players 
{
	String name;
	String coin;
	Dice dice = new Dice();
	
	public Players(String name, String coin)
	{
		this.name = name;
		this.coin = coin;
	}

	public int takeTurn()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print(name+"'s turn : press [ENTER] to Roll");
		String input = s.nextLine();
		
		int value = 0;
		for (int i = 0; i < input.length(); i++)
		{
			value+= input.charAt(i);
		}
		value = value % 10;
		if (value == 0)
		{
			value = 1;
		}
		
		
		for (int i = 0; i < value; i++)
		{
			dice.roll();
		}
		
		
		int roll = 0;
		roll = dice.roll();
		
		System.out.println(name + " got " + roll + " on dice roll.");
		
		return roll;
	}
	
	
	public String toString()
	{
		return coin;
	}
}
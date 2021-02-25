package com.LxiSoft.SnakeAndLadder;
import com.LxiSoft.SnakeAndLadder.*;
import java.util.*;
public class Players {

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
		
		System.out.print("\n"+name+"'s turn : press [ENTER] to Roll");
		String input = s.nextLine();
		
		
		int val = 0;
		for (int i = 0; i < input.length(); i++)
		{
			val+= input.charAt(i);
		}
		val = val % 10;
		if (val == 0)
		{
			val = 1;
		}
		
		
		for (int i = 0; i < val; i++)
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
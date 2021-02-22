package com.LxiSoft.Game;
import com.lxisoft.Game.*;
import java.util.*;

public class Players {

	String name;
	String coin;
	Dice dice = new Dice();
	
	public Players(String name, String coin){
		this.name = name;
		this.coin = coin;
	}
	public int takeTurn(){
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.print(name+"'s turn press [ENTER] to Roll the dice");
		String input = s.nextLine();
		
		
		int val = 0;
		for (int idx = 0; idx < input.length(); idx++){
			val+= input.charAt(idx);
		}
		val = val % 10;
		if (val == 0){
			val = 1;
		}
		
		
		for (int idx = 0; idx < val; idx++){
			dice.rollD6();
		}
		
		
		int roll = 0;
		roll = dice.rollD6();
		
		System.out.println(name + " rolled and got " + roll + ".");
		
		return roll;
	}
	
	
	public String toString(){
		return coin;
	}
}
package com.lxisoft.SnakeAndLadder;
import com.lxisoft.SnakeAndLadder.*;
import java.util.*;
public class Players {

	String name;
	Dice dice = new Dice();
	
	public Players(String name){
		this.name = name;
	}
	public int takeTurn(){
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(name+"'s turn press [ENTER] to Roll the dice");
		String input = scan.nextLine();
		
		
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
		return name;
	}
}

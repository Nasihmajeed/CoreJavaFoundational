package com.lxisoft.SnakeAndLadder;
import com.lxisoft.SnakeAndLadder.*;
import java.util.*;
public class Dice{
	Random random = new Random();
	public int diceRoll(){
		int side = random.nextInt(6);
		return side; 
	}
}
package com.lxisoft.SnakeAndLadder;
import com.lxisoft.SnakeAndLadder.*;
import java.util.*;
public class Dice{
	Random random;
	public Dice(){
		random = new Random();
	}
	public int rollD6(){
		return random.nextInt(6)+1;
	}
}
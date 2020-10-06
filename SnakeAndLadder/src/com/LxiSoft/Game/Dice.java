package com.LxiSoft.Game;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Dice 
{	
	int value;
 
 	public int roll() 
 	{	Random objGenerator = new Random();	
		value = objGenerator.nextInt(5+1)+1;
		return value; 
	}
 
}
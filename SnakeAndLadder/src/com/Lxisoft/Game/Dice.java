package com.Lxisoft.Game;
import java.io.*;
import java.util.*;
import java.util.Random;

public class Dice
{

	int[] inputDie = new int[]{ 1,2,3,4,5,6}; 


    private int randomNumber;
    public void setRandomNumber(int a){
        this.randomNumber=a;

    }
    public int getRandomNumber(){
        return randomNumber;
    }
	public int randomGeneration(){
		
		
	setRandomNumber(inputDie[new Random().nextInt(inputDie.length)]);//to get random numbers from input die array
	
		
	return getRandomNumber();
	}
	public void getDice()
    {
        int diceRoll;
        diceRoll = (int)(Math.random()*6 )+1 ; 
        int move = diceRoll;
        //return move; 
    }
	 
}

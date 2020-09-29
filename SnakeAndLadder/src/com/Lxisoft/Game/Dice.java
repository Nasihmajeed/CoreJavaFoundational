package com.Lxisoft.Game;
import java.util.Scanner;
import java.util.Random;
public class Dice{

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
	//System.out.println(getRandomNumber());
		
	return getRandomNumber();



	} 
	

}
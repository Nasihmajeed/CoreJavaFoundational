package com.lxisoft.snakeandladder;
import java.util.Scanner;
import java.util.Random;
public class Die{

	int[] inputDie = new int[]{ 1,2,3,4,5,6}; 


    private int randomNumber;
    public void setRandomNumber(int a){
        this.randomNumber=a;

    }
    public int getRandomNumber(){
        return randomNumber;
    }
	public int randomGeneration(){
		Random random=new Random();
		setRandomNumber(random.nextInt(6));
		
		return getRandomNumber();
		System.out.println(getRandomNumber());


	} 
	

}

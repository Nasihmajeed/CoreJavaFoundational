package com.LxiSoft.Game;
import java.util.*;
import java.util.Scanner;
public class Dice 
{	
	Scanner scnr=new Scanner(System.in);
	 Random randomNo = new Random();
	int value;

/*public void diceConditions()
{
this.gameStart();
} 

public void gameStart()
{
 int starter = randomNo.nextInt(6);

 while (starter!=1)
 {
  System.out.println("you have rolled" +starter+".");
	String sGame = "y"; 
  System.out.println("Do you want to play? Y or N     >  "); 
  sGame = scnr.nextLine ();
  if (sGame.equals ("y") || sGame.equals ("Y"))
   {
   	starter = randomNo.nextInt(6);
 	  }
  }
  	System.out.println("Yiu have rolled 1");
 	 this.gameRun();
}

public void gameRun()
{
  int randomRoll;
 System.out.println("lets start");
int gameRoll=randomRoll.nextInt(6);

  }*/

  int[] inputDice = new int[]{ 1,2,3,4,5,6}; 


    private int randomNumber;
    public void setRandomNumber(int a){
        this.randomNumber=a;

    }
    public int getRandomNumber(){
        return randomNumber;
    }
  public int randomGeneration(){
    
    
  setRandomNumber(inputDice[new Random().nextInt(inputDice.length)]);//to get random numbers from input die array
  //System.out.println(getRandomNumber());
    
  return getRandomNumber();



  } 
  

}

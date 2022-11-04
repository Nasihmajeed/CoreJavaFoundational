package com.lxisoft.game;
import java.util.*;

public class Player implements DiceThrowable,LadderUsable
{   
    private String name;

    private int score;          
    
    Scanner sc = new Scanner(System.in);

    Random rand = new Random();
    
    public String getName()                    
    {
        return name;
    }
    
    public void setName(String Name)
    {
        this.name=Name;
    }

    public int getScore()                       
    {
        return score;
    }
    
    public void setScore(int Score)
    {
        this.score=Score;
    }    

    public int rollDice()
	{
		int n = 0;
		Random r = new Random();
		n=r.nextInt(7);
		return (n==0?1:n);
	}
    
    /*public void moveCoin()
    {
        //Coin moves are occur here!
    }
    void throwDice()
    {
        System.out.println("Dice Throwing");
    }
    void useLadder()
    {
        System.out.println("Using Ladder");
    } 
    */  
}

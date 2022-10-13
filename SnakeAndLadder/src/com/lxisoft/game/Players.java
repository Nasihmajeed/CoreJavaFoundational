package com.lxisoft.game;
import java.util.*;

public class Players ///implements DiceThrowable,LadderUsable
{           
    private Dice dice;
    private Coin[] coins;
    private String nameOne;
    private String nameTwo;       
    private int score;
    
    Scanner sc = new Scanner(System.in);
    
    public Dice getDice()                       //Dice Settings            
    {
        return dice;
    } 
     
    public void setDice(Dice Dice)  
    {
        this.dice=Dice;
    }
    
    public Coin[] getCoin()                     //Coin Settings        
    {
        return coins;
    } 
     
    public void setDice(Coin[] Coins)
    {
        this.coins=Coins;
    }

    public String getNameOne()                     //NameOne Settings
    {
        return nameOne;
    }
    
    public void setNameOne(String NameOne)
    {
        this.nameOne=NameOne;
    }

    public String getNameTwo()                     //NameTwo Settings
    {
        return nameTwo;
    }
    
    public void setNameTwo(String NameTwo)
    {
        this.nameTwo=NameTwo;
    }    

    public int getScore()                       //Score Settings
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
    
    public void moveCoin()
    {
        //Coin moves are occur here!
    }   
    
    /*void throwDice()
    {
        //System.out.println("Dice Throwing");
    } 

    void useLadder()
    {
        //System.out.println("Using Ladder");
    }
    */
}

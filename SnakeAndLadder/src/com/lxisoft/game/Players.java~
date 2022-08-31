package com.lxisoft.game;
import java.util.*;

public class Players implements DiceThrowable,LadderUsable
{           
    private Dice dice;
    private Coin[] coins;
    private String name;    
    private int score;   

    Scanner sc = new Scanner();    

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

    public String getName()                     //Name Settings
    {
        return name;
    }
    
    public void setName(String Name)
    {
        this.name=Name;
    }

    public int getScore()                       //Score Settings
    {
        return score;
    }
    
    public void setScore(int Score)
    {
        this.score=Score;
    }

    public void abstract gameStarting();
    
    public void throwDice()
    {
        System.out.println("Throw Dice!"+"\n");        
    }
    
    public void useLadder()
    {
        System.out.println("WhooHoo Iam Using Ladder I Got Much Points");
    }
}

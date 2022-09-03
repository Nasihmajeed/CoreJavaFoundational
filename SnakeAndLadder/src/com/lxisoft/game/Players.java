package com.lxisoft.game;
import java.util.*;

public class Players implements DiceThrowable,LadderUsable
{           
    private Dice dice;
    //private Coin[] coins;
    private String name;    
    private int score;
    
    String xPress;   

    Scanner sc  = new Scanner(System.in);
    
    Players players = new Players();
    
    PlayerOne playerOne = new PlayerOne();
    PlayerTwo playerTwo = new PlayerTwo();


    public Dice getDice()                       //Dice Settings            
    {
        return dice;
    } 
     
    public void setDice(Dice Dice)  
    {
        this.dice=Dice;
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
   
    public int rollDice()
	{
        //Dice moves are occur here!
	}
    }
    
    public void moveCoin()
    {
        //Coin moves are occur here!
    }  
    
    public void throwDice()
    {
        System.out.println("Throw Dice!"+"\n");        
    }
        
    public void useLadder()
    {
        System.out.println("WhooHoo Iam Using Ladder I Got Much Points"+"\n");
    }
  
    
    public void gameLoading()                   //This is the method of beginning of the game 
    {
        System.out.println("\t "+"LXI Soft Presents "+"\n");
        System.out.println("     " + "Snake And Ladder Game 1.0"+"\n");
        System.out.println("\t "+"Game Is Loading..."+"\n");                                    

        xPress=sc.next();
        //diceValue=rollDice();

        System.out.println("*** Please Wait Game Is Starting ***");
        
    }       
}

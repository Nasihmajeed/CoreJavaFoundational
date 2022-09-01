package com.lxisoft.game;
import java.util.*;

public class Players implements DiceThrowable,LadderUsable
{           
    private Dice dice;
    private Coin[] coins;
    private String name;    
    private int score;   

    Scanner sc  = new Scanner();
    
    Players player = new Players();
    Dice dice = new Dice();
    
    player.setDice(dice);
    player.setCoin(coins);
    player.setScore(score);    

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

    public void abstract playersListing();      //abstract method of playerOne and playerTwo

    public void moveDice()
    {
        //Dice moves are occur here!
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

        
        playerOne.playersListing();
        playerTwo.playersListing();

        System.out.println("*** Please Wait Game Is Starting ***");
        
    }       
}

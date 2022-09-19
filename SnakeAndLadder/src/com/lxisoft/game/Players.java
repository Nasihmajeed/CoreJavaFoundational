package com.lxisoft.game;
import java.util.*;

public class Players implements DiceThrowable,LadderUsable
{           
    private Dice dice;
    private Coin[] coins;
    private String name;       
    private int score;
    
    String gameMode;
    String xPress;           
    
    Scanner sc = new Scanner(System.in);
    
    Players player = new Players();
    Dice dice = new Dice();        
    

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

    //public void abstract playersListing();      //abstract method of playerOne and playerTwo

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
        System.out.println("*** Instructions ***"+"\n");
        System.out.println("This program will simulate a regular snakes and ladders game developed by LxiSoft India.");
        System.out.println("You and the computer start at Starting Point 1 and You want to reach Home at ending point");
        System.out.println("When Dice get point 1 You can start the game");
        System.out.println("Good Luck and Have FUN!!!"+"\n");     

        System.out.println("Enter Player One Name :");
        playerOne=sc.nextLine();

        System.out.println("Enter Player Two Name :");
        playerTwo=sc.nextLine();

        System.out.println("Enter your game mode :");
        System.out.println("1. Easy ");
        System.out.println("2. Medium ");
        System.out.println("3. Hard ");

        gameMode=sc.nextLine();                    
         
        System.out.println("Yes You Have Selected " + gameMode);
        System.out.println("*** Please Wait Game Is Starting ***");
        
    }
        
    }       
}

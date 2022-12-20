package com.lxisoft.game;
import java.util.*;

public class Player implements DiceThrowable,LadderUsable,SnakeStrikeable
{   
    private String name;
    private int playerDiceValue = 0;    
    private int playerCurrentCell;
    
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

    void rollDice()
    {
		Random r = new Random();
		playerDiceValue=r.nextInt(7);
	    System.out.println(playerDiceValue);
    }   
    
    void moveCoin()
    {
        playerCurrentCell = playerCurrentCell + playerDiceValue;
        System.out.println(playerCurrentCell);
    }

    
    public void throwDice()
    {
        System.out.println("Dice Throwing");
    }
    public void useLadder()
    {
        System.out.println("Yeeeyy Using Ladder");
    } 
    public void snakeBite()
    {
        System.out.println("Ouch Snake Bites!!!");
    }      
}

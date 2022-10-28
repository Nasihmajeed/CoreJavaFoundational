package com.lxisoft.game;
import java.util.*;

public class Player implements DiceThrowable,LadderUsable
{   
    private String nameOne;
    private String nameTwo;       
    
    Scanner sc = new Scanner(System.in);
    
    public String getNameOne()                    
    {
        return nameOne;
    }
    
    public void setNameOne(String NameOne)
    {
        this.nameOne=NameOne;
    }

    public String getNameTwo()                    
    {
        return nameTwo;
    }
    
    public void setNameTwo(String NameTwo)
    {
        this.nameTwo=NameTwo;
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

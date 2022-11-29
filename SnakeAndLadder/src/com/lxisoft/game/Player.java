package com.lxisoft.game;
import java.util.*;

public class Player implements DiceThrowable,LadderUsable,SnakeStrikeable
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
    
    void moveCoin()
    {
        if(playerOneCell == ladderCell)  
        {
        //players got ladderCell they got climb with ladderBottomtoladderUpper. At the same time playersScore++ to currentCell.                
                    
        }
        else if(playerOneCell == snakeCell)
        {
        //players got snakeCell they got score-- to snakeTail. At the same time playersScore-- to currentCell.         
        }
               
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

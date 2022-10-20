package com.lxisoft.game;
import java.util.*;
import java.util.ArrayList;    

public class game
{  
    private Dice dice;

    private Coin[] coin;

    private int score;

    public Dice getDice()                                  
    {
        return dice;
    } 
     
    public void setDice(Dice Dice)  
    {
        this.dice=Dice;
    }

    public Coin[] getCoin()                             
    {
        return coin;
    } 
     
    public void setCoin(Coin[] Coin)
    {
        this.coin=Coin;
    } 

    public int getScore()                       
    {
        return score;
    }
    
    public void setScore(int Score)
    {
        this.score=Score;
    }

    Players playerOne = new Players();
    Players playerTwo = new Players();
}


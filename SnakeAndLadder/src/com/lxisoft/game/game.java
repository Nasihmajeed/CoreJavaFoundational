package com.lxisoft.game;

public class game
{  
    private Dice dice;

    private Coin[] coins;

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
}


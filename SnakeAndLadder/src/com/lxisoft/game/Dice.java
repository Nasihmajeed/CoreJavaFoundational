package com.lxisoft.game;dd
import java.util.*;
public class Dice
{
    int diceResult;

    public int rollDice()
    {    
        Random r = new Random();
        diceResult = r.nextInt(7);
        System.out.println("Dice Rolled : " + diceResult);
        return diceResult;       
   }
}
   

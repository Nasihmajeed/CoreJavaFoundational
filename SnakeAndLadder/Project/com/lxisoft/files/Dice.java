package com.lxisoft.files;

public class Dice implements DiceThrowable
{
    private int diceSize;
    
    public int getDiceSize()
    {
        return diceSize;
    }
    public void setDiceSize(int DiceSize)
    {
        this.diceSize=DiceSize;
    }

        public void throwDice()
        {
            System.out.println("Game Starting Throw Dice!"+"\n");        
        }
}

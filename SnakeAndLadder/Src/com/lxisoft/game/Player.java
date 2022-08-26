package com.lxisoft.game;

public class Player implements DiceThrowable,LadderUsable
{
    private String nameOne;
    private String nameTwo;    

    private int playerOneScore; 
    private int playerTwoScore;

   public String getnameOne()    
    {
        return nameOne;
    }

    public void setnameOne(String NameOne)
    {
        this.nameOne=NameOne;
    }

    public String getnameTwo()
    {
        return nameTwo;
    }

    public void setnameTwo(String NameTwo)
    {
        this.nameTwo=NameTwo;
    }

    public int getPlayerOneScore()
    {
        return playerOneScore;
    }
    
    public void setPlayerOneScore(int PlayerOneScore)
    {
        this.playerOneScore=PlayerOneScore;
    }

    public int getPlayerTwoScore()
    {
        return playerTwoScore;
    }

    public void setPlayerTwoScore(int PlayerTwoScore)
    {
        this.playerTwoScore=PlayerTwoScore;
    }

    public void throwDice()
    {
        System.out.println("Throw Dice!"+"\n");        
    }
    
    public void useLadder()
    {
        System.out.println("WhooHoo Iam Using Ladder I Got Much Points");
    }
}

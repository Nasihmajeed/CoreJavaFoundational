package com.lxisoft.files;

public class Ladder implements LadderUsable
{
    private int ladderSize;
    
    public int getLadderSize()
    {
        return ladderSize;
    }
    public void setLadderSize(int LadderSize)
    {
        this.ladderSize=LadderSize;
    }    

    public void useLadder()
    {
        System.out.println("WhooHoo Iam Using Ladder I Got Much Points");
    }
}

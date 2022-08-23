package com.lxisoft.files;

public class Person implements DiceThrowable,LadderUsable
{
    private String nameOne;
    private String nameTwo;    

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

    public void throwDice()
    {
        System.out.println("Throw Dice!"+"\n");        
    }
    
    public void useLadder()
    {
        System.out.println("WhooHoo Iam Using Ladder I Got Much Points");
    }
}

package com.lxisoft.files;

public class Snake implements SnakeStrikable
{
    private int snakeSize;

    public int getSnakeSize()
    {
        return snakeSize;
    }
    public void getSnakeSize(int SnakeSize)
    {
        this.snakeSize=SnakeSize;    
    }
        
    public void snakeBites()
    {
        System.out.println("Haha I Bites Him");
    }    
}

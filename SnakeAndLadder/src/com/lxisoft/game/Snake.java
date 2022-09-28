package com.lxisoft.game;

public class Snake implements SnakeStrikable
{
    int snakeHead;
    int snakeTail;    

    Snake(int snakeHead,int snakeTail)
    {
        this.snakeHead = snakeHead;
        this.snakeTail = snakeTail;
    }
    public void snakeBites()
    {
        System.out.println("Haha I Bites Him");
    }    
}

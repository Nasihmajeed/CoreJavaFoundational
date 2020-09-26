package com.LxiSoft.Game;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
public class BoardElements
{
	 int snakeHead;
	 int snakeTail;
	 int ladderStart;
	 int ladderEnd;

	 public void setSnakeHead(int snakeHead)
    {
        this.snakeHead=snakeHead;
    }
    public int getSnakeHead()
    {
        return snakeHead;
    }

    public void setSnakeTail(int snakeTail)
    {
        this.snakeTail=snakeTail;
    }
    public int getSnakeTail()
    {
        return snakeTail;
    }

    public void setLadderStart(int ladderStart)
    {
        this.ladderStart=ladderStart;
    }
    public int getLadderStart()
    {
        return ladderStart;
    }


    public void setLadderEnd(int ladderEnd)
    {
        this.ladderEnd=ladderEnd;
    }
    public int getLadderEnd()
    {
        return ladderEnd;
    }
    
    

}
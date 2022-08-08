package com.lxisoft.files;
import java.util.*;
 
public class Board
{
    private Board board;        
    private int location;
    
    int playerOneScore;
    int playerTwoScore;
    
    Scanner sc = new Scanner(System.in);            

    public Board getBoard()
    {
        return board;
    }
    public void setBoard(Board Board)
    {
        this.board=Board;
    }

    public int getLocationCell()
    {
        return location;
    }
    
    public void setLocationCell(int LocationCell)
    {
        this.location=LocationCell;
    }

    public void startPlaying()
    {      
        int k = 5;

        for(int i = 0;i < k;i++)
        {
            System.out.println("Player 1 Throw Dice :");
            playerOneScore=sc.nextInt();

            System.out.println("Player 2 Throw Dice :");
            playerTwoScore=sc.nextInt();            
        }                    
    }
    
}

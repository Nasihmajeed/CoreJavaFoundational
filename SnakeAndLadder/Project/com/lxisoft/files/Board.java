package com.lxisoft.files;
import java.util.*;
 
public class Board
{
    private Board board;        
    //private Location[] location;        
    
    int playerOneScore;
    int playerTwoScore;
    
    int k = 5;
    int ladderLocation = 4; 
    int snakeLocation = 7;    
   
    Scanner sc = new Scanner(System.in);            
    
    public Board getBoard()
    {
        return board;
    }
    public void setBoard(Board Board)
    {
        this.board=Board;
    }

    /*public Location[] getLocationCell()
    {
        return location;
    }
    
    public void setLocationCell(Location[] LocationCell)
    {
        this.location=LocationCell;
    }
    */

    public void startPlaying()
    {      
        
        for(int i = 0;i < k;i++)
        {
            System.out.println("Player 1 Throw Dice :");
            playerOneScore=sc.nextInt();

            System.out.println("Player 2 Throw Dice :");
            playerTwoScore=sc.nextInt(); 

            if(playerOneScore == snakeLocation)
            {
                System.out.println("Ouch Snake Bites!");
                System.out.println("Player Two Wins!!!");                                                
                break;    
            }
                    
            else if(playerTwoScore == snakeLocation)
            {
                System.out.println("Ouch Snake Bites!");
                System.out.println("Player One Wins!!!");
            } 
                
                if(playerOneScore == ladderLocation)
                {
                    System.out.println("Yey Iam Going To Space!");                    
                    break;                
                }               

                else if(playerTwoScore == ladderLocation)
                {
                    System.out.println("Yey Iam Going To Space!");
                }               
        }                    
    }
    
}

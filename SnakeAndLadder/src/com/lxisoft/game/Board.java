package com.lxisoft.game;   
import java.util.*;

public class Board
{   
    private Ladder[] ladders;
    private Snake[] snakes;  
    private Cell[] locationCells;                                                 
    
    Scanner sc = new Scanner(System.in);     
    Random rand = new Random();

    Board board = new Board();
    Ladder ladder = new Ladder();
    Snake snake = new Snake();

    Players player = new Players();

    int randomDicePoint=rand.nextInt(6);
    int startGame=1;
    int endGame=100;    

    final static int winPoint=100;    

    public Ladder[] getLadder()                //Ladder settings     
    {       
        return ladder;
    }

    public void setLadder(Ladder[] Ladder)
    {
        this.ladder=Ladder;
    }   
    
    public Snake[] getSnake()                   //Snakes settings
    {
        return snakes;
    }

    public void setSnake(Snake[] Snake)
    {
        this.snakes=Snake;
    }

    /*public Cell[] getLocationCell()            //locationCell Settings
    {
        return locationCells;
    }       

    public void setLocationCell(Cell[] LocationCells)
    {
        this.locationCells=LocationCells;
   }
    */

    public void startPlaying()
    {  
        player.gameLoading();

        for(int i = 0;i < 100;i++)
        {
            System.out.println("Use x to roll Dice");
            System.out.println(randomDicePoint);
            if(playerOne==startGame)
            {
                System.out.println("Nice Play Your Entered The Board");
            }
            else if(playerTwo==startGame)
            {
                System.out.println("Nice Play Your Entered The Board");
            }
            else
            {
                System.out.println("Try Again");
            }
                 
                   
            if(playerOneScore == snakes[0]) 
            {
                playerOneScore = 11; 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bit By A Snake, GOING DOWN!!!~~~~~~~~~~~~~");
            }
            else if (playerOneScore == snakes[1])
            {
                playerOneScore= 21; 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bit By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if (playerOneScore == snakes[2])
            {
                playerOneScore = 45; 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bit By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if (playerOneScore == snakes[3])
            {
                playerOneScore = 70; 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bit By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if (playerOneScore == snakes[4])
            {
                playerOneScore = 99; 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bit By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
                
            // ********************************************************** //

            if(playerOneScore == ladders[0])
            {
                playerOneScore = 5; 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }

            else if (playerOneScore == ladders[1])
            {
                playerOneScore = 15; 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if (playerOneScore == ladders[2])
            {
                playerOneScore = 30; 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if (playerOneScore == ladders[3])
            {
                playerOneScore = 60; 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if (playerOneScore == ladders[4])
            {
                playerOneScore = 98; 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
        
        }
    }
                    
    
}

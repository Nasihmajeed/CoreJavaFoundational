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

    public Cell[] getLocationCell()            //locationCell Settings
    {
        return locationCells;
    }       

    public void setLocationCell(Cell[] LocationCells)
    {
        this.locationCells=LocationCells;
    }

    public void startPlaying()
    {  
        for(int i = 0;i < 100;i++)
        {
            player.gameLoading();
            
            System.out.println("Use x to roll Dice");
            if(playerOne.rollDice()==startGame)
            {
                System.out.println("Nice Play Your Entered The Board");
            }
            if(playerTwo.rollDice()==startGame)
            {
                System.out.println("Nice Play Your Entered The Board");
            }
            else
            {
                System.out.println("Try Again");
            }
            
            System.out.println(getPlayerOne());
            System.out.println(randomDicePoint);
            
      
    }
    
}

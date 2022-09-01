package com.lxisoft.game;   
import java.util.*;

public class Board
{   
    private Ladder[] ladders;
    private Snake[] snakes;  
    private Cells[] locationCells;                                         
    
    Scanner sc = new Scanner(System.in);     
    Random rand = new Random();

    Board board = new Board();
    Ladder ladder = new Ladder();
    Snake snake = new Snake();

    board.setLadder(ladder);                
    for(int i = 0;i < 4;i++)
    {
        ladders[i] = new Ladder(); 
    }
    
    board.setSnake(snakes);
    for(int i = 0;i < 4;i++)
    {
        snakes[i] = new Snake();
    }

    int randomDicePoint=rand.nextInt(6);    

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

    public Cells[] getLocationCell()            //locationCell Settings
    {
        return locationCells;
    }       

    public void setLocationCell(Cells[] LocationCells)
    {
        this.locationCells=LocationCells;
    }

    public void startPlaying()
    {  
        for(int i = 0;i < 100;i++)
        {
            player.gameLoading();
            
            System.out.println("Use x to roll Dice");
            System.out.println(getPlayerOne() + "Throw The Dice");
            System.out.println(randomDicePoint);
            //currentPoint==playerOneScore or playerTwoScore;
            /*if(randomDicePoint==pass)
            {
                System.out.println("Nice Play! Player One Enter The Board");
            }
            else
            {
                System.out.println("Don't Worry Next Time");
            }
            Or 
            {
                System.out.println("You take 6 One More Chance!");
            }                    

            */
                    
            //players[0].setPlayerOneScore(sc.nextInt());  ///////Use Math.random();
            //players[0].throwDice();

            System.out.println("Player 2 Throw Dice :");
            players[1].setPlayerTwoScore(sc.nextInt()); 

            if(players[0].getPlayerOneScore() == ladders[i].getLocationOne())
            {
                 players[0].useLadder();
                 System.out.println("Yey Player One Going To Space!");                                                         
            }
                    
            if(players[1].getPlayerTwoScore() == ladders[i].getLocationOne())
            {
                players[1].useLadder();
                System.out.println("Yey Player Two Going To Space!");                                           
            }                                     
        
                if(players[0].getPlayerOneScore() == snakes[i].getLocationOne())
                {
                    snakes[0].snakeBites();
                    System.out.println("Ouch Snake Bites Player 1!");
                    System.out.println("Player Two Wins!!!");                                                                                         
         
                }               

                if(players[1].getPlayerTwoScore() == snakes[i].getLocationOne())
                {   
                    snakes[1].snakeBites();
                    System.out.println("Ouch Snake Bites Player 2!");
                    System.out.println("Player One Wins!!!");                                        
                }                            
        }  
      
    }
    
}

package com.lxisoft.files;
import java.util.*;

public class Board
{
    private Dice dice;
    private Ladder[] ladders;
    private Person[] players;
    private Snake[] snakes;             

    int playerOneScore; 
    int playerTwoScore;        
    
    int locationOfLadder = 6;
    int locationOfSnake  = 9;
    
    int k = 5;
    int m = 4;
    
    Scanner sc = new Scanner(System.in);            
        
    public Dice getDice()                      //Dice settings
    {
        return dice;
    } 
     
    public void setDice(Dice Dice)
    {
        this.dice=Dice;
    }      
    
    public Ladder[] getLadder()                //Ladder settings     
    {       
        return ladders;
    }

    public void setLadder(Ladder[] Ladder)
    {
        this.ladders=Ladder;
    }

    public Person[] getPlayer()                 //Person settings
    {
        return players;
    }

    public void setPlayer(Person[] Players)
    {
        this.players=Players;
    }
    
    public Snake[] getSnake()                   //Snakes settings
    {
        return snakes;
    }

    public void setSnake(Snake[] Snake)
    {
        this.snakes=Snake;
    }   

    public void startPlaying()
    {  
        System.out.println("\t "+"LXI Soft Presents "+"\n");
        System.out.println("     " + "Snake And Ladder Game 1.0"+"\n");
        System.out.println("\t "+"Game Is Loading..."+"\n");                    

        players[0].throwDice();
                           
        for(int i = 0;i < k;i++)
        {
            System.out.println("Player 1 Throw Dice :");
            playerOneScore=sc.nextInt();

            System.out.println("Player 2 Throw Dice :");
            playerTwoScore=sc.nextInt(); 

            if(playerOneScore == locationOfSnake)
            {
                snakes[0].snakeBites();
                System.out.println("Ouch Snake Bites Player 1!");
                System.out.println("Player Two Wins!!!");                                                
                break;    
            }
                    
            else if(playerTwoScore == locationOfSnake)
            {
                snakes[1].snakeBites();
                System.out.println("Ouch Snake Bites Player 2!");
                System.out.println("Player One Wins!!!");
                break;
            } 
                
                if(playerOneScore == locationOfLadder)
                {
                    players[0].useLadder();
                    System.out.println("Yey Player One Going To Space!");                                 
                }               

                else if(playerTwoScore == locationOfLadder)
                {   
                    players[1].useLadder();
                    System.out.println("Yey Player Two Going To Space!");                    
                }

            System.out.println("\n" + m-- + " Plays Left " + "\n");                   
        }  
      
    }
    
}

package com.lxisoft.game;   
import java.util.*;

public class Board
{   
    private Ladder[] ladders;
    private Snake[] snakes;                                                  
    
    Scanner read = new Scanner(System.in);     
    Random rand = new Random();

    Ladder ladders[] = new Ladder[5];    
    ladders[0] = new Ladder(5,13); 
    ladders[1] = new Ladder(5,13);
    ladders[2] = new Ladder(5,13);
    ladders[3] = new Ladder(5,13);
    ladders[4] = new Ladder(5,13);     
                                     

    Snake snakes[] = new Snake[5];
    snakes[0] =  new Snake(11,3);
    snakes[1] =  new Snake(11,3);
    snakes[2] =  new Snake(11,3);
    snakes[3] =  new Snake(11,3);
    snakes[4] =  new Snake(11,3);
   
    Players players = new Players;
    
    int randomDicePoint = rand.nextInt(6);
    String xPress;
    int startGame=1;
    int endGame=100;    

    //final static int winPoint=100;       
    
    public void startPlaying()
    {  
        player.gameLoading();

        for(int i = 0;i < 100;i++)
        {
            System.out.println("Use x to roll Dice");
            xPress = read.nextLine(); 
                       
            System.out.println(randomDicePoint);
            
            if(playerOne.getScore() == startGame)
            {
                System.out.println("Nice Play You Entered The Board");
            }
            else if(playerTwo.getScore() == startGame)
            {
                System.out.println("Nice Play You Entered The Board");
            }
            else
            {
                System.out.println("Try Again");
            }
                 
                   
            if(player.getScore() == snakes[0]) 
            { 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GOING DOWN!!!~~~~~~~~~~~~~");
            }
            else if (player.getScore() == snakes[1])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if (player.getScore() == snakes[2])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if (player.getScore() == snakes[3])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if (player.getScore() == snakes[4])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }

            if(playerTwo.getScore() == snakes[0]) 
            { 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GOING DOWN!!!~~~~~~~~~~~~~");
            }
            else if (player.getScore() == snakes[1])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if (player.getScore() == snakes[2])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if (player.getScore() == snakes[3])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if (player.getScore() == snakes[4])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
                
            // ********************************************************** //

            if(player.getScore() == ladders[0])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }

            else if (player.getScore() == ladders[1])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if (player.getScore() == ladders[2])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if (player.getScore() == ladders[3])
            { 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if (player.getScore() == ladders[4])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }

            if(playerTwo.getScore() == ladders[0])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }

            else if (player.getScore() == ladders[1])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if (player.getScore() == ladders[2])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if (player.getScore() == ladders[3])
            { 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if (player.getScore() == ladders[4])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }

            if(player.getScore() == endGame)
            {
                System.out.println (getPlayerOneName() + "\t\t\t\t  Is Win!");
            }

            else if(player.getScore == endGame)
            {
                System.out.println (getPlayerTwoName() + "\t\t\t\t  Is Win!");
            }                
        
        }
    }
                    
    
}

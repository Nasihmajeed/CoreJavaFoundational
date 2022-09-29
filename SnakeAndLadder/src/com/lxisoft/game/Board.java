package com.lxisoft.game;   
import java.util.*;

public class Board
{   
    Scanner sc = new Scanner(System.in);     
    Random rand = new Random();

    Ladder ladders[] = new Ladder[5];    
    ladders[0] = new Ladder(5,13); 
    ladders[1] = new Ladder(15,27);
    ladders[2] = new Ladder(30,57);
    ladders[3] = new Ladder(60,77);
    ladders[4] = new Ladder(82,98);     
                                     

    Snake snakes[] = new Snake[5];
    snakes[0] =  new Snake(11,3);
    snakes[1] =  new Snake(39,14);
    snakes[2] =  new Snake(49,21);
    snakes[3] =  new Snake(78,6);
    snakes[4] =  new Snake(99,58);
   
    Players playerOne = new Players();
    Players playerTwo = new Players();
    
    Dice dice = new Dice();
    
    int randomDicePoint = rand.nextInt(6);
    String gameMode;    
    String xPress;
    int startGame=1;
    int endGame=100;    

    //final static int winPoint=100;       
    
    public void startPlaying()
    {  
        System.out.println("\t "+"LXI Soft Presents "+"\n");
        System.out.println("     " + "Snake And Ladder Game 1.0"+"\n");
        System.out.println("*** Instructions ***"+"\n");
        System.out.println("This program will simulate a regular snakes and ladders game developed by LxiSoft India.");
        System.out.println("You and the computer start at Starting Point 1 and You want to reach Home at ending point");
        System.out.println("When Dice get point 1 You can start the game");
        System.out.println("Good Luck and Have FUN!!!"+"\n");

        System.out.println("Enter Player One Name :");
        playerOne.setName(sc.nextLine());

        System.out.println("Enter Player Two Name :");
        playerTwo.setName(sc.nextLine());

        System.out.println("Enter your game mode :");
        System.out.println("1. Easy ");
        System.out.println("2. Medium ");
        System.out.println("3. Hard ");

        gameMode=sc.nextLine();                    
         
        System.out.println("Yes You Have Selected " + gameMode);
        System.out.println("*** Please Wait Game Is Starting ***");

        for(int i = 0;i < 100;i++)
        {
            System.out.println("Use x to roll Dice");
            xPress = sc.nextLine(); 
                       
            System.out.println(randomDicePoint);
            
            if(playerOne.getName() == startGame)
            {
                System.out.println("Nice Play You Entered The Board");
            }
            else if(playerTwo.getName() == startGame)
            {
                System.out.println("Nice Play You Entered The Board");
            }
            else
            {
                System.out.println("Try Again");
            }
                 
                   
            if(player.getName() == snakes[0]) 
            { 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GOING DOWN!!!~~~~~~~~~~~~~");
            }
            else if (player.getName() == snakes[1])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if (player.getName() == snakes[2])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if (player.getName() == snakes[3])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if (player.getName() == snakes[4])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }

            if(playerTwo.getName() == snakes[0]) 
            { 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GOING DOWN!!!~~~~~~~~~~~~~");
            }
            else if (player.getName() == snakes[1])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if (player.getName() == snakes[2])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if (player.getName() == snakes[3])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if (player.getName() == snakes[4])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
                
            // ********************************************************** //

            if(player.getName() == ladders[0])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }

            else if (player.getName() == ladders[1])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if (player.getName() == ladders[2])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if (player.getName() == ladders[3])
            { 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if (player.getName() == ladders[4])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }

            if(playerTwo.getName() == ladders[0])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }

            else if (player.getName() == ladders[1])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if (player.getName() == ladders[2])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if (player.getName() == ladders[3])
            { 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if (player.getName() == ladders[4])
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }

            if(player.getName() == endGame)
            {
                System.out.println (getPlayerOneName() + "\t\t\t\t  Is Win!");
            }

            else if(player.getName == endGame)
            {
                System.out.println (getPlayerTwoName() + "\t\t\t\t  Is Win!");
            }                
        
        }
    }
                    
    
}

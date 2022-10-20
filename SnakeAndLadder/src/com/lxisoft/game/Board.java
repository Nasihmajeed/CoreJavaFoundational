package com.lxisoft.game;   
import java.util.*;

public class Board
{   
    Locationcell[] locationCell;         

    Scanner sc = new Scanner(System.in);     
    Random rand = new Random();
    
    int randomDicePoint = rand.nextInt(7);
    String gameMode;    
    String xPress;
    int startGame = 1;
    int endGame = 100;    

    public LocationCell[] getLocationCell()
    {
        return locationCell;
    }       

    public void setLocationCell(LocationCell[] LocationCell)
    {
        this.locationCell = LocationCell;
    }
    
    public void startPlaying()
    {  
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

        System.out.println("\n" + "\t\t\t\t\t\t" + "LXI SOFT Presents" + "\n");
        System.out.println("\t\t\t\t\t    " + "Snake And Ladder Game 1.0" + "\n");
        System.out.println("\t\t\t\t\t       " + "*** Instructions ***" + "\n");
        System.out.println("\t\t\t" + "This program will simulate a regular snakes and ladders game developed by LxiSoft India.");
        System.out.println("\t\t\t" + "You and the computer start at Starting Point 1 and You want to reach Home at finishing point 100.");
        System.out.println("\t\t\t" + "When Dice get point 1 You can start the game." + "\n");
        System.out.println("\t\t\t\t\t     " + "Good Luck and Have FUN!!!" + "\n");

        System.out.println("Enter Player One Name :");
        playerOne.setNameOne(sc.nextLine());

        System.out.println("Enter Player Two Name :");
        playerTwo.setNameTwo(sc.nextLine());

        System.out.println("Enter your game mode :");
        System.out.println("1. Easy ");
        System.out.println("2. Medium ");
        System.out.println("3. Hard ");

        gameMode = sc.nextLine();                    
         
        System.out.println("Yes You Have Selected " + gameMode + "\n");
        System.out.println("*** Please Wait Game Is Starting ***" + "\n");

        for(int i = 0;i < 100;i++)
        {
            System.out.println("Player One " + playerOne.getNameOne() + " : ");
        
            System.out.println("Use x to roll Dice");
            xPress = sc.nextLine();

            System.out.println("\n" + randomDicePoint);

            System.out.println("Player Two " + playerTwo.getNameTwo() + " : "); 
                       
            System.out.println("Use x to roll Dice");
            xPress = sc.nextLine();

            System.out.println("\n" + randomDicePoint);
            
            if(playerOne.getNameOne() == String.valueOf(startGame))
            {
                System.out.println("\n" + "Nice Play You Entered The Board");
            }
            else if(playerTwo.getNameTwo() == String.valueOf(startGame))
            {
                System.out.println("\n" + "Nice Play You Entered The Board");
            }
            else
            {
                System.out.println("Try Again");
            }
                 
                   
            if(playerOne.getNameOne() == String.valueOf(snakes[0])) 
            { 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GOING DOWN!!!~~~~~~~~~~~~~");
            }
            else if(playerOne.getNameOne() == String.valueOf(snakes[1]))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if(playerOne.getNameOne() == String.valueOf(snakes[2]))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if(playerOne.getNameOne() == String.valueOf(snakes[3]))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if(playerOne.getNameOne() == String.valueOf(snakes[4]))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }

            if(playerTwo.getNameTwo() == String.valueOf(snakes[0])) 
            { 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GOING DOWN!!!~~~~~~~~~~~~~");
            }
            else if(playerTwo.getNameTwo() == String.valueOf(snakes[1]))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if(playerTwo.getNameTwo() == String.valueOf(snakes[2]))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if(playerTwo.getNameTwo() == String.valueOf(snakes[3]))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if(playerTwo.getNameTwo() == String.valueOf(snakes[4]))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
                
            // ********************************************************** //

            if(playerOne.getNameOne() == String.valueOf(ladders[0]))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }

            else if(playerOne.getNameOne() == String.valueOf(ladders[1]))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if(playerOne.getNameOne() == String.valueOf(ladders[2]))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if(playerOne.getNameOne() == String.valueOf(ladders[3]))
            { 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if(playerOne.getNameOne() == String.valueOf(ladders[4]))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }

            if(playerTwo.getNameTwo() == String.valueOf(ladders[0]))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }

            else if(playerTwo.getNameTwo() == String.valueOf(ladders[1]))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if(playerTwo.getNameTwo() == String.valueOf(ladders[2]))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if(playerTwo.getNameTwo() == String.valueOf(ladders[3]))
            { 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if(playerTwo.getNameTwo() == String.valueOf(ladders[4]))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }

            if(playerOne.getNameOne() == String.valueOf(endGame))
            {
                System.out.println (playerOne.getNameOne() + "\t\t\t\t  Is Win!");
            }

            else if(playerTwo.getNameTwo() == String.valueOf(endGame))
            {
                System.out.println (playerTwo.getNameTwo() + "\t\t\t\t  Is Win!");
            }                
        
        }
    }
                    
    
}

package com.lxisoft.game;
import java.util.*;
import java.util.ArrayList;    

public class Game 
{  
    private Dice dice;
    private Coin coin;

    Player playerOne = new Player();
    Player playerTwo = new Player();

    Coin coinOne = new Coin();
    Coin coinTwo = new Coin();

    public Dice getDice()                                  
    {
        return dice;
    } 
     
    public void setDice(Dice Dice)  
    {
        this.dice = Dice;
    }

    public Coin getCoin()                                  
    {
        return coin;
    } 
     
    public void setCoin(Coin Coins)  
    {
        this.coin = Coins;
    }

    Random rand = new Random();
    Scanner sc = new Scanner(System.in);

    int randomDicePoint = rand.nextInt(7);
    int gameMode;    
    String xPress; 
    int selectColor; 
    int startGame = 1;
    int endGame = 100;

    public void startGame()
    {
        ArrayList<Ladder> ladders = new ArrayList<Ladder>();                
        ladders.add(new Ladder(5,13)); 
        ladders.add(new Ladder(15,27));
        ladders.add(new Ladder(30,57));
        ladders.add(new Ladder(60,77));
        ladders.add(new Ladder(82,98));

        ArrayList<Snake> snakes = new ArrayList<>();
        snakes.add(new Snake(11,3));
        snakes.add(new Snake(39,14));
        snakes.add(new Snake(49,21));
        snakes.add(new Snake(78,6));
        snakes.add(new Snake(99,58));    

        System.out.println("\n" + "\t\t\t\t\t\t" + "LXI SOFT Presents" + "\n");
        System.out.println("\t\t\t\t\t    " + "Snake And Ladder Game 1.0" + "\n");
        System.out.println("\t\t\t\t\t       " + "*** Instructions ***" + "\n");
        System.out.println("\t\t\t" + "This program will simulate a regular snakes and ladders game developed by LxiSoft India.");
        System.out.println("\t\t\t" + "You and the computer start at Starting Point 1 and You want to reach Home at finishing point 100.");
        System.out.println("\t\t\t" + "When Dice get point 1 You can start the game." + "\n");
        System.out.println("\t\t\t\t\t     " + "Good Luck and Have FUN!!!" + "\n");

        System.out.println("Enter Player One Name :");
        playerOne.setName(sc.nextLine());

        System.out.println("Enter Player Two Name :");
        playerTwo.setName(sc.nextLine());

        System.out.println("Enter your game mode :");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");

        gameMode = sc.nextInt();                    
         
        System.out.println("Yes You Have Selected " + gameMode + "\n");
        System.out.println("*** Please Wait Game Is Starting ***" + "\n");

        System.out.println("PlayerOne Please Select Your Colors " +"\n");
        System.out.println("1. Green");
        System.out.println("2. Red");
        coinOne.setColor(sc.nextInt());

        System.out.println("PlayerTwo Please Select Your Colors " +"\n");
        System.out.println("1. Green");
        System.out.println("2. Red");
        coinTwo.setColor(sc.nextInt());
        
        for(int i = 0;i < 100;i++)
        {            
            System.out.println("Player One " + playerOne.getName() + " : ");
        
            System.out.println("Use x to roll Dice");
            xPress = sc.nextLine();

            System.out.println("\n" + randomDicePoint);

            System.out.println("Player Two " + playerTwo.getName() + " : "); 
                       
            System.out.println("Use x to roll Dice");
            xPress = sc.nextLine();

            System.out.println("\n" + randomDicePoint);
            
            if(playerOne.getName() == String.valueOf(startGame))
            {
                System.out.println("\n" + "Nice Play You Entered The Board");
            }
            else if(playerTwo.getName() == String.valueOf(startGame))
            {
                System.out.println("\n" + "Nice Play You Entered The Board");
            }
            else
            {
                System.out.println("Try Again");
            }
                 
                   
            if(playerOne.getName() == String.valueOf(snakes)) 
            { 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GOING DOWN!!!~~~~~~~~~~~~~");
            }
            else if(playerOne.getName() == String.valueOf(snakes))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if(playerOne.getName() == String.valueOf(snakes))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if(playerOne.getName() == String.valueOf(snakes))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if(playerOne.getName() == String.valueOf(snakes))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }

            if(playerTwo.getName() == String.valueOf(snakes)) 
            { 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GOING DOWN!!!~~~~~~~~~~~~~");
            }
            else if(playerTwo.getName() == String.valueOf(snakes))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if(playerTwo.getName() == String.valueOf(snakes))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if(playerTwo.getName() == String.valueOf(snakes))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if(playerTwo.getName() == String.valueOf(snakes))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
                
            // ********************************************************** //

            if(playerOne.getName() == String.valueOf(ladders))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }

            else if(playerOne.getName() == String.valueOf(ladders))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if(playerOne.getName() == String.valueOf(ladders))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if(playerOne.getName() == String.valueOf(ladders))
            { 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if(playerOne.getName() == String.valueOf(ladders))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }

            if(playerTwo.getName() == String.valueOf(ladders))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }

            else if(playerTwo.getName() == String.valueOf(ladders))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if(playerTwo.getName() == String.valueOf(ladders))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if(playerTwo.getName() == String.valueOf(ladders))
            { 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if(playerTwo.getName() == String.valueOf(ladders))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }

            if(playerOne.getName() == String.valueOf(endGame))
            {
                System.out.println (playerOne.getName() + "\t\t\t\t  Is Win!");
            }

            else if(playerTwo.getName() == String.valueOf(endGame))
            {
                System.out.println (playerTwo.getName() + "\t\t\t\t  Is Win!");
            }           
        }
    }
}


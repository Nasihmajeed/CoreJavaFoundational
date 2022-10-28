package com.lxisoft.game;
import java.util.*;
import java.util.ArrayList;    

public class Game implements DiceThrowable,LadderUsable
{  
    private Dice dice;

    private Coin[] coin;

    private int score;
    
    public Dice getDice()                                  
    {
        return dice;
    } 
     
    public void setDice(Dice Dice)  
    {
        this.dice=Dice;
    }

    public Coin[] getCoin()                             
    {
        return coin;
    } 
     
    public void setCoin(Coin[] Coin)
    {
        this.coin=Coin;
    } 

    public int getScore()                       
    {
        return score;
    }
    
    public void setScore(int Score)
    {
        this.score=Score;
    }

    Players playerOne = new Players();
    Players playerTwo = new Players();

    Random rand = new Random();
    Scanner sc = new Scanner(System.in);

    int randomDicePoint = rand.nextInt(7);
    String gameMode;    
    String xPress;
    int startGame = 1;
    int endGame = 100;

    public void gameStarting()
    {
        ArrayList<Ladder> myLadderList = new ArrayList<Ladder>();                
        myLadderList.add(new Ladder(5,13)); 
        myLadderList.add(new Ladder(15,27));
        myLadderList.add(new Ladder(30,57));
        myLadderList.add(new Ladder(60,77));
        myLadderList.add(new Ladder(82,98));

        ArrayList<Snake> mySnakeList = new ArrayList<>();
        mySnakeList.add(new Snake(11,3));
        mySnakeList.add(new Snake(39,14));
        mySnakeList.add(new Snake(49,21));
        mySnakeList.add(new Snake(78,6));
        mySnakeList.add(new Snake(99,58));    

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
                 
                   
            if(playerOne.getNameOne() == String.valueOf(mySnakeList)) 
            { 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GOING DOWN!!!~~~~~~~~~~~~~");
            }
            else if(playerOne.getNameOne() == String.valueOf(mySnakeList))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if(playerOne.getNameOne() == String.valueOf(mySnakeList))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if(playerOne.getNameOne() == String.valueOf(mySnakeList))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if(playerOne.getNameOne() == String.valueOf(mySnakeList))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }

            if(playerTwo.getNameTwo() == String.valueOf(mySnakeList)) 
            { 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GOING DOWN!!!~~~~~~~~~~~~~");
            }
            else if(playerTwo.getNameTwo() == String.valueOf(mySnakeList))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if(playerTwo.getNameTwo() == String.valueOf(mySnakeList))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if(playerTwo.getNameTwo() == String.valueOf(mySnakeList))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
            else if(playerTwo.getNameTwo() == String.valueOf(mySnakeList))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GO DOWN!!!~~~~~~~~~~~~~");
            }
                
            // ********************************************************** //

            if(playerOne.getNameOne() == String.valueOf(myLadderList))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }

            else if(playerOne.getNameOne() == String.valueOf(myLadderList))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if(playerOne.getNameOne() == String.valueOf(myLadderList))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if(playerOne.getNameOne() == String.valueOf(myLadderList))
            { 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if(playerOne.getNameOne() == String.valueOf(myLadderList))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }

            if(playerTwo.getNameTwo() == String.valueOf(myLadderList))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }

            else if(playerTwo.getNameTwo() == String.valueOf(myLadderList))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if(playerTwo.getNameTwo() == String.valueOf(myLadderList))
            {
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if(playerTwo.getNameTwo() == String.valueOf(myLadderList))
            { 
                System.out.println ("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }
            else if(playerTwo.getNameTwo() == String.valueOf(myLadderList))
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

            void throwDice()
            {
                System.out.println("Dice Throwing");
            }

            void useLadder()
            {
                System.out.println("Using Ladder");
            }              
        }
    }
}


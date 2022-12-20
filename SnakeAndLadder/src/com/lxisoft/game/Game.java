package com.lxisoft.game;
import java.util.*;
import java.util.ArrayList;    

public class Game 
{  
    private Dice dice;
    private Coin coin;
    
    Player playerOne = new Player();
    Player playerTwo = new Player();

    Coin coinOneColor = new Coin();
    Coin coinTwoColor = new Coin();

    Board board = new Board();

    Random rand = new Random();
    Scanner sc = new Scanner(System.in);

    int gameMode; 
    int enterCell = 0;
    int winPoint = 100;       
    String xPress; 

    //set a 100 cells in locationCell(For Loop)   
    
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
        System.out.println("\t\t\t\t\t    " + " Snake And Ladder Game  " + "\n");
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

        System.out.println(playerOne.getName() + " Please Select Your Colors " +"\n");
        System.out.println("1. Green");
        System.out.println("2. Red");
        System.out.println("3. Yellow");

        coinOneColor.setColor(sc.nextLine());
        System.out.println("Yes You Have Selected " + coinOneColor.getColor() + "\n");
        
        System.out.println(playerTwo.getName() + " Please Select Your Colors " +"\n");
        System.out.println("1. Green");
        System.out.println("2. Red");
        System.out.println("3. Yellow");

        coinTwoColor.setColor(sc.nextLine());
        System.out.println("Yes You Have Selected " + coinTwoColor.getColor() + "\n");

        for(int i = 0; i < winPoint; i++)
        {            
            System.out.println(playerOne.getName() + "Use x to roll Dice : ");                  
            xPress = sc.nextLine();

            //playerCurrentCell
            //Checking array index whether if any snake or ladder cells are inside!!!
            //Use suitable naming functions and call properly with the perfection connections.
            playerOne.rollDice();
            playerOne.moveCoin();
            if(playerOne.playerCurrentCell == String.valueOf(enterCell))
            {
                System.out.println("\n" + "Nice Play You Entered The Board");
            }
            else
            {
                System.out.println("Try Again");
            }

            System.out.println(playerTwo.getName() + "Use x to roll Dice : ");                       
            xPress = sc.nextLine();

            playerTwo.rollDice();
            playerTwo.moveCoin();            
            if(playerTwo.playerCurrentCell == String.valueOf(enterCell))
            {
                System.out.println("\n" + "Nice Play You Entered The Board");
            }
            else
            {
                System.out.println("Try Again");
            }
                
            playerOne.rollDice();               
            playerOne.moveCoin();
            //++
            //snake 
            //moveCoin() may need Sys out that said "You got bite or wow";
            //Arrange naming for all function datas;
            
            if(playerOne.playerCurrentCell == String.valueOf(Snake.snakeHead)) 
            { 
                System.out.println("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GOING DOWN!!!~~~~~~~~~~~~~");
            }
            
            if(playerTwo.playerCurrentCell == String.valueOf(Snake.snakeHead)) 
            { 
                System.out.println("\t\t\t\t~~~~~~~~~~~~~You Got Bite By A Snake, GOING DOWN!!!~~~~~~~~~~~~~");
            }
                
            // ********************************************************** //

            if(playerOne.playerCurrentCell== String.valueOf(Ladder.ladderBottom))
            {
                System.out.println("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }

            
            if(playerTwo.playerCurrentCell == String.valueOf(Ladder.ladderBottom))
            {
                System.out.println("\t\t\t\t~~~~~~~~~~~~~Whoo Got Ladder!, GO UP MAN!!!~~~~~~~~~~~~~");
            }

            if(playerOne.playerCurrentCell == String.valueOf(winPoint))
            {
                System.out.println(playerOne.getName() + "\t\t\t\t  Is Win!");
            }

            else if(playerCurrentCell == String.valueOf(winPoint))
            {
                System.out.println(playerTwo.getName() + "\t\t\t\t  Is Win!");
            }  

            //playerOne.moveCoin();
            //playerOne.rollDice();
            //playeTwo.moveCoin();
            //playerTwo.rollDice();            
            //playerOne.currentScore();
            //player one have only one coin!
            //playerOne Winning routes(Scores,snakebites,ladder points,etc...).
            //make a well outstanding Connection!
            //conditions for moveCoin() and rollDice() methods.
            
            //**********Ajith Sir Advice*********// 
 
            //try code cleanly
            //use For(ladders l : Ladder)
            //players must have currentCell
            //playerScore currentCell = currentCell + diceValue
            //do in for loop for check conditions
            //ArrayCell(check snake or ladder in cells)
            //if playerScore 9 checks (the number is in the cell of snake or ladder)
            //playerCell has snake(head) playerScore going down to snakeTail.(if statement).
            //game.gameOver playerOne or playerTwo WIN!!!        
        }
    }
}


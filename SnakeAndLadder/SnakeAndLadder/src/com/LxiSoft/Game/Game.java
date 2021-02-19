package com.LxiSoft.Game;
import com.LxiSoft.Game.*;

import java.util.*;

public class Game
{
    int playerNo;
    // String[][] board = new String[10][10];
    Board board = new Board();
    Dice dice = new Dice();
    Snake snake = new Snake();
    Ladder ladder = new Ladder();
    ArrayList<Players> player = new ArrayList<Players>();

    enum GameLevel
    {
        EASY, HARD
    }
    GameLevel level;

    public void startGame()
    {
        System.out.println("\n\n +-------------------- SNAKE AND LADDER -------------------+");
		// board.setBoard();
        // board.print();
        
        System.out.println("\nRules :");
        System.out.println("           1 : Get 1 on dice to enter the Game.");
        System.out.println("           2 : Each player gets a dice roll adjacently.");
        System.out.println("           3 : 6 on dice gives a bonus roll.");
        System.out.println("           4 : There are snakes and ladders.");
        System.out.println("           5 : Snake bites moves the player to the tail.");
        System.out.println("           6 : Ladder helps to move upwards.");
        System.out.println("           7 : First player to reach 100 wins.");
        Scanner s = new Scanner(System.in);

        System.out.println("\nStart Game? \n\t1. Yes \n\t0. No");
        int start = s.nextInt();
        if(start == 1)
        {
            System.out.println("Levels \n\t 1. Easy \n\t 2. Hard");
           
            System.out.println("\n      Note :");
            System.out.println("           1 : Easy level contains more ladders and less snakes.");
            System.out.println("           2 : Hard level contains more snakes and less ladders.");
           
            System.out.println("\nSelect Level :");
            int level = s.nextInt();
            if(level == 1)
            {
                String gameLevel = "EASY";
                this.setLevel(GameLevel.valueOf(gameLevel));
            }
            else if(level == 2)
            {
                String gameLevel = "HARD";
                this.setLevel(GameLevel.valueOf(gameLevel));
            }
        }
    }

    public void setLevel(GameLevel levels)
    {
        Scanner s = new Scanner(System.in);
        switch (levels)
        {
            case EASY:
            System.out.println("                      Welcome to the Game");
            System.out.println(" +-------------------- SNAKE AND LADDER -------------------+");
            System.out.println(" +--------------------   Level : Easy   -------------------+");
            board.setEasyBoard();
            board.eprint();

            System.out.println("Enter the no.of players : ");
            playerNo = s.nextInt();

            board.addPlayer(playerNo,player);
		    board.setPlayer(playerNo,player);
            this.setEasyGame();
            break;

            case HARD:
            System.out.println("                      Welcome to the Game");
            System.out.println(" +-------------------- SNAKE AND LADDER -------------------+");
            System.out.println(" +--------------------   Level : Hard   -------------------+");
            board.setHardBoard();
            board.hprint();

            System.out.println("Enter the no.of players : ");
            playerNo = s.nextInt();

            board.addPlayer(playerNo,player);
		    board.setPlayer(playerNo,player);
            this.setHardGame();
            break;
        }
    }
   
    public void setEasyGame()
    {
        Scanner s = new Scanner(System.in);
        int roll;
        do
        {
            for(int x=0; x<player.size(); x++)
            {
                if(player.get(x).getPosition()==0)
                {
                    this.playGame0(x);
                }
                else if(player.get(x).getPosition()>0)
                {
                    // this.playGame1(x);
                    this.playEasyGame(x);
                }
                if (player.get(x).getPosition()==100)
                {
                    this.winner(x);
                    this.position();
                    break;
                }
            }

            System.out.println("\n-------- Press 1 to roll --------\n");
            roll = s.nextInt();
        }
        while(roll != 0);
    }

    public void setHardGame()
    {
        Scanner s = new Scanner(System.in);
        int roll;
        do
        {
            for(int x=0; x<player.size(); x++)
            {
                if(player.get(x).getPosition()==0)
                {
                    this.playGame0(x);
                }
                else if(player.get(x).getPosition()>0)
                {
                    // this.playGame1(x);
                    this.playHardGame(x);
                }
                if (player.get(x).getPosition()==100)
                {
                    this.winner(x);
                    this.position();
                    break;
                }
            }

            System.out.println("\n-------- Press 1 to roll --------\n");
            roll = s.nextInt();
        }
        while(roll != 0);
    }

    
    public void playGame0(int numb)
    {
        int num = dice.rollDice();
        System.out.println("\n"+player.get(numb).getPlayer()+" Coin : "+player.get(numb).getColor()+"\n gets "+num+" on dice ");
        if(num > 1)
        {
            System.out.println(player.get(numb).getPlayer()+" : Get 1 to enter the Game \n");
            if(num == 6)
            {
                System.out.println(player.get(numb).getPlayer()+" : Gets a bonus\n Roll dice again  ");
                this.playGame0(numb);
            }
        }
        else
        {
            player.get(numb).setPosition(1);
            System.out.println(player.get(numb).getPlayer()+" enters the game \n Current position : "+player.get(numb).getPosition()+"\n");
        }
    }

    
    public void playEasyGame(int numbr)
    {
        int num = dice.rollDice();
        if (num == 0)
        {
            dice.rollDice();
        }
        else if( num >= 1 && num <= 6)
        {
            int y = player.get(numbr).getPosition();
            System.out.println("\n"+player.get(numbr).getPlayer()+" Coin : "+player.get(numbr).getColor()+"\n gets "+num+" on dice ");

            if (num == 6)
            {
                if(player.get(numbr).getPosition()<94)
                {
                    player.get(numbr).setPosition(player.get(numbr).getPosition()+num);
                    System.out.println(player.get(numbr).getPlayer()+" moves to "+player.get(numbr).getPosition()+" \n");
                    if(player.get(numbr).getPosition()==100)
                    {
                        this.winner(numbr);
                        this.position();
                        // System.exit(0);
                    }
                }
                else if(player.get(numbr).getPosition()>94)
                {
                    System.out.println(player.get(numbr).getPlayer()+" stays on same position ");   
                    if(player.get(numbr).getPosition()==100)
                    {
                        this.winner(numbr);
                        this.position();
                        // System.exit(0);
                    }
                }

                System.out.println(player.get(numbr).getPlayer()+" : Gets a bonus\n Roll dice again ");
            
                int bonus = dice.rollDice();

                if(player.get(numbr).getPosition()<94)
                {
                    player.get(numbr).setPosition(player.get(numbr).getPosition()+bonus);
                    System.out.println(player.get(numbr).getPlayer()+" gets "+bonus+" moves to "+player.get(numbr).getPosition()+" ");
                    if(player.get(numbr).getPosition()==100)
                    {
                        this.winner(numbr);
                        this.position();
                        // System.exit(0);
                    }
                }

                else if(player.get(numbr).getPosition()>94 && player.get(numbr).getPosition()<100)
                {
                    player.get(numbr).setPosition(player.get(numbr).getPosition()+bonus);
                    if(y>100)
                    {
                        player.get(numbr).setPosition(player.get(numbr).getPosition()-bonus);
                        System.out.println(player.get(numbr).getPlayer()+" gets "+bonus+" stays on same position ");
                    }
                    else
                    {
                        if(num > 4 && y==96)
                        {
                            System.out.println("\n Get 4 or less to move");
                            System.out.println(player.get(numbr).getPlayer()+" gets "+bonus+" stays on same position ");
                            // player.get(numbr).setPosition(player.get(numbr).getPosition()-bonus);
                        }
                        else if(num > 3 && y==97)
                        {
                            System.out.println("\n Get 3 or less to move");
                            System.out.println(player.get(numbr).getPlayer()+" gets "+bonus+" stays on same position ");
                            // player.get(numbr).setPosition(player.get(numbr).getPosition()-bonus);
                        }
                        else if(num > 1 && y==99)
                        {
                            System.out.println("\n Get 1 to win");
                            System.out.println(player.get(numbr).getPlayer()+" gets "+bonus+" stays on same position "); 
                            // player.get(numbr).setPosition(player.get(numbr).getPosition()-bonus);
                        }
                        else
                        {
                            if(player.get(numbr).getPosition()>100)
                            {
                                System.out.println(player.get(numbr).getPlayer()+" gets "+bonus+" stays on same position "); 
                            }
                            else
                            System.out.println(player.get(numbr).getPlayer()+" gets "+bonus+" moves to "+player.get(numbr).getPosition());
                        }

                        if(player.get(numbr).getPosition()==100)
                        {
                            this.winner(numbr);
                            this.position();
                            // System.exit(0);
                        }
                    }
                }
            }

            else if(num > 4 && y==96)
            {
                System.out.println("\n Get 4 or less to move");
                System.out.println(player.get(numbr).getPlayer()+" stays on same position ");
                player.get(numbr).setPosition(player.get(numbr).getPosition()-num);
                
            }
            else if(num > 3 && y==97)
            {
                System.out.println("\n Get 3 or less to move");
                System.out.println(player.get(numbr).getPlayer()+" stays on same position ");
                player.get(numbr).setPosition(player.get(numbr).getPosition()-num);
            }
            else if(num > 1 && y==99)
            {
                System.out.println("\n Get 1 to win");   
                System.out.println(player.get(numbr).getPlayer()+" stays on same position ");
                player.get(numbr).setPosition(player.get(numbr).getPosition()-num);
            }

            else if((player.get(numbr).getPosition())==100)
            {
                this.winner(numbr);
                this.position();
                // System.exit(0);
            }
            else
            {
                player.get(numbr).setPosition(player.get(numbr).getPosition()+num);
                System.out.println(player.get(numbr).getPlayer()+" moves to "+player.get(numbr).getPosition()+" ");
            }

            if(y<100)
            {
		    	ladder.eClimb(player);
                snake.eBite(player);
            }

            // if(player.get(numbr).getPosition()==100)
            // {
            //     this.winner(numbr);
            //     this.position();
            //     System.exit(0);
            // }
        }
    }

    public void playHardGame(int numbr)
    {
        int num = dice.rollDice();
        if (num == 0)
        {
            dice.rollDice();
        }
        else if( num >= 1 && num <= 6)
        {
            int y = player.get(numbr).getPosition();
            System.out.println("\n"+player.get(numbr).getPlayer()+" Coin : "+player.get(numbr).getColor()+"\n gets "+num+" on dice ");

            if (num == 6)
            {
                if(player.get(numbr).getPosition()<=94)
                {
                    player.get(numbr).setPosition(player.get(numbr).getPosition()+num);
                    System.out.println(player.get(numbr).getPlayer()+" moves to "+player.get(numbr).getPosition()+" \n");
                    if(player.get(numbr).getPosition()==100)
                    {
                        this.winner(numbr);
                        this.position();
                        // System.exit(0);
                    }
                }
                else if(player.get(numbr).getPosition()>94)
                {
                    System.out.println(player.get(numbr).getPlayer()+" stays on same position ");   
                    if(player.get(numbr).getPosition()==100)
                    {
                        this.winner(numbr);
                        this.position();
                        // System.exit(0);
                    }
                }

                System.out.println(player.get(numbr).getPlayer()+" : Gets a bonus\n Roll dice again ");
            
                int bonus = dice.rollDice();

                if(player.get(numbr).getPosition()<=94)
                {
                    player.get(numbr).setPosition(player.get(numbr).getPosition()+bonus);
                    System.out.println(player.get(numbr).getPlayer()+" gets "+bonus+" moves to "+player.get(numbr).getPosition()+" ");
                    if(player.get(numbr).getPosition()==100)
                    {
                        this.winner(numbr);
                        this.position();
                        // System.exit(0);
                    }
                }

                else if(player.get(numbr).getPosition()>94 && player.get(numbr).getPosition()<100)
                {
                    player.get(numbr).setPosition(player.get(numbr).getPosition()+bonus);
                    if(y>100)
                    {
                        player.get(numbr).setPosition(player.get(numbr).getPosition()-bonus);
                        System.out.println(player.get(numbr).getPlayer()+" gets "+bonus+" stays on same position ");
                    }
                    else
                    {
                        if(num > 4 && y==96)
                        {
                            System.out.println("\n Get 4 or less to move");
                            System.out.println(player.get(numbr).getPlayer()+" gets "+bonus+" stays on same position ");
                            player.get(numbr).setPosition(player.get(numbr).getPosition()-bonus);
                        }
                        else if(num > 3 && y==98)
                        {
                            System.out.println("\n Get 2 or less to move");
                            System.out.println(player.get(numbr).getPlayer()+" gets "+bonus+" stays on same position ");
                            player.get(numbr).setPosition(player.get(numbr).getPosition()-bonus);
                        }
                        else if(num > 1 && y==99)
                        {
                            System.out.println("\n Get 1 to win");
                            System.out.println(player.get(numbr).getPlayer()+" gets "+bonus+" stays on same position "); 
                            player.get(numbr).setPosition(player.get(numbr).getPosition()-bonus);
                        }
                        else
                        {
                            if(player.get(numbr).getPosition()>100)
                            {
                                System.out.println(player.get(numbr).getPlayer()+" gets "+bonus+" stays on same position "); 
                            }
                            else
                            System.out.println(player.get(numbr).getPlayer()+" gets "+bonus+" moves to "+player.get(numbr).getPosition());
                        }

                        if(player.get(numbr).getPosition()==100)
                        {
                            this.winner(numbr);
                            this.position();
                            // System.exit(0);
                        }
                    }
                }
            }

            else if(num > 4 && y==96)
            {
                System.out.println("\n Get 4 or less to move");
                System.out.println(player.get(numbr).getPlayer()+" stays on same position ");
                player.get(numbr).setPosition(player.get(numbr).getPosition()-num);
            }
            else if(num > 3 && y==98)
            {
                System.out.println("\n Get 2 or less to move");
                System.out.println(player.get(numbr).getPlayer()+" stays on same position ");
                player.get(numbr).setPosition(player.get(numbr).getPosition()-num);
            }
            else if(num > 1 && y==99)
            {
                System.out.println("\n Get 1 to win");   
                System.out.println(player.get(numbr).getPlayer()+" stays on same position ");
                player.get(numbr).setPosition(player.get(numbr).getPosition()-num);
            }

            else if((player.get(numbr).getPosition())==100)
            {
                this.winner(numbr);
                this.position();
                // System.exit(0);
            }
            else
            {
                player.get(numbr).setPosition(player.get(numbr).getPosition()+num);
                System.out.println(player.get(numbr).getPlayer()+" moves to "+player.get(numbr).getPosition()+" ");
            }

            if(y<100)
            {
		    	ladder.hClimb(player);
                snake.hBite(player);
            }

            // if(player.get(numbr).getPosition()==100)
            // {
            //     this.winner(numbr);
            //     this.position();
            //     System.exit(0);
            // }
        }
    }

    public void winner(int w)
    { 
        System.out.println("\n\n +-------------------- SNAKE AND LADDER --------------------+");
        System.out.println(" +                          Winner                          +");

        if(player.get(w).getPosition()==100)
        {
			System.out.println("                      "+player.get(w).getPlayer()+" : "+player.get(w).getColor());
		}
        
		System.out.println(" +----------------------------------------------------------+");
    }

    public void position()
    {
        Collections.sort(player);
        System.out.println(" Current Positions ");
        System.out.println(" ----------------- ");
        for(Players p : player)
        {
            System.out.println("Player : " + p.player + " Coin : " + p.color + " Position : " + p.position);
        }
        System.exit(0);  
    }
}
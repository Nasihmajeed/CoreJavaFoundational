package com.LxiSoft.Game;
import com.LxiSoft.Game.*;

import java.util.*;

public class Game
{
    String[][] board = new String[10][10];
    Dice dice = new Dice();
    Snake snake = new Snake();
    Ladder ladder = new Ladder();
    ArrayList<Players> player = new ArrayList<Players>();
    public void startGame()
    {
        System.out.println("\n\n +-------------------- SNAKE AND LADDER -------------------+");
		this.setBoard();
        this.print();
        
        System.out.println("\nRules :");
        System.out.println("           1 : Get 1 on dice to enter the Game.");
        System.out.println("           2 : Each player gets a dice roll adjacently.");
        System.out.println("           3 : 6 on dice gives a bonus roll.");
        System.out.println("           4 : There are snakes and ladders.");
        System.out.println("           5 : Snake bites moves the player to the tail.");
        System.out.println("           6 : Ladder helps to move upwards.");
        System.out.println("           7 : First player to reach 100 wins.");
        Scanner s = new Scanner(System.in);
        // int replay;
        // do
        // {
            System.out.println("\nStart Game? \n\t1.Yes \n\t0.No");
            int start = s.nextInt();
            if(start == 1)
            {
                System.out.println("                     Welcome to the Game");
                System.out.println(" +-------------------- SNAKE AND LADDER -------------------+");
				this.setBoard();
		        // this.print();
		        this.addPlayer();
		        this.setPlayer();
                this.setGame();
                this.winner();
			}
            else
            {
				System.exit(0);
			}
		// 	System.out.println("Restart Game? \n\t1.Yes \n\t0.No");
		// 	replay = s.nextInt();
        // }
        // while(replay !=0 );
    }

    public void restart()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Restart Game? \n\t1.Yes \n\t0.No");
        int replay = s.nextInt();
        if(replay==1)
        {
            this.startGame();
        }
        else
        {
            System.exit(0);
        }
    }

    public void setBoard()
    {
        board[0][0] = "100";
        board[0][1] = " 99";
        board[0][2] = " 98";
        board[0][3] = " 97";
        board[0][4] = " 96";
        board[0][5] = " 95";
        board[0][6] = " 94";
        board[0][7] = " 93";
        board[0][8] = " 92";
        board[0][9] = " 91";

        board[1][0] = " 81";
        board[1][1] = " 82";
        board[1][2] = " 83";
        board[1][3] = " 84";
        board[1][4] = " 85";
        board[1][5] = " 86";
        board[1][6] = " 87";
        board[1][7] = " 88";
        board[1][8] = " 89";
        board[1][9] = " 90";

        board[2][0] = " 80";
        board[2][1] = " 79";
        board[2][2] = " 78";
        board[2][3] = " 77";
        board[2][4] = " 76";
        board[2][5] = " 75";
        board[2][6] = " 74";
        board[2][7] = " 73";
        board[2][8] = " 72";
        board[2][9] = " 71";

        board[3][0] = " 61";
        board[3][1] = " 62";
        board[3][2] = " 63";
        board[3][3] = " 64";
        board[3][4] = " 65";
        board[3][5] = " 66";
        board[3][6] = " 67";
        board[3][7] = " 68";
        board[3][8] = " 69";
        board[3][9] = " 70";

        board[4][0] = " 60";
        board[4][1] = " 59";
        board[4][2] = " 58";
        board[4][3] = " 57";
        board[4][4] = " 56";
        board[4][5] = " 55";
        board[4][6] = " 54";
        board[4][7] = " 53";
        board[4][8] = " 52";
        board[4][9] = " 51";

        board[5][0] = " 41";
        board[5][1] = " 42";
        board[5][2] = " 43";
        board[5][3] = " 44";
        board[5][4] = " 45";
        board[5][5] = " 46";
        board[5][6] = " 47";
        board[5][7] = " 48";
        board[5][8] = " 49";
        board[5][9] = " 50";

        board[6][0] = " 40";
        board[6][1] = " 39";
        board[6][2] = " 38";
        board[6][3] = " 37";
        board[6][4] = " 36";
        board[6][5] = " 35";
        board[6][6] = " 34";
        board[6][7] = " 33";
        board[6][8] = " 32";
        board[6][9] = " 31";

        board[7][0] = " 21";
        board[7][1] = " 22";
        board[7][2] = " 23";
        board[7][3] = " 24";
        board[7][4] = " 25";
        board[7][5] = " 26";
        board[7][6] = " 27";
        board[7][7] = " 28";
        board[7][8] = " 29";
        board[7][9] = " 30";

        board[8][0] = " 20";
        board[8][1] = " 19";
        board[8][2] = " 18";
        board[8][3] = " 17";
        board[8][4] = " 16";
        board[8][5] = " 15";
        board[8][6] = " 14";
        board[8][7] = " 13";
        board[8][8] = " 12";
        board[8][9] = " 11";

        board[9][0] = "  1";
        board[9][1] = "  2";
        board[9][2] = "  3";
        board[9][3] = "  4";
        board[9][4] = "  5";
        board[9][5] = "  6";
        board[9][6] = "  7";
        board[9][7] = "  8";
        board[9][8] = "  9";
        board[9][9] = " 10";
    }

    public void addPlayer()
    {
		player.add(new Player1());
		player.add(new Player2());
    }
    
    public void setPlayer()
    {
		player.get(0).setPlayer("Player 1");
		player.get(0).setColor("Blue");
		player.get(0).setPosition(0);
		player.get(1).setPlayer("Player 2");
		player.get(1).setColor("Red");
		player.get(1).setPosition(0);
    }

    public void exception()
    {
        
    }
    
    public void setGame()
    {
        while(player.get(0).getPosition()<100 && player.get(0).getPosition()<100)
        {
            if(player.get(0).getPosition()==0 && player.get(1).getPosition()==0)
            {
                this.playGame1();
                this.playGame2();
            }
            else if(player.get(0).getPosition()==0 && player.get(1).getPosition()>0){
				this.player1Game();
				this.player2Game();
				
			}
			else if(player.get(0).getPosition()>0 && player.get(1).getPosition()==0){
				this.player1Game();
				this.player2Game();
			}
			else if(player.get(0).getPosition()>0 && player.get(1).getPosition()>0){
				this.player1Game();
				this.player2Game();
			}
		}
    }
    
    public void playGame1()
    {
		int num = dice.rollDice();
		System.out.println("\n"+player.get(0).getPlayer()+" Colour : "+player.get(0).getColor()+"\n gets "+num+" on dice ");
        if(num != 1)
        {
			System.out.println(player.get(0).getPlayer()+" : Get 1 to enter the Game ");
		}
        else
        {
			player.get(0).setPosition(1);
			System.out.println(player.get(0).getPlayer()+" enters the game \n Current position : "+player.get(0).getPosition());
		}
    }
    
    public void playGame2()
    {
		int num = dice.rollDice();
		System.out.println("\n"+player.get(1).getPlayer()+" Colour : "+player.get(1).getColor()+"\n gets "+num+" on dice ");
        if(num != 1)
        {
			System.out.println(player.get(1).getPlayer()+" : Get 1 to enter the Game ");
		}
        else
        {
			player.get(1).setPosition(1);
			System.out.println(player.get(1).getPlayer()+" enters the game \n Current position : "+player.get(1).getPosition());
		}
    }
    
    public void player1Game()
    {
        int num = dice.rollDice();
        if (num == 0)
        {
            dice.rollDice();
        }
        else if (num == 6)
        {
            System.out.println("\n"+player.get(0).getPlayer()+" Colour : "+player.get(0).getColor()+"\n gets "+num+" on dice ");
            // int b = player.get(0).getPosition();
            if((player.get(0).getPosition())<=94)
            {
                player.get(0).setPosition(player.get(0).getPosition()+num);
                System.out.println(player.get(0).getPlayer()+" moves to "+player.get(0).getPosition()+" ");
                if((player.get(0).getPosition())==100)
                {
                    this.winner();
                    // System.exit(0);
                    this.restart();
                }
            }
            
            System.out.println(player.get(0).getPlayer()+" : Gets a bonus\n Roll dice again ");
            int bonus = dice.rollDice();
            if((player.get(0).getPosition())<=94)
            {
                player.get(0).setPosition(player.get(0).getPosition()+bonus);
                System.out.println(player.get(0).getPlayer()+" gets "+bonus+" moves to "+player.get(0).getPosition());
                if((player.get(0).getPosition())==100)
                {
                    this.winner();
                    // System.exit(0);
                    this.restart();
                }
            }
        }

        else
        {
            int x = player.get(0).getPosition();
            System.out.println("\n"+player.get(0).getPlayer()+" Colour : "+player.get(0).getColor()+"\n gets "+num+" on dice ");

            if(num > 4 && x==96)
            {
                System.out.println("\n Get 4 or less to move");
            }
            else if(num > 3 && x==97)
            {
                System.out.println("\n Get 3 or less to move");   
            }
            else if(num > 1 && x==99)
            {
                System.out.println("\n Get 1 to win");   
            }
            else if((player.get(0).getPosition())==100)
            {
                this.winner();
                // System.exit(0);
                this.restart();
            }
            else
            {
                player.get(0).setPosition(player.get(0).getPosition()+num);
            }
		    System.out.println(player.get(0).getPlayer()+" moves to "+player.get(0).getPosition()+" ");
            if(x<=100)
            {
		    	ladder.climb(player);
                snake.bite(player);
            }
        }
    }
    
    public void player2Game()
    {
        int num = dice.rollDice();
        if (num == 0)
        {
            dice.rollDice();
        }
        else if (num == 6)
        {
            System.out.println("\n"+player.get(1).getPlayer()+" Colour : "+player.get(1).getColor()+"\n gets "+num+" on dice ");
            // int b = player.get(1).getPosition();
            if((player.get(1).getPosition())<=94)
            {
                player.get(1).setPosition(player.get(1).getPosition()+num);
                System.out.println(player.get(1).getPlayer()+" moves to "+player.get(1).getPosition()+" ");
                if((player.get(1).getPosition())==100)
                {
                    this.winner();
                    // System.exit(0);
                    this.restart();
                }
            }
            
            System.out.println(player.get(1).getPlayer()+" : Gets a bonus\n Roll dice again ");
            int bonus = dice.rollDice();
            if((player.get(1).getPosition())<=94)
            {
                player.get(1).setPosition(player.get(1).getPosition()+bonus); 
                System.out.println(player.get(1).getPlayer()+" gets "+bonus+" moves to "+player.get(1).getPosition()); 
                if((player.get(1).getPosition())==100)
                {
                    this.winner();
                    // System.exit(0);
                    this.restart();
                }
            }    
        }

        else
        {
            System.out.println("\n"+player.get(1).getPlayer()+" Colour : "+player.get(1).getColor()+"\n gets "+num+" on dice ");
            int y = player.get(1).getPosition();

            if(num > 4 && y==96)
            {
                System.out.println("\n Get 4 or less to move");
            }
            else if(num > 3 && y==97)
            {
                System.out.println("\n Get 3 or less to move");   
            }
            else if(num > 1 && y==99)
            {
                System.out.println("\n Get 1 to win");   
            }
            else if((player.get(1).getPosition())==100)
            {
                this.winner();
                // System.exit(0);
                this.restart();
            }
            else
            {
                player.get(1).setPosition(player.get(1).getPosition()+num);
            }
        
        
		    System.out.println(player.get(1).getPlayer()+" moves to "+player.get(1).getPosition()+" ");
		
            if(y<=100)
            {
		    	ladder.climb(player);
                snake.bite(player);
            }
        }
    }
    
    public void winner()
    { 
        System.out.println("\n\n +-------------------- SNAKE AND LADDER --------------------+");
        System.out.println(" +                          Winner                          +");

        if(player.get(0).getPosition()==100)
        {
			System.out.println("                      "+player.get(0).getPlayer()+" : "+player.get(0).getColor());
		}
        else if(player.get(1).getPosition()==100)
        {
			System.out.println("                      "+player.get(1).getPlayer()+" : "+player.get(1).getColor());
		}
		System.out.println(" +----------------------------------------------------------+");
    }
    
    public void print()
    {
		System.out.println("+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
        for(int i=0; i<10; i++)
        {
            for(int j=0; j<10; j++)
            {
				System.out.print("|");
                System.out.print(" "+board[i][j]+" ");
			}
            System.out.print("|\n");
            System.out.println("+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+"); 	
		}
		// System.out.println("+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
	}
}
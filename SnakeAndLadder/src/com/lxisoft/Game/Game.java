package com.lxisoft.Game;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Game
{
    Scanner scanner = new Scanner(System.in);
    Board board = new Board();

    public void welcomePage()
    {
    	System.out.println("\n");
    	System.out.println("*****************************************************************");
    	System.out.println("*****************************************************************");
    	System.out.println("\n\n                   WELCOME TO SNAKE AND LADDER                   ");
    	System.out.println("\n\n*****************************************************************");
    	System.out.println("*****************************************************************");
    }

    public void instruction()
    {
    	System.out.println("\nRead the instructions carefully");
    	System.out.println("\n");
    	System.out.println("1.Only two players can play this game.");
    	System.out.println("2.Each player puts their counter on the space if they get 1 on dice they enter to the game.");
    	System.out.println("3.Take it in turns to roll the dice. Move your counter forward the number of spaces shown on the dice.");
    	System.out.println("4.If your counter lands at the bottum of a ladder, you can move up to the top of the ladder.");
    	System.out.println("5.If your counter lands on the head of a snake, you must slide down to the bottom of the snake.");
    	System.out.println("6.The first player to get to the space of 100 is the Winner of the game.");
    	System.out.println("\n Have fun!");
    }

    public void starting()
    {
    	System.out.println("\nPress 1 to start game");
    	int a = scanner.nextInt();
    	if(a==1)
    	{
    		board.playerName();
    	}
    	else
    	{
    		System.out.println("Please select valid option");
    	}
    }

    public void printBoard()
    {
    	int i,j;
    	System.out.println("\n++++++++++++++++++++++++++ SNAKE AND LADDER ++++++++++++++++++++++++++++++");
    	System.out.println();
        this.createBoard();
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");	
    }

    public void createBoard()
    {
    	int i,j;
    	int[][] arr = new int [10][10];
        for(i=0;i<10;i++)
        {
            for(j=0;j<10;j++)
            {

                arr[0][0] = 100;
                arr[0][1] = 99;
                arr[0][2] = 98;
                arr[0][3] = 97;
                arr[0][4] = 96;
                arr[0][5] = 95;
                arr[0][6] = 94;
                arr[0][7] = 93;
                arr[0][8] = 92;
                arr[0][9] = 91;

                arr[1][0] = 81;
                arr[1][1] = 82;
                arr[1][2] = 83;
                arr[1][3] = 84;
                arr[1][4] = 85;
                arr[1][5] = 86;
                arr[1][6] = 87;
                arr[1][7] = 88;
                arr[1][8] = 89;
                arr[1][9] = 90;

                arr[2][0] = 80;
                arr[2][1] = 79;
                arr[2][2] = 78;
                arr[2][3] = 77;
                arr[2][4] = 76;
                arr[2][5] = 75;
                arr[2][6] = 74;
                arr[2][7] = 73;
                arr[2][8] = 72;
                arr[2][9] = 71; 

                arr[3][0] = 61;
                arr[3][1] = 62;
                arr[3][2] = 63;
                arr[3][3] = 64;
                arr[3][4] = 65;
                arr[3][5] = 66;
                arr[3][6] = 67;
                arr[3][7] = 68;
                arr[3][8] = 69;
                arr[3][9] = 70;

                arr[4][0] = 60;
                arr[4][1] = 59;
                arr[4][2] = 58;
                arr[4][3] = 57;
                arr[4][4] = 56;
                arr[4][5] = 55;
                arr[4][6] = 54;
                arr[4][7] = 53;
                arr[4][8] = 52;
                arr[4][9] = 51;

                arr[5][0] = 41;
                arr[5][1] = 42;
                arr[5][2] = 43;
                arr[5][3] = 44;
                arr[5][4] = 45;
                arr[5][5] = 46;
                arr[5][6] = 47;
                arr[5][7] = 48;
                arr[5][8] = 49;
                arr[5][9] = 50;

                arr[6][0] = 40;
                arr[6][1] = 39;
                arr[6][2] = 38;
                arr[6][3] = 37;
                arr[6][4] = 36;
                arr[6][5] = 35;
                arr[6][6] = 34;
                arr[6][7] = 33;
                arr[6][8] = 32;
                arr[6][9] = 31;

                arr[7][0] = 21;
                arr[7][1] = 22;
                arr[7][2] = 23;
                arr[7][3] = 24;
                arr[7][4] = 25;
                arr[7][5] = 26;
                arr[7][6] = 27;
                arr[7][7] = 28;
                arr[7][8] = 29;
                arr[7][9] = 30;

                arr[8][0] = 20;
                arr[8][1] = 19;
                arr[8][2] = 18;
                arr[8][3] = 17;
                arr[8][4] = 16;
                arr[8][5] = 15;
                arr[8][6] = 14;
                arr[8][7] = 13;
                arr[8][8] = 12;
                arr[8][9] = 11;

                arr[9][0] = 1;
                arr[9][1] = 2;
                arr[9][2] = 3;
                arr[9][3] = 4;
                arr[9][4] = 5;
                arr[9][5] = 6;
                arr[9][6] = 7;
                arr[9][7] = 8;
                arr[9][8] = 9;
                arr[9][9] = 10;

                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }

    public void player1()
    {
        System.out.println("\nPress 1 to start the game for player1");
        int c = scanner.nextInt();
       
        if(c==1)
        {
            System.out.println("\nDice rolling for "+board.player.get(0).getName()+" is ");
            int a = board.player.get(0).dice.random();
            System.out.println(a);

            if(a != 1)
            {
                System.out.println("\n"+board.player.get(0).getName()+" cannot enter the game");                 
            }
            else
            {
            	System.out.println("\n----------------------------------------------------------------");
            	System.out.println("CONGRATULATIONS PLAYER 1 ENTERED THE GAME");
            	board.player.get(0).setPosition(1);
            	System.out.println("\nPlayer 1 is in  "+board.player.get(0).getPosition()+"th  position");
            	System.out.println("----------------------------------------------------------------");

            	System.out.println("\nPress 1 to get one more chance to play");
            	int d=scanner.nextInt();
         	    if(d==1)
            	{
            		System.out.println("\nDice rolling for "+board.player.get(0).getName()+" is ");
                    int a1 = board.player.get(0).dice.random();
                    System.out.println(a1);

                    board.player.get(0).setPosition(board.player.get(0).getPosition()+a1);
                    System.out.println("\nPlayer 1 is in  "+board.player.get(0).getPosition()+"th position");
                }
                else
                {
                	System.out.println("Invalid choice");
                }
            }
        }
        else
        {
        	System.out.println("Invalid choice");
        }
    }

    public void player1Play()
    {
    	System.out.println("\nPress 1 to start the game for player1");
        int c = scanner.nextInt();
       
        if(c==1)
        {
            System.out.println("\nDice rolling for "+board.player.get(0).getName()+" is ");
            int a2 = board.player.get(0).dice.random();
            System.out.println(a2);

            board.player.get(0).setPosition(board.player.get(0).getPosition()+a2);
            int d = board.player.get(0).getPosition(); 
            if(d<=100)
            {
            	System.out.println("\nPlayer 1 is in  "+d+"th position");
            	this.ladder();
            	this.snake();
            }
            else
            {
            	board.player.get(0).setPosition(board.player.get(0).getPosition()-a2);
                System.out.println("\nPlayer 1 is in  "+board.player.get(0).getPosition()+"th position");
            }
        }
        else
        {
        	System.out.println("Invalide choice");
        }    
    }

    public void player2()
    {	
        System.out.println("\n\nPress 1 to start the game for player2");
        int c = scanner.nextInt();
        
        if(c==1)
        {	
        	System.out.println("\nDice rolling for "+board.player.get(1).getName()+" is ");
            int b = board.player.get(1).dice.random();
            System.out.println(b);

            if(b != 1)
            {
                System.out.println("\n"+board.player.get(1).getName()+" cannot enter the game");                 
            }
            else
            {
            	System.out.println("\n----------------------------------------------------------------");
            	System.out.println("CONGRATULATIONS PLAYER 2 ENTERED THE GAME");
            	board.player.get(1).setPosition(1);
            	System.out.println("\nPlayer 2 is in  "+board.player.get(1).getPosition()+"th position");
            	System.out.println("----------------------------------------------------------------");

            	System.out.println("\nPress 1 to get one more chance to play");
            	int d=scanner.nextInt();
            	if(d==1)
            	{
            		System.out.println("\nDice rolling for "+board.player.get(1).getName()+" is ");
                    int b1 = board.player.get(1).dice.random();
                    System.out.println(b1);

                    board.player.get(1).setPosition(board.player.get(1).getPosition()+b1);
                    System.out.println("\nPlayer 2 is in  "+board.player.get(1).getPosition()+"th position");
            	}
            	else
                {
                	System.out.println("Invalid choice");
                }
            }
        }
        else
        {
        	System.out.println("Invalid choice");
        }
    }

    public void player2Play()
    {
    	System.out.println("\nPress 1 to start the game for player2");
        int c = scanner.nextInt();
       
        if(c==1)
        {
            System.out.println("\nDice rolling for "+board.player.get(1).getName()+" is ");
            int b2 = board.player.get(1).dice.random();
            System.out.println(b2);

            board.player.get(1).setPosition(board.player.get(1).getPosition()+b2);
            int d = board.player.get(1).getPosition(); 
            if(d<=100)
            {
            	System.out.println("\nPlayer 2 is in  "+d+"th position");
            	this.ladder();
            	this.snake();
            }
            else
            {
            	board.player.get(1).setPosition(board.player.get(1).getPosition()-b2);
                System.out.println("\nPlayer 2 is in  "+board.player.get(1).getPosition()+"th position");
            }            
        }
        else
        {
        	System.out.println("Invalide choice");
        }    
    }

    public void playGame()
    {
    	while(board.player.get(0).getPosition() < 100 && board.player.get(1).getPosition() < 100)
    	{
    		if(board.player.get(0).getPosition() == 0 && board.player.get(1).getPosition() == 0)
    		{
    	        this.player1();
    	        this.player2();
    	    }
    	    else if(board.player.get(0).getPosition() == 0 && board.player.get(1).getPosition() > 0)
    	    {
    	    	this.player1();
    	    	this.player2Play();
    	    } 
    	    else if(board.player.get(0).getPosition() > 0 && board.player.get(1).getPosition() == 0)
    	    {
    	    	this.player1Play();
    	    	this.player2();
    	    } 
    	    else if(board.player.get(0).getPosition() > 0 && board.player.get(1).getPosition() > 0)
    	    {
    	    	this.player1Play();
    	    	this.player2Play();
    	    }
    	}
    } 

    public void winner()
    {
    	if(board.player.get(0).getPosition() == 100)
    	{
    		System.out.println("\n******************************************");
    		System.out.println("Ultimate Winner is : "+board.player.get(0).getName());
    		System.out.println("******************************************");
    	}

    	else if(board.player.get(1).getPosition() == 100) 
    	{
    		System.out.println("\n******************************************");
    		System.out.println("Ultimate Winner is : "+board.player.get(1).getName());
    		System.out.println("******************************************");
    	}
    	System.out.println("Game Over");
    }

    public void ladder()
    {
    	for(int i=0;i<board.player.size();i++)
    	{
    		if(board.player.get(i).getPosition() == 4)
    		{
    			System.out.println("\nWow there is a ladder in the position 4");
    			board.player.get(i).setPosition(36);
    			System.out.println("\nYour current position: "+board.player.get(i).getPosition());
    		}
    		else if(board.player.get(i).getPosition() == 12)
    		{
    			System.out.println("\nWow there is a ladder in the position 12");
    			board.player.get(i).setPosition(53);
    			System.out.println("\nYour current position is: "+board.player.get(i).getPosition());
    		}
    		else if(board.player.get(i).getPosition() == 40)
    		{
    			System.out.println("\nWow there is a ladder in the position 40");
    			board.player.get(i).setPosition(81);
    			System.out.println("\nYour current position is: "+board.player.get(i).getPosition());
    		}
    		else if(board.player.get(i).getPosition() == 66)
    		{
    			System.out.println("\nWow there is a ladder in the position 66");
    			board.player.get(i).setPosition(97);
    			System.out.println("\nYour current position is: "+board.player.get(i).getPosition());
    		}
    		else if(board.player.get(i).getPosition() == 71)
    		{
    			System.out.println("\nWow there is a ladder in the position 71");
    			board.player.get(i).setPosition(91);
    			System.out.println("\nYour current position is: "+board.player.get(i).getPosition());
    		}
    	}
    }

    public void snake()
    {
    	for(int i=0;i<board.player.size();i++)
    	{
    		if(board.player.get(i).getPosition() == 98)
    		{
    			System.out.println("\nOho there is a snake in the position 98");
    			board.player.get(i).setPosition(8);
    			System.out.println("\nYour current position is: "+board.player.get(i).getPosition());
    		}
            else if(board.player.get(i).getPosition() == 86)
            {
            	System.out.println("\noho there is a snake in the position 86");
            	board.player.get(i).setPosition(25);
    			System.out.println("\nYour current position is: "+board.player.get(i).getPosition());
            }
            else if(board.player.get(i).getPosition() == 62)
            {
            	System.out.println("\noho there is a snake in the position 62");
            	board.player.get(i).setPosition(19);
    			System.out.println("\nYour current position is: "+board.player.get(i).getPosition());
            }
            else if(board.player.get(i).getPosition() == 31)
            {
                System.out.println("\noho there is a snake in the position 31");
            	board.player.get(i).setPosition(7);
    			System.out.println("\nYour current position is: "+board.player.get(i).getPosition());	
            }
    	}
    }

}
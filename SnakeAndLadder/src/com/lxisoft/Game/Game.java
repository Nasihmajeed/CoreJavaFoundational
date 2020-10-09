package com.lxisoft.Game;
import java.util.Scanner;

public class Game
{
    Scanner scanner = new Scanner(System.in);
    Board board = new Board();

    public void welcomePage()
    {
    	System.out.println("\n");
    	System.out.println("*******************************************");
    	System.out.println("*******************************************");
    	System.out.println("***     WELCOME TO SNAKE AND LADDER     ***");
    	System.out.println("*******************************************");
    	System.out.println("*******************************************");
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
}
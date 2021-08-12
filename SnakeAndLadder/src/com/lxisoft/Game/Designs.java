package com.LxiSoft.Game;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Designs
{
	public void gameBoard()
	{

		    int counter= 1000;
		    int iteration=-1; 
        System.out.println ("-----------------------------------------------------Game Board-----------------------------------------------------------------------------");
        
       
        while (counter > 0)
        {
                if (counter%10 == 0 && counter != 1000)
                {
                if(iteration==-1)
                {
                    counter-=9;
                    iteration=1;
                }
                else
                {
                    System.out.print(counter+"\t");
                    counter-=10;
                    iteration=-1; 
                }
                if(counter!=0)
                System.out.print("\n" + counter + "\t"); 
            }
            else
            System.out.print(counter + "\t"); 
            counter+=iteration; 
        }
        System.out.println();
        System.out.println ("----------------------------------------------------------------------------------------------------------------------------------");
        this.gameRule();
        this.snakeAndLadderPosition();
        
	}
    public void gameRule() 
    {
        System.out.println ("\t\t\t\t\t\t\tInstructions:");
        System.out.println(" \t\t\t\t  There will be 2 players in the game");
          System.out.println(" \t\t\tEach player enter the game if and only if he rolls 1 on the dice:");
            System.out.println ("\t\t\t there will be preset squares which will be the snakes or ladders.");
        System.out.println ("\t\tOnce you land on top of a snake you go down a few squares, and move up if you land on the bottom of a ladder. ");
             
        
            System.out.println(" \t\t\t\t  player who reaches at 100th position 1st wins yhe game");
               System.out.println ("\t\t\t\t\t\t Good Luck and Have FUN!!!");

    }
    public void snakeAndLadderPosition()
    {

        System.out.println("\t Ladders \t\t Snakes\n");
        System.out.println("\t 2 - 38  \t\t 25 - 4 ");
        System.out.println("\t 6- 14  \t\t 36 - 15 ");
        System.out.println("\t 17 - 47  \t\t 62 - 57 ");
        System.out.println("\t 33 - 85  \t\t 92 - 53 ");
        System.out.println("\t 52 - 88  \t\t 98 -8 ");
    }

}
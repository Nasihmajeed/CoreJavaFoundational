package com.lxisoft.game;
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
        System.out.println ("\t\t\t\t\t\t\tGENERAL INSTUCTIONS OF GAME");
        System.out.println(" \t\t\t\t THERE WILL BE 2 PLAYERS IN THE GAME ");
        System.out.println(" \t\t\tWE CAN ENTER THE GAME ONLY IF WE GET 1 :");
        System.out.println ("\t\t\t\t\t\t LET'S GO.........");    
        
    }
    public void snakeAndLadderPosition()
    {

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(" ");
        System.out.println("");
        System.out.println("");
    }

}
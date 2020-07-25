package com.lxisoft.AnimalGame;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.lang.Math; 

public class Forest
{

    Animal animal =new Animal();
    Scanner select  = new Scanner(System.in);
    Game game =new Game();
    
    
    
    public void welcomeScreen()
    {
    	System.out.println("                ---------------------------------------------------");
    	System.out.println("                ---------------------------------------------------");
    	System.out.println("                -------------------- Animal Game ------------------");
    	System.out.println("                ---------------------------------------------------");
    	System.out.println("                ---------------------------------------------------");
    	System.out.println("                -------------------- version v1.0 -----------------");
    	System.out.println("                ---------------------------------------------------");
    	System.out.println("                ---------------------------------------------------");

    }
    public void selectionMenu()
	{
		int choice=0;
    do
    {
      System.out.println("\n________________________");
        System.out.println(" \n\n1. Start New Game  \n\n2. Resume Game  \n\n3. Credits \n\n Press 0 for Exit \n");
        choice=select.nextInt();
      
        if(choice==1)
         {
        	game.forestInGame();
        	game.randomSelection();

         }

        if(choice==2)
        {
        	game.resumeGame();
        }
        if(choice==3)
        {
        	game.credits();
        }
        
        else if (choice==0)
        {
             System.out.println(" ");
        }
    }
    while(choice>0);
      

	}
}
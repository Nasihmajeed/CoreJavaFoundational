package com.lxisoft.Design;
import com.lxisoft.Game.Forest;
import com.lxisoft.Test.TDD;
import java.util.Scanner;

public class Design
{	
	Forest forest = new Forest();
  Scanner scnr=new Scanner(System.in);

	public void welcomeScreen()
	{
	  	  System.out.println("                ---------------------------------------------------");
      	System.out.println("                ---------------------------------------------------");
     	  System.out.println("                -------------------- Animal Game ------------------");
      	System.out.println("                ---------------------------------------------------");
      	System.out.println("                ---------------------------------------------------");
      	System.out.println("                -------------------- version v2.0 -----------------");
      	System.out.println("                ---------------------------------------------------");
      	System.out.println("                ---------------------------------------------------\n\n\n");
	
	
	}

	public void participants()
	{
		System.out.println("                ---------------------------------------------------");
		System.out.println("                ---------------------------------------------------");
		System.out.println("                -------------------participants--------------------");
		System.out.println("                ---------------------------------------------------");
		System.out.println("                ---------------------------------------------------\n\n\n");

	}

  public void credits()
  {
    System.out.println("                ---------------------------------------------------");
    System.out.println("                ---------------------------------------------------");
    System.out.println("                ---------------- Developed By Faris ---------------");
    System.out.println("                ---------------------------------------------------");
    System.out.println("                ---------------- LXI Technologies -----------------");
    System.out.println("                ---------------------------------------------------");
    System.out.println("                ---------------------------------------------------\n\n\n");
  }

	public void gameMenu()
	{
		int choice=0;
    	do
    	{
      		System.out.println("\n________________________");
        	System.out.println("\n\n1. Start Game \n\n2. Participants \n\n3. Credits \n\n Press 0 for Exit \n");
        	choice=scnr.nextInt();

        if(choice==1)
        {
          this.participants();
          forest.animal();
          forest.animalList();
          forest.startGame();
        }
        if(choice==2)
        {
             
          this.participants();
          forest.animal();
          forest.animalList(); 
        }
        if(choice==3)
        {
             
           this.credits();
         
        }
        else if(choice==0)
        {
            System.out.println(" ");
        }
    }
    while(choice>0);
      
	}

}


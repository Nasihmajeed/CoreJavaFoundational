package com.lxisoft.Game;
import com.lxisoft.Animals.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class GameInterface
{
public void Game(int playerOne,int playerTwo,ArrayList<Animal> animal)
	{
		if(animal.get(playerOne).getLife()==true && animal.get(playerTwo).getLife()==true )
	  	{
		if (animal.get(playerOne) instanceof Carnivorus && animal.get(playerTwo) instanceof Herbivorus)
		{
			this.carnHerb(playerOne,playerTwo,animal);
		}
		else if (animal.get(playerOne) instanceof Herbivorus && animal.get(playerTwo) instanceof Herbivorus)
		{
			this.herbHerb(playerOne,playerTwo,animal);
		}
		else if (animal.get(playerOne) instanceof Carnivorus && animal.get(playerTwo) instanceof Carnivorus)
		{
			this.carnCarn(playerOne,playerTwo,animal);
		}
		else if (animal.get(playerOne) instanceof Herbivorus && animal.get(playerTwo) instanceof Carnivorus)
		{
			this.herbCarn(playerOne,playerTwo,animal);
		}}}
	public void carnHerb(int playerOne,int playerTwo,	ArrayList<Animal> animal)
   	{ 
               boolean result=this.checkArea(playerOne,playerTwo,animal);
  		if(result == true)
  		{
  			int luckyHerb=luck();
            		 System.out.println(animal.get(playerOne).getName()+"kills"+animal.get(playerTwo).getName());
            		 System.out.println("Player One Name     :"+"    "+animal.get(playerOne).getName()+"\nPlayer One Strength :"+"\t"+"\t"+animal.get(playerOne).getStrength()+"\n");
            		 System.out.println("Player Two Name     :"+"    "+animal.get(playerTwo).getName()+"\nPlayer Two Strength :"+"\t"+"\t"+animal.get(playerTwo).getStrength()+"\n");
           		if(animal.get(playerOne).getStrength() > animal.get(playerTwo).getStrength())
           		 {
           			 if ( animal.get(playerTwo) instanceof Weak)
           			 {
            				if(luckyHerb!=2)
            				{
            					System.out.println("\nWinner is Player One:"+"    "+animal.get(playerOne).getName());
            					animal.get(playerOne).setStrength(animal.get(playerOne).getStrength()-10);
            					System.out.println("\nWinner's New Strength:"+"    "+animal.get(playerOne).getStrength());
            					animal.get(playerTwo).setLife(false);
            					System.out.println("\nLoser is Player Two:"+animal.get(playerTwo).getName());
            					animal.get(playerTwo).setStrength(animal.get(playerTwo).getStrength()-15);
           				 	System.out.println("\nLosser's New Strength:"+"    "+animal.get(playerTwo).getStrength());
           				 	System.out.println("**************************************");
          				}
          				else
          				{
            					System.out.println("\nWinner is Player Two:"+"    "+animal.get(playerTwo).getName());
            					animal.get(playerTwo).setStrength(animal.get(playerTwo).getStrength()-10);
            					System.out.println("\nWinner's New Strength:"+"    "+animal.get(playerTwo).getStrength());
            					animal.get(playerTwo).setLife(false);
            					System.out.println("\nLoser is Player Two:"+animal.get(playerOne).getName());
            					animal.get(playerOne).setStrength(animal.get(playerOne).getStrength()-15);
            					System.out.println("**************************************");
          				}}
         			else
       			 {
         	   			System.out.println("\nWinner is Player Two:"+"    "+animal.get(playerTwo).getName());
            				animal.get(playerTwo).setStrength(animal.get(playerTwo).getStrength()-10);
            				System.out.println("\nWinner's New Strength:"+"    "+animal.get(playerTwo).getStrength());
            				animal.get(playerTwo).setLife(false);
            				System.out.println("\nLoser is Player Two:"+animal.get(playerOne).getName());
            				animal.get(playerOne).setStrength(animal.get(playerOne).getStrength()-15);
            				System.out.println("\nLosser's New Strength:"+"    "+animal.get(playerOne).getStrength());
            				System.out.println("**************************************");
        }}}
	public void herbCarn(int playerOne,int playerTwo,ArrayList<Animal> animal)
   	{ 
               boolean result=this.checkArea(playerOne,playerTwo,animal);
  		if(result == true)
  		{
  			int luckyHerb=luck();
            		System.out.println("Player One Name     :"+"    "+animal.get(playerOne).getName()+"\nPlayer One Strength :"+"\t"+"\t"+animal.get(playerOne).getStrength()+"\n");
            		System.out.println("Player Two Name     :"+"    "+animal.get(playerTwo).getName()+"\nPlayer Two Strength :"+"\t"+"\t"+animal.get(playerTwo).getStrength()+"\n");
            		if(animal.get(playerOne).getStrength()>animal.get(playerTwo).getStrength())
            		{
            			if ( animal.get(playerTwo) instanceof Weak)
            			{
            				if(luckyHerb!=2)
            				{
            					System.out.println("\nWinner is Player One:"+"    "+animal.get(playerOne).getName());
            					animal.get(playerOne).setStrength(animal.get(playerOne).getStrength()-10);
            					System.out.println("\nWinner's New Strength:"+"    "+animal.get(playerOne).getStrength());animal.get(playerTwo).setLife(false);
            					System.out.println("\nLoser is Player Two:"+animal.get(playerTwo).getName());
            					animal.get(playerTwo).setStrength(animal.get(playerTwo).getStrength()-15);
            					System.out.println("**************************************");
          				}}
        				else
        				{
            					System.out.println("\nWinner is Player Two:"+"    "+animal.get(playerTwo).getName());
            					animal.get(playerTwo).setStrength(animal.get(playerTwo).getStrength()-10);
            					System.out.println("\nWinner's New Strength:"+"    "+animal.get(playerTwo).getStrength());
            					animal.get(playerOne).setLife(false);
            					System.out.println("\nLoser is Player One:"+animal.get(playerOne).getName());
            					animal.get(playerOne).setStrength(animal.get(playerOne).getStrength()-15);
            					System.out.println("**************************************");
        				}}}
	public void herbHerb(int playerOne,int playerTwo,ArrayList<Animal> animal)
	{
		boolean result=this.checkArea(playerOne,playerTwo,animal);
  		if(result == true)
  		{
            		System.out.println("Player One Name     :"+"    "+animal.get(playerOne).getName());
            		System.out.println("Player Two Name     :"+"    "+animal.get(playerTwo).getName());
    			System.out.println("\nBoth are Herbivorus and they dont fight each other");
    			System.out.println("**************************************");
    		}}
	public void carnCarn(int playerOne,int playerTwo,	ArrayList<Animal> animal)
	{
  		boolean result=this.checkArea(playerOne,playerTwo,animal);
  		if(result == true)
  		{
            		System.out.println(animal.get(playerOne).getName()+"meets"+animal.get(playerTwo).getName());
            		System.out.println("Player One Name     :"+"    "+animal.get(playerOne).getName()+"\nPlayer One Strength :"+"\t"+"\t"+animal.get(playerOne).getStrength()+"\n");
            		System.out.println("Player Two Name     :"+"    "+animal.get(playerTwo).getName()+"\nPlayer Two Strength :"+"\t"+"\t"+animal.get(playerTwo).getStrength()+"\n");
            		System.out.println();

            		if(animal.get(playerOne).getStrength() > animal.get(playerTwo).getStrength())
            		{
                		System.out.println("\nWinner is Player One:"+"    "+animal.get(playerOne).getName());
                		animal.get(playerOne).setStrength(animal.get(playerOne).getStrength()-10);
                		System.out.println("\nNew Strength of Winner:       "+animal.get(playerOne).getStrength());
                		System.out.println("\nLooser is Player Two:"+"    "+animal.get(playerTwo).getName());
                		animal.get(playerTwo).setStrength(animal.get(playerTwo).getStrength()-30);
                		System.out.println("\nNew strength of Looser:   "+animal.get(playerTwo).getStrength());
                		if(animal.get(playerTwo).getStrength()<=30)
                		{
                   			animal.get(playerTwo).setLife(false);
                   			System.out.println("\nDied animal:  "+animal.get(playerTwo).getName());
                		}
                		System.out.println("**************************************");
            		}
            		else
            		{
                		System.out.println("\nWinner is player Two:"+"    "+animal.get(playerTwo).getName());
                		animal.get(playerTwo).setStrength(animal.get(playerTwo).getStrength()-10);
                		System.out.println("\nNew strength of Winner:       "+animal.get(playerTwo).getStrength());
                 		System.out.println("\n Looser  IS  PLAYER 1"+"    "+animal.get(playerOne).getName());
                		animal.get(playerOne).setStrength(animal.get(playerOne).getStrength()-30);
                		System.out.println("\nNew strength of Looser:   "+animal.get(playerOne).getStrength());
                	if(animal.get(playerOne).getStrength()<=30)
                	{
                    		animal.get(playerOne).setLife(false);
                    		System.out.println("\nDied animal:-  "+animal.get(playerOne).getName());
                	}
                System.out.println("**************************************");
     }}}
	private int luck()
   	{
   		 Random random = new Random();
   		 int randomLuck = random.nextInt(3);
    		return randomLuck;
   	}
	public boolean checkArea(int playerOne,int playerTwo,  ArrayList<Animal> animal)
  	{
    		System.out.println("\t TERRITORY DETAILS ");
    		System.out.println("   **************************");
    		System.out.println("\n"+animal.get(playerOne).getName()+"\t Range =" +animal.get(playerOne).getDistance());
    		System.out.println("\n"+animal.get(playerTwo).getName()+"\t Range =" +animal.get(playerTwo).getDistance());
    		int dist =(animal.get(playerOne).getDistance())-(animal.get(playerTwo).getDistance());int rad =30;
    		if(dist<rad)
    		{
      			System.out.println("\n\t\t=> "+animal.get(playerOne).getName() + " AND " +  animal.get(playerTwo).getName() + " are in SAME TERRITORY \n");
      			return true;
     		}
     		else {System.out.println("\n\t\t=> "+animal.get(playerOne).getName() + " AND " +  animal.get(playerTwo).getName() + " are not in SAME TERRITORY \n");return false; 
     			}}}
       
			
			
		

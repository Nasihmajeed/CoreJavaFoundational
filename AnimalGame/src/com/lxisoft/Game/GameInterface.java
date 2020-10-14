package com.lxisoft.Game;
import com.lxisoft.Animals.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;
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
	}
	}
	}
	   public void carnHerb(int playerOne,int playerTwo,	ArrayList<Animal> animal)
   { 
             int luckyHerb=luckFactor();
            System.out.println("Player One Name     :"+"    "+animal.get(playerOne).getName()+"\nPlayer One Strength :"+"\t"+"\t"+animal.get(playerOne).getStrength()+"\n");
            System.out.println("Player Two Name     :"+"    "+animal.get(playerTwo).getName()+"\nPlayer Two Strength :"+"\t"+"\t"+animal.get(playerTwo).getStrength()+"\n");
            if ( animal.get(playerTwo) instanceof Weak)
            {
            if(luckyHerb!=2)
            {
            System.out.println("\nWinner is Player One:"+"    "+animal.get(playerOne).getName());
            animal.get(playerOne).setStrength(animal.get(playerOne).getStrength()+10);
            System.out.println("\nWinner's New Strength:"+"    "+animal.get(playerOne).getStrength());
            animal.get(playerTwo).setLife(false);
            System.out.println("**************************************");
          }
          else
          {
            System.out.println("\n"+animal.get(playerOne).getName()+"gets exhausted");
            animal.get(playerOne).setStrength(animal.get(playerOne).getStrength()-10);
            System.out.println("\nNew Strength:"+"    "+animal.get(playerOne).getStrength());
              System.out.println("\nLucky Animal"+"    "+animal.get(playerTwo).getName());
            System.out.println("**************************************");
          }
        }
        else
        {
            System.out.println("\nWinner is Player One:"+"    "+animal.get(playerOne).getName());
            animal.get(playerOne).setStrength(animal.get(playerOne).getStrength()+10);
            System.out.println("\nWinner's New Strength:"+"    "+animal.get(playerOne).getStrength());
            animal.get(playerTwo).setLife(false);
            System.out.println("**************************************");
        }
   }
		public void herbCarn(int playerOne,int playerTwo,	ArrayList<Animal> animal)
  				 {
        			  int luckyHerb=luckFactor();
            System.out.println("Player One Name     :"+"    "+animal.get(playerOne).getName()+"\nPlayer One Strength :"+"\t"+"\t"+animal.get(playerOne).getStrength()+"\n");
            System.out.println("Player Two Name     :"+"    "+animal.get(playerTwo).getName()+"\nPlayer Two Strength :"+"\t"+"\t"+animal.get(playerTwo).getStrength()+"\n");
           if (animal.get(playerOne) instanceof Weak)
           {
            if (luckyHerb!=2)
            {
            System.out.println("\nWinner is Player Two:"+"    "+animal.get(playerTwo).getName());
            animal.get(playerTwo).setStrength(animal.get(playerTwo).getStrength()+10);
            System.out.println("\nWinner'S New Strength:"+"    "+animal.get(playerTwo).getStrength());
            animal.get(playerOne).setLife(false);
            System.out.println("**************************************");
            }
            else
            {
            System.out.println("\n"+animal.get(playerTwo).getName()+"gets exhausted");
            animal.get(playerTwo).setStrength(animal.get(playerTwo).getStrength()-10);
            System.out.println("\nNew Strength:"+"    "+animal.get(playerTwo).getStrength());
            System.out.println("\nLucky Animal:"+"    "+animal.get(playerOne).getName());
            System.out.println("**************************************");
            }
          }
          else
          {
            System.out.println("\nWinner is Player Two:"+"    "+animal.get(playerTwo).getName());
            animal.get(playerTwo).setStrength(animal.get(playerTwo).getStrength()+10);
            System.out.println("\nWinner'S New Strength:"+"    "+animal.get(playerTwo).getStrength());
            animal.get(playerOne).setLife(false);
            System.out.println("**************************************");
          }
   }
		
		public void herbHerb(int playerOne,int playerTwo,ArrayList<Animal> animal)
				{
            System.out.println("Player One Name     :"+"    "+animal.get(playerOne).getName()+"\nPlayer One Strength :"+"\t"+"\t"+animal.get(playerOne).getStrength()+"\n");
            System.out.println("Player Two Name     :"+"    "+animal.get(playerTwo).getName()+"\nPlayer Two Strength :"+"\t"+"\t"+animal.get(playerTwo).getStrength()+"\n");
    				System.out.println("\n BOTH ARE HERBIVOROUS");
    				System.out.println("\t \n DONOT FIGHT");
    				System.out.println("**************************************");
    				}
		public void carnCarn(int playerOne,int playerTwo,	ArrayList<Animal> animal)
{
            System.out.println("Player One Name     :"+"    "+animal.get(playerOne).getName()+"\nPlayer One Strength :"+"\t"+"\t"+animal.get(playerOne).getStrength()+"\n");
            System.out.println("Player Two Name     :"+"    "+animal.get(playerTwo).getName()+"\nPlayer Two Strength :"+"\t"+"\t"+animal.get(playerTwo).getStrength()+"\n");
            System.out.println();

            if(animal.get(playerOne).getStrength() >= animal.get(playerTwo).getStrength())
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
                   System.out.println("\n Died animal:  "+animal.get(playerTwo).getName());
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

            }
}
			 private int luckFactor()
   {
    Random rand = new Random();
    int randomLuck = rand.nextInt(3);
    return randomLuck;
   }
			}
			
			
		

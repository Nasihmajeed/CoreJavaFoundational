package com.LxiSoft.Forest;
import java.util.*;
import com.LxiSoft.Animal.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;
public class GamePlay

{
		 Random random = new Random();
    
public void gameConditions(int randomNo,int randomFile,	ArrayList<Animal> animal)

{
  boolean result=this.checkArea(randomNo,randomFile,animal);
  if(result == true)
 {
   if (animal.get(randomNo) instanceof Herbivorus && animal.get (randomFile) instanceof Herbivorus )
    {
   	this.herbVsHerb(randomNo,randomFile,animal);
     }

else if(animal.get(randomNo) instanceof Carnivorous && animal.get(randomFile) instanceof Carnivorous )
  {
 this.carVsCar(randomNo,randomFile,animal);
   }

 else if (animal.get(randomNo) instanceof Herbivorus && animal.get(randomFile) instanceof Carnivorous)
  {
  this.herbVsCar(randomNo,randomFile,animal);
   }

  else if ((animal.get(randomNo) instanceof Carnivorous) && ( animal.get(randomFile) instanceof Herbivorus))
  {
 this.carVsHerb(randomNo,randomFile,animal);
   }
 }
 else
 {
  System.out.println("Animal is not in area");
 }

}
public void herbVsHerb(int randomNo,int randomFile,	ArrayList<Animal> animal)
{
	System.out.println("    \n  PLAYER 1"+"    "+animal.get(randomNo).getName());
    System.out.println("    \n  PLAYER 2"+"    "+animal.get(randomFile).getAnimalName());
    System.out.println("\n BOTH ARE HERBIVOROUS");
    System.out.println("\t \n DONOT FIGHT");
    System.out.println("**************************************");
}
public void carVsCar(int randomNo,int randomFile,	ArrayList<Animal> animal)
{
            System.out.println("    \n  PLAYER 1"+"    "+animal.get(randomNo).getName()+ "   \t STRENGTH    "+animal.get(randomNo).getAnimalStrength());
           //System.out.println();
            System.out.println("    \n  PLAYER 2"+"    "+animal.get(randomFile).getAnimalName()+"    \t STRENGTH    "+animal.get(randomFile).getAnimalStrength());
            System.out.println();

            if(animal.get(randomNo).getAnimalStrength() >= animal.get(randomFile).getAnimalStrength())
            {
                System.out.println("\n WINNER  IS  PLAYER 1"+"    "+animal.get(randomNo).getAnimalName());
                animal.get(randomNo).setAnimalStrength(animal.get(randomNo).getAnimalStrength()-20);
                System.out.println(" \n NEW  STRENGTH     "+animal.get(randomNo).getAnimalStrength());
                animal.get(randomFile).setAnimalLife(false);
                System.out.println("**************************************");
            }

            else
            {

                System.out.println("\n WINNER  IS  PLAYER 2"+"    "+animal.get(randomFile).getAnimalName());
                animal.get(randomFile).setAnimalStrength(animal.get(randomFile).getAnimalStrength()-20);
                System.out.println(" \n NEW  STRENGTH     "+animal.get(randomFile).getAnimalStrength());
                animal.get(randomNo).setAnimalLife(false);
                System.out.println("**************************************");

            }
}

   public void herbVsCar(int randomNo,int randomFile,	ArrayList<Animal> animal)
   {
          int luckyHerb=luckFactor();

            System.out.println("    \n  PLAYER 1"+"    "+animal.get(randomNo).getAnimalName()+"    \t  STRENGTH    "+animal.get(randomNo).getAnimalStrength());
            System.out.println();
            System.out.println("    \n  PLAYER 2"+"    "+animal.get(randomFile).getAnimalName()+"    \t STRENGTH    "+animal.get(randomFile).getAnimalStrength());
            System.out.println();

           if (animal.get(randomNo) instanceof WeakAnimal)
           {
            if (luckyHerb!=2)
            {
            System.out.println("\n WINNER  IS  PLAYER 2"+"    "+animal.get(randomFile).getAnimalName());
            animal.get(randomFile).setAnimalStrength(animal.get(randomFile).getAnimalStrength()+20);
            System.out.println("\n WINNER S NEW STRENGTH"+"    "+animal.get(randomFile).getAnimalStrength());
            animal.get(randomNo).setAnimalLife(false);
            System.out.println("**************************************");
            }
            else
            {
            System.out.println("\n Animal doesnt get food"+"    "+animal.get(randomFile).getAnimalName());
            animal.get(randomFile).setAnimalStrength(animal.get(randomFile).getAnimalStrength()-10);
            System.out.println("\n  NEW STRENGTH"+"    "+animal.get(randomFile).getAnimalStrength());
             System.out.println("    \n  Lucky Animal"+"    "+animal.get(randomNo).getAnimalName());
            System.out.println("**************************************");
            }
          }
          else
          {
                  System.out.println("\n WINNER  IS  PLAYER 2"+"    "+animal.get(randomFile).getAnimalName());
            animal.get(randomFile).setAnimalStrength(animal.get(randomFile).getAnimalStrength()+20);
            System.out.println("\n WINNER S NEW STRENGTH"+"    "+animal.get(randomFile).getAnimalStrength());
            animal.get(randomNo).setAnimalLife(false);
            System.out.println("**************************************");
          }
   }

   public void carVsHerb(int randomNo,int randomFile,	ArrayList<Animal> animal)
   { 
             int luckyHerb=luckFactor();

            System.out.println("    \n  PLAYER 1"+"    "+animal.get(randomNo).getAnimalName()+"    \t  STRENGTH    "+animal.get(randomNo).getAnimalStrength());
            System.out.println();
            System.out.println("    \n  PLAYER 2"+"    "+animal.get(randomFile).getAnimalName()+"    \t  STRENGTH    "+animal.get(randomFile).getAnimalStrength());
            System.out.println();

            if ( animal.get(randomFile) instanceof WeakAnimal)
            {
            if(luckyHerb!=2)
            {
            System.out.println("\n WINNER  IS  PLAYER 1"+"    "+animal.get(randomNo).getAnimalName());
            animal.get(randomNo).setAnimalStrength(animal.get(randomNo).getAnimalStrength()+10);
            System.out.println("\n WINNER S NEW STRENGTH"+"    "+animal.get(randomNo).getAnimalStrength());
            animal.get(randomFile).setAnimalLife(false);
            System.out.println("**************************************");
          }
          else
          {
            System.out.println("\n Animal doesnt get food"+"    "+animal.get(randomNo).getAnimalName());
            animal.get(randomNo).setAnimalStrength(animal.get(randomNo).getAnimalStrength()-10);
            System.out.println("\n  NEW STRENGTH"+"    "+animal.get(randomNo).getAnimalStrength());
              System.out.println("    \n  LuckyAnimal"+"    "+animal.get(randomFile).getAnimalName());
            System.out.println("**************************************");
          }
        }
        else
        {
            System.out.println("\n WINNER  IS  PLAYER 1"+"    "+animal.get(randomNo).getAnimalName());
            animal.get(randomNo).setAnimalStrength(animal.get(randomNo).getAnimalStrength()+20);
            System.out.println("\n WINNER S NEW STRENGTH"+"    "+animal.get(randomNo).getAnimalStrength());
            animal.get(randomFile).setAnimalLife(false);
            System.out.println("**************************************");
        }
   }

   private int luckFactor()
   {
    Random rand = new Random();
    int randomLuck = rand.nextInt(3);
    return randomLuck;
   }
   public boolean checkArea(int randomNo,int randomFile,  ArrayList<Animal> animal)
  {
    int animal1X,animal1Y,animal2X,animal2Y;

    animal1X= 10 + (int) (Math.random()*50);
    animal1Y= 10 + (int) (Math.random()*50);
    animal2X= 10 + (int) (Math.random()*50);
    animal2Y= 10 + (int) (Math.random()*50);
    System.out.println("\t TERRITORY DETAILS ");
    System.out.println("   **************************");
    System.out.println("\n"+animal.get(randomNo).getAnimalName() +"=> \t( "+animal1X+", " +animal1Y+")" + "\t Range =  " +animal.get(randomNo).range );
    System.out.println("\n"+animal.get(randomFile).getAnimalName()+" => \t( "+animal2X+", " +animal2Y+")" + "\t Range =  " +animal.get(randomFile).range);

    int dist = (int) (Math.sqrt(((animal1X - animal2X)*(animal1X - animal2X))+((animal1Y - animal2Y)*(animal1Y - animal2Y))));
    int rad = ((animal.get(randomNo).getRange())+(animal.get(randomFile).getRange()));
    if(dist<= rad)
    {

      System.out.println("\n\t\t=> "+animal.get(randomNo).getAnimalName() + " AND " +  animal.get(randomFile).getAnimalName() + " are in SAME TERRITORY \n");
      return true;
    }
    else
    {
      if(((animal.get(randomNo)) instanceof Herbivorus) && ((animal.get(randomFile)) instanceof Herbivorus))
        System.out.println("\n\t\t=> "+" Both Are Herbivorus => No Fight Happens");
      System.out.println("\n\t\t=> "+animal.get(randomNo).getAnimalName() + " AND " +  animal.get(randomFile).getAnimalName() + " are in DIFFERENT TERRITORY \n\t\t=> No FIGHT TAKES PLACE");
      return false;

    }

  }
}
 


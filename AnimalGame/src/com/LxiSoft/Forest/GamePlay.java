package com.LxiSoft.Forest;
import com.LxiSoft.Animal.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;
public class GamePlay

{
		 Random random = new Random();
     Forest forest=new Forest();

public void gameConditions(int randomNo,int randomFile,	ArrayList<Animal> animal)

{
  if(forest.checkArea()==true)
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
 }
 


package com.lxisoft.Game;
import com.lxisoft.Animals.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;
public class GamePlay

{

     Random random = new Random();

public void gameSpecs(int randomNo,int randomFile, ArrayList<Animal> animal)

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
public void herbVsHerb(int randomNo,int randomFile, ArrayList<Animal> animal)
{
  System.out.println("    \n  PLAYER 1"+"    "+animal.get(randomNo).getName());
    System.out.println("    \n  PLAYER 2"+"    "+animal.get(randomFile).getAnimalName());
    System.out.println("\t \n CAN'T FIGHT TOGETHER");
    System.out.println("-------------------------------");
}
public void carVsCar(int randomNo,int randomFile, ArrayList<Animal> animal)
{
    System.out.println("    \n  PLAYER 1"+"    "+animal.get(randomNo).getName());
            System.out.println("    \n  STRENGTH    "+animal.get(randomNo).getAnimalStrength());
            System.out.println("    \n  PLAYER 2"+"    "+animal.get(randomFile).getAnimalName());
            System.out.println("    \n  STRENGTH    "+animal.get(randomFile).getAnimalStrength());

            if(animal.get(randomNo).getAnimalStrength() >= animal.get(randomFile).getAnimalStrength())
            {
                System.out.println("\n WINNER  IS  PLAYER 1"+"    "+animal.get(randomNo).getAnimalName());
                animal.get(randomNo).setAnimalStrength(animal.get(randomNo).getAnimalStrength()-20);
                System.out.println(" \n NEW  STRENGTH     "+animal.get(randomNo).getAnimalStrength());
                animal.get(randomFile).setAnimalLife(false);
                System.out.println(animal.get(randomFile).getAnimalLife());
                System.out.println("--------------------------------------");
            }

            else
            {

                System.out.println("\n WINNER  IS  PLAYER 2"+"    "+animal.get(randomFile).getAnimalName());
                animal.get(randomFile).setAnimalStrength(animal.get(randomFile).getAnimalStrength()-20);
                System.out.println(" \n NEW  STRENGTH     "+animal.get(randomFile).getAnimalStrength());
                  System.out.println(animal.get(randomNo).getAnimalLife());
                animal.get(randomNo).setAnimalLife(false);
                System.out.println(animal.get(randomNo).getAnimalLife());
                System.out.println("-----------------------------------");

            }
}

   public void herbVsCar(int randomNo,int randomFile, ArrayList<Animal> animal)
   {
          int luckyHerb=luckFactor();
            System.out.println("    \n  PLAYER 1"+"    "+animal.get(randomNo).getAnimalName());
            System.out.println("    \n  STRENGTH    "+animal.get(randomNo).getAnimalStrength());
            System.out.println("    \n  PLAYER 2"+"    "+animal.get(randomFile).getAnimalName());
            System.out.println("    \n  STRENGTH    "+animal.get(randomFile).getAnimalStrength());

           if (animal.get(randomNo) instanceof WeakAnimal)
           {
            if (luckyHerb!=2)
            {
            System.out.println("\n WINNER  IS  PLAYER 2"+"    "+animal.get(randomFile).getAnimalName());
            animal.get(randomFile).setAnimalStrength(animal.get(randomFile).getAnimalStrength()+20);
            System.out.println("\n WINNER S NEW STRENGTH"+"    "+animal.get(randomFile).getAnimalStrength());
            animal.get(randomNo).setAnimalLife(false);
            System.out.println(animal.get(randomNo).getAnimalLife());
            System.out.println("-----------------------------------");
            }
            else
            {
            System.out.println("\n Animal doesnt get food"+"    "+animal.get(randomFile).getAnimalName());
            animal.get(randomFile).setAnimalStrength(animal.get(randomFile).getAnimalStrength()-10);
            System.out.println("\n  NEW STRENGTH"+"    "+animal.get(randomFile).getAnimalStrength());
             System.out.println("    \n  Lucky Animal"+"    "+animal.get(randomNo).getAnimalName());
            System.out.println("------------------------------------");
            }
          }
          else
          {
                  System.out.println("\n WINNER  IS  PLAYER 2"+"    "+animal.get(randomFile).getAnimalName());
            animal.get(randomFile).setAnimalStrength(animal.get(randomFile).getAnimalStrength()+20);
            System.out.println("\n WINNER S NEW STRENGTH"+"    "+animal.get(randomFile).getAnimalStrength());
            animal.get(randomNo).setAnimalLife(false);
            System.out.println(animal.get(randomNo).getAnimalLife());
            System.out.println("----------------------------------");
          }
   }

   public void carVsHerb(int randomNo,int randomFile, ArrayList<Animal> animal)
   { 
             int luckyHerb=luckFactor();

            System.out.println("    \n  PLAYER 1"+"    "+animal.get(randomNo).getAnimalName());
            System.out.println("    \n  STRENGTH    "+animal.get(randomNo).getAnimalStrength());
            System.out.println("    \n  PLAYER 2"+"    "+animal.get(randomFile).getAnimalName());
            System.out.println("    \n  STRENGTH    "+animal.get(randomFile).getAnimalStrength());

            if ( animal.get(randomFile) instanceof WeakAnimal)
            {
            if(luckyHerb!=2)
            {
            System.out.println("\n WINNER  IS  PLAYER 1"+"    "+animal.get(randomNo).getAnimalName());
            animal.get(randomNo).setAnimalStrength(animal.get(randomNo).getAnimalStrength()+10);
            System.out.println("\n WINNER S NEW STRENGTH"+"    "+animal.get(randomNo).getAnimalStrength());
            animal.get(randomFile).setAnimalLife(false);
            System.out.println(animal.get(randomFile).getAnimalLife());
            System.out.println("------------------------------------");
          }
          else
          {
            System.out.println("\n Animal doesnt get food"+"    "+animal.get(randomNo).getAnimalName());
            animal.get(randomNo).setAnimalStrength(animal.get(randomNo).getAnimalStrength()-10);
            System.out.println("\n  NEW STRENGTH"+"    "+animal.get(randomNo).getAnimalStrength());
              System.out.println("    \n  LuckyAnimal"+"    "+animal.get(randomFile).getAnimalName());
            System.out.println("-------------------------------------");
          }
        }
        else
        {
            System.out.println("\n WINNER  IS  PLAYER 1"+"    "+animal.get(randomNo).getAnimalName());
            animal.get(randomNo).setAnimalStrength(animal.get(randomNo).getAnimalStrength()+20);
            System.out.println("\n WINNER S NEW STRENGTH"+"    "+animal.get(randomNo).getAnimalStrength());
            animal.get(randomFile).setAnimalLife(false);
            System.out.println(animal.get(randomFile).getAnimalLife());
            System.out.println("------------------------------------");
        }
   }

   private int luckFactor()
   {
    Random rand = new Random();
    int randomLuck = rand.nextInt(3);
    return randomLuck;
   }
 }
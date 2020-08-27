package com.lxisoft.Game;
import com.lxisoft.Animals.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;
public class GamePlay

{
public void gameConditions(int randomNo,int randomFile,	ArrayList<Animal> animal)

{
 if (animal.get(randomNo) instanceof Herbivorus && animal.get (randomFile) instanceof Herbivorus )
 {
 System.out.println("CAN'T FIGHT");
 System.out.println("-----------------------------------");
  }

else if(animal.get(randomNo) instanceof Carnivorous && animal.get(randomFile) instanceof Carnivorous )
  {
 this.carVsCar(randomNo,randomFile,animal);
   }

 else if (animal.get(randomNo) instanceof Herbivorus && animal.get(randomFile) instanceof Carnivorous)
  {
  this.carVsHerb(randomNo,randomFile,animal);
   }

  else if ((animal.get(randomNo) instanceof Carnivorous) && ( animal.get(randomFile) instanceof Herbivorus))
  {
 this.herbVsCar(randomNo,randomFile,animal);
   }

}

public void carVsCar(int randomNo,int randomFile,	ArrayList<Animal> animal)
{
    System.out.println("    \n  PLAYER 1"+"    "+animal.get(randomNo).getName());
            System.out.println("    \n  STRENGTH    "+animal.get(randomNo).getAnimalStrength());
            System.out.println("    \n  PLAYER 2"+"    "+animal.get(randomFile).getAnimalName());
            System.out.println("    \n  STRENGTH    "+animal.get(randomFile).getAnimalStrength());

            if(animal.get(randomNo).getAnimalStrength() >= animal.get(randomFile).getAnimalStrength())
            {
                System.out.println("\n WINNER  IS  PLAYER1"+"    "+animal.get(randomNo).getAnimalName());
                animal.get(randomNo).setAnimalStrength(animal.get(randomNo).getAnimalStrength()-20);
                System.out.println(" \n NEW  STRENGTH     "+animal.get(randomNo).getAnimalStrength());
                System.out.println(" \n  LOOSER  "+animal.get(randomFile).getAnimalName());
                System.out.println("-------------------------------------------------");
                animal.get(randomFile).setAnimalLife(false);
            }

            else{

                System.out.println("\n WINNER  IS  PLAYER2"+"    "+animal.get(randomFile).getAnimalName());
                animal.get(randomNo).setAnimalStrength(animal.get(randomFile).getAnimalStrength()-20);
                System.out.println(" \n NEW  STRENGTH     "+animal.get(randomFile).getAnimalStrength());
                System.out.println(" \n  LOOSER IS PLAYER1 "+animal.get(randomNo).getAnimalName());
                System.out.println("----------------------------------------------");
                animal.get(randomNo).setAnimalLife(false);

            }
}

   public void herbVsCar(int randomNo,int randomFile,	ArrayList<Animal> animal)
   {
            System.out.println("    \n  PLAYER 1"+"    "+animal.get(randomNo).getAnimalName());
            System.out.println("    \n  STRENGTH    "+animal.get(randomNo).getAnimalStrength());
            System.out.println("    \n  PLAYER 2"+"    "+animal.get(randomFile).getAnimalName());
            System.out.println("    \n  STRENGTH    "+animal.get(randomFile).getAnimalStrength());

            System.out.println("\n WINNER  IS  PLAYER1"+"    "+animal.get(randomNo).getAnimalName());
            animal.get(randomNo).setAnimalStrength(animal.get(randomNo).getAnimalStrength()+20);
            System.out.println("\n WINNER S NEW STRENGTH"+"    "+animal.get(randomNo).getAnimalStrength());
            System.out.println("\n LOOSER  IS  PLAYER2"+"    "+animal.get(randomFile).getAnimalName());
            System.out.println("---------------------------------------------");
            animal.get(randomFile).setAnimalLife(false);

       
   }

   public void carVsHerb(int randomNo,int randomFile,	ArrayList<Animal> animal)
   {
       System.out.println("    \n  PLAYER 1"+"    "+animal.get(randomNo).getAnimalName());
            System.out.println("    \n  STRENGTH    "+animal.get(randomNo).getAnimalStrength());
            System.out.println("    \n  PLAYER 2"+"    "+animal.get(randomFile).getAnimalName());
            System.out.println("    \n  STRENGTH    "+animal.get(randomFile).getAnimalStrength());

            System.out.println("\n WINNER  IS  PLAYER1"+"    "+animal.get(randomNo).getAnimalName());
            animal.get(randomNo).setAnimalStrength(animal.get(randomNo).getAnimalStrength()+20);
            System.out.println("\n WINNER S NEW STRENGTH"+"    "+animal.get(randomNo).getAnimalStrength());
            System.out.println("\n LOOSER  IS  PLAYER2"+"    "+animal.get(randomFile).getAnimalName());
            System.out.println("-------------------------------------------");
            animal.get(randomFile).setAnimalLife(false);
   }
 }

 


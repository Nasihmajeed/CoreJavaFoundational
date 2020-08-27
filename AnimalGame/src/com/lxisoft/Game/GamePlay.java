package com.lxisoft.Game;
import com.lxisoft.Animals.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;
public class GamePlay

{
public void gameSpecs(int rdmNo,int rdmFile,	ArrayList<Animal> animal)

{
 if (animal.get(rdmNo) instanceof Herbivorus && animal.get (rdmFile) instanceof Herbivorus )
 {
 System.out.println("CAN'T FIGHT");
 System.out.println("-----------------------------------");
  }

else if(animal.get(rdmNo) instanceof Carnivorous && animal.get(rdmFile) instanceof Carnivorous )
  {
 this.carVsCar(rdmNo,rdmFile,animal);
   }

 else if (animal.get(rdmNo) instanceof Herbivorus && animal.get(rdmFile) instanceof Carnivorous)
  {
  this.carVsHerb(rdmNo,rdmFile,animal);
   }

  else if ((animal.get(rdmNo) instanceof Carnivorous) && ( animal.get(rdmFile) instanceof Herbivorus))
  {
 this.herbVsCar(rdmNo,rdmFile,animal);
   }

}

public void carVsCar(int randomNo,int randomFile,	ArrayList<Animal> animal)
{
    System.out.println("    \n  PLAYER 1"+"    "+animal.get(rdmNo).getName());
            System.out.println("    \n  STRENGTH    "+animal.get(rdmNo).getAnimalStrength());
            System.out.println("    \n  PLAYER 2"+"    "+animal.get(rdmFile).getAnimalName());
            System.out.println("    \n  STRENGTH    "+animal.get(rdmFile).getAnimalStrength());

            if(animal.get(rdmNo).getAnimalStrength() >= animal.get(rdmFile).getAnimalStrength())
            {
                System.out.println("\n WINNER  IS  PLAYER1"+"    "+animal.get(rdmNo).getAnimalName());
                animal.get(rdmNo).setAnimalStrength(animal.get(rdmNo).getAnimalStrength()-20);
                System.out.println(" \n NEW  STRENGTH     "+animal.get(rdmNo).getAnimalStrength());
                System.out.println(" \n  LOOSER  "+animal.get(rdmFile).getAnimalName());
                System.out.println("-------------------------------------------------");
                animal.get(rdmFile).setAnimalLife(false);
            }

            else{

                System.out.println("\n WINNER  IS  PLAYER2"+"    "+animal.get(rdmFile).getAnimalName());
                animal.get(rdmNo).setAnimalStrength(animal.get(rdmFile).getAnimalStrength()-20);
                System.out.println(" \n NEW  STRENGTH     "+animal.get(rdmFile).getAnimalStrength());
                System.out.println(" \n  LOOSER IS PLAYER1 "+animal.get(rdmNo).getAnimalName());
                System.out.println("----------------------------------------------");
                animal.get(rdmNo).setAnimalLife(false);

            }
}

   public void herbVsCar(int rdmNo,int rdmFile,	ArrayList<Animal> animal)
   {
            System.out.println("    \n  PLAYER 1"+"    "+animal.get(rdmNo).getAnimalName());
            System.out.println("    \n  STRENGTH    "+animal.get(rdmNo).getAnimalStrength());
            System.out.println("    \n  PLAYER 2"+"    "+animal.get(rdmFile).getAnimalName());
            System.out.println("    \n  STRENGTH    "+animal.get(rdmFile).getAnimalStrength());

            System.out.println("\n WINNER  IS  PLAYER1"+"    "+animal.get(rdmNo).getAnimalName());
            animal.get(randomNo).setAnimalStrength(animal.get(rdmNo).getAnimalStrength()+20);
            System.out.println("\n WINNER S NEW STRENGTH"+"    "+animal.get(rdmNo).getAnimalStrength());
            System.out.println("\n LOOSER  IS  PLAYER2"+"    "+animal.get(rdmFile).getAnimalName());
            System.out.println("---------------------------------------------");
            animal.get(rdmFile).setAnimalLife(false);

       
   }

   public void carVsHerb(int rdmNo,int rdmFile,	ArrayList<Animal> animal)
   {
       System.out.println("    \n  PLAYER 1"+"    "+animal.get(rdmNo).getAnimalName());
            System.out.println("    \n  STRENGTH    "+animal.get(rdmNo).getAnimalStrength());
            System.out.println("    \n  PLAYER 2"+"    "+animal.get(rdmFile).getAnimalName());
            System.out.println("    \n  STRENGTH    "+animal.get(rdmFile).getAnimalStrength());

            System.out.println("\n WINNER  IS  PLAYER1"+"    "+animal.get(rdmNo).getAnimalName());
            animal.get(rdmNo).setAnimalStrength(animal.get(rdmNo).getAnimalStrength()+20);
            System.out.println("\n WINNER S NEW STRENGTH"+"    "+animal.get(rdmNo).getAnimalStrength());
            System.out.println("\n LOOSER  IS  PLAYER2"+"    "+animal.get(rdmFile).getAnimalName());
            System.out.println("-------------------------------------------");
            animal.get(rdmile).setAnimalLife(false);
   }
 }

 


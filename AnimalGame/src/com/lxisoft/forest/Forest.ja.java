package com.lxisoft.forest;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;
public class Forest{

    //Animal animals=new Animal();
    public ArrayList<Animal> animalList = new ArrayList<Animal>();
   // Animal animal=new Animal();
    Scanner scanner=new Scanner(System.in);
    Random random=new Random();
    int choice=1;
    Animal winner;
    Animal temp;


    public void printDetails(){
        System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                    ANIMAL GAME                                       *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");

        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");

        System.out.println("                                WELCOME TO THE GAME                                              ");
        System.out.println("                                                                                                 ");


                    
    }




    public void forestDetails(){

        System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");
       
        System.out.println("                                 PARTICIPANTS OF GAME ARE                                       ");  
              
        animalList.add(new Tiger());
        animalList.get(0).setAnimalName("Tiger");
        animalList.get(0).setAnimalStrength(90);
          animalList.get(0).setAnimalAlive(true);




        animalList.add(new Lion());
        animalList.get(1).setAnimalName("Lion");
        animalList.get(1).setAnimalStrength(100);
          animalList.get(1).setAnimalAlive(true);

        animalList.add(new Rabbit());
        animalList.get(2).setAnimalName("Rabbit");
         animalList.get(2).setAnimalStrength(10);
  animalList.get(2).setAnimalAlive(true);

        animalList.add(new Deer());
        animalList.get(3).setAnimalName("Deer");    
         animalList.get(3).setAnimalStrength(20);
           animalList.get(3).setAnimalAlive(true);

        for(int i=0;i<animalList.size();i++){


        System.out.println("                                                                                                 ");
        System.out.println("                                                                                                 ");
        System.out.println(" \n                                              "+animalList.get(i).getAnimalName()+"           ");
    }

         System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");

       
          
    }



    public void randomSelection(){


        System.out.println("PRESS 1 TO START THE GAME");
         int choice=scanner.nextInt();
         
        if(choice==1){
            randomNumberPick();
            while(randomNumber==randomItem){
                randomNumberPick();
            }

            System.out.println(" "+randomNumber);
            System.out.println("    "+randomItem);

        }
    }

           public void randomNumberPick(){

               int randomNumber=random.nextInt(4);
               int randomItem=random.nextInt(4);

           }
}
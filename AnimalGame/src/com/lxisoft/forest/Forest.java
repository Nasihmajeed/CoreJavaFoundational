package com.lxisoft.forest;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Forest{

	//Animal animals=new Animal();
	public ArrayList<Animal> animalList = new ArrayList<Animal>();
    Random random=new Random();


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
        System.out.println("
                    
    }




	public void forestDetails(){

		animalList.add(new Animal());
        animalList.get(0).setAnimalName("Tiger");

        animalList.add(new Animal());
        animalList.get(1).setAnimalName("Lion");

        animalList.add(new Animal());
        animalList.get(2).setAnimalName("Rabbit");

        animalList.add(new Animal());
        animalList.get(3).setAnimalName("Deer");    


        for(int i=0;i<animalList.size();i++){


        System.out.println(animalList.get(i).getAnimalName());
    }

       
          
	}


        public void randomSelection(){
             int randomNumber = random.nextInt(4); 
             
        
            for(int i=0;i<1;i++){

             System.out.println(" "+randomNumber);
             
             System.out.println(animalList.get(randomNumber).getAnimalName());
            
            }        
        }

        public void randomSelection1(){
            int randomItem= random.nextInt(4);
             for(int i=0;i<1;i++){

            
             System.out.println(" "+randomItem);
             
             System.out.println(animalList.get(randomItem).getAnimalName());
            }  

        }

   
}
package com.lxisoft.forest;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Forest{

	//Animal animals=new Animal();
	public ArrayList<Animal> animalList = new ArrayList<Animal>();
    Scanner scanner=new Scanner(System.in);
    Random random=new Random();
    int choice=1;


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
              
		animalList.add(new Animal());
        animalList.get(0).setAnimalName("Tiger");

        animalList.add(new Animal());
        animalList.get(1).setAnimalName("Lion");

        animalList.add(new Animal());
        animalList.get(2).setAnimalName("Rabbit");

        animalList.add(new Animal());
        animalList.get(3).setAnimalName("Deer");    


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

            //nt randomNumber = random.nextInt(4);   
             int randomItem= random.nextInt(4);
              int randomNumber = random.nextInt(4);   
             
        
            for(int i=0;i<1;i++){

                 System.out.println(" "+randomNumber);
               System.out.println(" "+randomItem);

                
                if(randomNumber!=randomItem){
                 System.out.println(animalList.get(randomNumber).getAnimalName());
                 System.out.println(animalList.get(randomItem).getAnimalName());
                }
                else{
                    for(int j=0;j<animalList.size();j++){
                        randomNumber=random.nextInt(4);
                         System.out.println(animalList.get(randomNumber).getAnimalName());
                         System.out.println(animalList.get(randomItem).getAnimalName());


                    }
                }
                }        
            }

            else{
                System.out.println("EXITED FROM ANIMAL GAME");
            }
        }

       
   
}
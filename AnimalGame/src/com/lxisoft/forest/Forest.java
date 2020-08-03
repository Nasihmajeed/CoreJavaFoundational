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

    int randomNumber;
    int randomItem;


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

           
                randomNumber=random.nextInt(4);
                randomItem=random.nextInt(4);
                
                while(randomNumber==randomItem){
                    randomNumber=random.nextInt(4);
                    randomItem=random.nextInt(4);
                }//while

                System.out.println(" "+randomNumber);
                System.out.println(" "+randomItem);
                System.out.println("    \n  PLAYER 1"+"    "+animalList.get(randomNumber).getAnimalName());
                System.out.println("    \n  PLAYER 2"+"    "+animalList.get(randomItem).getAnimalName());
                checkFight();

          
        }//choice 1
    }//methoid


    public void checkFight(){
        if(animalList.get(randomNumber) instanceof Carnivoros || animalList.get(randomItem) instanceof Carnivoros){
            if(animalList.get(randomNumber).getAnimalStrength() > animalList.get(randomItem).getAnimalStrength()){
                System.out.println("        WINNER");
                System.out.println("\n    PLAYER1"+"    "+animalList.get(randomNumber).getAnimalName()
                    +"    "+" STRENGTH"+" "+animalList.get(randomNumber).getAnimalStrength());
                randomNumber=randomNumber;
                System.out.println("PRINT RANDOM NUMBER"+randomNumber);
                animalList.get(randomItem).setAnimalAlive(false);
                
               


            }
            else{
                System.out.println("        WINNER");
                System.out.println("\n    PLAYER2"+"    "+animalList.get(randomItem).getAnimalName()
                    +"    "+" STRENGTH"+" "+animalList.get(randomItem).getAnimalStrength());
                randomNumber=randomItem;
                System.out.println("PRINT RANDOM NUMBER"+randomNumber);
                animalList.remove(randomNumber);
                animalList.get(randomNumber).setAnimalAlive(false);
            }

        }
        else{
            System.out.println("DONT FIGHT");
        }
    }

    public void findUltimateWinner(){
        System.out.println("ULTIMATE WINNER");
            for(int i=0;i<=3;i++){
            randomItem=random.nextInt(animalList.size());
            System.out.println("RANDOM ITEM INDEX   "+randomItem);
            while(randomNumber==randomItem){
                randomItem=random.nextInt(animalList.size());
            }
            System.out.println("RANDOM ITEM IN After"+randomItem);
            if(animalList.get(randomNumber).getAnimalAlive() == true && animalList.get(randomItem).getAnimalAlive() == true){
                if(animalList.get(randomNumber) instanceof Carnivoros || animalList.get(randomItem) instanceof Carnivoros){
                    System.out.println("\n PLAYER1     "+animalList.get(randomNumber).getAnimalName());
                    System.out.println("\n  STRENGTH   "+animalList.get(randomNumber).getAnimalStrength());
                    System.out.println("    ");
                    System.out.println("\n PLAYER2  "+animalList.get(randomItem).getAnimalName());
                    System.out.println("\n STRENGTH    "+animalList.get(randomItem).getAnimalStrength());    
                    if(animalList.get(randomNumber).getAnimalStrength()>animalList.get(randomItem).getAnimalStrength()){
                        System.out.println("\n      WINNER IS"+animalList.get(randomNumber).getAnimalName());
                        randomNumber=randomNumber;
                        animalList.get(randomItem).setAnimalAlive(false);
                    }
                    else{
                        System.out.println("\n      WINNER IS"+animalList.get(randomItem).getAnimalName());
                        animalList.get(randomItem).setAnimalAlive(false);
                       
                        randomNumber=randomItem;

                    }
                }

                if(animalList.get(randomNumber) instanceof Herbivoros && animalList.get(randomItem) instanceof Herbivoros){
                    System.out.println("\n PLAYER1     "+animalList.get(randomNumber).getAnimalName());
                    System.out.println("\n  STRENGTH   "+animalList.get(randomNumber).getAnimalStrength());
                    System.out.println("    ");
                    System.out.println("\n PLAYER2  "+animalList.get(randomItem).getAnimalName());
                    System.out.println("\n STRENGTH    "+animalList.get(randomItem).getAnimalStrength());  
                    System.out.println("DONT FIGHT");
                }  


            }//true checking

            


        }//false
          
            
            

    
        

    

           
    }//method
}//class
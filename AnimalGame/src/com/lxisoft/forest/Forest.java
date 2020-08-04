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

        animalList.add(new Goat());
        animalList.get(4).setAnimalName("Goat");    
        animalList.get(4).setAnimalStrength(30);
        animalList.get(4).setAnimalAlive(true);

        animalList.add(new Heyna());
        animalList.get(5).setAnimalName("Heyna");    
        animalList.get(5).setAnimalStrength(40);
        animalList.get(5).setAnimalAlive(true);

        animalList.add(new Bear());
        animalList.get(6).setAnimalName("Bear");    
        animalList.get(6).setAnimalStrength(60);
        animalList.get(6).setAnimalAlive(true);

        animalList.add(new Cheetha());
        animalList.get(7).setAnimalName("Cheetha");    
        animalList.get(7).setAnimalStrength(85);
        animalList.get(7).setAnimalAlive(true);

        animalList.add(new Fox());
        animalList.get(8).setAnimalName("Fox");    
        animalList.get(8).setAnimalStrength(45);
        animalList.get(8).setAnimalAlive(true);

        animalList.add(new Racoon());
        animalList.get(9).setAnimalName("Racoon");    
        animalList.get(9).setAnimalStrength(35);
        animalList.get(9).setAnimalAlive(true);

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

           
                randomNumber=random.nextInt(10);
                randomItem=random.nextInt(10);
                
                while(randomNumber==randomItem){
                    randomNumber=random.nextInt(10);
                    randomItem=random.nextInt(10);
                }//while

                System.out.println(" "+randomNumber);
                System.out.println(" "+randomItem);
                System.out.println("    ");
                System.out.println("**************************************");
                System.out.println("    \n  PLAYER 1"+"    "+animalList.get(randomNumber).getAnimalName());
                System.out.println("    \n  STRENGTH    "+animalList.get(randomNumber).getAnimalStrength());
                System.out.println("    \n  PLAYER 2"+"    "+animalList.get(randomItem).getAnimalName());
                System.out.println("    \n  STRENGTH    "+animalList.get(randomItem).getAnimalStrength());
                checkFight();

          
        }//choice 1
    }//methoid


    public void checkFight(){
        if(animalList.get(randomNumber) instanceof Carnivoros || animalList.get(randomItem) instanceof Carnivoros){
            if(animalList.get(randomNumber).getAnimalStrength() >= animalList.get(randomItem).getAnimalStrength()){
                //System.out.println("        WINNER");
                System.out.println("\n WINNER  IS  PLAYER1"+"    "+animalList.get(randomNumber).getAnimalName());
                animalList.get(randomNumber).setAnimalStrength(animalList.get(randomNumber).getAnimalStrength()-20);
                 System.out.println(" \n NEW  STRENGTH     "+animalList.get(randomNumber).getAnimalStrength());
                 System.out.println(" \n  LOOSER  "+animalList.get(randomItem).getAnimalName());
                  System.out.println("**************************************");
                randomNumber=randomNumber;
               // System.out.println("PRINT RANDOM NUMBER"+randomNumber);
                animalList.get(randomItem).setAnimalAlive(false);
                animalList.remove(randomItem);
                
               


            }
            else{
               // System.out.println("        WINNER");
                System.out.println("\n WINNER  IS  PLAYER2"+"    "+animalList.get(randomItem).getAnimalName());
                  animalList.get(randomItem).setAnimalStrength(animalList.get(randomItem).getAnimalStrength()-20);
                 System.out.println("STRENGTH  "+animalList.get(randomItem).getAnimalStrength());
                 System.out.println("\n LOOSER   "+animalList.get(randomNumber).getAnimalName());
                  System.out.println("**************************************");
                 randomNumber=randomItem;
                // System.out.println("PRINT RANDOM NUMBER"+randomNumber);
              
                animalList.get(randomNumber).setAnimalAlive(false);
                animalList.remove(randomNumber);
            }

        }
        else{
            if(animalList.get(randomNumber).getAnimalStrength()>animalList.get(randomItem).getAnimalStrength()){
                randomNumber=randomNumber;
                 System.out.println("DONT FIGHT");
                  System.out.println("**************************************");
            }

            if(animalList.get(randomItem).getAnimalStrength()>animalList.get(randomNumber).getAnimalStrength()){
                randomNumber=randomItem;
                 System.out.println("DONT FIGHT");
                  System.out.println("**************************************");
            }


           
           
            }
    

   
       
            for(int i=0;i<animalList.size();i++){
            randomItem=random.nextInt(animalList.size());
           // System.out.println("RANDOM ITEM INDEX   "+randomItem);
            while(randomNumber==randomItem){
                randomItem=random.nextInt(animalList.size());
            }
          //  System.out.println("RANDOM ITEM IN After"+randomItem);
            if(animalList.get(randomNumber).getAnimalAlive() == true && animalList.get(randomItem).getAnimalAlive() == true){
                if(animalList.get(randomNumber) instanceof Carnivoros || animalList.get(randomItem) instanceof Carnivoros){
                     System.out.println("\n  NEXT LEVEL");
                      System.out.println("**************************************");
                    System.out.println("\n PLAYER1     "+animalList.get(randomNumber).getAnimalName());
                    System.out.println("\n  STRENGTH   "+animalList.get(randomNumber).getAnimalStrength());
                    System.out.println("    ");
                    System.out.println("\n PLAYER2  "+animalList.get(randomItem).getAnimalName());
                    System.out.println("\n STRENGTH    "+animalList.get(randomItem).getAnimalStrength());    
                    if(animalList.get(randomNumber).getAnimalStrength()>animalList.get(randomItem).getAnimalStrength()){
                        System.out.println("\n      WINNER IS  PLAYER1"+animalList.get(randomNumber).getAnimalName());
                        animalList.get(randomNumber).setAnimalStrength(animalList.get(randomNumber).getAnimalStrength()-20);
                        System.out.println(" \n NEW  STRENGTH     "+animalList.get(randomNumber).getAnimalStrength());
                        System.out.println("\n LOOSER "+animalList.get(randomItem).getAnimalName());
                          System.out.println("**************************************");
                        randomNumber=randomNumber;
                        animalList.get(randomItem).setAnimalAlive(false);
                        animalList.remove(randomItem);
                    }
                    else{
                        System.out.println("\n    WINNER IS PLAYER2"+animalList.get(randomItem).getAnimalName());
                        animalList.get(randomItem).setAnimalStrength(animalList.get(randomItem).getAnimalStrength()-20);
                        System.out.println(" \n NEW  STRENGTH     "+animalList.get(randomItem).getAnimalStrength());
                          System.out.println("**************************************");
                        int a=randomItem;
                        randomNumber=a;
                        //System.out.println("Checking the wheather the value is moved to randomnumber    "+randomNumber);
                        animalList.get(randomItem).setAnimalAlive(false);
                        animalList.remove(randomNumber);
                      

                    }
                }

                if(animalList.get(randomNumber) instanceof Herbivoros && animalList.get(randomItem) instanceof Herbivoros){
                    if(randomNumber!=randomItem){
                         System.out.println("\n  NEXT LEVEL");
                          System.out.println("**************************************");
                    System.out.println("\n PLAYER1     "+animalList.get(randomNumber).getAnimalName());
                    System.out.println("\n  STRENGTH   "+animalList.get(randomNumber).getAnimalStrength());
                    System.out.println("    ");
                    System.out.println("\n PLAYER2  "+animalList.get(randomItem).getAnimalName());
                    System.out.println("\n STRENGTH    "+animalList.get(randomItem).getAnimalStrength());  
                    System.out.println("DONT FIGHT");
                      System.out.println("**************************************");
                    }
                }  


            }//true checking

            


        }//false
          
            
            

    
        

    

           
    }//method

    public void ultimateWinner(){
        System.out.println("\n **************************************");
        System.out.println("               FINAL WINNER");
        System.out.println("\n             "+animalList.get(randomNumber).getAnimalName());
        System.out.println("                ANIMAL STRENGTH "+animalList.get(randomNumber).getAnimalStrength());
        System.out.println("\n **************************************");
    }
}//class
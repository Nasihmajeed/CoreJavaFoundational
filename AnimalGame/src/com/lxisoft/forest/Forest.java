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




        animalList.add(new Lion());
        animalList.get(1).setAnimalName("Lion");
        animalList.get(1).setAnimalStrength(100);

        animalList.add(new Rabbit());
        animalList.get(2).setAnimalName("Rabbit");
         animalList.get(2).setAnimalStrength(10);

        animalList.add(new Deer());
        animalList.get(3).setAnimalName("Deer");    
         animalList.get(3).setAnimalStrength(20);

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
         
              if(choice==1){//1
                 int randomNumber = random.nextInt(4);   
             int randomItem= random.nextInt(4);
             //nt randomNumber = random.nextInt(4);   
             
        
            for(int i=0;i<1;i++){

                 System.out.println(" "+randomNumber);
               System.out.println(" "+randomItem);

                
                if(randomNumber==randomItem){
                    randomItem=random.nextInt(4);
                }


               


                System.out.println("                                                                                                ");
                System.out.println("                                                                                                 ");
                System.out.println("    ");
                 System.out.println("**********************");
                 System.out.println("**********************");
                 System.out.println("            PLAYER1      ");
                System.out.println("          "+animalList.get(randomNumber).getAnimalName()+"      ");
                 System.out.println("STRENGTH        "+animalList.get(randomNumber).getAnimalStrength()+"      ");

                System.out.println("**********************");
                 System.out.println("**********************");
               
               
               System.out.println(" ");
                System.out.println(" ");
                 System.out.println("**********************");
                 System.out.println("**********************");
                 System.out.println("         PLAYER2      ");
                System.out.println("       "+animalList.get(randomItem).getAnimalName()+"         ");
                  System.out.println("STRENGTH        "+animalList.get(randomItem).getAnimalStrength()+"      ");
                System.out.println("**********************");
                 System.out.println("**********************");






             

            
                }//for loop

                 if(animalList.get(randomNumber) instanceof Carnivoros || animalList.get(randomItem) instanceof Carnivoros ){
                    //2
               

                if(animalList.get(randomNumber).getAnimalStrength()>animalList.get(randomItem).getAnimalStrength()){


                     System.out.println(" ");
                System.out.println(" ");
                     System.out.println("**********************");
                 System.out.println("**********************");
                 System.out.println("       Winner         ");
                System.out.println("       "+animalList.get(randomNumber).getAnimalName()+"     ");
                int newStrength=(animalList.get(randomNumber).getAnimalStrength()-10);
                System.out.println("STRENGTH      " +newStrength);
                System.out.println("**********************");
                 System.out.println("**********************");
               



                   
                }

                else{
                   //ystem.out.println("    "+animalList.get(randomItem).getAnimalName());
                    System.out.println("    ");
                    System.out.println("    ");
                     System.out.println("**********************");
                 System.out.println("**********************");
                 System.out.println("    Winner          ");
                     System.out.println("     "+animalList.get(randomItem).getAnimalName()+"         ");
                      int newStrength=(animalList.get(randomItem).getAnimalStrength()-10);
                System.out.println("STRENGTH     "+newStrength);
                System.out.println("**********************");
                 System.out.println("**********************");


                }
            }//instanceof


               if(animalList.get(randomNumber) instanceof Herbivoros && animalList.get(randomItem) instanceof Herbivoros ){
                System.out.println("DONOT FIGHT");

               }






            

         
        }//method

           else{//choice
                System.out.println("EXITED FROM ANIMAL GAME");
            }

       
   
}}

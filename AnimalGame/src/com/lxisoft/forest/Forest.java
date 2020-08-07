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
    private int randomNumber;
    public void setRandomNumber(int a){
        this.randomNumber=a;

    }
    public int getRandomNumber(){
        return randomNumber;
    }

    private int randomItem;
    public void setRandomItem(int a){
        this.randomItem=a;
    }
    public int getRandomItem(){
        return randomItem;
    }


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

           
                setRandomNumber(random.nextInt(10));
                setRandomItem(random.nextInt(10));
                
                while(getRandomNumber()==getRandomItem()){
                    setRandomNumber(random.nextInt(10));
                    setRandomItem(random.nextInt(10));   
                }//while

                System.out.println(" "+getRandomNumber());
                System.out.println(" "+getRandomItem());



                
        }//choice 1
    }//methoid


    public void fightMethod(){
        //while(animalList.size()>0){
            if(animalList.get(getRandomNumber()).getAnimalAlive()==true && animalList.get(getRandomItem()).getAnimalAlive()==true){
                System.out.println("\n PLAYER 1     "+animalList.get(getRandomNumber()).getAnimalName());
                System.out.println("\n STRENGTH     "+animalList.get(getRandomNumber()).getAnimalStrength());

                 System.out.println("\n PLAYER 2     "+animalList.get(getRandomItem()).getAnimalName());
                    System.out.println("\n STRENGTH     "+animalList.get(getRandomItem()).getAnimalStrength());
               if(animalList.get(getRandomNumber()) instanceof Carnivoros || animalList.get(getRandomItem()) instanceof Carnivoros){
                    if(animalList.get(getRandomNumber()).getAnimalStrength() >= animalList.get(getRandomItem()).getAnimalStrength()){
                            //System.out.println("        WINNER");
                            System.out.println("\n WINNER  IS  PLAYER1"+"    "+animalList.get(getRandomNumber()).getAnimalName());
                            animalList.get(randomNumber).setAnimalStrength(animalList.get(getRandomNumber()).getAnimalStrength()-20);
                             System.out.println(" \n NEW  STRENGTH     "+animalList.get(getRandomNumber()).getAnimalStrength());
                             System.out.println(" \n  LOOSER  "+animalList.get(getRandomItem()).getAnimalName());
                              System.out.println("**************************************");
                           
                            animalList.get(getRandomItem()).setAnimalAlive(false);
                            animalList.remove(getRandomItem());
                            System.out.println("\n NEW PARTICIPANTS LIST");
                            for(int i=0;i<animalList.size();i++){

                                System.out.println("\n"+animalList.get(i).getAnimalName());
                            }                          
                            
                           


                    }//checking randomnumberstrength higher
                    else{
                          
                            System.out.println("\n WINNER  IS  PLAYER2"+"    "+animalList.get(getRandomItem()).getAnimalName());
                              animalList.get(getRandomItem()).setAnimalStrength(animalList.get(getRandomItem()).getAnimalStrength()-20);//check what it is; 
                             System.out.println("STRENGTH  "+animalList.get(getRandomItem()).getAnimalStrength());
                             System.out.println("\n LOOSER   "+animalList.get(getRandomNumber()).getAnimalName());
                              System.out.println("**************************************");
                                     // System.out.println("PRINT RANDOM NUMBER"+randomNumber);
                          
                            animalList.get(getRandomNumber()).setAnimalAlive(false);
                            animalList.remove(getRandomNumber());
                            System.out.println("\n NEW PARTICIPANTS LIST");
                            for(int i=0;i<animalList.size();i++){

                                System.out.println("\n"+animalList.get(i).getAnimalName());
                            }                          
                            
                           
                           
                    }//else
                }//checking instanceof

                //*checking herbivoros*

                if(animalList.get(getRandomNumber()) instanceof Herbivoros &&  animalList.get(getRandomItem()) instanceof Herbivoros){
                    System.out.println("DONOT FIGHT");
                      System.out.println("\n NEW PARTICIPANTS LIST");
                            for(int i=0;i<animalList.size();i++){

                                System.out.println("\n"+animalList.get(i).getAnimalName());
                            }     




                }//hrbivoros closing




            }//randomnumber true checking
        //}//for loop
    }//fight method
}

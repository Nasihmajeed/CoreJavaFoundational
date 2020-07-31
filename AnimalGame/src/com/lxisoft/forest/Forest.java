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
         
        if(choice==1){//1

           //loop
            
                int randomNumber = random.nextInt(animalList.size());   
                int randomItem= random.nextInt(animalList.size());

               

                    if(animalList.get(randomNumber)!=animalList.get(randomItem)){
                    

                        if(animalList.get(randomNumber).getAnimalAlive()==true &&  animalList.get(randomItem).getAnimalAlive()==true)
                        {

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


                             if(animalList.get(randomNumber) instanceof Carnivoros || animalList.get(randomItem) instanceof Carnivoros ){
                                             if(animalList.get(randomNumber).getAnimalStrength()>animalList.get(randomItem).getAnimalStrength()){


                                                System.out.println(" ");
                                                System.out.println(" ");
                                                System.out.println("**********************");
                                                System.out.println("**********************");
                                                System.out.println("    DIED"+animalList.get(randomItem).getAnimalName());
                                                System.out.println("       Winner         ");
                                                System.out.println("       "+animalList.get(randomNumber).getAnimalName()+"     ");
                                                int newStrength=(animalList.get(randomNumber).getAnimalStrength()-10);
                                                System.out.println("STRENGTH      " +newStrength);
                                                System.out.println("**********************");
                                                System.out.println("**********************");
                                                temp=animalList.get(randomNumber);
                                                animalList.get(randomItem).setAnimalAlive(false);
                                              }
                                              
                                              else{//check
                                                    System.out.println("    ");
                                                    System.out.println("    ");
                                                    System.out.println("**********************");
                                                    System.out.println("**********************");
                                                    System.out.println("    Winner          ");
                                                    System.out.println("    DIED"+animalList.get(randomNumber).getAnimalName());
                                                    System.out.println("     "+animalList.get(randomItem).getAnimalName()+"         ");
                                                    int newStrength=(animalList.get(randomItem).getAnimalStrength()-10);
                                                    System.out.println("STRENGTH     "+newStrength);
                                                    System.out.println("**********************");
                                                    System.out.println("**********************");
                                                    temp=animalList.get(randomItem);
                                                    animalList.get(randomItem).setAnimalAlive(false);
                                              } 




                            }else{//instance of
                                System.out.println("Dont fight");
                            }






                        }
                    }

                    else{//random=random
                        randomItem=random.nextInt(animalList.size());
                    }


            //for
                                              for(int a=0;a<=2;a++){


                                                    int randomElement= random.nextInt(animalList.size());
                                                    if(temp!=animalList.get(randomElement)){

                                                            if(temp.getAnimalAlive()==true &&  animalList.get(randomElement).getAnimalAlive()==true){
                                                                 System.out.println("    ");
                                                System.out.println("    ");
                                                System.out.println("NEXT LEVEL");
                                                System.out.println("    ");
                                                System.out.println("    ");
                                                                    System.out.println("    PLAYER1 "+temp.getAnimalName());
                                                                    System.out.println("    PLAYER2 "+animalList.get(randomElement).getAnimalName());

                                                                    if(temp.getAnimalStrength()>animalList.get(randomElement).getAnimalStrength()){
                                                                        System.out.println( "   Winner      "+temp.getAnimalName());
                                                                        int newStrength=temp.getAnimalStrength()-10;
                                                                        System.out.println("    Strength     "+newStrength);

                                                                        winner=temp;
                                                                        temp=winner;
                                                                    }

                                                                        if(animalList.get(randomElement).getAnimalStrength()>temp.getAnimalStrength()){
                                                                            System.out.println("   Winner      "+animalList.get(randomElement).getAnimalName());

                                                                             int newStrength=animalList.get(randomElement).getAnimalStrength()-10;
                                                                            System.out.println("    Strength     "+newStrength);


                                                                            winner=animalList.get(randomElement);
                                                                            temp=winner;
                                                                        }
                                                                    
                                                            }

                                                    }
                                                    else{
                                                        randomElement=random.nextInt(animalList.size());
                                                    }

                                              } 



       

    











        }//choice==1
        else{
            System.out.println("EXIT");
        }
    }//randomselection


    public void ultimateWinner(){
        System.out.println("        ");
        System.out.println("    ");
        System.out.println("ULTIMATE WINNER");
        System.out.println("        ");
        System.out.println("    ");
        System.out.println(temp.getAnimalName());
    }




  
}//class



       
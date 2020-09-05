package com.lxisoft.forest;
public class Game{
	 public void checkFight(){
              if(animalList.get(getRandomNumber()).getAnimalAlive() == true && animalList.get(getRandomItem()).getAnimalAlive() == true){


                if(animalList.get(getRandomNumber()) instanceof Carnivoros && animalList.get(getRandomItem()) instanceof Carnivoros){
                System.out.println("BOTH ARE CARNIVOROS");
                System.out.println("    \n  PLAYER 1"+"    "+animalList.get(getRandomNumber()).getAnimalName());
                System.out.println("    \n  STRENGTH    "+animalList.get(getRandomNumber()).getAnimalStrength());
                System.out.println("    \n  PLAYER 2"+"    "+animalList.get(getRandomItem()).getAnimalName());
                System.out.println("    \n  STRENGTH    "+animalList.get(getRandomItem()).getAnimalStrength());

                if(animalList.get(getRandomNumber()).getAnimalStrength() >= animalList.get(getRandomItem()).getAnimalStrength()){
                    System.out.println("\n \nWINNER  IS  PLAYER1"+"    "+animalList.get(getRandomNumber()).getAnimalName());
                    animalList.get(randomNumber).setAnimalStrength(animalList.get(getRandomNumber()).getAnimalStrength()-20);
                    System.out.println(" \n NEW  STRENGTH     "+animalList.get(getRandomNumber()).getAnimalStrength());
                    System.out.println(" \n  LOOSER  "+animalList.get(getRandomItem()).getAnimalName());
                    System.out.println("**************************************");

                    animalList.get(getRandomItem()).setAnimalAlive(false);
                   
                    count=this.workingOfLoop();
                    this.Winner();
                }

                else{

                    System.out.println("\n \n WINNER  IS  PLAYER2"+"    "+animalList.get(getRandomItem()).getAnimalName());
                    animalList.get(randomItem).setAnimalStrength(animalList.get(getRandomItem()).getAnimalStrength()-20);
                    System.out.println(" \n NEW  STRENGTH     "+animalList.get(getRandomItem()).getAnimalStrength());
                    System.out.println(" \n  LOOSER IS PLAYER1 "+animalList.get(getRandomNumber()).getAnimalName());
                    System.out.println("**************************************");
                    animalList.get(getRandomNumber()).setAnimalAlive(false);
                   
                      count=this.workingOfLoop();
                       this.Winner();

                }
                
                     
                       
                       

             }

             else  if(animalList.get(getRandomNumber()) instanceof Herbivoros && animalList.get(getRandomItem()) instanceof Herbivoros){

                System.out.println("BOTH ARE HERBIVOROS");

                System.out.println("    \n  PLAYER 1"+"    "+animalList.get(getRandomNumber()).getAnimalName());
                System.out.println("    \n  STRENGTH    "+animalList.get(getRandomNumber()).getAnimalStrength());
                System.out.println("    \n  PLAYER 2"+"    "+animalList.get(getRandomItem()).getAnimalName());
                System.out.println("    \n  STRENGTH    "+animalList.get(getRandomItem()).getAnimalStrength());


                System.out.println("\n DONT FIGHT");
                  System.out.println("**************************************");
                
                   count=this.workingOfLoop();
                   this.Winner();
             } 

             // *** LUCKFACTOR IMPLEMENTATION SETUP STARTS *** //

             else  if(animalList.get(getRandomNumber()) instanceof Carnivoros && animalList.get(getRandomItem()) instanceof Herbivoros){

                int luckyAnimal=determineLuckyAnimal();
                System.out.println(luckyAnimal);


                System.out.println("PLAYER 1 - CARNIVOROS");
                System.out.println("\nPLAYER 2 -HERBIVOROS");
                System.out.println("    \n  PLAYER 1"+"    "+animalList.get(getRandomNumber()).getAnimalName());
                System.out.println("    \n  STRENGTH    "+animalList.get(getRandomNumber()).getAnimalStrength());
                System.out.println("    \n  PLAYER 2"+"    "+animalList.get(getRandomItem()).getAnimalName());
                System.out.println("    \n  STRENGTH    "+animalList.get(getRandomItem()).getAnimalStrength());

                if(animalList.get(getRandomItem()) instanceof WeakAnimal){//luckFactor implementation
                    //if(luckyAnimal!=1)
                    //{

                        System.out.println("\n "+animalList.get(getRandomNumber()).getAnimalName()+"  cant hunt the"+animalList.get(getRandomItem()).getAnimalName());
                        System.out.println("\n "+animalList.get(getRandomItem()).getAnimalName()+" runs away");
                        animalList.get(randomNumber).setAnimalStrength(animalList.get(getRandomNumber()).getAnimalStrength()-20);
                        System.out.println( "\n NEW STRENGTH OF"+animalList.get(getRandomNumber()).getAnimalName()+"    "+animalList.get(getRandomNumber()).getAnimalStrength());
                          this.Winner();







                }
                    else{

                         System.out.println("\n WINNER  IS  PLAYER1"+"    "+animalList.get(getRandomNumber()).getAnimalName());
                            animalList.get(randomNumber).setAnimalStrength(animalList.get(getRandomNumber()).getAnimalStrength()+20);
                            System.out.println("\n WINNER S NEW STRENGTH"+"    "+animalList.get(getRandomNumber()).getAnimalStrength());
                            System.out.println("\n LOOSER  IS  PLAYER2"+"    "+animalList.get(getRandomItem()).getAnimalName());
                              System.out.println("**************************************");
                            animalList.get(getRandomItem()).setAnimalAlive(false);
                           
                              count=this.workingOfLoop();
                                this.Winner();
                        
                        }




             }  

             else if(animalList.get(getRandomNumber()) instanceof Herbivoros && animalList.get(getRandomItem()) instanceof Carnivoros){

               

              

                System.out.println("PLAYER 1 -HERBIVOROS");
                System.out.println("\nPLAYER 2 -CARNIVOROS");
                System.out.println("    \n  PLAYER 1"+"    "+animalList.get(getRandomNumber()).getAnimalName());
                System.out.println("    \n  STRENGTH    "+animalList.get(getRandomNumber()).getAnimalStrength());
                System.out.println("    \n  PLAYER 2"+"    "+animalList.get(getRandomItem()).getAnimalName());
                System.out.println("    \n  STRENGTH    "+animalList.get(getRandomItem()).getAnimalStrength());

                 
                    



                        System.out.println("\n WINNER  IS  PLAYER2"+"    "+animalList.get(getRandomItem()).getAnimalName());
                        animalList.get(randomItem).setAnimalStrength(animalList.get(getRandomItem()).getAnimalStrength()+20);
                        System.out.println("\n WINNER S NEW STRENGTH"+"    "+animalList.get(getRandomItem()).getAnimalStrength());
                        System.out.println("\n LOOSER  IS  PLAYER1"+"    "+animalList.get(getRandomNumber()).getAnimalName());
                        animalList.get(getRandomNumber()).setAnimalAlive(false);
                        System.out.println("**************************************");
                     
                          count=this.workingOfLoop();
                          this.Winner();

                    
                    
            }


        }      
        
    }//checkfight

   
}
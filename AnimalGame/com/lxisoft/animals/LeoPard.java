package com.lxisoft.animals;
import java.*;
import com.lxisoft.*;
import java.util.Random;
import com.lxisoft.game.Animal;
import com.lxisoft.test.*;


public class LeoPard extends Animal implements Carnivores{

      // Random rand = new Random();

       public LeoPard(String animalName,int starvage,int strength,int distance , boolean isAlive)
       {
              super(animalName,starvage,strength,distance , isAlive);
       }

       TDD opt = new TDD();

       public String killOpponent(Animal player1,Animal player2){
       if (opt.getOption() == 1) {
              
       if (player1 instanceof Herbivores && player2 instanceof Carnivores){
        System.out.println(object.initialize().getProperty("Design_1") );
        System.out.println( object.initialize().getProperty("Fight_stmt1")+player1.getName()+ object.initialize().getProperty("Fight_stmt2") +player2.getName()+ object.initialize().getProperty("Fight_stmt3"));
        System.out.println(object.initialize().getProperty("Fight_stmt4")+player1.getName());
        player1.setIsAlive(false);
        System.out.println(object.initialize().getProperty("Fight_stmt5")+player1.getName()+ object.initialize().getProperty("Fight_stmt6")+player1.getIsAlive());
        
       
       }else if(player1 instanceof Carnivores && player2 instanceof Herbivores){
 
 System.out.println(object.initializeM().getProperty("Design_1"));
        System.out.println( object.initialize().getProperty("Fight_stmt1")+player1.getName()+  object.initialize().getProperty("Fight_stmt2") +player2.getName()+  object.initialize().getProperty("Fight_stmt3"));
        System.out.println( object.initialize().getProperty("Fight_stmt4")+player2.getName());
        player2.setIsAlive(false);
        
        System.out.println( object.initialize().getProperty("Fight_stmt5")+player2.getName()+ object.initialize().getProperty("Fight_stmt6")+player2.getIsAlive());
    
 
       }
    return  object.initialize().getProperty("Fight_stmt7");
} else if (opt.getOption() == 2) {
              
       if (player1 instanceof Herbivores && player2 instanceof Carnivores){
        System.out.println(object.initializeM().getProperty("Design_1") );
        System.out.println( object.initializeM().getProperty("Fight_stmt1")+player1.getName()+ object.initializeM().getProperty("Fight_stmt2") +player2.getName()+ object.initializeM().getProperty("Fight_stmt3"));
        System.out.println(object.initializeM().getProperty("Fight_stmt4")+player1.getName());
        player1.setIsAlive(false);
        System.out.println(object.initializeM().getProperty("Fight_stmt5")+player1.getName()+ object.initializeM().getProperty("Fight_stmt6")+player1.getIsAlive());
        
       
       }else if(player1 instanceof Carnivores && player2 instanceof Herbivores){
 
 System.out.println(object.initializeM().getProperty("Design_1") );
        System.out.println( object.initializeM().getProperty("Fight_stmt1")+player1.getName()+  object.initializeM().getProperty("Fight_stmt2") +player2.getName()+  object.initializeM().getProperty("Fight_stmt3"));
        System.out.println( object.initializeM().getProperty("Fight_stmt4")+player2.getName());
        player2.setIsAlive(false);
        System.out.println( object.initializeM().getProperty("Fight_stmt5")+player2.getName()+ object.initializeM().getProperty("Fight_stmt6")+player2.getIsAlive());
    
 
       }
    return  object.initialize().getProperty("Fight_stmt7");
}
       }

     //  int x = rand.nextInt(20);
       //int y = rand.nextInt(20);

 

    /*   public void startFight(Animal opponent){
              //System.out.println("hello");
              int starvageOfPlayer1 = this.getStarvage();
              int starvageOfPlayer2 = opponent.getStarvage();
  
              int strengthOfPlayer1 = this.getStrength();
              int strengthOfPlayer2 = opponent.getStrength();

              System.out.println("\n" +opponent.getName()+" was very unlucky and caught by "+this.getName());
      if(opponent.getLuckFactor() >= 5 ){
  
      System.out.println(" \n But fortunately player " +opponent.getName()+ " is very lucky_!!!  just escaped from \n" +this.getName());
      Herbivores.escapeFromEnemy(this,opponent);
      }else{
       System.out.println("\n \t \t \t THE REAL FIGHT @@@BEGINS@@@ \t \t \n");
     
     System.out.println("\t"+opponent.getName()+" is caught by "+this.getName());
     System.out.println("\t" +this.getName()+" is attacking "+opponent.getName());
                             System.out.println();			
     System.out.println(" Starvage of "+this.getName()+" is higher than the Strength of "+opponent.getName() );
    
     System.out.println("\t\t\t . \t\t\t");
                                   
                        System.out.println("\t Strength of "+opponent.getName()+" is decreasing !!!!!!");
                        strengthOfPlayer2  = 0;
                        System.out.println("\t\t\t .. \t\t\t");
                        System.out.println("\t Strength of "+opponent.getName()+" reduced to "+strengthOfPlayer2);								  
                                   
                        System.out.println("\t\t\t ... \t\t\t");
                       /// System.out.println("The Strength of "+player2.getName()+" is decreasing");
                        System.out.println("\t"+ this.getName()+" Defeated and Killed by "+opponent.getName());
                        System.out.println("\t\t\t ------------- \t\t\t");
 
         //winner = player1;
        // return this.getName();
     }
     

          //    return "NOTHING HAPPENDS";
       }//*/

}

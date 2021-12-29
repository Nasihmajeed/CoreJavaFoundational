package com.lxisoft.animals;
import java.util.Random;
import com.lxisoft.game.Animal;

public class  Lion extends Animal implements Carnivores{

      // Random rand = new Random();

       public Lion(String animalName,int starvage,int strength,int distance)
       {
              super(animalName,starvage,strength,distance);
       }
      
   //    int x = rand.nextInt(20);
     //  int y = rand.nextInt(20);

     public void startFight(Animal opponent){
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
  //return this.getName();
}


    //   return "NOTHING HAPPENDS";
}

}

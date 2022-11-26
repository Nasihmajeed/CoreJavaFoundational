package com.lxisoft.game;

import java.util.ArrayList;

import java.util.Random;

import com.lxisoft.factors.Location;
import com.lxisoft.factors.customException;
import com.lxisoft.animals.*;

public class Forest {

    ArrayList<Animal> animalsList = new ArrayList<Animal>();

   



     public void welcomeToForest () {

        System.out.println("..........WELCOME TO FOREST........... \n");
    
 // animal.wildAnimals();
    animalsList.add(new Lion("King-Lion","meat",35,35,true));
    animalsList.add(new Deer("Alcine-Deer","grass",15,15,true));
    animalsList.add(new Tiger("Dave-Tiger","meat",30,30,true));
    animalsList.add(new Rabbit("Peter-Rabbit","grass",13,12,true));
    animalsList.add(new Leopard("Dale-Leopard","meat",20,13,true));
    animalsList.add(new Giraffe("Custard-Giraffe","grass",12,10,true));
    animalsList.add(new Wolf("Roman-Wolf","meat",18,11,true));
    animalsList.add(new Rhinocer("Grit-Rhinocer","meat",11,11,true));
    animalsList.add(new Cheetah("Fastest-Cheetah","meat",14,13,true));
    animalsList.add(new Zebra("Zippy-Zebra","grass",11,10,true));
    
    for(int i = 0 ; i < animalsList.size() ; i++) {
        System.out.println(animalsList.get(i).getName()+"  "+animalsList.get(i).getFood()+"  "+animalsList.get(i).getStrengthLevel() +"  " +animalsList.get(i).getHungryLevel());
    
    } 
        }

     public void pickAnimal() throws customException {

         for(int i=0;i<animalsList.size();i++) {

            Random random = new Random();

        int animal1 =random.nextInt(animalsList.size());
        int animal2 =random.nextInt(animalsList.size());
    
        Animal player1 = animalsList.get(animal1);
        Animal player2 = animalsList.get(animal2);

        player1.setLocation(random.nextInt(30),random.nextInt(30));
        player2.setLocation(random.nextInt(30),random.nextInt(30));

        roamingArea(player1 , player2 );
 }
    }
      public void roamingArea(Animal player1, Animal player2) throws customException {

            Random random = new Random();
           
            int x1 = player1.getLocationX();
            int x2 = player2.getLocationX();
            int y1 = player1.getLocationX();
            int y2 = player2.getLocationX();
            
            double roamArea = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));

            
            //  System.out.println("roming" +roamArea);
          
             if(player1.getAlive() ==true && player2.getAlive() ==true) {

             }

          if((player1 instanceof Herbivorous) && (player2 instanceof Herbivorous)) {

            System.out.println("The Both Players Are Herbivores \n");
            System.out.println("They are  Friends \n" );
    
        }
        
        else if((player1 instanceof Herbivorous) && (player2 instanceof Carnivorous)) {
    
            player1.setLocation(random.nextInt(20),random.nextInt(20));            
            System.out.println("The First Player Is Herbivores \n" );
            System.out.println("Player1 is : "+player1.getName()+" "+"  with hungry level "+player1.getHungryLevel()+" having strength of "+player1.getStrengthLevel() + "\n");
            System.out.println("The Second Player Is Carnivores \n");
            System.out.println("Player2 is : "+player2.getName()+" "+"  with hungry level "+player2.getHungryLevel()+" having strength of "+player2.getStrengthLevel()+ "\n");
            System.out.println("Player 2 is Winner : "+player2.getName()+" " + "\n");

            if(roamArea <=10 ) {
            Carnivorous carnivors = (Carnivorous) player2;
            Animal loserAnimal = carnivors.startFight(player1);
            
           Herbivorous herbivores = (Herbivorous) player1;
           herbivores.escapeFromEnemy(player2);
    
            }   

            else {
                System.out.println("Nothing will Happen \n");
            }
    }
    
    else if((player1 instanceof Carnivorous) && (player2 instanceof Carnivorous)){
    
        System.out.println("The Both Players Are Carnivores \n");
        Carnivorous carnivores = (Carnivorous) player2;
        carnivores.startFight(player2);
        System.out.println("They Fight Each Other \n");
        System.out.println("Nothing wil happen \n");
    
    }
    
    else if((player1 instanceof Carnivorous) && (player2 instanceof Herbivorous)){
    
        System.out.println("The First Player Is Carnivores \n");
        System.out.println("Player1 is : "+player1.getName()+" "+"  with hungry level "+player1.getHungryLevel()+" having strength of "+player1.getStrengthLevel()+ "\n");
        System.out.println("The Second Player Is Herbivores");
        System.out.println("Player2 is : "+player2.getName()+" "+"  with hungry level "+player2.getHungryLevel()+" having strength of "+player2.getStrengthLevel() + "\n");
        System.out.println("player1 is Winner : "+player1.getName()+"" + "\n");

       
        if(roamArea <=10) {

        Carnivorous carnivores = (Carnivorous) player1;
        carnivores.startFight(player2);
       Herbivorous herbivores = (Herbivorous) player2;
       herbivores.escapeFromEnemy(player1);
        }

        
        else {
            System.out.println("there is no hope for fight \n");
        }
    }

   

}
   
}
        

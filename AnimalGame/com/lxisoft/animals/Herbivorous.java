package com.lxisoft.animals;

import com.lxisoft.game.Animal;

public interface Herbivorous {

    public static void escapeFromEnemy(Animal player1 , Animal player2) 
     
    {

       if((player1 instanceof Carnivorous) && (player2 instanceof Herbivorous )) {

           System.out.println(player2.getName() +"the animal is escaping");
       }

       else if(player1 instanceof Herbivorous && player2 instanceof Carnivorous) {

          
           System.out.println(player1.getName() +"the animal is escaping");            
       }

       
   }

}


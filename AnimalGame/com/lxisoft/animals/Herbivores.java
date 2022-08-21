package com.lxisoft.animals;

import com.lxisoft.game.Animal;

public interface Herbivores {

     public static void escapeFromEnemy(Animal player1 , Animal player2) 
     
     {

        if((player1 instanceof Carnivores) && (player2 instanceof Herbivores )) {

            System.out.println(player2.getName() +"the animal is escaping");
        }

        else if(player1 instanceof Herbivores && player2 instanceof Carnivores) {

           
            System.out.println(player1.getName() +"the animal is escaping");            
        }

        
    }

}


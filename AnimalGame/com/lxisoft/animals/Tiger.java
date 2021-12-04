package com.lxisoft.animals;

import com.lxisoft.game.Animal;

public class Tiger extends Animal {
        
public Tiger(String animalName,int energy,int stamina,int distance){
       super(animalName,energy,stamina,distance);
}
   public void printData(){
          System.out.println("Name : " + super.getName());
          System.out.println("Energy : " + super.getEnergy());
          System.out.println("Stamina : " + super.getStamina());
          System.out.println("Distance: " + super.getDistance());
   }  

}

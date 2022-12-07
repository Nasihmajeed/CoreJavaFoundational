package com.lxisoft.forest;
import com.lxisoft.forest.Animal;

public class Deer extends Animal{

public Animal creatingDeer(){
		
		Animal animal = new Animal();
		animal.setAnimalName("Deer ");
 		animal.setAnimalStrengthLevel(5);
		animal.setAnimalHungerLevel(6);
		animal.setAnimalAggressivenessLevel(7);  
		return animal;
		
		}

}
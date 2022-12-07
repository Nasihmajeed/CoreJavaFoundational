package com.lxisoft.forest;
import com.lxisoft.forest.Animal;

public class Elephant extends Animal {
	
public Animal creatingElephant(){
		
		Animal animal = new Animal();
		animal.setAnimalName("Elephant");
 		animal.setAnimalStrengthLevel(6);
		animal.setAnimalHungerLevel(7);
		animal.setAnimalAggressivenessLevel(8);  
		return animal;
		
		}

}
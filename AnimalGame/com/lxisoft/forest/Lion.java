package com.lxisoft.forest;
import com.lxisoft.forest.Animal;

public class Lion extends Animal{
	
public Animal creatingLion(){
		
		Animal animal = new Animal();
		animal.setAnimalName("Lion");
 		animal.setAnimalStrengthLevel(7);
		animal.setAnimalHungerLevel(8);
		animal.setAnimalAggressivenessLevel(9);  
		return animal;
		
		}

}
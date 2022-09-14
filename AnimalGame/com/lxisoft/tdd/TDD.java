 //Packages

package com.lxisoft.tdd;
import com.lxisoft.Forest.Animal;
import com.lxisoft.Forest.Forest; 
import java.util.ArrayList;
import java.util.List;

public class TDD {
	public static void main (String [] args) {
		
		List<Animal> animal = new ArrayList<Animal>();
		
		Forest denseForest=new Forest();
		Forest Animal=new Forest();
/* 		denseForest.setNewAnimal(animals);
		Animal.setNewAnimal(animals); */

				
		for (int i=0; i < 2; i++){
			Animal tiger = new Animal();
			Animal lion = new Animal();
			
			
			tiger.setAnimalName("AnimalName: Tiger");
			tiger.setAnimalStrengthLevel("AnimalStrengthLevel:100%");
			tiger.setAnimalHungerLevel("AnimalHungerLevel: 75%");
			tiger.setAnimalAggressivenessLevel("AnimalAggressivenessLevel: 100%");			
			animal.add(tiger);
			animal.get(i).print();
			
			lion.setAnimalName("AnimalName: Lion");
			lion.setAnimalStrengthLevel("AnimalStrengthLevel:100%");
			lion.setAnimalHungerLevel("AnimalHungerLevel: 75%");
			lion.setAnimalAggressivenessLevel("AnimalAggressivenessLevel: 100%");	
			animal.add(lion);
			animal.get(i).print();
		}			
		
		denseForest.setForestName("Forest Name : Amazon Forest");
		System.out.println(denseForest.getForestName());
				
	}
}
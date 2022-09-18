 //Packages

package com.lxisoft.tdd;
import com.lxisoft.forest.Animal;
import com.lxisoft.forest.Forest; 
import java.util.ArrayList;
import java.util.List;
import com.lxisoft.methods.Methods; 

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
			
			
			tiger.setAnimalName("AnimalName: Tiger " +(i+1));
			tiger.setAnimalStrengthLevel(100 + (i+1));
			tiger.setAnimalHungerLevel(100 + (i+1));
			tiger.setAnimalAggressivenessLevel(100 + (i+1));			
			animal.add(tiger);
			animal.get(i).print();
					
			lion.setAnimalName("AnimalName: Lion");
			lion.setAnimalStrengthLevel(100 + (i+1));
			lion.setAnimalHungerLevel(100 + (i+1));
			lion.setAnimalAggressivenessLevel(100 + (i+1));	
			animal.add(lion);
			animal.get(i).print();
			
		}			
		
		denseForest.setForestName("Forest Name : Amazon Forest");
		System.out.println(denseForest.getForestName());
		//System.out.println(Animal.getAnimalStrengthLevel());
		
		int Lion = Methods.animalfight(50, 50, 50);
		System.out.println("Lion Strength: "+ Lion);
		
		int Tiger = Methods.animalfight(100, 50, 50);
		System.out.println("Tiger Strength: "+ Tiger);
		
		if (Lion > Tiger)
		System.out.println("Lion have more power");
		else 
		System.out.println("Tiger have more power");
				
	}
}
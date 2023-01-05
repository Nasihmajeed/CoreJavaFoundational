package com.lxisoft.forest;
import com.lxisoft.forest.Animal;

public class Lion extends Animal implements Carnivores{
	
public String animalFight(Animal animal1){
		
		if (this.animalStrengthLevel > animal1.getAnimalStrengthLevel()){
			
			this.setAnimalStrengthLevel(this.getAnimalStrengthLevel()-1);
			
			this.setAnimalHungerLevel(this.getAnimalHungerLevel()-1);
			
			this.setAnimalAggressivenessLevel(this.getAnimalAggressivenessLevel()-1);
						
			animal1.setAnimalStrengthLevel(animal1.getAnimalStrengthLevel()-2);
			
			animal1.setAnimalHungerLevel(animal1.getAnimalHungerLevel()-2);
			
			animal1.setAnimalAggressivenessLevel(animal1.getAnimalAggressivenessLevel()-2);
			
			return this.getAnimalName();
					
			
		} if (this.animalStrengthLevel < animal1.getAnimalStrengthLevel()){
			
			animal1.setAnimalStrengthLevel(animal1.getAnimalStrengthLevel()-1);
			
			animal1.setAnimalHungerLevel(animal1.getAnimalHungerLevel()-1);
			
			animal1.setAnimalAggressivenessLevel(animal1.getAnimalHungerLevel()-1);
			
			this.setAnimalStrengthLevel(this.getAnimalStrengthLevel()-1);
			
			this.setAnimalHungerLevel(this.getAnimalHungerLevel()-1);
			
			this.setAnimalAggressivenessLevel(this.getAnimalHungerLevel()-1);			
			
			return animal1.getAnimalName();
			
		}  if (this.animalStrengthLevel == animal1.getAnimalStrengthLevel()){
			
			animal1.setAnimalStrengthLevel(animal1.getAnimalStrengthLevel()-1);
			
			animal1.setAnimalHungerLevel(animal1.getAnimalHungerLevel()-1);
			
			animal1.setAnimalAggressivenessLevel(animal1.getAnimalHungerLevel()-1);
			
			this.setAnimalStrengthLevel(this.getAnimalStrengthLevel()-1);
			
			this.setAnimalHungerLevel(this.getAnimalHungerLevel()-1);
			
			this.setAnimalAggressivenessLevel(this.getAnimalHungerLevel()-1);			
			
			return animal1.getAnimalName();
					
		}	
			return null;
		}  
}
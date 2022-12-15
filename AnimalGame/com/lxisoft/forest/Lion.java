package com.lxisoft.forest;
import com.lxisoft.forest.Animal;

public class Lion extends Animal implements Carnivores{
	
public void randomAnimalsMeetAndFight(){
			
	/* int animalSizeReference = animals.size();
	
	System.out.println("-----RANDOM FIGHT DETAILS-----");
		

	while (animalSizeReference>1){
		
		double randomValue = Math.random();
		double randomValue1 = Math.random();
		
		//System.out.println("Random value1: "+randomValue);
		
		int randomIndex = (int)(randomValue*animals.size());
		int randomIndex1 = (int)(randomValue1*animals.size());
		
        //System.out.println("Random value2 * "+animals.size()+": "+randomIndex);
		
		//System.out.println(animals.get(randomIndex).getAnimalName()+"\n"); 
		
		// Storing 2 animals and printing the details
		
		Animal animal1 = animals.get(randomIndex);
		System.out.println("Random Animal1 from the List : "+animal1.getAnimalName()+"\n"); 
		
		Animal animal2 = animals.get(randomIndex1);
		System.out.println("Random Animal2 from the List: "+animal2.getAnimalName()+"\n"); 
			
		if (((animal1.getAnimalStrengthLevel() >= 1) && (animal2.getAnimalStrengthLevel() >= 1))){
		
		System.out.println("Fight Between 2 Animals & Survived Animal Name : " +animal1.animalFight(animal2)+"\n");
		
		System.out.println("After Fight Animal1 Strength Level: " + animal1.getAnimalStrengthLevel()+"\n" + "\n" + 
		"After Fight Animal2 Strength Level: " + animal2.getAnimalStrengthLevel()+"\n");		
		}
		
		animalSizeReference = animals.size();
		
				
		for (Animal i : animals){			
				
			if (i.getAnimalStrengthLevel() <= 1) {
							
			animalSizeReference --;
					
			System.out.println("\n"+"Lost Animal Name: " + i.getAnimalName() + 
			"\n" +"Lost Animal Strength Level:" + i.getAnimalStrengthLevel()+"\n"+
			"Lost Animal Hunger Level:" + i.getAnimalHungerLevel()+"\n"+
			"Lost Animal Aggressiveness Level:" + i.getAnimalAggressivenessLevel()+"\n"
			);
						 			 
			}
			
		}
			
	}*/
	
	}  
}
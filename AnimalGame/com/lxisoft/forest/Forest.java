//Packages
package com.lxisoft.forest;
import java.util.ArrayList;
import java.util.List;
import com.lxisoft.forest.Animal;

public class Forest {
				
	private List<Animal> animals = new ArrayList<Animal>();
	private String forestName;
	private Boolean flag=false;
	private int animalSizeReference;
    
 	public void animalDetails(int number){
				
		for (int i=0;i < number; i++) {
		Animal animal = new Animal();
		animal.setAnimalName("Animal "+(i+1));
 		animal.setAnimalStrengthLevel(1 +(i+1));
		animal.setAnimalHungerLevel(75 +(i+1));
		animal.setAnimalAggressivenessLevel(65 +(i+1));  
		animals.add(animal);
		
			
		System.out.println("____ANIMAL DETAILS_____\n");
		System.out.println("AnimalName: "+animal.getAnimalName()
		+"\nAnimalStrengthLevel: "+animal.getAnimalStrengthLevel()
		+"\nAnimalHungerLevel: "+animal.getAnimalHungerLevel()
		+"\nAnimalAggressivenessLevel: "+animal.getAnimalAggressivenessLevel()+"\n"); 
		
	}
	}
	
	public void showAllAnimals(){
		System.out.println("-----Total Number of Animals in the Forest-----"+"\n");
		for(int i=0; i < animals.size();i++){
		System.out.println(animals.get(i).getAnimalName()+"\n");			
		}
		}
			
	public void randomAnimalsMeet(){
		
	int animalSizeReference = animals.size();
	
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
			"\n" +"Lost Animal Strength Level:" + i.getAnimalStrengthLevel()+"\n" );
						 			 
			}
			
		}
			
	}
	
	}
	
	public void getSurvivedAnimal(){
			
	for (Animal i : animals){
		
	if (i.getAnimalStrengthLevel() > 1)	{
				
	System.out.println("Survived Animal on the Fight: " + i.getAnimalName()+"\n" + 
	"Survived Animal Strength Level:" + i.getAnimalStrengthLevel());
	}
			
	}
	}
			
	public void setForestName(String foresName){
	this.forestName=foresName;	
	}
	
	public String getForestName(){
		return this.forestName;
	}
	
	public void setAnimals(List<Animal> Ani){
	this.animals = Ani;
	}

	public List<Animal> getAnimals(){
	return animals;
	}
			
	public void print(){
		
		for (int i=0; i<animals.size();i++){
			animals.get(i).print();
		}
		System.out.println (this.forestName);
			
	}
}
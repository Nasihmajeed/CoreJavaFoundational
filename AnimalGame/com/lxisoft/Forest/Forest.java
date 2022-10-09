//Packages
package com.lxisoft.forest;
import java.util.ArrayList;
import java.util.List;
import com.lxisoft.forest.Animal;

public class Forest {
				
	private List<Animal> animals = new ArrayList<>();
	private String forestName;
	Animal animal1 = new Animal();
	Animal animal2 = new Animal();
	Animal animal3 = new Animal();
		
 	public void animalDetails(){
		for (int i=0;i < 1; i++) {
		
		animal1.setAnimalName("TIGER");
 		animal1.setAnimalStrengthLevel(90 +(i+1));
		animal1.setAnimalHungerLevel(75 +(i+1));
		animal1.setAnimalAggressivenessLevel(65 +(i+1));  
		animals.add(animal1);
				
		System.out.println("____ANIMAL DETAILS_____\n");
		System.out.println("AnimalName: "+animal1.getAnimalName()
		+"\nAnimalStrengthLevel: "+animal1.getAnimalStrengthLevel()
		+"\nAnimalHungerLevel: "+animal1.getAnimalHungerLevel()
		+"\nAnimalAggressivenessLevel: "+animal1.getAnimalAggressivenessLevel()+"\n"); 
		}
		for (int i=0;i < 1; i++) {
		
		animal2.setAnimalName("LION");
 		animal2.setAnimalStrengthLevel(90 +(i+1));
		animal2.setAnimalHungerLevel(75 +(i+1));
		animal2.setAnimalAggressivenessLevel(65 +(i+1));  
		animals.add(animal2);
				
		System.out.println("____ANIMAL DETAILS_____\n");
		System.out.println("AnimalName: "+animal2.getAnimalName()
		+"\nAnimalStrengthLevel: "+animal2.getAnimalStrengthLevel()
		+"\nAnimalHungerLevel: "+animal2.getAnimalHungerLevel()
		+"\nAnimalAggressivenessLevel: "+animal2.getAnimalAggressivenessLevel()+"\n"); 
		
	}
		for (int i=0;i < 1; i++) {
		
		animal3.setAnimalName("CHEETAH");
 		animal3.setAnimalStrengthLevel(90 +(i+1));
		animal3.setAnimalHungerLevel(75 +(i+1));
		animal3.setAnimalAggressivenessLevel(65 +(i+1));  
		animals.add(animal3);
				
		System.out.println("____ANIMAL DETAILS_____\n");
		System.out.println("AnimalName: "+animal3.getAnimalName()
		+"\nAnimalStrengthLevel: "+animal3.getAnimalStrengthLevel()
		+"\nAnimalHungerLevel: "+animal3.getAnimalHungerLevel()
		+"\nAnimalAggressivenessLevel: "+animal3.getAnimalAggressivenessLevel()+"\n"); 
	}
	}
			
	// Create Meet Animal method
	
 	public void meetAnimals(){
		
		animal1.animalFight(animal2);
		animal2.animalFight(animal3);
		animal3.animalFight(animal1);
		
		System.out.println("\n"+"Tiger's damage: "+animal1.getDamagePercentage()
		+"\nLion's Damage:"+animal2.getDamagePercentage()+"\n");

		System.out.println("Lion's damage: "+animal2.getDamagePercentage()
		+"\nCheetah's Damage:"+animal3.getDamagePercentage()+"\n"); 
		
 		System.out.println("Cheetah's damage: "+animal3.getDamagePercentage()
		+"\nTiger's Damage:"+animal1.getDamagePercentage()+"\n");		
		
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
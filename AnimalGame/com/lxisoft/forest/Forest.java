//Packages
package com.lxisoft.forest;
import java.util.ArrayList;
import java.util.List;
import com.lxisoft.forest.Animal;

public class Forest {
				
	private List<Animal> animals = new ArrayList<>();
	private String forestName;
	
 	public void animalDetails(int number){
		
		for (int i=0;i < number; i++) {
		Animal animal = new Animal();
		animal.setAnimalName("Animal "+(i+1));
 		animal.setAnimalStrengthLevel(90 +(i+1));
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
		System.out.println("-----Total Number of Animals in the Forets-----"+"\n");
		for(int i=0; i < animals.size();i++){
			System.out.println(animals.get(i).getAnimalName()+"\n");
		}
	}
			
	public void fight(){
		int size = animals.size();
		System.out.println("-----RANDOM FIGHT DETAILS-----");
		for (int i=0; i <size; i++){
		double randomValue = Math.random();
		System.out.println("Random value: "+randomValue);
		int randomIndex = (int)(randomValue*animals.size());
        System.out.println("Random value * "+size+": "+randomIndex);
		System.out.println(animals.get(randomIndex).getAnimalName());
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
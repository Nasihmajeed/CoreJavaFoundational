//Packages
package com.lxisoft.forest;
import java.util.ArrayList;
import java.util.List;
import com.lxisoft.forest.Animal;

public class Forest {
				
	private List<Animal> animals = new ArrayList<Animal>();
	private String forestName;
	
 	public void animalDetails(int number){
		
		//Animal animal = new Animal();
		
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
		System.out.println("-----Total Number of Animals in the Forest-----"+"\n");
		for(int i=0; i < animals.size();i++){
		System.out.println(animals.get(i).getAnimalName()+"\n");			
		}
		}
	
/* 	public void fightBetweenAnimals(){
		System.out.println("\n"+"-----Animals Fight-----"+"\n");
		
		animals.get(0).animalFight(animals.get(1));
		animals.get(1).animalFight(animals.get(2));
	 	animals.get(2).animalFight(animals.get(3));
		animals.get(3).animalFight(animals.get(4));
		animals.get(4).animalFight(animals.get(1));
				
		System.out.println("\n"+"Animal 1 & 2 damage Percentage: " + animals.get(0).animalFight(animals.get(1))+
		"\n" +"Animal 2 & 3 damage Percentage: " + animals.get(1).animalFight(animals.get(2))+
		"\n" +"Animal 3 & 4 damage Percentage: "+ animals.get(2).animalFight(animals.get(3))+
		"\n" +"Animal 4 & 5 damage Percentage: "+ animals.get(3).animalFight(animals.get(4))+
		"\n" +"Animal 5 & 1 damage Percentage: " + animals.get(4).animalFight(animals.get(1)));
	} */

			
	public void randomAnimalsMeet(){
		int size = animals.size();
		System.out.println("-----RANDOM FIGHT DETAILS-----");
		for (int i=0; i <size; i++){
		double randomValue = Math.random();
		double randomValue1 = Math.random();
		//System.out.println("Random value1: "+randomValue);
		
		int randomIndex = (int)(randomValue*animals.size());
		int randomIndex1 = (int)(randomValue1*animals.size());
		
        //System.out.println("Random value2 * "+size+": "+randomIndex);
		
		System.out.println(animals.get(randomIndex).getAnimalName()); 
		
		// Storing 2 animals and printing the details
		
		Animal animal1 = animals.get(randomIndex);
		
		System.out.println("Random Animal1: "+animal1.getAnimalName()+"\n"); 
		
		Animal animal2 = animals.get(randomIndex1);
		
		System.out.println("Random Animal2: "+animal2.getAnimalName()+"\n"); 
		
		float fightResult = animal1.animalFight(animal2);
		
		System.out.println("Fight: " +fightResult+"\n");
		
		if (fightResult > 1) {
			System.out.println("\n" + "This Group has won the fight"+"\n" ); 
		
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
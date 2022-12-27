//Packages
package com.lxisoft.forest;
import java.util.ArrayList;
import java.util.List;
import com.lxisoft.forest.Animal;

public class Forest extends Deer implements Carnivores{
				
	private List<Animal> animals = new ArrayList<Animal>();
	private String forestName;
	//public int carnivoresCount = 0;
    	
 	public void forestAnimals(){
		
		Deer deer = new Deer();
		deer.setAnimalName("Deer");
 		deer.setAnimalStrengthLevel(5);
		deer.setAnimalHungerLevel(6);
		deer.setAnimalAggressivenessLevel(7);
		animals.add(deer);		
		
		System.out.println("____ANIMAL DETAILS_____\n");
		System.out.println("AnimalName: "+deer.getAnimalName()
		+"\nAnimalStrengthLevel: "+deer.getAnimalStrengthLevel()
		+"\nAnimalHungerLevel: "+deer.getAnimalHungerLevel()
		+"\nAnimalAggressivenessLevel: "+deer.getAnimalAggressivenessLevel()+"\n"); 
		
		
		Elephant elephant = new Elephant();
		elephant.setAnimalName("Elephant");
 		elephant.setAnimalStrengthLevel(7);
		elephant.setAnimalHungerLevel(8);
		elephant.setAnimalAggressivenessLevel(9);  
		animals.add(elephant);
		
		System.out.println("AnimalName: "+elephant.getAnimalName()
		+"\nAnimalStrengthLevel: "+elephant.getAnimalStrengthLevel()
		+"\nAnimalHungerLevel: "+elephant.getAnimalHungerLevel()
		+"\nAnimalAggressivenessLevel: "+elephant.getAnimalAggressivenessLevel()+"\n"); 
		
		Lion lion = new Lion();
		lion.setAnimalName("Lion");
 		lion.setAnimalStrengthLevel(7);
		lion.setAnimalHungerLevel(8);
		lion.setAnimalAggressivenessLevel(9);  
		animals.add(lion);
		
		System.out.println("AnimalName: "+lion.getAnimalName()
		+"\nAnimalStrengthLevel: "+lion.getAnimalStrengthLevel()
		+"\nAnimalHungerLevel: "+lion.getAnimalHungerLevel()
		+"\nAnimalAggressivenessLevel: "+lion.getAnimalAggressivenessLevel()+"\n"); 
		
		Tiger tiger = new Tiger();
		tiger.setAnimalName("Tiger");
 		tiger.setAnimalStrengthLevel(7);
		tiger.setAnimalHungerLevel(8);
		tiger.setAnimalAggressivenessLevel(9);  
		animals.add(tiger);
		
		System.out.println("AnimalName: "+tiger.getAnimalName()
		+"\nAnimalStrengthLevel: "+tiger.getAnimalStrengthLevel()
		+"\nAnimalHungerLevel: "+tiger.getAnimalHungerLevel()
		+"\nAnimalAggressivenessLevel: "+tiger.getAnimalAggressivenessLevel()+"\n"); 
		
		Wolf wolf = new Wolf();
		wolf.setAnimalName("Wolf");
 		wolf.setAnimalStrengthLevel(7);
		wolf.setAnimalHungerLevel(8);
		wolf.setAnimalAggressivenessLevel(9);  
		animals.add(wolf);
		
		System.out.println("AnimalName: "+wolf.getAnimalName()
		+"\nAnimalStrengthLevel: "+wolf.getAnimalStrengthLevel()
		+"\nAnimalHungerLevel: "+wolf.getAnimalHungerLevel()
		+"\nAnimalAggressivenessLevel: "+wolf.getAnimalAggressivenessLevel()+"\n"); 
		
/* 		for (int i=0;i < number; i++) {
		Animal animal = new Animal();
		animal.setAnimalName("Animal "+(i+1));
 		animal.setAnimalStrengthLevel(1 +(i+1));
		animal.setAnimalHungerLevel(1 +(i+1));
		animal.setAnimalAggressivenessLevel(1 +(i+1));  
		animals.add(animal);
		
			
		System.out.println("____ANIMAL DETAILS_____\n");
		System.out.println("AnimalName: "+animal.getAnimalName()
		+"\nAnimalStrengthLevel: "+animal.getAnimalStrengthLevel()
		+"\nAnimalHungerLevel: "+animal.getAnimalHungerLevel()
		+"\nAnimalAggressivenessLevel: "+animal.getAnimalAggressivenessLevel()+"\n"); 
		
	} */
	}
	
/* 	public void coutingCarnivores(){
		
		for(int i=0; i < animals.size();i++) {
		if ((animals.get(i) instanceof Carnivores)){
			carnivoresCount++;
		}
		}
		
	} */
	
	public void animalsCountinforest(){
		System.out.println("-----Total Number of Animals in the Forest-----"+"\n");
		for(int i=0; i < animals.size();i++){
		System.out.println(animals.get(i).getAnimalName()+"\n");			
		}
		}
			
	public void randomAnimalsMeetAndFight(){
			
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
		
		//if ((animal1 instanceof Carnivores) && (animal2 instanceof Carnivores)) {
			
		if ((animal1 instanceof Herbivores)) {
			
		System.out.println(animal1.getAnimalName());	
		
		Herbivores.escape();} 
		
		else {
		
		
		if (((animal1.getAnimalStrengthLevel() >= 1) && (animal2.getAnimalStrengthLevel() >= 1))){
		
		System.out.println("Fight Between 2 Animals & Survived Animal Name : " +animal1.animalFight(animal2)+"\n");
		
		System.out.println("After Fight Animal1 Strength Level: " + animal1.getAnimalStrengthLevel()+"\n" + "\n" + 
		"After Fight Animal2 Strength Level: " + animal2.getAnimalStrengthLevel()+"\n");		
		}
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
			
	}
	
	} 
	
 	public void survivedAnimalNameAndDetails(){
			
	for (Animal i : animals){
		
	if (i.getAnimalStrengthLevel() > 1)	{
				
	System.out.println("Survived Animal Name: " + i.getAnimalName()+"\n" + 
	"Survived Animal Strength Level:" + i.getAnimalStrengthLevel()+"\n" + 
	"Survived Animal Hunger Level:" + i.getAnimalHungerLevel()+"\n" + 
	"Survived Animal Aggressiveness Level:" + i.getAnimalAggressivenessLevel());
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
		
/* 		for (int i=0; i<animals.size();i++){
			animals.get(i).print();
		} */
		System.out.println (this.forestName);
			
	}
}
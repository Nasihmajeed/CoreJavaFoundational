//Packages

package com.lxisoft.forest;
import java.util.Comparator;

public class Animal{
	
	private String animalName;
	private int animalStrengthLevel,animalHungerLevel,animalAggressivenessLevel;
	private float damagePercentage;
	
 	public String animalFight(Animal animal1){
		
		if (this.animalStrengthLevel > animal1.getAnimalStrengthLevel()){
			
			this.setAnimalStrengthLevel(this.getAnimalStrengthLevel()-1);
						
			animal1.setAnimalStrengthLevel(animal1.getAnimalStrengthLevel()-2);
			
			return this.getAnimalName();
					
			
		} else if (this.animalStrengthLevel < animal1.getAnimalStrengthLevel()){
			
			animal1.setAnimalStrengthLevel(animal1.getAnimalStrengthLevel()-1);
			
			this.setAnimalStrengthLevel(this.getAnimalStrengthLevel()-2);
			
			return animal1.getAnimalName();
			
		}  
			return null;
		}
	
	// Setter and Getter
	
	public void setAnimalName(String animName){
	this.animalName = animName;
}
	
	public void setAnimalStrengthLevel(int animalStrLevel){
	this.animalStrengthLevel = animalStrLevel;
}

	public void setAnimalHungerLevel(int animalHunLevel){
	this.animalHungerLevel = animalHunLevel;
}

	public void setAnimalAggressivenessLevel(int animalAggressivLevel){
	this.animalAggressivenessLevel = animalAggressivLevel;
}
	public void setDamagePercentage(float damagePercent){
	this.damagePercentage = damagePercent;
}

	public String getAnimalName(){
	return this.animalName;
}

	public int getAnimalStrengthLevel(){
	return this.animalStrengthLevel;
}

	public int getAnimalHungerLevel(){
	return this.animalHungerLevel;
}

	public int getAnimalAggressivenessLevel(){
	return this.animalAggressivenessLevel;
}

	public float getDamagePercentage(){
	return this.damagePercentage;
}

public void print(){
	System.out.println(animalName+"\n"+animalStrengthLevel+"\n"+animalHungerLevel+
	"\n"+animalAggressivenessLevel+"\n"+this.damagePercentage);
	}
}
//Packages

package com.lxisoft.forest;

public class Animal{
	
	private String animalName;
	private int animalStrengthLevel,animalHungerLevel,animalAggressivenessLevel;
	private float damagePercentage;
		
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
	"\n"+animalAggressivenessLevel+"\n"+damagePercentage);
	}
}
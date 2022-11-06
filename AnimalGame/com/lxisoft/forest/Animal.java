//Packages

package com.lxisoft.forest;

public class Animal{
	
	private String animalName;
	private int animalStrengthLevel,animalHungerLevel,animalAggressivenessLevel;
	private float damagePercentage;
	private float afterFight;
	
 	public float animalFight(Animal animal){
		
		this.damagePercentage = (this.animalStrengthLevel+this.animalHungerLevel+this.animalAggressivenessLevel)
		-(animal.getAnimalStrengthLevel()+animal.getAnimalHungerLevel()+animal.getAnimalAggressivenessLevel());	
		this.afterFight=(this.damagePercentage-10);
		return this.afterFight;
		
	} 
	
 /* 	public float animalFight(Animal animal){
		this.damagePercentage = (this.animalStrengthLevel+animal.getAnimalStrengthLevel()/this.animalStrengthLevel*100);
		this.afterFight=(this.damagePercentage-75);
		return this.afterFight;
	} */
	 
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
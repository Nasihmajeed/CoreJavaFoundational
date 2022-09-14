//Packages

package  com.lxisoft.Forest;

public class Animal {
	
	private String animalName;
	private String animalStrengthLevel,animalHungerLevel,animalAggressivenessLevel;
	
	
	// Setter and Getter
	
	public void setAnimalName(String animName){
	this.animalName = animName;
}
	
	public void setAnimalStrengthLevel(String animalStrLevel){
	this.animalStrengthLevel = animalStrLevel;
}

	public void setAnimalHungerLevel(String animalHunLevel){
	this.animalHungerLevel = animalHunLevel;
}

	public void setAnimalAggressivenessLevel(String animalAggressivLevel){
	this.animalAggressivenessLevel = animalAggressivLevel;
}

	public String getAnimalNamee (){
	return this.animalName;
}

	public String getAnimalStrengthLevel (){
	return this.animalStrengthLevel;
}

	public String getAnimalHungerLevel (){
	return this.animalHungerLevel;
}

	public String getAnimalAggressivenessLevel (){
	return this.animalAggressivenessLevel;
}

public void print(){
	System.out.println(animalName+"\n"+animalStrengthLevel+"\n"+animalHungerLevel+"\n"+animalAggressivenessLevel);
	}
}
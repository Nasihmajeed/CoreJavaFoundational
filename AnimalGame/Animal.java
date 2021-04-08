import java.util.*;
class Animal{
	String name;
	int strength;
	ArrayList<Animal> animal=new ArrayList<Animal>();
public void setName(String name){
	this.name=name;
}
public String getName(){
	return name;
}
public void setStrength(int strength){
	this.strength=strength;
}
public int getStrength(){
	return strength;
}
public void addAnimal(ArrayList<Animal> animal){
	animal.add(new Animal());
	animal.get(0).setName("TIGER");
	animal.get(0).setStrength(85);
	animal.add(new Animal());
	animal.get(1).setName("LION");
	animal.get(1).setStrength(88);
	animal.add(new Animal());
	animal.get(2).setName("CHEETAH");
	animal.get(2).setStrength(80);
	animal.add(new Animal());
	animal.get(3).setName("FOX");
	animal.get(3).setStrength(75);
}
}
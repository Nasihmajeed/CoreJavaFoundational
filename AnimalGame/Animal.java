import java.util.*;
public class Animal{
	String name;
	int strength;
	boolean life;
/* public Animal(){
	this.name=name;
	this.strength=strength;
	this.life=life;
} */
	//ArrayList<Animal> carnAnimal=new ArrayList<Animal>();
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
public void setLife(boolean life){
	this.life=life;
}
public boolean getLife(){
	return life;
}
}
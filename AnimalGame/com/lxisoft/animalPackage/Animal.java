package com.lxisoft.animalPackage;

import java.util.*;
public class Animal{
	String name,type;
	int strength;
	ArrayList<Animal> animal=new ArrayList<Animal>();
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
public void setType(String type){
	this.type=type;
}
public String getType(){
	return type;
}
public void addAnimal(ArrayList<Animal> animal){
	for(int i=0;i<10;i++){
		animal.add(new Animal());
	}
	animal.get(0).setName("DEER");
	animal.get(0).setStrength(40);
	animal.get(0).setType("HERBIVORES");
	//animal.add(new Animal());
	animal.get(1).setName("BUFFALLO");
	animal.get(1).setStrength(50);
	animal.get(1).setType("HERBIVORES");
	//animal.add(new Animal());
	animal.get(2).setName("GIRAFFE");
	animal.get(2).setStrength(45);
	animal.get(2).setType("HERBIVORES");
	//animal.add(new Animal());
	animal.get(3).setName("ELEPHANT");
	animal.get(3).setStrength(90);
	animal.get(3).setType("HERBIVORES");
	
	animal.get(4).setName("COW");
	animal.get(4).setStrength(38);
	animal.get(4).setType("HERBIVORES");
	
	/* for(int i=0;i<5;i++){
		carnAnimal.add(new Animal());
	} */
	animal.get(5).setName("TIGER");
	animal.get(5).setStrength(84);
	animal.get(5).setType("CARNIVORES");
	
	animal.get(6).setName("LION");
	animal.get(6).setStrength(87);
	animal.get(6).setType("CARNIVORES");
	
	animal.get(7).setName("CHEETAH");
	animal.get(7).setStrength(60);
	animal.get(7).setType("CARNIVORES");
	
	animal.get(8).setName("FOX");
	animal.get(8).setStrength(79);
	animal.get(8).setType("CARNIVORES");
	
	animal.get(9).setName("PANTHER");
	animal.get(9).setStrength(82);
	animal.get(9).setType("CARNIVORES");
	
	/* carnAnimal.get(5).setName("LEOPARD");
	carnAnimal.get(5).setStrength(83); */
}
}
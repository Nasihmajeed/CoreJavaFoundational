package com.LxiSoft.AnimalGame.Game;
import java.util.*;
public class Jaguar extends Animal implements Carnivore{
	public void animalDetails(){
		System.out.println("           2)   The jaguar is a large felid species and the only extant member of the genus Panthera ");
	}

	public void setName(String name){
		this.animalName = name;
	}
	public String getName(){
		return animalName;
	} 
	public void setStrength(int strenth){
		this.strength = strenth;
	}
	public int getStrength(){
		return strength;
	}
	public void setEnergyLevel(int energy){
		this.energyLevel = energy;
	}
	public int getEnergyLevel(){
		return energyLevel;
	}
	public void setHungerLevel(int hunger){
		this.hungerLevel = hunger;
	}
	public int getHungerLevel(){
		return hungerLevel;
	}
}
package com.LxiSoft.AnimalGame.Game;
import java.util.*;
public class WildeBeest extends Animal implements Herbivore{
	public void animalDetails(){
		System.out.println("           4)   The wildebeest is an antelope in the genus Connochaetes. It belongs to the family Bovidae.");
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
}
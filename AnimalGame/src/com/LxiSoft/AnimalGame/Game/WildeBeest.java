package com.LxiSoft.AnimalGame.Game;
import java.util.*;
public class WildeBeest extends Animal implements Herbivore{
	String animalName;
	int strength;
	int energyLevel;
	public void behaviour(){
		System.out.println("  ");
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
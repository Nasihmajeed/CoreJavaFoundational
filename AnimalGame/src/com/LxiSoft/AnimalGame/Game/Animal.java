package com.LxiSoft.AnimalGame.Game;
import java.util.*;
public abstract class Animal{
	public abstract void animalDetails();

	String animalName;
	int strength;
	int energyLevel;
	int hungerLevel;
	int range;
	
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
	public void setArea(int area){
		this.range = area;
	}
	public int getArea(){
		return range;
	}
}
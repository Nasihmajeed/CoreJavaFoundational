package com.LxiSoft.Test;
import com.LxiSoft.AnimalGame.Game;
import java.util.*;
public class Animal{
	String animalName;
	int strength;
	int energyLevel;
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
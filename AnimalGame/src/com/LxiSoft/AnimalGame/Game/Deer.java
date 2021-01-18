package com.LxiSoft.AnimalGame.Game;
import java.util.*;
public class Deer extends Animal implements Herbivore{
	public void animalDetails(){
		System.out.println("           3)   Deer or true deer are hoofed ruminant mammals forming the family Cervidae");
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
package com.LxiSoft.AnimalGame.Game;
import java.util.*;
abstract class Animal{
	
	public void behaviour(){
		System.out.println("  ");
	}
	abstract  void setName(String name);
	abstract  String getName();
	abstract  void setStrength(int strenth);
	abstract int getStrength();
	abstract  void setEnergyLevel(int energy);
	abstract int getEnergyLevel();
}
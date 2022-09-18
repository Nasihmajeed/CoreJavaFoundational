//Packages

package com.lxisoft.methods;

public class Methods {
	
/* 		public static void  animalname(String AnimalName){
		System.out.println(AnimalName);
		}	 */	
		public static int animalfight (int AnimalStrengthLevel,int AnimalHungerLevel,int AnimalAggressivenessLevel){
			int fight;
			fight = AnimalStrengthLevel+AnimalHungerLevel+AnimalAggressivenessLevel;
			return fight;
						
	}
}
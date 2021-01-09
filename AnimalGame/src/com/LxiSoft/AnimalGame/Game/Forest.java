package com.LxiSoft.AnimalGame;
import com.LxiSoft.AnimalGame.Game;
import java.util.*;
public class Forest{
	String forestName;
	ArrayList<Animal> animals = new ArrayList<Animal>();
	public void setGame(){
		Scanner s = new Scanner(System.in);
		forestName = "JUMANJI";
		System.out.println(forestName+" is a forest full of vigourous animals. They fight for their life and their existence");
		System.out.println("Do you want to start the game 1.Yes 0.Exit");
		int start = s.nextInt();
		if(start == 1)
			this.animalGame();
	}
	public void animalGame(){
		this.addAnimals();
		this.setAnimal();
		for(int i=0; i<animals.size(); i++){
			System.out.println(animals.get(i).getName()+"\t "+animals.get(i).getStrength()+"\t"+animals.get(i).getEnergyLevel());
		}
	}	
	public void addAnimals(){
		animals.add(new Animal());
		animals.add(new Animal());
		animals.add(new Animal());
		animals.add(new Animal());
	}
	public void setAnimal(){
		animals.get(0).setName("Jaguar");
		animals.get(0).setStrength(8);
		animals.get(0).setEnergyLevel(6);
		animals.get(1).setName("Deer");
		animals.get(1).setStrength(5);
		animals.get(1).setEnergyLevel(10);
		animals.get(2).setName("Tiger");
		animals.get(2).setStrength(10);
		animals.get(2).setEnergyLevel(10);
		animals.get(3).setName("Wider_Beast");
		animals.get(3).setStrength(3);
		animals.get(3).setEnergyLevel(7);
	}
}
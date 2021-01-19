package com.LxiSoft.AnimalGame.Game;
import com.LxiSoft.AnimalGame.Game.Animal;
import java.util.*;
public class Forest{
	String forestName;
	ArrayList<Animal> animals = new ArrayList<Animal>();
	Random random = new Random();
	AnimalFight fight = new AnimalFight();
	public void setGame(){
		Scanner s = new Scanner(System.in);
		forestName = "JUMANJI";
		System.out.println("\n"+forestName+" is a forest full of vigourous animals. They fight for their life and their existence \n");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("   FACTS : ");
		this.aboutAnimal();
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("\nDo you want to start the game 1.Yes 0.Exit");
		int start = s.nextInt();
		if(start == 1)
			this.animalGame();
	}
	public void aboutAnimal(){
		Tiger t = new Tiger();
		Jaguar j = new Jaguar();
		Deer d = new Deer();
		WildeBeest wb = new WildeBeest();
		t.animalDetails();
		j.animalDetails();
		d.animalDetails();
		wb.animalDetails();
	}
	public void animalGame(){
		Scanner s = new Scanner(System.in);
		this.addAnimals();
		this.setAnimal();
		this.printList();
		int again;
		int size;
		do{
			
		    size = animals.size();
		    int x = random.nextInt(size);
		    int y = random.nextInt(size);
		    if(x != y){
		    	fight.setFight(x,y,animals);
		    }
		    
		    
		    //}
		    //System.out.println("Do you need to keep fighting 1.Yes 0.No");
		    //again = s.nextInt();
		}while(size > 1);
		if(size == 1){
			System.out.println("\nThe Conquerer of "+forestName+" ");
		   	System.out.println("+----------------------+");
		    System.out.println("         JUMANJI        ");
		    System.out.println("+----------------------+");
		    System.out.println("     "+animals.get(size-1).getName());
		    System.out.println("+----------------------+");   	
		}
	}	
	public void addAnimals(){
		animals.add(new Tiger());
		animals.add(new Jaguar());
		animals.add(new Deer());
		animals.add(new WilderBeast());

		animals.add(new Tiger());
		animals.add(new Jaguar());
		animals.add(new Deer());
		animals.add(new WilderBeast());
	}
	public void setAnimal(){
		int bTigerTrtry = random.nextInt(20);
		int jguarTrtry = random.nextInt(20);
		int deerTrtry = random.nextInt(20);
		int beestTrtry = random.nextInt(20);
		int wTigerTrtry = random.nextInt(20);
		int lepordTrtry = random.nextInt(20);
		int rDeerTrtry = random.nextInt(20);
		int bisonTrtry = random.nextInt(20);
		animals.get(0).setName("Bengal Tiger");
		animals.get(0).setStrength(10);
		animals.get(0).setEnergyLevel(9);
		animals.get(0).setHungerLevel(8);
		animals.get(0).setArea(bTigerTrtry);
		animals.get(1).setName("Jaguar      ");
		animals.get(1).setStrength(8);
		animals.get(1).setEnergyLevel(6);
		animals.get(1).setHungerLevel(6);
		animals.get(1).setArea(jguarTrtry);
		animals.get(2).setName("Deer        ");
		animals.get(2).setStrength(5);
		animals.get(2).setEnergyLevel(10);
		animals.get(2).setArea(deerTrtry);
		animals.get(3).setName("WildeBeest  ");
		animals.get(3).setStrength(6);
		animals.get(3).setEnergyLevel(7);
		animals.get(3).setArea(beestTrtry);

		animals.get(4).setName("White Tiger ");
		animals.get(4).setStrength(9);
		animals.get(4).setEnergyLevel(8);
		animals.get(4).setHungerLevel(5);
		animals.get(4).setArea(wTigerTrtry);
		animals.get(5).setName("Leopord     ");
		animals.get(5).setStrength(6);
		animals.get(5).setEnergyLevel(9);
		animals.get(5).setHungerLevel(4);
		animals.get(5).setArea(lepordTrtry);
		animals.get(6).setName("Red Deer    ");
		animals.get(6).setStrength(6);
		animals.get(6).setEnergyLevel(7);
		animals.get(6).setArea(rDeerTrtry);
		animals.get(7).setName("Bisons      ");
		animals.get(7).setStrength(7);
		animals.get(7).setEnergyLevel(3);
		animals.get(7).setArea(bisonTrtry);
	}
	public void printList(){
		//System.out.println(animals.size());
		System.out.println("+---------+-------------+");
		System.out.println("         JUMANJI         ");
		System.out.println("+---------+-------------+");
		System.out.println("  S.No\t    Animal    \t ");
		System.out.println("+---------+-------------+");
		for(int i=0; i<animals.size(); i++){
			System.out.println("  "+(i+1)+"\t    "+animals.get(i).getName()+"\t");
		}
		System.out.println("+---------+-------------+");
	}
	
}
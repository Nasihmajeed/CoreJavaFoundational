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
		t.carnBehaviour();
		j.animalDetails();
		j.carnBehaviour();
		d.animalDetails();
		d.herbBehaviour();
		wb.animalDetails();
		wb.herbBehaviour();
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
		    	this.setFight(x,y,animals);
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
		else{
			System.out.println("\nTHERE IS NO WINNER");
		}
	}
	public void setFight(int animal1,int animal2,ArrayList<Animal> animals){
		//if(animals.get(animal1).getLife() == true && animals.get(animal2).getLife() == true){
			if(animals.get(animal1) instanceof Carnivore && animals.get(animal2) instanceof Carnivore){
			    fight.carnivoreVsCarnivore(animal1,animal2,animals);
		    }
		    else if(animals.get(animal1) instanceof Carnivore && animals.get(animal2) instanceof Herbivore){ 
			    fight.carnivoreVsHerbivore(animal1,animal2,animals);
		    }
		    else if(animals.get(animal1) instanceof Herbivore && animals.get(animal2) instanceof Carnivore){
			    fight.herbivoreVsCarnivore(animal1,animal2,animals);
		    }
		    else if(animals.get(animal1) instanceof Herbivore && animals.get(animal2) instanceof Herbivore){
			
			    fight.result(animal1,animal2,animals);
			    System.out.println(" "+animals.get(animal1).getName()+" and "+animals.get(animal2).getName()+" does not fight each other");
			    System.out.println("------------------------------------------------------------------------------------------"); 
		    }
		//}
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
		/*int bTigerTrtry = random.nextInt(20);
		int bTigerView = random.nextInt(10);
		int jguarTrtry = random.nextInt(20);
		int jguarView = random.nextInt(10);
		int deerTrtry = random.nextInt(20);
		int deerView = random.nextInt(10);
		int beestTrtry = random.nextInt(20);
		int beestView = random.nextInt(10);
		int wTigerTrtry = random.nextInt(20);
		int wTigerView = random.nextInt(10);
		int lepordTrtry = random.nextInt(20);
		int lepordView = random.nextInt(10);
		int rDeerTrtry = random.nextInt(20);
		int rDeerView = random.nextInt(10);
		int bisonTrtry = random.nextInt(20);
		int bisonView = random.nextInt(10);*/
		animals.get(0).setName("Bengal Tiger");
		animals.get(0).setStrength(10);
		animals.get(0).setEnergyLevel(9);
		animals.get(0).setHungerLevel(8);
		animals.get(0).setArea(40);
		animals.get(0).setView(12);
		animals.get(0).setLife(true);
		animals.get(1).setName("Jaguar      ");
		animals.get(1).setStrength(8);
		animals.get(1).setEnergyLevel(6);
		animals.get(1).setHungerLevel(4);
		animals.get(1).setArea(35);
		animals.get(1).setView(15);
		animals.get(1).setLife(true);
		animals.get(2).setName("Deer        ");
		animals.get(2).setStrength(5);
		animals.get(2).setEnergyLevel(10);
		animals.get(2).setHungerLevel(5);
		animals.get(2).setArea(20);
		animals.get(2).setView(10);
		animals.get(2).setLife(true);
		animals.get(3).setName("WildeBeest  ");
		animals.get(3).setStrength(6);
		animals.get(3).setEnergyLevel(7);
		animals.get(3).setHungerLevel(4);
		animals.get(3).setArea(15);
		animals.get(3).setView(5);
		animals.get(3).setLife(true);

		animals.get(4).setName("White Tiger ");
		animals.get(4).setStrength(9);
		animals.get(4).setEnergyLevel(8);
		animals.get(4).setHungerLevel(4);
		animals.get(4).setArea(32);
		animals.get(4).setView(11);
		animals.get(4).setLife(true);
		animals.get(5).setName("Leopord     ");
		animals.get(5).setStrength(7);
		animals.get(5).setEnergyLevel(9);
		animals.get(5).setHungerLevel(4);
		animals.get(5).setArea(30);
		animals.get(5).setView(13);
		animals.get(5).setLife(true);
		animals.get(6).setName("Red Deer    ");
		animals.get(6).setStrength(6);
		animals.get(6).setEnergyLevel(7);
		animals.get(6).setHungerLevel(5);
		animals.get(6).setArea(28);
		animals.get(6).setView(9);
		animals.get(6).setLife(true);
		animals.get(7).setName("Bisons      ");
		animals.get(7).setStrength(5);
		animals.get(7).setEnergyLevel(3);
		animals.get(7).setHungerLevel(6);
		animals.get(7).setArea(42);
		animals.get(7).setView(8);
		animals.get(7).setLife(true);
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
package com.LxiSoft.AnimalGame.Game;
import com.LxiSoft.AnimalGame.Game.Animal;
import java.util.*;
public class Forest{
	String forestName;
	ArrayList<Animal> animals = new ArrayList<Animal>();
	Random random = new Random();
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
			//System.out.println("Array size "+animals.size());
		    size = animals.size();
		    //int choice1 = s.nextInt();
		    //int choice2 = s.nextInt();
		    int x = random.nextInt(size);
		    int y = random.nextInt(size);
		    //System.out.println(x+" "+y);
		    if(x != y){
		    	this.fight(x,y);
		    	/*if(x==0){
			        x+=1;
		        }
		        if(y == 0){
			        y+=1;*/
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
		animals.get(0).setName("Bengal Tiger");
		animals.get(0).setStrength(10);
		animals.get(0).setEnergyLevel(9);
		animals.get(0).setHungerLevel(4);
		animals.get(1).setName("Jaguar      ");
		animals.get(1).setStrength(8);
		animals.get(1).setEnergyLevel(6);
		animals.get(1).setHungerLevel(3);
		animals.get(2).setName("Deer        ");
		animals.get(2).setStrength(5);
		animals.get(2).setEnergyLevel(10);
		animals.get(3).setName("WildeBeest  ");
		animals.get(3).setStrength(6);
		animals.get(3).setEnergyLevel(7);

		animals.get(4).setName("White Tiger ");
		animals.get(4).setStrength(9);
		animals.get(4).setEnergyLevel(8);
		animals.get(4).setHungerLevel(5);
		animals.get(5).setName("Leopord     ");
		animals.get(5).setStrength(6);
		animals.get(5).setEnergyLevel(9);
		animals.get(5).setHungerLevel(2);
		animals.get(6).setName("Red Deer    ");
		animals.get(6).setStrength(6);
		animals.get(6).setEnergyLevel(7);
		animals.get(7).setName("Bisons      ");
		animals.get(7).setStrength(7);
		animals.get(7).setEnergyLevel(3);
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
	public void fight(int animal1,int animal2){
		if(animals.get(animal1) instanceof Carnivore && animals.get(animal2) instanceof Carnivore){
			this.carnivoreVsCarnivore(animal1,animal2);
		}
		else if(animals.get(animal1) instanceof Carnivore && animals.get(animal2) instanceof Herbivore || (animals.get(animal1) instanceof Herbivore && animals.get(animal2) instanceof Carnivore)){
			this.carnivoreVsHerbivore(animal1,animal2);
		}
		else if(animals.get(animal1) instanceof Herbivore && animals.get(animal2) instanceof Herbivore){
			System.out.println(" "+animals.get(animal1).getName()+" and "+animals.get(animal2).getName()+" does not fight each other"); 
		}
		
		//this.printList();
	}
	public void carnivoreVsCarnivore(int n1,int n2){
		if(animals.get(n1).getStrength() > animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() > animals.get(n2).getEnergyLevel()){
			System.out.println(animals.get(n2).getName()+" has lost the fight and got killed by "+animals.get(n1).getName());
			animals.remove(n2);
			//System.out.println("The remaining animals ");
			//this.printList();
		}
		else if(animals.get(n2).getStrength() > animals.get(n1).getStrength() && animals.get(n2).getEnergyLevel() > animals.get(n1).getEnergyLevel()){
			System.out.println(animals.get(n1).getName()+" has lost the fight and got killed by "+animals.get(n2).getName());
			animals.remove(n1);
			    //System.out.println("The remaining animals ");
			//this.printList();
		}
		else if(animals.get(n1).getStrength() > animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() < animals.get(n2).getEnergyLevel()){
		    System.out.println(animals.get(n2).getName()+" has lost the fight and got killed by "+animals.get(n1).getName());
		    animals.remove(n2);
			    //System.out.println("The remaining animals ");
			//this.printList();
		}
		else if(animals.get(n1).getStrength() < animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() > animals.get(n2).getEnergyLevel()){
		    System.out.println(animals.get(n1).getName()+" has lost the fight and got killed by "+animals.get(n2).getName());
		    animals.remove(n1);
			    //System.out.println("The remaining animals ");
			//this.printList();
		}
		else if(animals.get(n1).getStrength() > animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() == animals.get(n2).getEnergyLevel()){
		    System.out.println(animals.get(n2).getName()+" has lost the fight and got killed by "+animals.get(n1).getName());
		    animals.remove(n2);
			   // System.out.println("The remaining animals ");
			//this.printList();
		}
		else if(animals.get(n1).getStrength() < animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() == animals.get(n2).getEnergyLevel()){
		    System.out.println(animals.get(n1).getName()+" has lost the fight and got killed by "+animals.get(n2).getName());
		    animals.remove(n1);
			    //System.out.println("The remaining animals ");
			//this.printList();
		}
		else if(animals.get(n1).getStrength() == animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() > animals.get(n2).getEnergyLevel()){
		    System.out.println(animals.get(n1).getName()+" has got escaped and "+animals.get(n2).getName()+" Stands");
			//this.printList();
		}
		else if(animals.get(n1).getStrength() == animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() < animals.get(n2).getEnergyLevel()){
		    System.out.println(animals.get(n2).getName()+" has got escaped and "+animals.get(n1).getName()+" Stands");
			//this.printList();
		} 
		else if(animals.get(n1).getStrength() == animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() == animals.get(n2).getEnergyLevel()){
		    System.out.println(animals.get(n1).getName()+" , "+animals.get(n2).getName()+" got tie ");
			//this.printL ist();
		}
	}
	public void carnivoreVsHerbivore(int m1, int m2){
		if(animals.get(m1).getStrength() > animals.get(m2).getStrength() && animals.get(m1).getEnergyLevel() > animals.get(m2).getEnergyLevel()){
			System.out.println(animals.get(m2).getName()+" has lost the fight and got killed by "+animals.get(m1).getName());
			animals.remove(m2);
			//System.out.println("The remaining animals ");
			//this.printList();
		}
		else if(animals.get(m2).getStrength() > animals.get(m1).getStrength() && animals.get(m2).getEnergyLevel() > animals.get(m1).getEnergyLevel()){
			System.out.println(animals.get(m1).getName()+" has lost the fight and got killed by "+animals.get(m2).getName());
			animals.remove(m1);
			    //System.out.println("The remaining animals ");
			//this.printList();
		}
		else if(animals.get(m1).getStrength() > animals.get(m2).getStrength() && animals.get(m1).getEnergyLevel() < animals.get(m2).getEnergyLevel()){
		    System.out.println(animals.get(m2).getName()+" has lost the fight and got killed by "+animals.get(m1).getName());
		    animals.remove(m2);
			    //System.out.println("The remaining animals ");
			//this.printList();
		}
		else if(animals.get(m1).getStrength() < animals.get(m2).getStrength() && animals.get(m1).getEnergyLevel() > animals.get(m2).getEnergyLevel()){
		    System.out.println(animals.get(m1).getName()+" has lost the fight and got killed by "+animals.get(m2).getName());
		    animals.remove(m1);
			    //System.out.println("The rsemaining animals ");
			//this.printList();
		}
	}
}
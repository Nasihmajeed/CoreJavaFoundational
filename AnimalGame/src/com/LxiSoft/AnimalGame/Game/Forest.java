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
		System.out.println("\n"+forestName+" is a forest full of vigourous animals. They fight for their life and their existence");
		System.out.println("Do you want to start the game 1.Yes 0.Exit");
		int start = s.nextInt();
		if(start == 1)
			this.animalGame();
	}
	public void animalGame(){
		Scanner s = new Scanner(System.in);
		this.addAnimals();
		this.setAnimal();
		this.printList();
		int again;
		do{
			System.out.println("Array size "+animals.size());
		    int size = animals.size();
		    //int choice1 = s.nextInt();
		    //int choice2 = s.nextInt();
		    int x = random.nextInt(size);
		    int y = random.nextInt(size);
		    System.out.println(x+" "+y);
		    if(x != y){
		    	if(x==0){
			        x+=1;
		        }
		        else if(y == 0){
			        y+=1;
		        }
		    	this.fight(x,y);
		    }
		    System.out.println("Do you need to keep fighting 1.Yes 0.No");
		    again = s.nextInt();
		}while(again != 0);
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
		animals.get(0).setName("Tiger       ");
		animals.get(0).setStrength(10);
		animals.get(0).setEnergyLevel(10);
		animals.get(1).setName("Jaguar      ");
		animals.get(1).setStrength(8);
		animals.get(1).setEnergyLevel(6);
		animals.get(2).setName("Deer        ");
		animals.get(2).setStrength(5);
		animals.get(2).setEnergyLevel(10);
		animals.get(3).setName("Wilder_Beast");
		animals.get(3).setStrength(6);
		animals.get(3).setEnergyLevel(7);

		animals.get(4).setName("VarayanTiger");
		animals.get(4).setStrength(9);
		animals.get(4).setEnergyLevel(8);
		animals.get(5).setName("leopord     ");
		animals.get(5).setStrength(6);
		animals.get(5).setEnergyLevel(8);
		animals.get(6).setName("KombanDeer  ");
		animals.get(6).setStrength(6);
		animals.get(6).setEnergyLevel(7);
		animals.get(7).setName("Buffallow   ");
		animals.get(7).setStrength(7);
		animals.get(7).setEnergyLevel(3);
	}
	public void printList(){
		System.out.println(animals.size());
		System.out.println("+---------+-------------+-------------+-------------+");
		System.out.println("  S.No\t    Animal    \t  Streangth\t  EnergyLevel");
		System.out.println("+---------+-------------+-------------+-------------+");
		for(int i=0; i<animals.size(); i++){
			System.out.println("  "+(i+1)+"\t    "+animals.get(i).getName()+"\t"+animals.get(i).getStrength()+"\t\t"+animals.get(i).getEnergyLevel());
		}
		System.out.println("+---------+-------------+-------------+-------------+");
	}
	public void fight(int n1,int n2){
		
		if(animals.get(n1-1).getStrength() > animals.get(n2-1).getStrength() && animals.get(n1-1).getEnergyLevel() > animals.get(n2-1).getEnergyLevel()){
			System.out.println(animals.get(n2-1).getName()+" has lost the fight and got killed");
			animals.remove(n2-1);
			System.out.println("The remaining animals ");
			//this.printList();
		}
		else if(animals.get(n2-1).getStrength() > animals.get(n1-1).getStrength() && animals.get(n2-1).getEnergyLevel() > animals.get(n1-1).getEnergyLevel()){
			System.out.println(animals.get(n1-1).getName()+" has lost the fight and got killed");
			animals.remove(n1-1);
			System.out.println("The remaining animals ");
			//this.printList();
		}
		else if(animals.get(n1-1).getStrength() > animals.get(n2-1).getStrength() && animals.get(n1-1).getEnergyLevel() < animals.get(n2-1).getEnergyLevel()){
			System.out.println(animals.get(n2-1).getName()+" has lost the fight and got killed");
			animals.remove(n2-1);
			System.out.println("The remaining animals ");
			//this.printList();
		}
		else if(animals.get(n1-1).getStrength() < animals.get(n2-1).getStrength() && animals.get(n1-1).getEnergyLevel() > animals.get(n2-1).getEnergyLevel()){
			System.out.println(animals.get(n1-1).getName()+" has lost the fight and got killed");
			animals.remove(n1-1);
			System.out.println("The remaining animals ");
			//this.printList();
		}
		else if(animals.get(n1-1).getStrength() > animals.get(n2-1).getStrength() && animals.get(n1-1).getEnergyLevel() == animals.get(n2-1).getEnergyLevel()){
			System.out.println(animals.get(n2-1).getName()+" has lost the fight and got killed");
			animals.remove(n2-1);
			System.out.println("The remaining animals ");
			//this.printList();
		}
		else if(animals.get(n1-1).getStrength() < animals.get(n2-1).getStrength() && animals.get(n1-1).getEnergyLevel() == animals.get(n2-1).getEnergyLevel()){
			System.out.println(animals.get(n1-1).getName()+" has lost the fight and got killed");
			animals.remove(n1-1);
			System.out.println("The remaining animals ");
			//this.printList();
		}
		else if(animals.get(n1-1).getStrength() == animals.get(n2-1).getStrength() && animals.get(n1-1).getEnergyLevel() > animals.get(n2-1).getEnergyLevel()){
			System.out.println(animals.get(n1-1).getName()+" has got escaped");
			//this.printList();
		}
		else if(animals.get(n1-1).getStrength() == animals.get(n2-1).getStrength() && animals.get(n1-1).getEnergyLevel() < animals.get(n2-1).getEnergyLevel()){
			System.out.println(animals.get(n2-1).getName()+" has got escaped");
			//this.printList();
		}
		else if(animals.get(n1-1).getStrength() == animals.get(n2-1).getStrength() && animals.get(n1-1).getEnergyLevel() == animals.get(n2-1).getEnergyLevel()){
			System.out.println(animals.get(n1-1).getName()+" , "+animals.get(n2-1).getName()+" got tie ");
			//this.printList();
		}
		this.printList();
	}
}
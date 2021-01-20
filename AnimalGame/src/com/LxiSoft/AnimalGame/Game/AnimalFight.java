package com.LxiSoft.AnimalGame.Game;
import com.LxiSoft.AnimalGame.Game.Animal;
import java.util.*;
public class AnimalFight{
	public void setFight(int animal1,int animal2,ArrayList<Animal> animals){
		if(animals.get(animal1) instanceof Carnivore && animals.get(animal2) instanceof Carnivore){
			this.carnivoreVsCarnivore(animal1,animal2,animals);
		}
		else if(animals.get(animal1) instanceof Carnivore && animals.get(animal2) instanceof Herbivore || (animals.get(animal1) instanceof Herbivore && animals.get(animal2) instanceof Carnivore)){
			this.carnivoreVsHerbivore(animal1,animal2,animals);
		}
		else if(animals.get(animal1) instanceof Herbivore && animals.get(animal2) instanceof Herbivore){
			this.result(animal1,animal2,animals);
			System.out.println(" "+animals.get(animal1).getName()+" and "+animals.get(animal2).getName()+" does not fight each other");
			System.out.println("------------------------------------------------------------------------------------------"); 
		}
		
		//this.printList();
	}
	public void carnivoreVsCarnivore(int n1,int n2,ArrayList<Animal> animals){
		System.out.println("+----------------------------------------------------------------------------------------+");
		boolean ar = this.setRange(n1,n2,animals);

		if(ar == true){
			if(animals.get(n1).getHungerLevel() > 2 || animals.get(n2).getHungerLevel() > 2){
				if(animals.get(n1).getStrength() > animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() > animals.get(n2).getEnergyLevel()){
				this.result(n1,n2,animals);
			    System.out.println(" "+animals.get(n2).getName()+" has lost the fight and got killed by "+animals.get(n1).getName());
			    System.out.println("------------------------------------------------------------------------------------------");
			    animals.remove(n2);
			    int hunger = animals.get(n1).getHungerLevel();
			    hunger = hunger-1;
			    animals.get(n1).setHungerLevel(hunger);
			//System.out.println("The remaining animals ");
			//this.printList();
		        }
		        else if(animals.get(n2).getStrength() > animals.get(n1).getStrength() && animals.get(n2).getEnergyLevel() > animals.get(n1).getEnergyLevel()){
			        this.result(n1,n2,animals);
			        System.out.println(" "+animals.get(n1).getName()+" has lost the fight and got killed by "+animals.get(n2).getName());
			        System.out.println("------------------------------------------------------------------------------------------");
			        animals.remove(n1);
			        int hunger = animals.get(n2).getHungerLevel();
			        hunger = hunger-1;
			        animals.get(n2).setHungerLevel(hunger);
			    //System.out.println("The remaining animals ");
			//this.printList();
		        }
		        else if(animals.get(n1).getStrength() > animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() < animals.get(n2).getEnergyLevel()){
		            this.result(n1,n2,animals);
		            System.out.println(" "+animals.get(n2).getName()+" has lost the fight and got killed by "+animals.get(n1).getName());
		            System.out.println("------------------------------------------------------------------------------------------");
		            animals.remove(n2);
		            int hunger = animals.get(n1).getHungerLevel();
		            hunger = hunger-1;
		            animals.get(n1).setHungerLevel(hunger);
			    //System.out.println("The remaining animals ");
			//this.printList();
		        }
		        else if(animals.get(n1).getStrength() < animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() > animals.get(n2).getEnergyLevel()){
		            this.result(n1,n2,animals);
		            System.out.println(" "+animals.get(n1).getName()+" has lost the fight and got killed by "+animals.get(n2).getName());
		            System.out.println("------------------------------------------------------------------------------------------");
		            animals.remove(n1);
		            int hunger = animals.get(n2).getHungerLevel();
		            hunger--;
		            animals.get(n2).setHungerLevel(hunger);
			    //System.out.println("The remaining animals ");
			//this.printList();
		        }
		        else if(animals.get(n1).getStrength() > animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() == animals.get(n2).getEnergyLevel()){
		            this.result(n1,n2,animals);
		            System.out.println(" "+animals.get(n2).getName()+" has lost the fight and got killed by "+animals.get(n1).getName());
		            System.out.println("------------------------------------------------------------------------------------------");
		            animals.remove(n2);
		            int hunger = animals.get(n1).getHungerLevel();
		            hunger = hunger-1;
		            animals.get(n1).setHungerLevel(hunger);
			   // System.out.println("The remaining animals ");
			//this.printList();
		        }
		        else if(animals.get(n1).getStrength() < animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() == animals.get(n2).getEnergyLevel()){
		            this.result(n1,n2,animals);
		            System.out.println(" "+animals.get(n1).getName()+" has lost the fight and got killed by "+animals.get(n2).getName());
		            System.out.println("------------------------------------------------------------------------------------------");
		            animals.remove(n1);
		            int hunger = animals.get(n2).getHungerLevel();
		            hunger = hunger-1;
		            animals.get(n2).setHungerLevel(hunger);
			    //System.out.println("The remaining animals ");
			//this.printList();
		        }
		        else if(animals.get(n1).getStrength() == animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() > animals.get(n2).getEnergyLevel()){
		            this.result(n1,n2,animals);
		            System.out.println(" "+animals.get(n1).getName()+" has got escaped and "+animals.get(n2).getName()+" Stands");
		            System.out.println("------------------------------------------------------------------------------------------");
			//this.printList();
		        }
		        else if(animals.get(n1).getStrength() == animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() < animals.get(n2).getEnergyLevel()){
		            this.result(n1,n2,animals);
		            System.out.println(" "+animals.get(n2).getName()+" has got escaped and "+animals.get(n1).getName()+" Stands");
		            System.out.println("------------------------------------------------------------------------------------------");
			//this.printList();
		        } 
		        else if(animals.get(n1).getStrength() == animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() == animals.get(n2).getEnergyLevel()){
		            this.result(n1,n2,animals);
		            System.out.println(" "+animals.get(n1).getName()+" , "+animals.get(n2).getName()+" got tie ");
		            System.out.println("------------------------------------------------------------------------------------------");
			//this.printL ist();
		        }
			}
			else {

				System.out.println(animals.get(n1).getName()+" and "+animals.get(n2).getName()+" does not engage in fight , he is not HUNGRY ");
			}
		}
	}
	public void carnivoreVsHerbivore(int m1, int m2,ArrayList<Animal> animals){
		boolean ara = this.setRange(m1,m2,animals);
		if(ara == true){
			if(animals.get(m1) instanceof Carnivore && animals.get(m1).getHungerLevel() > 2 || animals.get(m2) instanceof Carnivore && animals.get(m2).getHungerLevel() > 2){
				if(animals.get(m1).getStrength() > animals.get(m2).getStrength() && animals.get(m1).getEnergyLevel() > animals.get(m2).getEnergyLevel()){
			        this.result(m1,m2,animals);
			        System.out.println(" "+animals.get(m2).getName()+" has lost the fight and got killed by "+animals.get(m1).getName());
			        System.out.println("------------------------------------------------------------------------------------------");
			        animals.remove(m2);
			    }
		        else if(animals.get(m2).getStrength() > animals.get(m1).getStrength() && animals.get(m2).getEnergyLevel() > animals.get(m1).getEnergyLevel()){
			        this.result(m1,m2,animals);
			        System.out.println(" "+animals.get(m1).getName()+" has lost the fight and got killed by "+animals.get(m2).getName());
			        System.out.println("------------------------------------------------------------------------------------------");
			        animals.remove(m1);
		        }
		        else if(animals.get(m1).getStrength() > animals.get(m2).getStrength() && animals.get(m1).getEnergyLevel() < animals.get(m2).getEnergyLevel()){
		            this.result(m1,m2,animals);
		            System.out.println(" "+animals.get(m2).getName()+" has lost the fight and got killed by "+animals.get(m1).getName());
		            System.out.println("------------------------------------------------------------------------------------------");
		            animals.remove(m2);
			    }
		        else if(animals.get(m1).getStrength() < animals.get(m2).getStrength() && animals.get(m1).getEnergyLevel() > animals.get(m2).getEnergyLevel()){
		            this.result(m1,m2,animals);
		            System.out.println(" "+animals.get(m1).getName()+" has lost the fight and got killed by "+animals.get(m2).getName());
		            System.out.println("------------------------------------------------------------------------------------------");
		            animals.remove(m1);
			    }
			}
			else if(animals.get(m1) instanceof Carnivore && animals.get(m1).getHungerLevel() < 2 || animals.get(m2) instanceof Carnivore && animals.get(m2).getHungerLevel() < 2){
				System.out.println("The Carnivore does not engage in fight , he is not HUNGRY ");
			}
		}
	}
	public void result(int anml1,int anml2,ArrayList<Animal> animals){
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("                  "+animals.get(anml1).getName()+"\tVS\t"+animals.get(anml2).getName());
		System.out.println("              -------------------------------------------");
		System.out.println(" StreangthLevel :      "+animals.get(anml1).getStrength()+"\tVS\t"+animals.get(anml2).getStrength());
		System.out.println(" EnergyLevel    :      "+animals.get(anml1).getEnergyLevel()+"\tVS\t"+animals.get(anml2).getEnergyLevel());
		System.out.println("------------------------------------------------------------------------------------------");
	}
	public boolean setRange(int p1, int p2, ArrayList<Animal> animals){
		
		int range = 10;
		int teritory = (animals.get(p1).getArea()) - (animals.get(p2).getArea());
		if(range>teritory){
			System.out.println("==>> "+animals.get(p1).getName()+" and "+animals.get(p2).getName()+" are in same teritory and meet each other <<==");
			return true;
		}
		else{
			System.out.println("==>> "+animals.get(p1).getName()+" and "+animals.get(p2).getName()+" are not in same teritory and do not meet each other <<==");
			return false;
		}
	}
}
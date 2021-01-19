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
			System.out.println(" "+animals.get(animal1).getName()+" and "+animals.get(animal2).getName()+" does not fight each other"); 
		}
		
		//this.printList();
	}
	public void carnivoreVsCarnivore(int n1,int n2,ArrayList<Animal> animals){
		boolean ar = this.setRange(n1,n2,animals);

		if(ar == true){
			if(animals.get(n1).getStrength() > animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() > animals.get(n2).getEnergyLevel()){
			System.out.println(animals.get(n2).getName()+" has lost the fight and got killed by "+animals.get(n1).getName());
			animals.remove(n2);
			//int hunger = animals.get(n1).getHungerLevel();
			//hunger--;
			animals.get(n1).setHungerLevel(animals.get(n1).getHungerLevel()-1);
			//System.out.println("The remaining animals ");
			//this.printList();
		    }
		    else if(animals.get(n2).getStrength() > animals.get(n1).getStrength() && animals.get(n2).getEnergyLevel() > animals.get(n1).getEnergyLevel()){
			    System.out.println(animals.get(n1).getName()+" has lost the fight and got killed by "+animals.get(n2).getName());
			    animals.remove(n1);
			    //int hunger = animals.get(n2).getHungerLevel();
			    //hunger--;
			    animals.get(n2).setHungerLevel(animals.get(n2).getHungerLevel()-1);
			    //System.out.println("The remaining animals ");
			//this.printList();
		    }
		    else if(animals.get(n1).getStrength() > animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() < animals.get(n2).getEnergyLevel()){
		        System.out.println(animals.get(n2).getName()+" has lost the fight and got killed by "+animals.get(n1).getName());
		        animals.remove(n2);
		        //int hunger = animals.get(n1).getHungerLevel();
		        //hunger--;
		        animals.get(n1).setHungerLevel(animals.get(n1).getHungerLevel()-1);
			    //System.out.println("The remaining animals ");
			//this.printList();
		    }
		    else if(animals.get(n1).getStrength() < animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() > animals.get(n2).getEnergyLevel()){
		        System.out.println(animals.get(n1).getName()+" has lost the fight and got killed by "+animals.get(n2).getName());
		        animals.remove(n1);
		        //int hunger = animals.get(n2).getHungerLevel();
		        //hunger--;
		        animals.get(n2).setHungerLevel(animals.get(n2).getHungerLevel()-1);
			    //System.out.println("The remaining animals ");
			//this.printList();
		    }
		    else if(animals.get(n1).getStrength() > animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() == animals.get(n2).getEnergyLevel()){
		        System.out.println(animals.get(n2).getName()+" has lost the fight and got killed by "+animals.get(n1).getName());
		        animals.remove(n2);
		        //int hunger = animals.get(n1).getHungerLevel();
		        //hunger--;
		        animals.get(n1).setHungerLevel(animals.get(n1).getHungerLevel()-1);
			   // System.out.println("The remaining animals ");
			//this.printList();
		    }
		    else if(animals.get(n1).getStrength() < animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() == animals.get(n2).getEnergyLevel()){
		        System.out.println(animals.get(n1).getName()+" has lost the fight and got killed by "+animals.get(n2).getName());
		        animals.remove(n1);
		        //int hunger = animals.get(n2).getHungerLevel();
		        //hunger--;
		        animals.get(n2).setHungerLevel(animals.get(n2).getHungerLevel()-1);
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
	}
	public void carnivoreVsHerbivore(int m1, int m2,ArrayList<Animal> animals){
		boolean ara = this.setRange(m1,m2,animals);
		if(ara == true){
			if(animals.get(m1) instanceof Carnivore && animals.get(m1).getHungerLevel() > 2 || animals.get(m2) instanceof Carnivore && animals.get(m2).getHungerLevel() > 2){
				if(animals.get(m1).getStrength() > animals.get(m2).getStrength() && animals.get(m1).getEnergyLevel() > animals.get(m2).getEnergyLevel()){
			        System.out.println(animals.get(m2).getName()+" has lost the fight and got killed by "+animals.get(m1).getName());
			        animals.remove(m2);
			    }
		        else if(animals.get(m2).getStrength() > animals.get(m1).getStrength() && animals.get(m2).getEnergyLevel() > animals.get(m1).getEnergyLevel()){
			        System.out.println(animals.get(m1).getName()+" has lost the fight and got killed by "+animals.get(m2).getName());
			        animals.remove(m1);
		        }
		        else if(animals.get(m1).getStrength() > animals.get(m2).getStrength() && animals.get(m1).getEnergyLevel() < animals.get(m2).getEnergyLevel()){
		            System.out.println(animals.get(m2).getName()+" has lost the fight and got killed by "+animals.get(m1).getName());
		            animals.remove(m2);
			    }
		        else if(animals.get(m1).getStrength() < animals.get(m2).getStrength() && animals.get(m1).getEnergyLevel() > animals.get(m2).getEnergyLevel()){
		            System.out.println(animals.get(m1).getName()+" has lost the fight and got killed by "+animals.get(m2).getName());
		            animals.remove(m1);
			    }
			}
			else if(animals.get(m1) instanceof Carnivore && animals.get(m1).getHungerLevel() < 2 || animals.get(m2) instanceof Carnivore && animals.get(m2).getHungerLevel() < 2){
				System.out.println("The Carnivore does not engage in fight , he is not HUNGRY ");
			}
		}
	}
	public boolean setRange(int p1, int p2, ArrayList<Animal> animals){
		System.out.println(" Teritory");
		System.out.println("----------");
		int range = 10;
		int teritory = (animals.get(p1).getArea()) - (animals.get(p2).getArea());
		if(range>teritory){
			System.out.println(animals.get(p1).getName()+" and "+animals.get(p2).getName()+" meet each other");
			return true;
		}
		else{
			System.out.println(animals.get(p1).getName()+" and "+animals.get(p2).getName()+" do not meet each other");
			return false;
		}
	}
}
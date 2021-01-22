package com.LxiSoft.AnimalGame.Game;
import com.LxiSoft.AnimalGame.Game.Animal;
import java.util.*;
public class AnimalFight{
	public void setFight(int animal1,int animal2,ArrayList<Animal> animals){
		//if(animals.get(animal1).getLife() == true && animals.get(animal2).getLife() == true){
			if(animals.get(animal1) instanceof Carnivore && animals.get(animal2) instanceof Carnivore){
			    this.carnivoreVsCarnivore(animal1,animal2,animals);
		    }
		    else if(animals.get(animal1) instanceof Carnivore && animals.get(animal2) instanceof Herbivore){ 
			    this.carnivoreVsHerbivore(animal1,animal2,animals);
		    }
		    else if(animals.get(animal1) instanceof Herbivore && animals.get(animal2) instanceof Carnivore){
			    this.herbivoreVsCarnivore(animal1,animal2,animals);
		    }
		    else if(animals.get(animal1) instanceof Herbivore && animals.get(animal2) instanceof Herbivore){
			
			    this.result(animal1,animal2,animals);
			    System.out.println(" "+animals.get(animal1).getName()+" and "+animals.get(animal2).getName()+" does not fight each other");
			    System.out.println("------------------------------------------------------------------------------------------"); 
		    }
		//}
	}
	public void carnivoreVsCarnivore(int n1,int n2,ArrayList<Animal> animals){
		System.out.println("+----------------------------------------------------------------------------------------+");
		boolean ar = this.setRange(n1,n2,animals);
		if(ar == true){
			if(animals.get(n1).getView() > animals.get(n2).getView() || animals.get(n2).getView() > animals.get(n1).getView()){
				System.out.println(animals.get(n1).getName()+" and "+animals.get(n2).getName()+" see each other and starts Fight");
				if(animals.get(n1).getHungerLevel() > 2 || animals.get(n2).getHungerLevel() > 2){
				    if(animals.get(n1).getStrength() > animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() > animals.get(n2).getEnergyLevel()){
				        this.result(n1,n2,animals);
			            System.out.println(" "+animals.get(n2).getName()+" has lost the fight and got killed by "+animals.get(n1).getName());
			            System.out.println("------------------------------------------------------------------------------------------");
			            animals.remove(n2);
			            //animals.get(n1).setLife(false);
			            int hunger = animals.get(n1).getHungerLevel();
			            hunger = hunger-1;
			            animals.get(n1).setHungerLevel(hunger);
			            //animals.get(n1).setStrength(animals.get(n1).getStrength()-2);
			        }
		            else if(animals.get(n2).getStrength() > animals.get(n1).getStrength() && animals.get(n2).getEnergyLevel() > animals.get(n1).getEnergyLevel()){
			            this.result(n1,n2,animals);
			            System.out.println(" "+animals.get(n1).getName()+" has lost the fight and got killed by "+animals.get(n2).getName());
			            System.out.println("------------------------------------------------------------------------------------------");
			            animals.remove(n1);
			            //animals.get(n1).setLife(false);
			            int hunger = animals.get(n2).getHungerLevel();
			            hunger = hunger-1;
			            animals.get(n2).setHungerLevel(hunger);
			            //animals.get(n2).setStrength(animals.get(n2).getStrength()-2); 
		            }
		            else if(animals.get(n1).getStrength() > animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() < animals.get(n2).getEnergyLevel()){
		                this.result(n1,n2,animals);
		                System.out.println(" "+animals.get(n2).getName()+" has lost the fight and got killed by "+animals.get(n1).getName());
		                System.out.println("------------------------------------------------------------------------------------------");
		                animals.remove(n2);
		                //animals.get(n2).setLife(false);
		                int hunger = animals.get(n1).getHungerLevel();
		                hunger = hunger-1;
		                animals.get(n1).setHungerLevel(hunger);
		                //animals.get(n1).setStrength(animals.get(n1).getStrength()-2);
			        }
		            else if(animals.get(n1).getStrength() < animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() > animals.get(n2).getEnergyLevel()){
		                this.result(n1,n2,animals);
		                System.out.println(" "+animals.get(n1).getName()+" has lost the fight and got killed by "+animals.get(n2).getName());
		                System.out.println("------------------------------------------------------------------------------------------");
		                animals.remove(n1);
		                //animals.get(n1).setLife(false);
		                int hunger = animals.get(n2).getHungerLevel();
		                hunger--;
		                animals.get(n2).setHungerLevel(hunger);
		                //animals.get(n2).setStrength(animals.get(n2).getStrength()-2);
			        }
		            else if(animals.get(n1).getStrength() > animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() == animals.get(n2).getEnergyLevel()){
		                this.result(n1,n2,animals);
		                System.out.println(" "+animals.get(n2).getName()+" has lost the fight and got killed by "+animals.get(n1).getName());
		                System.out.println("------------------------------------------------------------------------------------------");
		                animals.remove(n2);
		                //animals.get(n2).setLife(false);
		                int hunger = animals.get(n1).getHungerLevel();
		                hunger = hunger-1;
		                animals.get(n1).setHungerLevel(hunger);
		                //animals.get(n1).setStrength(animals.get(n1).getStrength()-2);
			        }
		            else if(animals.get(n1).getStrength() < animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() == animals.get(n2).getEnergyLevel()){
		                this.result(n1,n2,animals);
		                System.out.println(" "+animals.get(n1).getName()+" has lost the fight and got killed by "+animals.get(n2).getName());
		                System.out.println("------------------------------------------------------------------------------------------");
		                animals.remove(n1);
		                //animals.get(n1).setLife(false);
		                int hunger = animals.get(n2).getHungerLevel();
		                hunger = hunger-1;
		                animals.get(n2).setHungerLevel(hunger);
		                //animals.get(n2).setStrength(animals.get(n2).getStrength()-2);
			        }
		            else if(animals.get(n1).getStrength() == animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() > animals.get(n2).getEnergyLevel()){
		                this.result(n1,n2,animals);
		                System.out.println(" "+animals.get(n1).getName()+" has got escaped and "+animals.get(n2).getName()+" Stands");
		                System.out.println("------------------------------------------------------------------------------------------");
			        }
		            else if(animals.get(n1).getStrength() == animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() < animals.get(n2).getEnergyLevel()){
		                this.result(n1,n2,animals);
		                System.out.println(" "+animals.get(n2).getName()+" has got escaped and "+animals.get(n1).getName()+" Stands");
		                System.out.println("------------------------------------------------------------------------------------------");
			        } 
		            else if(animals.get(n1).getStrength() == animals.get(n2).getStrength() && animals.get(n1).getEnergyLevel() == animals.get(n2).getEnergyLevel()){
		                this.result(n1,n2,animals);
		                System.out.println(" "+animals.get(n1).getName()+" , "+animals.get(n2).getName()+" got tie ");
		                System.out.println("------------------------------------------------------------------------------------------");
		            }
		        }
			    else if(animals.get(n1).getHungerLevel() <= 2 || animals.get(n2).getHungerLevel() <= 2){

				    System.out.println(animals.get(n1).getName()+" and "+animals.get(n2).getName()+" does not engage in fight , he is not HUNGRY ");
		        }
		    }
		    else {
		    	System.out.println(animals.get(n1).getName()+" and "+animals.get(n2).getName()+" does not see each other");
	    	}
		}
	}
	public void carnivoreVsHerbivore(int m1, int m2,ArrayList<Animal> animals){
		boolean ara = this.setRange(m1,m2,animals);
		if(ara == true){
			if(animals.get(m1).getView() > animals.get(m2).getView()){
                System.out.println("   "+animals.get(m1).getName()+" spotted "+animals.get(m2).getName()+" and engage to fight");
			    if(animals.get(m1).getHungerLevel() > 2){
				    if(animals.get(m1).getStrength() > animals.get(m2).getStrength() && animals.get(m1).getEnergyLevel() > animals.get(m2).getEnergyLevel()){
			            this.result(m1,m2,animals);
			            System.out.println(" "+animals.get(m2).getName()+" has lost the fight and got killed by "+animals.get(m1).getName());
			            System.out.println("------------------------------------------------------------------------------------------");
			            animals.remove(m2);
			            //animals.get(m2).setLife(false);
			            int hunger = animals.get(m1).getHungerLevel();
			            hunger = hunger-1;
			            animals.get(m1).setHungerLevel(hunger);
			            //animals.get(m1).setStrength(animals.get(m1).getStrength()-2);
			        }
		        
		            else if(animals.get(m1).getStrength() > animals.get(m2).getStrength() && animals.get(m1).getEnergyLevel() < animals.get(m2).getEnergyLevel()){
		                this.result(m1,m2,animals);
		                System.out.println(" "+animals.get(m2).getName()+" has lost the fight and got killed by "+animals.get(m1).getName());
		                System.out.println("------------------------------------------------------------------------------------------");
		                animals.remove(m2);
                        //animals.get(m2).setLife(false);
		                int hunger = animals.get(m1).getHungerLevel();
			            hunger = hunger-1;
			            animals.get(m1).setHungerLevel(hunger);
			            //animals.get(m1).setStrength(animals.get(m1).getStrength()-2);
			        }
		        
			    }
			    else if(animals.get(m1).getHungerLevel() < 2){
				    System.out.println("The Carnivore does not engage in fight , he is not HUNGRY ");
			    }
			}
			else{
				System.out.println("  "+animals.get(m2).getName()+" escaped without getting Spotted by "+animals.get(m1).getName());
			}
		}
	}
	public void herbivoreVsCarnivore(int a1, int a2 ,ArrayList<Animal> animals){
		
		boolean ara = this.setRange(a1,a2,animals);
		if(ara == true){
			if(animals.get(a1) instanceof Herbivore && animals.get(a2) instanceof Carnivore){
			    if(animals.get(a1).getView() < animals.get(a2).getView()){
			    	System.out.println("  "+animals.get(a2).getName()+" spotted "+animals.get(a1).getName()+" and engage in fight");
			    	if(animals.get(a2).getStrength() > animals.get(a1).getStrength() && animals.get(a2).getEnergyLevel() > animals.get(a1).getEnergyLevel()){
		                this.result(a1,a2,animals);
		                System.out.println(" "+animals.get(a1).getName()+" has lost the fight and got killed by "+animals.get(a2).getName());
		                System.out.println("------------------------------------------------------------------------------------------");
		                animals.remove(a1);
		                //animals.get(a1).setLife(false);
		                int hunger = animals.get(a2).getHungerLevel();
		                hunger = hunger-1;
		                animals.get(a2).setHungerLevel(hunger);
		                //animals.get(a2).setStrength(animals.get(a2).getStrength()-2);
		            }
		            else if(animals.get(a1).getStrength() < animals.get(a2).getStrength() && animals.get(a1).getEnergyLevel() > animals.get(a2).getEnergyLevel()){
		                this.result(a1,a2,animals);
		                System.out.println(" "+animals.get(a1).getName()+" has lost the fight and got killed by "+animals.get(a2).getName());
		                System.out.println("------------------------------------------------------------------------------------------");
		                animals.remove(a1);
		                //animals.get(a1).setLife(false);
		                int hunger = animals.get(a2).getHungerLevel();
		                hunger = hunger-1;
		                animals.get(a2).setHungerLevel(hunger);
		                //animals.get(a2).setStrength(animals.get(a2).getStrength()-2);
		            }
			    }
			    else{
				    System.out.println("  "+animals.get(a1).getName()+" escaped without getting Spotted by "+animals.get(a2).getName());
			    }
		    }
		}    
	}
	public void result(int anml1,int anml2,ArrayList<Animal> animals){
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("                  "+animals.get(anml1).getName()+"\tVS\t"+animals.get(anml2).getName());
		System.out.println("              ----------------------------------------");
		System.out.println(" StreangthLevel :      "+animals.get(anml1).getStrength()+"\tVS\t"+animals.get(anml2).getStrength());
		System.out.println(" EnergyLevel    :      "+animals.get(anml1).getEnergyLevel()+"\tVS\t"+animals.get(anml2).getEnergyLevel());
		System.out.println(" HungerLevel    :      "+animals.get(anml1).getHungerLevel()+"\tVS\t"+animals.get(anml2).getHungerLevel());
		System.out.println("------------------------------------------------------------------------------------------");
	}
	public boolean setRange(int p1, int p2, ArrayList<Animal> animals){
		
		int range = 10;
		int teritory = (animals.get(p1).getArea()) - (animals.get(p2).getArea());
		if(range>teritory){
			System.out.println("==>> "+animals.get(p1).getName()+" and "+animals.get(p2).getName()+" are in same teritory <<==");
			return true;
		}
		else{
			System.out.println("==>> "+animals.get(p1).getName()+" and "+animals.get(p2).getName()+" are not in same teritory and do not meet each other <<==");
			return false;
		}
	}
}
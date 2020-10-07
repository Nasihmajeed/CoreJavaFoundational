package com.lxisoft.Forest;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Forest
{
	ArrayList<Animal> animal = new ArrayList<Animal>();
	Scanner scanner = new Scanner(System.in);
	int count;

	public void printName()
	{	
	    System.out.println("\n");	
		System.out.println("*****************************************************");
		System.out.println("*               WELCOME TO ANIMAL GAME              *");
		System.out.println("*****************************************************");
	}

	public void setName()
	{
		System.out.println("\nAnimals");
		System.out.println("\n");
		animal.add(new Deer());
		animal.get(0).setName("Deer");
		animal.get(0).setStrength(20);
		animal.get(0).setAlive(true);

		animal.add(new Elephant());
		animal.get(1).setName("Elephant");
		animal.get(1).setStrength(60);
		animal.get(1).setAlive(true);

		animal.add(new Rabit());
		animal.get(2).setName("Rabit");
		animal.get(2).setStrength(20);
		animal.get(2).setAlive(true);

		animal.add(new Lion());
		animal.get(3).setName("Lion");
		animal.get(3).setStrength(100);
		animal.get(3).setAlive(true);
        
        animal.add(new Panther());
		animal.get(4).setName("Panther");
		animal.get(4).setStrength(80);
		animal.get(4).setAlive(true);

		animal.add(new Deer());
		animal.get(5).setName("Deer1");
		animal.get(5).setStrength(20);
		animal.get(5).setAlive(true);

		animal.add(new Elephant());
		animal.get(6).setName("Elephant1");
		animal.get(6).setStrength(65);
		animal.get(6).setAlive(true);

		animal.add(new Rabit());
		animal.get(7).setName("Rabit1");
		animal.get(7).setStrength(20);
		animal.get(7).setAlive(true);

		animal.add(new Lion());
		animal.get(8).setName("Lion1");
		animal.get(8).setStrength(95);
		animal.get(8).setAlive(true);
        
        animal.add(new Panther());
		animal.get(9).setName("Panther1");
		animal.get(9).setStrength(85);
		animal.get(9).setAlive(true);
        
		for(int i=0;i<animal.size();i++)
		{
			System.out.println(i+1+" "+animal.get(i).getName());
		}
	}

	public void fight(int random1, int random2)
	{
		int a=0,y=0;
		String z=null,b=null;
		System.out.println("\nAnimal 1: "+animal.get(random1).getName()+"\n"+"Strength: "+animal.get(random1).getStrength());
        System.out.println("\nAnimal 2: "+animal.get(random2).getName()+"\n"+"Strength: "+animal.get(random2).getStrength());
		if(animal.get(random1).getStrength() >= animal.get(random2).getStrength())
		{
	        a = animal.get(random1).getStrength();
            b = animal.get(random1).getName();
            System.out.println("\nWinner:"+b);
            if(animal.get(random2).getStrength() <= animal.get(random1).getStrength())
            {
                animal.get(random1).setStrength(animal.get(random1).getStrength()-10);
                animal.get(random2).setStrength(animal.get(random2).getStrength()-30);
                System.out.println("New strength of "+animal.get(random1).getName()+": "+animal.get(random1).getStrength());
                System.out.println("New Strength of "+animal.get(random2).getName()+": "+animal.get(random2).getStrength());
                if(animal.get(random2).getStrength() <= 5)
                {
                	animal.get(random2).setAlive(false);
                	System.out.println("Dead: "+animal.get(random2).getName());
                }
                else
                {
                	animal.get(random1).setAlive(true);
                }
                count--;
            }
	    }
	    else
	    {
		  	y = animal.get(random2).getStrength();
            z = animal.get(random2).getName();
            System.out.println("\nWinner:"+z);
            if(animal.get(random1).getStrength() <= animal.get(random2).getStrength())
            {
                animal.get(random2).setStrength(animal.get(random2).getStrength()-10);
                animal.get(random1).setStrength(animal.get(random1).getStrength()-30);
                System.out.println("New Strength of "+animal.get(random2).getName()+": "+animal.get(random2).getStrength());
                System.out.println("New Strength of "+animal.get(random1).getName()+": "+animal.get(random1).getStrength());
                if(animal.get(random1).getStrength() <= 5)
                {
                	animal.get(random1).setAlive(false);
                	System.out.println("Dead: "+animal.get(random1).getName());
                }
                else
                {
                	animal.get(random1).setAlive(true);
                }
                count--;
            } 
        }
	}

	public void setPage()
	{	
	    int i=0;	
		System.out.println("\n press 1 to Start GAME:");
		int c = scanner.nextInt();
		if(c==1)
		{	
			count = animal.size();
		    while(count > 1)
		    {
		    	count=this.random();
		        Random r = new Random();
	            int random1 = r.nextInt(10);
	            int random2 = r.nextInt(10);
	            if(animal.get(random1).getName() == animal.get(random2).getName())
	            {
	            	random2 = r.nextInt();
	            }
	            else
	            {	            	
	            	if(animal.get(random1).getAlive() && animal.get(random2).getAlive() == true)
	            	{
	            	    if(animal.get(random1) instanceof Carnivorous && animal.get(random2) instanceof Herbivorous)
	            		{
	            			int lucky = luckFactor();
	            			if(lucky!=2)
	            			{
	            			    System.out.println("\nAnimal 1: Carnivorous"+"\n"+"Animal 2: Herbivorous");
                                this.fight(random1,random2);
                                System.out.println("******************************************");
                            }
                            else
                            {
                                if(animal.get(random2) instanceof WeakAnimal)
	            			    {
	            			    	System.out.println("\nAnimal 1: "+animal.get(random1).getName()+"\n"+"Strength: "+animal.get(random1).getStrength());
                                    System.out.println("\nAnimal 2: "+animal.get(random2).getName()+"\n"+"Strength: "+animal.get(random2).getStrength());
                                	System.out.println("\n"+animal.get(random2).getName()+" run away from "+animal.get(random1).getName()+" and hide in the forest");
                                	animal.get(random1).setStrength(animal.get(random1).getStrength()-5);
                                    animal.get(random2).setStrength(animal.get(random2).getStrength()-5);
                                    System.out.println("\nLuck Factor: "+animal.get(random2).getName());
                                    System.out.println("\nNew strength of "+animal.get(random1).getName()+": "+animal.get(random1).getStrength());
                                    System.out.println("New Strength of "+animal.get(random2).getName()+": "+animal.get(random2).getStrength());
                                    System.out.println("******************************************");
                                }
	            			}
	                    }
	                    
	                    else if(animal.get(random1) instanceof Herbivorous && animal.get(random2) instanceof Carnivorous)
	            		{
	            			int lucky = luckFactor();
	            			if(lucky!=2)
	            			{
	            	            System.out.println("\nAnimal 1: Herbivorous"+"\n"+"Animal 2: Carnivorous");
                                this.fight(random1,random2);
                                System.out.println("******************************************");
                            }  
                            else
                            {
                                if(animal.get(random1) instanceof WeakAnimal)
	            			    {
                                	System.out.println("\nAnimal 1: "+animal.get(random1).getName()+"\n"+"Strength: "+animal.get(random1).getStrength());
                                    System.out.println("\nAnimal 2: "+animal.get(random2).getName()+"\n"+"Strength: "+animal.get(random2).getStrength());
                                    System.out.println("\n"+animal.get(random1).getName()+" run away from "+animal.get(random2).getName()+" and hide in the forest");
                                    animal.get(random1).setStrength(animal.get(random1).getStrength()-5);
                                    animal.get(random2).setStrength(animal.get(random2).getStrength()-5);
                                    System.out.println("\nLuck Factor: "+animal.get(random1).getName());
                                    System.out.println("\nNew strength of "+animal.get(random1).getName()+": "+animal.get(random1).getStrength());
                                    System.out.println("New Strength of "+animal.get(random2).getName()+": "+animal.get(random2).getStrength());
                                    System.out.println("******************************************");
                                } 
                            }  
	                    }
	                   
	                    else if(animal.get(random1) instanceof Carnivorous && animal.get(random2) instanceof Carnivorous)
	            		{
	            			System.out.println("\nBoth Animals are Carnivorous");
                            this.fight(random1,random2);
                            System.out.println("******************************************");
	                    }
	                   
	                     else if(animal.get(random1) instanceof Herbivorous && animal.get(random2) instanceof Herbivorous)
	            		{
	            			System.out.println("\nBoth Animals are Herbivorous");
                            System.out.println("Just meet and no fight");
                            System.out.println("******************************************");
	                    }
	                }    
	            }
	        i++;
	        }
	    System.out.println("\n Game Over");
	    this.ultimateWinner(); 
        }
	    else
		{
			System.out.println("Invalid choice");
		}
	}

	private int random()
	{
		count=0;
		for(int i=0;i<animal.size();i++)
		{
			if(animal.get(i).getAlive()==true)
			{
				count++;
			}
		}
		return count;
	}

	private int luckFactor()
	{
	    Random random = new Random();
		int random3 = random.nextInt(3);
		return random3;
	}

	public void ultimateWinner()
	{
		for(int i=0;i<animal.size();i++)
		{
			if(animal.get(i).getAlive() == true)
			{
				System.out.println("\n==========================================");
				System.out.println("\n Ultimate Winner is: "+animal.get(i).getName());
				System.out.println("\n==========================================");
			}
		}
	}
}

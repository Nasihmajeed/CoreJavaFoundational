package com.lxisoft.Forest;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Forest
{
	ArrayList<Animals> animal = new ArrayList<Animals>();
	Scanner scanner = new Scanner(System.in);
	int count;
	public void setAnimalDetails()
	{
		System.out.println("\n");
		System.out.println(" ANIMAL GAME ");
		System.out.println("-------------");
		System.out.println("\n");
		animal.add(new Lion());
        animal.get(0).setName("Lion1");
        animal.get(0).setStrength(100);
        animal.get(0).setAlive(true);

        animal.add(new Tiger());
        animal.get(1).setName("Tiger1");
        animal.get(1).setStrength(90);
        animal.get(1).setAlive(true);

        animal.add(new Leopard());
        animal.get(2).setName("Leopard1");
        animal.get(2).setStrength(80);
        animal.get(2).setAlive(true);

        animal.add(new Elephant());
        animal.get(3).setName("Elephant1");
        animal.get(3).setStrength(98);
        animal.get(3).setAlive(true);

        animal.add(new Deer());
        animal.get(4).setName("Deer1");
        animal.get(4).setStrength(50);
        animal.get(4).setAlive(true);
  
        animal.add(new Lion());
        animal.get(5).setName("Lion2");
        animal.get(5).setStrength(95);
        animal.get(5).setAlive(true);

        animal.add(new Tiger());
        animal.get(6).setName("Tiger2");
        animal.get(6).setStrength(85);
        animal.get(6).setAlive(true);

        animal.add(new Leopard());
        animal.get(7).setName("Leopard2");
        animal.get(7).setStrength(75);
        animal.get(7).setAlive(true);

        animal.add(new Elephant());
        animal.get(8).setName("Elephant2");
        animal.get(8).setStrength(94);
        animal.get(8).setAlive(true);
        
        animal.add(new Deer());
        animal.get(9).setName("Deer2");
        animal.get(9).setStrength(25);
        animal.get(9).setAlive(true);
        for(int i=0;i<animal.size();i++)
        {
           System.out.println((i+1)+" "+"ANIMAL NAME :"+" "+animal.get(i).getName()+"\n"+"  "+"STRENGTH    :"+" "+animal.get(i).getStrength());
           System.out.println("\n");
        }
	}
	public void fight(int random1,int random2)
	{
      int a=0,b=0;
      String c=null,d=null;
     
      if(animal.get(random1).getStrength() >= animal.get(random2).getStrength())
      {
      	c=animal.get(random1).getName();
      	a=animal.get(random1).getStrength();
      	System.out.println(" THE WINNER IS :"+c);
      	if(animal.get(random1).getStrength() >= animal.get(random2).getStrength())
      	{
      		animal.get(random1).setStrength(animal.get(random1).getStrength()-30);
      		animal.get(random2).setStrength(animal.get(random2).getStrength()-55);
      		System.out.print("After Fight The Animals Strength Is:"+animal.get(random1).getName()+"\n"+animal.get(random1).getStrength());
      		System.out.print("After Fight The Animals Strength Is:"+animal.get(random2).getName()+"\n"+animal.get(random2).getStrength());
      		if(animal.get(random2).getStrength()<=1)
      		{
      			animal.get(random2).setAlive(false);
      			System.out.println("The Animal Is DEAD:"+animal.get(random2).getName());
      		}
      		else
      		{
      			animal.get(random2).setAlive(true);
      		}
      		 count--;
      	}
      }
      else
      {
      	d=animal.get(random1).getName();
      	b=animal.get(random1).getStrength();
      	System.out.println(" THE WINNER IS :"+b);
      	if(animal.get(random1).getStrength() <= animal.get(random2).getStrength())
      	{
      		animal.get(random1).setStrength(animal.get(random1).getStrength()-55);
      		animal.get(random2).setStrength(animal.get(random2).getStrength()-30);
      		System.out.print("After Fight The Animals Strength Is:"+animal.get(random1).getName()+"\n"+animal.get(random1).getStrength());
      		System.out.print("After Fight The Animals Strength Is:"+animal.get(random2).getName()+"\n"+animal.get(random2).getStrength());
      		if(animal.get(random1).getStrength()<=1)
      		{
      			animal.get(random1).setAlive(false);
      			System.out.println("The Animal Is DEAD:"+animal.get(random1).getName());
      		}
      		else
      		{
      			animal.get(random1).setAlive(true);
      		}
      		 count--;
      	}
     }
    }
    public void setSpace()
    {
    	int i=0;
    	System.out.println("\n IF YOU WANT TO START THE GAME PREE 1 ");
        int e = scanner.nextInt();
        if(e==1)
        {
        	count=animal.size();
        	while(count>1)
        	{
        		count = this.random();
        		Random random = new Random();
        		int random1 = random.nextInt(10);
        		int random2 = random.nextInt(10);
        		if(animal.get(random1).getName() == animal.get(random2).getName())
        		{
        			random2=random.nextInt();
        		}
        		else
        		{
        			if(animal.get(random1).getAlive() && animal.get(random2).getAlive() == true)
        			{
        				if(animal.get(random1) instanceof Carnivorous && animal.get(random2) instanceof Herbivorous)
        				{
        					 System.out.print("\nAnimal 1 : Carnivourous"+"\n"+"Animal 2 : Herbivorous");
        					 this.fight(random1,random2);
        					 System.out.print("Animal 1 ="+" "+animal.get(random1).getName()+"\n"+"Strength :"+animal.get(random1).getStrength());
                             System.out.print("Animal 2 ="+" "+animal.get(random2).getName()+"\n"+"Strength :"+animal.get(random2).getStrength());
                             animal.get(random1).setStrength(animal.get(random1).getStrength()-5);
                             animal.get(random2).setStrength(animal.get(random2).getStrength()-5);
                             System.out.print("After Fight The Animals Strength Is:"+animal.get(random1).getName()+"\n"+animal.get(random1).getStrength());
      		                 System.out.print("After Fight The Animals Strength Is:"+animal.get(random2).getName()+"\n"+animal.get(random2).getStrength());
      		                 System.out.print("-------------------------------------------------------------------------------------------------------");
        			    }
        			    else
        			    {
        			    	if(animal.get(random2) instanceof Herbivorous && animal.get(random2) instanceof Carnivorous)
                           {
               	              System.out.print("\nAnimal 1 : Herbivourous"+"\n"+"Animal 2 : Carnivorous");
        					  this.fight(random1,random2);
        		              System.out.print("Animal 1 ="+" "+animal.get(random1).getName()+"\n"+"Strength :"+animal.get(random1).getStrength());
                              System.out.print("Animal 2 ="+" "+animal.get(random2).getName()+"\n"+"Strength :"+animal.get(random2).getStrength());
                              animal.get(random1).setStrength(animal.get(random1).getStrength()-5);
                              animal.get(random2).setStrength(animal.get(random2).getStrength()-5);
                              System.out.print("After Fight The Animals Strength Is:"+animal.get(random1).getName()+"\n"+animal.get(random1).getStrength());
      		                  System.out.print("After Fight The Animals Strength Is:"+animal.get(random2).getName()+"\n"+animal.get(random2).getStrength());
      		                  System.out.print("-------------------------------------------------------------------------------------------------------");
        		            }
        			    }
        			}
        		}
        	     if(animal.get(random1) instanceof Carnivorous && animal.get(random2) instanceof Herbivorous)
        	   {
        		  System.out.print(" \n Two Animals Are Carnivorous ");
        		  this.fight(random1,random2);
        	   }
        	   else
        	   {
        	     if(animal.get(random2) instanceof Carnivorous && animal.get(random2) instanceof Herbivorous)
        	      {
        		    System.out.print(" \n Two Animals Are Herbivorous ");
        		    this.fight(random1,random2);
        	      }
	            } 
            }
            i++;
        }
        System.out.print("            GAME OVER            ");
        System.out.print("---------------------------------");
        this.finalWinner();
    }
	public void finalWinner()
	{
      for(int i=0;i<animal.size();i++)
      {
      	if(animal.get(i).getAlive()==true)
      	{
      		System.out.println(" FINAL WINNER IS :"+animal.get(i).getName());
      	}
      }
	}
}

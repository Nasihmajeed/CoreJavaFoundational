 package com.lxisoft.animalgame;
// import java.util.Scanner;
import java.lang.Math;

import com.lxisoft.animalgame.*;

public class Forest
{
	
	public void print()
	{
		// Scanner scan=new Scanner(System.in);

		
		Animal[] animal=new Animal[10];
		animal [0]=new Tiger();
		animal [1]=new Rabbit();
		animal [2]=new Lion();
		animal [3]=new Peacook();
		animal [4]=new Zeebra();
		animal [5]=new Fox();
		animal [6]=new Cheetah();
		animal [7]=new Deer();
		animal [8]=new Elephant();
		animal [9]=new Wolf();

		
		

		animal[0].name="tiger";
		animal[0].strength=90;
		animal[0].isDead=false;
		animal[0].range=35;
		animal[0].sight=15;
		animal[0].newLocation[0]=random(50);
		animal[0].newLocation[1]=random(50);
		
		animal[1].name="rabbit";
		animal[1].strength=30;
		animal[1].isDead=false;
		((Hanimal)(animal[1])).luckFactor=2;
		animal[1].range=15;
		animal[1].sight=5;
		animal[1].newLocation[0]=random(50);
		animal[1].newLocation[1]=random(50);
		
		animal[2].name="lion";
		animal[2].strength=100;
		animal[2].isDead=false;
		animal[2].range=35;
		animal[2].sight=15;
		animal[2].newLocation[0]=random(50);
		animal[2].newLocation[1]=random(50);
		
		animal[3].name="peacook";
		animal[3].strength=40;
		animal[3].isDead=false;
		((Hanimal)(animal[3])).luckFactor=3;
		animal[3].range=25;
		animal[3].sight=5;
		animal[3].newLocation[0]=random(50);
		animal[3].newLocation[1]=random(50);
		
		animal[4].name="zeebra";
		animal[4].strength=45;
		animal[4].isDead=false;
		((Hanimal)(animal[4])).luckFactor=4;
		animal[4].range=25;
		animal[4].sight=5;
		animal[4].newLocation[0]=random(50);
		animal[4].newLocation[1]=random(50);
		
		animal[5].name="fox";
		animal[5].strength=10;
		animal[5].isDead=false;
		animal[5].range=25;
		animal[5].sight=10;
		animal[5].newLocation[0]=random(50);
		animal[5].newLocation[1]=random(50);
		
		animal[6].name="cheetah";
		animal[6].strength=80;
		animal[6].isDead=false;
		animal[6].range=25;
		animal[6].sight=10;
		animal[6].newLocation[0]=random(50);
		animal[6].newLocation[1]=random(50);
		
		animal[7].name="deer";
		animal[7].strength=50;
		animal[7].isDead=false;
		((Hanimal)(animal[7])).luckFactor=4;
		animal[7].range=20;
		animal[7].sight=5;
		animal[7].newLocation[0]=random(50);
		animal[7].newLocation[1]=random(50);
		
		animal[8].name="elephant";
		animal[8].strength=70;
		animal[8].isDead=false;
		((Hanimal)(animal[8])).luckFactor=5;
		animal[8].range=20;
		animal[8].sight=10;
		animal[8].newLocation[0]=random(50);
		animal[8].newLocation[1]=random(50);
		
		animal[9].name="wolf";
		animal[9].strength=60;
		animal[9].isDead=false;
		animal[9].range=28;
		animal[9].sight=15;
		animal[9].newLocation[0]=random(50);
		animal[9].newLocation[1]=random(50);


		
		meet(animal);


	}
	public int random(int max)
	{
		int random=(int)(max* Math.random());
		return random;
	}
 	public Animal[] isdead(int winner,int looser, Animal[] animal )
	{
		int diff=animal[looser].strength/2;
		animal[winner].strength-=diff;
		animal[looser].strength=0;
		return animal;
	}
	public void winning(Animal lastone, Animal[] array)
	{
		int count=0;
		for(int i=0; i<array.length; i++)
		{
			if(array[i] instanceof Carnivore)
			
			{
				if(array[i].isDead==false)
				{
			
					count++;
					lastone=array[i];
				
				}
			}
		}
		if (count==1)
		{
			System.out.println(lastone.name +" is the Winner...");
		}
		else
		{
			meet(array);
		}


	}
	public boolean withinRange(int x, int y,int[] one,int range)
	{
		boolean yes=true;
		int distance=(int)Math.sqrt((x-one[0])*(x-one[0])+(y-one[1])*(y-one[1]));
		if(distance>range)yes=true;
		else yes=false;
		// System.out.println("range Distance= "+distance);
		return yes;
	}
	public boolean withinSight(int[] x, int[] y,int sight)
	{
		boolean yes=true;
		int distance=(int)Math.sqrt((x[0]-y[0])*(x[0]-y[0])+(x[1]-y[1])*(x[1]-y[1]));
		if(distance>sight)yes=true;
		else yes=false;
		// System.out.println("sight distnce= "+distance+" "+sight);
		return yes;

	}
	public Animal[] newLocation(Animal[] animal)
	{
		boolean returns=false;
		int[] newPosition=new int[2];
		// setting new loction ech animals
		for(int i=0; i<animal.length; i++)
		{
			if(animal[i].isDead==false)
			{
				
				if(animal[i] instanceof Herbivores)
				{
					do
					{
						newPosition=((Hanimal)(animal[i])).graze();
						// animal[i].printName();
						returns=withinRange(animal[i].newLocation[0],animal[i].newLocation[1],newPosition,animal[i].range);
					}while(returns);

				}
				else
				{
					do
					{
						newPosition=((Canimal)(animal[i])).roam();
						// animal[i].printName();
						returns=withinRange(animal[i].newLocation[0],animal[i].newLocation[1],newPosition,animal[i].range);
					}while(returns);
					
				}
				animal[i].newLocation=newPosition;
				
			}
		}
		return animal;
	}
	public Animal[] isweaken(int i,Animal[] animal,int[] near)
	{
		for(int j=0;j<2;j++)
		{
			if(animal[i]!=animal[near[j]])
			{
				animal[near[j]].strength=animal[near[j]].strength-15;

			}
		}
		return animal;
	}
	public Animal[] isweaken(int i,Animal[] animal,int[] near,int nearby)
	{
		for(int j=0;j<nearby;j++)
		{
			if(animal[i]!=animal[near[j]])
			{
				animal[near[j]].strength=animal[near[j]].strength-15;

			}
		}
		return animal;
	}
	public void meet(Animal[] animal)
	{
		int count=0,locationX=0,locationY=0;
		int random1=0;
		int random2=0;
		Animal win=null;
		animal=newLocation(animal);
		// printing alive animals
		for(int i=0; i<animal.length; i++)
		{
			if(animal[i].isDead==false)
			{
				System.out.print(i+"  ");
				animal[i].printDetails();
				System.out.println(" new location: "+animal[i].newLocation[0]+", "+animal[i].newLocation[1]);
				
			}
		}
		// second animal for fight
		int nearby=0;
		int[] near= new int[animal.length];
		boolean forsight,enemy;
		enemy=true;
		int counter=20;
		do
		{
			
				do
				{
					
					random2=random(animal.length);

	 
				
				}while(animal[random2].isDead);
				// System.out.print("animal 2: ");
				// animal[random2].printName();
			// first animal for fight
			for(int i=0; i<animal.length;i++)
			{
				forsight=true;
				if(i==random2); 
				else
				{
					if(animal[i].isDead==false)
					{

						if(animal[i] instanceof Carnivore)
						{
							forsight=withinSight(animal[i].newLocation,animal[random2].newLocation,animal[i].sight);
							if(forsight==false)
							{
								near[nearby]=i;
								nearby++;
								enemy=false;
								// System.out.println(" in sight:");

							}
						}
					}
				}
						

				
				// animal[i].printName();
				// animal[random2].printName();
				
			}
			counter--;
			if(counter==0)
			{
				animal=newLocation(animal);
				counter=20;
			}
		}while(enemy);
		for(int i=0; i<nearby; i++)
		{
			// System.out.print(" in sight animal: ");
			// animal[near[i]].printName();
		}
			// System.out.println("in sight count = "+nearby);
		random1=near[0];
		boolean escape=false;
		
		if(nearby==1)
		{
			System.out.println(animal[near[0]].name+" meets "+animal[random2].name);
					
			if(animal[random2] instanceof Herbivores)
			{
				escape=((Hanimal)(animal[random2])).luck();

			}
		}
		if(nearby==2)
		{
			System.out.println(animal[near[0]].name+" and "+animal[near[1]].name+" meets "+animal[random2].name);
					
			if(animal[random2] instanceof Herbivores)
			{
				((Hanimal)(animal[random2])).luckFactor=(int)(((Hanimal)(animal[random2])).luckFactor)/2;
				escape=((Hanimal)(animal[random2])).luck();

			}
		}
		if(nearby>=3)
		{
			System.out.println(animal[near[0]].name+", "+animal[near[1]].name+" and "+animal[near[2]].name+" meets "+animal[random2].name);
		}

		if(escape==false)
			{
				if(nearby==1)
				{
					win=((Carnivore) (animal[near[0]])).fight(animal[random2]);
				}
				
				if(nearby==2)
				{
					win=((Carnivore) (animal[near[0]])).fight(animal[random2],animal[near[1]]);
				}
				
				if(nearby>=3)
				{
					win=((Carnivore) (animal[near[0]])).fight(animal[random2],animal,near,nearby);
				}


				// win.printDetails();

				if(nearby==1)
				{	for(int i=0; i<nearby; i++)
					{
						if(animal[i].name==win.name)
						{
							animal=isdead(i,random2, animal); 

						}
						
					}
				}
				if(nearby==2)
				{	for(int i=0; i<nearby; i++)
					{
						if(animal[i].name==win.name)
						{
							animal=isweaken(i,animal,near); 

						}
						
					}
				}
				if(nearby>=3)
				{	for(int i=0; i<nearby; i++)
					{
						if(animal[i].name==win.name)
						{
							animal=isweaken(i,animal,near,nearby); 

						}
						
					}
				}
				
			}
		
		
		winning(win, animal);
   
	}
}

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
		animal[0].range=30;
		animal[0].sight=20;
		animal[0].locationX=random(50);
		animal[0].locationY=random(50);
		
		animal[1].name="rabbit";
		animal[1].strength=30;
		animal[1].isDead=false;
		((Hanimal)(animal[1])).luckFactor=2;
		animal[1].range=20;
		animal[1].sight=5;
		animal[1].locationX=random(50);
		animal[1].locationY=random(50);
		
		animal[2].name="lion";
		animal[2].strength=100;
		animal[2].isDead=false;
		animal[2].range=30;
		animal[2].sight=20;
		animal[2].locationX=random(50);
		animal[2].locationY=random(50);
		
		animal[3].name="peacook";
		animal[3].strength=40;
		animal[3].isDead=false;
		((Hanimal)(animal[3])).luckFactor=3;
		animal[3].range=25;
		animal[3].sight=5;
		animal[3].locationX=random(50);
		animal[3].locationY=random(50);
		
		animal[4].name="zeebra";
		animal[4].strength=45;
		animal[4].isDead=false;
		((Hanimal)(animal[4])).luckFactor=4;
		animal[4].range=25;
		animal[4].sight=5;
		animal[4].locationX=random(50);
		animal[4].locationY=random(50);
		
		animal[5].name="fox";
		animal[5].strength=10;
		animal[5].isDead=false;
		animal[5].range=20;
		animal[5].sight=20;
		animal[5].locationX=random(50);
		animal[5].locationY=random(50);
		
		animal[6].name="cheetah";
		animal[6].strength=80;
		animal[6].isDead=false;
		animal[6].range=25;
		animal[6].sight=20;
		animal[6].locationX=random(50);
		animal[6].locationY=random(50);
		
		animal[7].name="deer";
		animal[7].strength=50;
		animal[7].isDead=false;
		((Hanimal)(animal[7])).luckFactor=4;
		animal[7].range=20;
		animal[7].sight=5;
		animal[7].locationX=random(50);
		animal[7].locationY=random(50);
		
		animal[8].name="elephant";
		animal[8].strength=70;
		animal[8].isDead=false;
		((Hanimal)(animal[8])).luckFactor=5;
		animal[8].range=20;
		animal[8].sight=10;
		animal[8].locationX=random(50);
		animal[8].locationY=random(50);
		
		animal[9].name="wolf";
		animal[9].strength=60;
		animal[9].isDead=false;
		animal[9].range=20;
		animal[9].sight=20;
		animal[9].locationX=random(50);
		animal[9].locationY=random(50);


		
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
		System.out.println("range Distance= "+distance);
		return yes;
	}
	public boolean withinSight(int[] x, int[] y,int sight)
	{
		boolean yes=true;
		int distance=(int)Math.sqrt((x[0]-y[0])*(x[0]-y[0])+(x[1]-y[1])*(x[1]-y[1]));
		if(distance>sight)yes=true;
		else yes=false;
		System.out.println("sight distnce= "+distance+" "+sight);
		return yes;

	}
	
	public void meet(Animal[] animal)
	{
		int count=0,locationX=0,locationY=0;
		int random1=0;
		int random2=0;
		Animal win=null;
		boolean returns=false;
		
		for(int i=0; i<animal.length; i++)
		{
			if(animal[i].isDead==false)
			{
				animal[i].newLocation= new int[2];
				if(animal[i] instanceof Herbivores)
				{
					do
					{
						animal[i].newLocation=((Hanimal)(animal[i])).graze();
						animal[i].printName();
						returns=withinRange(animal[i].locationX,animal[i].locationY,animal[i].newLocation,animal[i].range);
					}while(returns);

				}
				else
				{
					do
					{
						animal[i].newLocation=((Canimal)(animal[i])).roam();
						animal[i].printName();
						returns=withinRange(animal[i].locationX,animal[i].locationY,animal[i].newLocation,animal[i].range);
					}while(returns);
					
				}
				System.out.print(i+"  ");
				animal[i].printDetails();
				System.out.println(" new location: "+animal[i].newLocation[0]+", "+animal[i].newLocation[1]);
				
			}
		}

		boolean ca=true;
		boolean forsight;
		do
		{
			forsight=true;
			do
			{
				 ca=true; 
				random1=random(animal.length);

				if(animal[random1] instanceof Carnivore)
				{
					ca=false;

					// System.out.println(" Random ANimal 1: "+animal[random1].name+" Random number");
					
				} 
			}while(animal[random1].isDead ||  ca);
			// System.out.println("  Selected Random ANimal 1: "+animal[random1].name+" Random number");
					

			do
			{
				
				random2=random(animal.length);

 
			
			}while(animal[random2].isDead || random1==random2 );
			animal[random1].printName();
			animal[random2].printName();
			forsight=withinSight(animal[random1].newLocation,animal[random2].newLocation,animal[random1].sight);
		}while(forsight);


		System.out.println(animal[random1].name+" meets "+animal[random2].name);
		boolean escape=false;
		
		if(animal[random2] instanceof Herbivores)
		{
			escape=((Hanimal)(animal[random2])).luck();

		}
		if(escape==false)
			{
				win=((Carnivore) (animal[random1])).fight(animal[random2]);
				// win.printDetails();

				if(animal[random1].name==win.name)
				{
					animal=isdead(random1,random2, animal); 

				}
				else
				{
					animal=isdead(random2,random1,animal);
				}
				
			}
		
		
		winning(win, animal);
   
	}
}
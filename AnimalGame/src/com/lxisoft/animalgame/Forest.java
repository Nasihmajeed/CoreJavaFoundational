 package com.lxisoft.animalgame;
// import java.util.Scanner;
import java.lang.Math;

import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Tiger;
import com.lxisoft.animalgame.Rabbit;
import com.lxisoft.animalgame.Lion;
import com.lxisoft.animalgame.Peacook;
import com.lxisoft.animalgame.Zeebra;
import com.lxisoft.animalgame.Frog;
import com.lxisoft.animalgame.Cheetah;
import com.lxisoft.animalgame.Deer;
import com.lxisoft.animalgame.Elephant;
import com.lxisoft.animalgame.Wolf;

public class Forest
{
	
	public void print()
	{
		// Scanner scan=new Scanner(System.in);

		Animal tiger=new Tiger();
		Animal rabbit=new Rabbit();
		Animal lion=new Lion();
		Animal peacook=new Peacook();
		Animal zeebra=new Zeebra();
		Animal frog=new Frog();
		Animal cheetah=new Cheetah();
		Animal deer=new Deer();
		Animal elephant=new Elephant();
		Animal wolf=new Wolf();
		
		Animal[] animal=new Animal[10];
		animal [0]=new Tiger();
		animal [1]=new Rabbit();
		animal [2]=new Lion();
		animal [3]=new Peacook();
		animal [4]=new Zeebra();
		animal [5]=new Frog();
		animal [6]=new Cheetah();
		animal [7]=new Deer();
		animal [8]=new Elephant();
		animal [9]=new Wolf();


		
		

		animal[0].name="tiger";
		animal[0].strength=90;
		animal[0].isDead=false;
		animal[1].name="rabbit";
		animal[1].strength=30;
		animal[1].isDead=false;
		animal[2].name="lion";
		animal[2].strength=100;
		animal[2].isDead=false;
		animal[3].name="peacook";
		animal[3].strength=40;
		animal[3].isDead=false;
		animal[4].name="zeebra";
		animal[4].strength=45;
		animal[4].isDead=false;
		animal[5].name="frog";
		animal[5].strength=10;
		animal[5].isDead=false;
		animal[6].name="cheetah";
		animal[6].strength=80;
		animal[6].isDead=false;
		animal[7].name="deer";
		animal[7].strength=50;
		animal[7].isDead=false;
		animal[8].name="elephant";
		animal[8].strength=70;
		animal[8].isDead=false;
		animal[9].name="wolf";
		animal[9].strength=60;
		animal[9].isDead=false;


		
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


	public void meet(Animal[] animal)
	{
		int count=0;
		int random1=0;
		int random2=0;
		Animal win=null;
		for(int i=0; i<animal.length; i++)


			
		{
			if(animal[i].isDead==false)
			{
				System.out.print(i+"  ");
				animal[i].printDetails();
				
			}
		}

		boolean ca=true;
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
		System.out.println(animal[random1].name+" meets "+animal[random2].name);
		
		int luckfactor=0;
		luckfactor=random(10);
		if(luckfactor==0)
		{
			System.out.println("lucky b day animal escapped");
		}
		else
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
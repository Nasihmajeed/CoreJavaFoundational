package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
import java.util.Scanner;

public class Forest
{
	String name="Jungle Book";
	Animal[] animal;
	
	public void theForest()
	{
		System.out.println("\n");
		System.out.println("Welcome to the "+name);
	}

	public void meetAnimals()
	{
		 int x,y,z,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total no. of tiger in the forest");
		 int t=sc.nextInt();
		System.out.println("enter the total no. of lion in the forest");
		 int l=sc.nextInt();
		System.out.println("enter the total no. of bear in the forest");
		 int b=sc.nextInt();
		System.out.println("enter the total no. of rabbit in the forest");
		 int r=sc.nextInt();
		 int total=t+l+b+r;
		animal=new Animal[total];

		for( i=0;i<t;i++)
		{
			System.out.println("enter the name  tiger"+(i+1));
			animal[i]=new Tiger();
			animal[i].name=sc.next();
			System.out.println("enter the  strength of tiger"+(i+1));
			animal[i].strength=sc.nextInt();
			
		}x=i;

		for(i=0;i<l;i++)
		{
			System.out.println("enter the name  of lion"+(i+1));
			animal[x]=new Lion();
			animal[x].name=sc.next();
			System.out.println("enter the  strength of lion"+(i+1));
			animal[x].strength=sc.nextInt();
			x++;
			
		}y=x;
		
		for(i=0;i<b;i++)
		{
			System.out.println("enter the name  of bear"+(i+1));
			animal[y]=new Bear();
			animal[y].name=sc.next();
			System.out.println("enter the  strength of bear"+(i+1));
			animal[y].strength=sc.nextInt();
			y++;
			
		}z=y;
		
		for(i=0;i<r;i++)
		{
			System.out.println("enter the name  of rabbit"+(i+1));
			animal[z]=new Rabbit();
			animal[z].name=sc.next();
			System.out.println("enter the  strength of rabbit"+(i+1));
			animal[z].strength=sc.nextInt();
			z++;
		}
	}

	public void animalsRoam()
	{
		int total=animal.length;
		System.out.println("Animals which roam around jungle are ");

		for(int i=0;i<total;i++)
		{
			System.out.println("animal name -"+animal[i].name);
			System.out.println("animal strength -"+animal[i].strength);
			System.out.println("\n");
		}
	}

	// public void eat()
	// {
	// 	animal.eat();
	// }

	// public void run()
	// {
	// 	animal.run();

	// }

}


		
		
		// System.out.println("\n");

	


		// Animal aTiger=new Tiger();
		
		// aTiger.details();
		// aTiger.eat();
		// aTiger.run();
		// System.out.println("\n");
		// aArray[0]=aTiger;

		// Animal aLion=new Lion();
		// aLion.animalName="lion";
		// aLion.strength=5;
		// aLion.details();
		// aLion.eat();
		// aLion.run();
		// System.out.println("\n");
		// aArray[1]=aLion;

		// Animal aBear=new Bear();
		// aBear.animalName="bear";
		// aBear.strength=3;
		// aBear.details();
		// aBear.eat();
		// aBear.run();
		// System.out.println("\n");
		// aArray[2]=aBear;

		// Animal aRabbit=new Rabbit();
		// aRabbit.animalName="rabbit";
		// aRabbit.strength=2;
		// aRabbit.details();
		// aRabbit.eat();
		// aRabbit.run();
		// aArray[3]=aRabbit;


		// animal.fight(aArray);

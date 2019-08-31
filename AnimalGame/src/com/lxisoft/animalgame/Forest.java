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

	public void fight()
	{
		System.out.println("------------------FIGHT BEGINS------------------");
		int x,y,z,i,total,win;
		Animal temp=new Animal();
		total=animal.length;
		System.out.println("total no of animals in the forest is"+total);
		z=(int) (Math.random() * (total+total));
		System.out.println("total no of fights taken place->"+z);
		System.out.println("\n");

		for(i=0;i<z;i++)
		{
			x=(int) (Math.random() * total);
			y=(int) (Math.random() * total);
			
			System.out.println("					 Fight"+(i+1)+"				\n         				"+animal[x].name+" v/s "+animal[y].name);
			temp=animal[x].fight(animal[y]);
			System.out.println("				"+temp.name+" WINS  (strength="+temp.strength+")");
			System.out.println("\n");
		}
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



		
	


		
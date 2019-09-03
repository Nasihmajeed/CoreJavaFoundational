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
			animal[i].isDead=false;
			
		}x=i;

		for(i=0;i<l;i++)
		{
			System.out.println("enter the name  of lion"+(i+1));
			animal[x]=new Lion();
			animal[x].name=sc.next();
			System.out.println("enter the  strength of lion"+(i+1));
			animal[x].strength=sc.nextInt();
			animal[x].isDead=false;
			x++;
			
		}y=x;
		
		for(i=0;i<b;i++)
		{
			System.out.println("enter the name  of bear"+(i+1));
			animal[y]=new Bear();
			animal[y].name=sc.next();
			System.out.println("enter the  strength of bear"+(i+1));
			animal[y].strength=sc.nextInt();
			animal[y].isDead=false;
			y++;
			
		}z=y;
		
		for(i=0;i<r;i++)
		{
			System.out.println("enter the name  of rabbit"+(i+1));
			animal[z]=new Rabbit();
			animal[z].name=sc.next();
			System.out.println("enter the  strength of rabbit"+(i+1));
			animal[z].strength=sc.nextInt();
			animal[z].isDead=false;
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
		int x,y,i,j,total,win,c,f=0;
		Animal temp=new Animal();
		total=animal.length;
		System.out.println("total no of animals in the forest is"+total);
		System.out.println("\n------------------FIGHT BEGINS------------------");
		System.out.println("\n");
	
		for(i=0;true;i++)
		{
			x=(int) (Math.random() * total);
			y=(int) (Math.random() * total);
			c=0;
			for(j=0;j<total;j++)
			{
				if(animal[j].isDead==false)
				{
					c++;
				}
			}
			if(c<=1)
			{
				break;
			}

			if(x!=y)
			{
				if(animal[x].isDead==false && animal[y].isDead==false)
				{
					f++;
					System.out.println("					 Fight"+(f)+"				\n         				"+animal[x].name+" v/s "+animal[y].name);
					temp=animal[x].fight(animal[y]);
					System.out.println("				"+temp.name+" WINS  (strength="+temp.strength+")");
					if(temp==animal[x])
					{
						animal[x].strength--;
						animal[y].strength-=2;
						if (animal[y].strength<1)
						{
							animal[y].isDead=true;
						}
					}
					else
					{
						animal[y].strength--;
						animal[x].strength-=2;
						if (animal[x].strength<1)
						{
							animal[x].isDead=true;
						}
					}
					System.out.println("\n");
				}
			}
				
		}

		
		for  (i=0;i<total;i++)
		{
			System.out.println(animal[i].name+ "  dead?  "+animal[i].isDead);
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



		
	


		
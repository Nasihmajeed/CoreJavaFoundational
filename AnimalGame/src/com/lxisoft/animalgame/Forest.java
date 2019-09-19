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
		int x,y,z;
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
		x=tigerAnimal(animal,t);
		y=lionAnimal(animal,l,x);
		z=bearAnimal(animal,b,y);
		rabbitAnimal(animal,r,z);
	}

	public int tigerAnimal(Animal[] animal,int t)
	{
		 int i,x;
		 Scanner sc=new Scanner(System.in);
		for( i=0;i<t;i++)
		{
			System.out.println("enter the name  tiger"+(i+1));
			animal[i]=new Tiger();
			animal[i].name=sc.next();
			System.out.println("enter the  strength of tiger"+(i+1));
			animal[i].strength=sc.nextInt();
			animal[i].isDead=false;
		}x=i;
		return x;
	}

	public int lionAnimal(Animal[] animal,int l,int x)
	{
		int i,y;
		Scanner sc=new Scanner(System.in);
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
		return y;
	}
		 
	public int bearAnimal(Animal[] animal,int b,int y)	
	{
		int i,z;
		Scanner sc=new Scanner(System.in);
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
		return z;
	}
	public void rabbitAnimal(Animal[] animal,int r,int z)
	{
		int i,y;
		Scanner sc=new Scanner(System.in);
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

	public void eat()
	{
		int total=animal.length;
		for(int i=0;i<total;i++)
		{
			animal[i].eat();
		}
	}

	public void run()
	{
		int total=animal.length;
		for(int i=0;i<total;i++)
		{
			animal[i].run();
		}
	}


	public void readyToFight()
	{
		int x,y,i,j,total,win=0,c,f=1;
		System.out.println("\n\t\t  ------------------FIGHT BEGINS------------------\n");
		for(i=0;true;i++)
		{
			x=(int) (Math.random() * animal.length);
			y=(int) (Math.random() * animal.length);
			c=0;
			for(j=0;j<animal.length;j++)
			{
				if((animal[j] instanceof Carnivorous) && (animal[j].isDead==false))
				{
					win=j;
					c++;
				}
			}
			if(c<=1)
			{
				System.out.println("\t\t\t ********* THE WINNER IS "+animal[win].name+" *********");
				for  (i=0;i<animal.length;i++)
					System.out.println(animal[i].name+ "  dead?  "+animal[i].isDead);
				break;
			}
			f=fightStarts(x,y,f);
		}
	}


	public int fightStarts(int x,int y,int f)
	{
		Animal temp;
		if(animal[x] instanceof Carnivorous && (x!=y))
		{
			if(animal[x].isDead==false && animal[y].isDead==false)
			{
				if(animal[y] instanceof Herbivorous)
				{
					System.out.println("					 Fight"+(f++)+"				\n         				"+animal[x].name+" v/s "+animal[y].name);
					((Herbivorous) animal[y]).escape(animal[x]);
				}	
				else
				{
					System.out.println("					 Fight"+(f++)+"				\n         				"+animal[x].name+" v/s "+animal[y].name);
					temp=((Carnivorous) animal[x]).fight(animal[y]);
					System.out.println("				"+temp.name+" WINS  (strength="+temp.strength+")\n");
					if(temp==animal[x])
					{
						animal[x].strength--;
						animal[y].strength-=2;
						if (animal[y].strength<1)
							animal[y].isDead=true;
					}
					else
					{
						animal[y].strength--;
						animal[x].strength-=2;
						if (animal[x].strength<1)
							animal[x].isDead=true;
					}
				}
			}
		}				return f;
	}
}



package com.lxisoft.animalgame;
import java.lang.Math;
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
		animalLuck();

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
			animal[i].range=(int) (Math.random() * 40+1);
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
			animal[x].range=(int) (Math.random() * 50+1);
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
			animal[y].range=(int) (Math.random() * 30+1);
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
			animal[z].range=(int) (Math.random() * 10+1);
			z++;
		}
		animalStatus();
	}

	public void animalStatus()
	{
		for(int i=0;i<animal.length;i++)
		{
			animal[i].xaxis=(int) (Math.random() * 100+1);
			animal[i].yaxis=(int) (Math.random() * 100+1);
		}
	}

	public void animalsRoam()
	{
		int total=animal.length;
		System.out.println("Animals which roam around jungle are ");

		for(int i=0;i<total;i++)
		{
			System.out.println("animal name- "+animal[i].name);
			System.out.println("animal strength- "+animal[i].strength);
			System.out.println("Coordinates- "+animal[i].xaxis+" X "+animal[i].yaxis);
			System.out.println("area/range- "+animal[i].range);
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
				{
					System.out.println(animal[i].name+ "  luck?  "+animal[i].luck);
					System.out.println(animal[i].name+ "  dead?  "+animal[i].isDead+"\n");
				}
				break;
			}
			f=fightStarts(x,y,f);
		}
	}

	public int fightStarts(int x,int y,int f)
	{
		int[] arr=new int[animal.length];
		int i,dist,count=0;
		if(animal[x] instanceof Carnivorous && (x!=y) && animal[x].isDead==false && animal[y].isDead==false)
		{
			dist=(int) (Math.sqrt((animal[x].xaxis-animal[y].xaxis)*(animal[x].xaxis-animal[y].xaxis)+(animal[x].yaxis-animal[y].yaxis)*(animal[x].yaxis-animal[y].yaxis)));
			for(i=0;i<animal.length;i++)
			{
				if(animal[i] instanceof Carnivorous && (animal[i]!=animal[y]))
				{
					if(dist<animal[i].range)
					{
						arr[count]=i;
						count++;
					}
				}
			}
			if(count!=0)
			{
				System.out.println("	 \t\t  ___________Fight"+(f++)+"___________");				      				//"+animal[x].name+" v/s "+animal[y].name);
				System.out.println("\t\t\t\tanimals nearby  "+animal[y].name+"  are ");
				nearAnimals(arr,count);
				if(animal[y] instanceof Herbivorous)
				{
					if(count==1)
						((HerbivorousAnimal)animal[y]).escape(animal[arr[0]]);
					else if(count==2)
						((HerbivorousAnimal)animal[y]).escape(animal[arr[0]],animal[arr[1]]);
					else if(count==3)
						((HerbivorousAnimal)animal[y]).escape(animal[arr[0]],animal[arr[1]],animal[arr[2]]);
				}
				else
				{
					if(count==1)
						((CarnivorousAnimal)animal[y]).fight(animal[arr[0]]);
					else if(count==2)
						((CarnivorousAnimal)animal[y]).fight(animal[arr[0]],animal[arr[1]]);
				}
			}
		}
		animalStatus();
		return f;
	}

	public void nearAnimals(int[] arr,int count)
	{
		for(int i=0;i<count;i++)
		{
			System.out.println("\t\t\t\t\t"+animal[arr[i]].name);
		}
	}

	public void animalLuck()
	{
		int i;
		for(i=0;i<animal.length;i++)
		{
			animal[i].luck=(int) (Math.random() * 100+1);
		}
	}


}


	// public int fightStarts(int x,int y,int f)
	// {
	// 	int dist;
	// 	if(animal[x] instanceof Carnivorous && (x!=y) && animal[x].isDead==false && animal[y].isDead==false)
	// 	{
	// 		dist=(int) (Math.sqrt((animal[x].xaxis-animal[y].xaxis)*(animal[x].xaxis-animal[y].xaxis)+(animal[x].yaxis-animal[y].yaxis)*(animal[x].yaxis-animal[y].yaxis)));
			
	// 		{
				
	// 			if(dist<animal[x].range)
	// 			{
	// 				((Herbivorous) animal[y]).escape(animal[x]);
	// 			}
	// 			else
	// 				System.out.println("\t\t\t NO FIGHT- animal not in range : Carnivore "+animal[x].name+" range-"+animal[x].range+" y=="+animal[y].name+" dis-"+dist+" axis\n");
	// 		}	
	// 		else
	// 		{
	// 			System.out.println("					 Fight"+(f++)+"				\n         				"+animal[x].name+" v/s "+animal[y].name);
	// 			carnivorousFight(x,y,dist);
	// 		}
	// 	}
	
	// return f;
	// }


	// public void carnivorousFight(Animal temp)
	// {
	// 		System.out.println("				"+temp.name+" WINS  (strength="+temp.strength+")\n");
	// 		if(temp==animal[x])
	// 		{
	// 			animal[x].strength--;
	// 			animal[y].strength-=2;
	// 			if (animal[y].strength<1)
	// 				animal[y].isDead=true;
	// 		}
	// 		else
	// 		{
	// 			animal[y].strength--;
	// 			animal[x].strength-=2;
	// 			if (animal[x].strength<1)
	// 				animal[x].isDead=true;
	// 		}
	// }

	

	



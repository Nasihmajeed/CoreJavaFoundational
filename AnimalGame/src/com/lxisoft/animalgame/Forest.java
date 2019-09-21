package com.lxisoft.animalgame;
import java.util.Scanner;
import com.lxisoft.animalgame.*;
public class Forest 
{
	Animal animal;
    Animal tiger;
    Animal lion;
    Animal rabbit;
    Animal deer;
	public void fight()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("\n");
	    System.out.println("    PINE FOREST  ");
	    System.out.println("  ****************");
	    System.out.println("Enter no.of Tiger:");
	    int t=sc.nextInt();
	    System.out.println("Enter no.of Lion:");
		int l=sc.nextInt();
	    System.out.println("Enter no.of Rabbit:");
		int r=sc.nextInt();
		System.out.println("Enter no.of Deer:");
		int d=sc.nextInt();
		int tot=(t+l+r+d);
		Animal[] animalArr=new Animal[tot];
		tigerDetails(animalArr,t);
		lionDetails(animalArr,t,l);
		rabbitDetails(animalArr,t,l,r);
		deerDetails(animalArr,t,l,r,d);
	}
   	public void tigerDetails(Animal animalArr[],int t)
    {
    	Scanner sc=new Scanner (System.in);
	    for(int i=0;i<t;i++)
		{
			tiger =new Tiger();
			System.out.println("Enter Tiger name:");
			tiger.animalName=sc.next();
			System.out.println("Enter Tiger strength:");
			tiger.strength=sc.nextInt();
			tiger.isDead=false;
			animalArr[i]=tiger;
		}
		tiger.run();
		tiger.eat();
    }
    public void lionDetails(Animal animalArr[],int t,int l)
    {
        Scanner sc=new Scanner (System.in);
		for(int i=t;i<t+l;i++)
		{
			lion=new Lion();
			System.out.println("Enter Lion name:");
			lion.animalName=sc.next();
			System.out.println("Enter Lion strength:");
			lion.strength=sc.nextInt();
			lion.isDead=false;
			animalArr[i]=lion;
		}
		lion.run();
		lion.eat();
	}
	public void rabbitDetails(Animal animalArr[],int t,int l,int r)
	{
	    Scanner sc=new Scanner (System.in);
		for(int i=t+l;i<(t+l+r);i++)
		{
			rabbit=new Rabbit();
			System.out.println("Enter Rabbit name:");
			rabbit.animalName=sc.next();
			System.out.println("Enter Rabbit strength:");
			rabbit.strength=sc.nextInt();
			rabbit.isDead=false;
			animalArr[i]=rabbit;
		}
		rabbit.run();
		rabbit.eat();
	}
	public void deerDetails(Animal animalArr[],int t,int l,int r,int d)
	{
		Scanner sc=new Scanner (System.in);
		int tot=t+l+r+d;
	    for(int i=(t+l+r);i<tot;i++)
		{
			deer=new Deer();
			System.out.println("Enter Deer name:");
			deer.animalName=sc.next();
			System.out.println("Enter Deer strength:");
			deer.strength=sc.nextInt();
			animalArr[i]=deer;
		}
		deer.run();
        deer.eat();
		meetFight(tot,animalArr);
    }
	public void meetFight(int tot,Animal animalArr[])
	{
		int count,c,w=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("--ANIMAL DETAILS--");
		System.out.println("\nAnimal Meet & Fight Starts\n-----------------------------");
		Animal temp=null;
		for(int i=0;true;i++)
		{
			c=0;
			for(int j=0;j<animalArr.length;j++)
			{
				if((animalArr[j].isDead==false)&(animalArr[j] instanceof Carnivore))
				{
					c++;
					w=j;
				}
			}
			if(c<=1)
			{
				System.out.println(animalArr[w].animalName+"   WINNER  ");
				break;
			}
			escapeHerbivore(animalArr);
			carnivoreWinner(animalArr);
		}
	}

		
	public void escapeHerbivore(Animal animalArr[])
	{
		int m=(int)(Math.random()*animalArr.length);
		int n=(int)(Math.random()*animalArr.length);
		if((animalArr[m].isDead==false)&(animalArr[n].isDead==false)&(m!=n))
		{
			if((animalArr[m] instanceof Herbivore)&(animalArr[n] instanceof Carnivore))
			{
				System.out.println("\n"+animalArr[n].animalName+"  VS  "+animalArr[m].animalName);
				Animal tempp=((Herbivore)(animalArr[m])).escape(animalArr[n]);
		        if(tempp==animalArr[m])
				{
					System.out.println("WINNER   "+animalArr[n].animalName);
					System.out.println(animalArr[m].animalName+"--------Escape------");
				}
				if(tempp==animalArr[n])
				{
					System.out.println("WINNER   "+animalArr[n].animalName);
					System.out.println(animalArr[n].animalName+"  kill "+animalArr[m].animalName);
					animalArr[m].isDead=true;
					
				}
			}
		}
    }
    public void carnivoreWinner(Animal animalArr[])
    {
    	int m=(int)(Math.random()*animalArr.length);
		int n=(int)(Math.random()*animalArr.length);
		if((animalArr[m].isDead==false)&(animalArr[n].isDead==false)&(m!=n))
		{
			if((animalArr[m] instanceof Carnivore)&(animalArr[n] instanceof Carnivore))
			{
				System.out.println("\n"+animalArr[m].animalName+"  VS  "+animalArr[n].animalName);	
				Animal temp=((Carnivore)(animalArr[m])).fight(animalArr[n]);
				if(temp==animalArr[m])
				{
					System.out.println("WINNER   "+animalArr[m].animalName+" \nwinner Strength=" +(animalArr[m].strength-=1));
					System.out.println("Looser Strength=" +(animalArr[n].strength=0));
					if(animalArr[n].strength<=0)
					{
						animalArr[n].isDead=true;
						System.out.println(animalArr[n].animalName+"  DEAD  ");
					}	
				}
				else
				{
					System.out.println(animalArr[n].animalName+"  WIN  winner Strength="+(animalArr[n].strength-=1));
					animalArr[m].strength=0;
					System.out.println("Looser Strength="+animalArr[m].strength);
					if(animalArr[m].strength<=0)
					{
						animalArr[m].isDead=true;
						System.out.println(animalArr[m].animalName+"  DEAD  ");
					}
				}
			}
		}
	}			
}


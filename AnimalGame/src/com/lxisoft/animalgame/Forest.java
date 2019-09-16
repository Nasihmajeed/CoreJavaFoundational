package com.lxisoft.animalgame;
import java.util.Scanner;
import com.lxisoft.animalgame.Animal;
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
	    for(int i=(t+l+r);i<(t+l+r+d);i++)
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
		meetFight(animalArr,tot);		
	}
	
     
	public void meetFight(Animal animalArr[],int tot)
	{
		int count=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("--ANIMAL DETAILS--");
		System.out.println("\n");
		System.out.println("Animal Meet & Fight Starts");
		System.out.println("-----------------------------");
		Animal temp=null;
		do
		{
			for(int i=0;i<animalArr.length;i++)
		    {
		    	int m,n;
		    	boolean c;
		    	do
		    	{
		    		c=true;
					m=(int)(Math.random()*tot);
					if(animalArr[m] instanceof Carnivore)
					{
						c=false;
					}
				}
				while(c);
				n=(int)(Math.random()*tot);
				if(m!=n)
				{
					if(animalArr[m].isDead==false&animalArr[n].isDead==false)
					{
						System.out.println("\n"+animalArr[m].animalName+"  VS  "+animalArr[n].animalName);
						temp=((Carnivore)(animalArr[m])).fight(animalArr[n]);					
						if(temp==animalArr[m])
						 {
						 	animalArr[m].strength=(animalArr[m].strength-1);
						 	System.out.println("winner Strength=" +animalArr[m].strength);
						 	animalArr[n].strength=0;
						 	System.out.println("Looser Strength=" +animalArr[n].strength);
							if(animalArr[m].strength<=0)
							{
								animalArr[m].isDead=true;
								System.out.println(animalArr[m].animalName+"  DEAD");
							}
							if(animalArr[n].strength<=0)
							{
								animalArr[n].isDead=true;
								System.out.println(animalArr[n].animalName+"  DEAD");
							}	
							System.out.println(animalArr[m].animalName+"  WIN");
							count=remaining(animalArr);
							System.out.println("count" +count);
					    }
						else
						{
							 animalArr[n].strength=(animalArr[n].strength-1);
							 System.out.println("winner Strength="+animalArr[n].strength);
							 animalArr[m].strength=0;
							 System.out.println("Looser Strength="+animalArr[m].strength);
							if(animalArr[n].strength<=0)
							{
								animalArr[n].isDead=true;
								System.out.println(animalArr[n].animalName+"  DEAD");
							}
							if(animalArr[m].strength<=0)
							{
								animalArr[m].isDead=true;
								System.out.println(animalArr[m].animalName+"  DEAD");
							}
							System.out.println(animalArr[n].animalName+"  WIN");
							count=remaining(animalArr);
							System.out.println("count" +count);
						}
			    	}
			    }
		    }
		} 
	    while(count>1);
	    if(count==1 )
	    {
	    	System.out.println("winner is " +temp.animalName);
	    } 
	}
	public int remaining(Animal[] animalArr)
	{
		int count=0;
		for(int i=0;i<animalArr.length;i++)
      	{
      		if(animalArr[i].isDead==false)
      		{
      			System.out.println("\n Remainig="+animalArr[i].animalName);
      			count++;
      		}
   		} 	
   		return count;
	}
}
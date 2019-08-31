package com.lxisoft.animalgame;
import java.util.Scanner;
import com.lxisoft.animalgame.Animal;
public class Forest 
{
	Animal animal;
    Tiger tiger;
    Lion lion;
    Rabbit rabbit;
	
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
		int tot=(t+l+r);
		Animal[] animalArr=new Animal[tot];
     	animal=new Animal();
	    for(int i=0;i<t;i++)
		{
			tiger =new Tiger();
			System.out.println("Enter Tiger name:");
			tiger.animalName=sc.next();
			System.out.println("Enter Tiger strength:");
			tiger.strength=sc.nextInt();
			animalArr[i]=tiger;
		}
		for(int i=t;i<t+l;i++)
		{
			Lion lion=new Lion();
			System.out.println("Enter Lion name:");
			lion.animalName=sc.next();
			System.out.println("Enter Lion strength:");
			lion.strength=sc.nextInt();
			animalArr[i]=lion;
		}
		for(int i=t+l;i<(t+l+r);i++)
		{
			rabbit=new Rabbit();
			System.out.println("Enter Rabbit name:");
			rabbit.animalName=sc.next();
			System.out.println("Enter Rabbit strength:");
			rabbit.strength=sc.nextInt();
			animalArr[i]=rabbit;
		}     	
		meetFight(animalArr);		
	}
     
	public void meetFight(Animal animalArr[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("-Animal Details-");
		System.out.println("Animal Meet & Fight Starts");
		System.out.println("-----------------------------");
		System.out.println("No.of Fight");
		int l=sc.nextInt();
		    for(int i=0;i<l;i++)
		    {
				int m=(int)(Math.random()*3);
				int n=(int)(Math.random()*3);
				if(m!=n)
				{
				if(animalArr[m].isDead==false&animalArr[n].isDead==false)
				{
					System.out.println(animalArr[m].animalName+"  VS  "+animalArr[n].animalName);					
					if(animalArr[m].strength>animalArr[n].strength)
					{
						System.out.println(animalArr[m].animalName+"  WIN");
						animalArr[m].strength=(animalArr[m].strength-1);
						System.out.println("winner Strength=" +animalArr[m].strength);
						animalArr[n].strength=(animalArr[n].strength-2);
						System.out.println("Looser Strength=" +animalArr[n].strength);
						if(animalArr[m].strength<=0)
						{
							animalArr[m].isDead=true;
						}
						if(animalArr[n].strength<=0)
						{
							animalArr[n].isDead=true;
						}	
					}
					else
					{
						System.out.println(animalArr[n].animalName+"  WIN");
						animalArr[n].strength=(animalArr[n].strength-1);
						System.out.println("winner Strength="+animalArr[n].strength);
						animalArr[m].strength=(animalArr[m].strength-2);
						System.out.println("Looser Strength="+animalArr[m].strength);
						if(animalArr[n].strength<=0)
						{
							animalArr[n].isDead=true;
						}
						if(animalArr[m].strength<=0)
						{
							animalArr[m].isDead=true;
						}
					}
			    }
		    }
	    }
	}
}
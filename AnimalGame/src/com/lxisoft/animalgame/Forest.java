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
		System.out.println("-Animal Details-");
		System.out.println("Animal Meet & Fight Starts");
		System.out.println("-----------------------------");
		    for(int i=0;i<5;i++)
		    {
				int m=(int)(Math.random()*3);
				int n=(int)(Math.random()*3);
				System.out.println(animalArr[m].animalName+"  VS  "+animalArr[n].animalName);
				
				if(animalArr[m].strength>animalArr[n].strength)
				{
					System.out.println(animalArr[m].animalName+"  WIN");
				}
				else
				{
					System.out.println(animalArr[n].animalName+"  WIN");
				}
	        }
	}


}
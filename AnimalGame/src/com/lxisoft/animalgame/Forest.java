package com.lxisoft.animalgame;
import java.util.Scanner;
import com.lxisoft.animalgame.Animal;
public class Forest
{
	Animal animal;	
	Tiger tiger;
	Lion lion;
	Rabbit rabbit;
	public void print()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\n\t\t  ------SHANTHI VANAM --------");

		System.out.println("enter the number of tiger");			
	 	int t=sc.nextInt();	
	 	System.out.println("enter the number of lion");			
	 	int l=sc.nextInt();	 
	 	System.out.println("enter the number of rabbit");			
	 	int r=sc.nextInt();
	 	int total=(t+l+r);
	 	Animal[] animalArray=new Animal[total];
	 	animal=new Animal();
		

	 	for(int i=0;i<t;i++)
	 	{
	 		Tiger tiger=new Tiger();
	 		System.out.println("name of the tiger");
	  		tiger.animalName=sc.next();
	  		System.out.println("strength of tiger");
	  		tiger.strength=sc.nextInt();
	  		animalArray[i]=tiger;
		}	
		
	 	for(int i=t;i<l+t;i++)
	 	{
	 		Lion lion=new Lion();
		 	System.out.println("name of the lion");		  
	  		lion.animalName=sc.next();
		  	System.out.println("strength of lion");
		  	lion.strength=sc.nextInt();
		  	animalArray[i]=lion;		
		}	
		
	 	for(int i=l+t;i<l+r+t;i++)
	 	{
	 		Rabbit rabbit=new Rabbit();
			System.out.println("name of the rabbit");			
	  		rabbit.animalName=sc.next();
			System.out.println("strength of rabbit");
			rabbit.strength=sc.nextInt();
			animalArray[i]=rabbit;
		
		}	
			meet(animalArray);
	}	
	public void meet(Animal animalArray[])
	{
		System.out.println("-------fight begins---------");	
		int x,y,temp;
		for(int i=0;i<6;i++)
		{
			x=(int) (Math.random()*3);
			y=(int) (Math.random()*3);
			//x instanceof Tiger;
			//while(animalArray[x].strength==animalArray[y].strength)
			System.out.println(animalArray[x].animalName+" Vs "+animalArray[y].animalName);
			if(animalArray[x].isDead==false&animalArray[y].isDead==false)
			{

			}
			if(animalArray[x].strength<animalArray[y].strength)
			{
				System.out.println("winner====="+animalArray[y].animalName);
				System.out.println(animalArray[x].animalName+" dead");
				animalArray[x].isDead=true;
			}
			else
			{
				System.out.println("Dead========"+animalArray[x].animalName);
				System.out.println(animalArray[y].animalName+" dead");				
				animalArray[y].isDead=true;

			}	
		}

	}	
	
}




	
			
		
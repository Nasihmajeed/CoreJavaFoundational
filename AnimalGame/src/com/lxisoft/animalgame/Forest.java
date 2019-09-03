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
		
	 	for(int i=t;i<t+l;i++)
	 	{
	 		Lion lion=new Lion();
		 	System.out.println("name of the lion");		  
	  		lion.animalName=sc.next();
		  	System.out.println("strength of lion");
		  	lion.strength=sc.nextInt();
		  	animalArray[i]=lion;		
		}	
		
	 	for(int i=t+l;i<t+l+r;i++)
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
		Scanner sc=new Scanner(System.in);
		System.out.println("\n");
		System.out.println("-------fight begins---------");
		System.out.println("\n");	
		System.out.println("number of fights");
		int f=sc.nextInt();
		System.out.println("\n");	
		int x,y;
		for(int i=0;i<f;i++)
		{
			x=(int) (Math.random()*3);
			y=(int) (Math.random()*3);
			if(x!=y)
			{
		    if(animalArray[x].isDead==false & animalArray[y].isDead==false)
			{   
			    System.out.println(animalArray[x].animalName+" Vs "+animalArray[y].animalName);             
				if(animalArray[x].strength>animalArray[y].strength)
				{
					System.out.println("winner====="+animalArray[x].animalName);
					animalArray[x].strength=(animalArray[x].strength-1);
					System.out.println("win strength=" +animalArray[x].strength);
                    animalArray[y].strength=(animalArray[y].strength-2);
                    System.out.println("failed="+animalArray[y].strength);						
					if(animalArray[x].strength<=0)
					{
						animalArray[x].isDead=true;
					}
					if(animalArray[y].strength<=0)
					{
						animalArray[y].isDead=true;
					}
				}
				else
				{
					System.out.println("Winner====="+animalArray[y].animalName);
					animalArray[y].strength=(animalArray[y].strength-1);
					System.out.println("win strength=" +animalArray[y].strength);				
					animalArray[y].strength=(animalArray[x].strength-2);
					if(animalArray[y].strength<=0)
					{
						animalArray[y].isDead=true;
					}
					if(animalArray[x].strength<=0)
					{
						animalArray[x].isDead=true;
					}

				}
				
			}	
		}
	}
	}	
	
}




	
			
		
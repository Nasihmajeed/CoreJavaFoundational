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
	 	for(int i=0;i<t;i++)
	 	{
	 		Tiger tiger=new Tiger();
	 		System.out.println("name of the tiger");
	  		tiger.animalName=sc.next();
	  		System.out.println("strength of tiger");
	  		tiger.strength=sc.nextInt();
	  		tiger.isDead=false;
	  		animalArray[i]=tiger;
		}			
	 	for(int i=t;i<t+l;i++)
	 	{
	 		Lion lion=new Lion();
		 	System.out.println("name of the lion");		  
	  		lion.animalName=sc.next();
		  	System.out.println("strength of lion");
		  	lion.strength=sc.nextInt();
		  	lion.isDead=false;
		  	animalArray[i]=lion;		
		}			
	 	for(int i=t+l;i<t+l+r;i++)
	 	{
	 		Rabbit rabbit=new Rabbit();
			System.out.println("name of the rabbit");			
	  		rabbit.animalName=sc.next();
			System.out.println("strength of rabbit");
			rabbit.strength=sc.nextInt();
			rabbit.isDead=false;
			animalArray[i]=rabbit;		
		}	
		meet(animalArray);				
	}	
	public void run()
	{
	}
	public void meet(Animal[] animalArray)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n");
		System.out.println("-------fight begins---------");
		System.out.println("\n");	
		int x,y,co,i,j;
		int count=animalArray.length;		
		for(i=0;true;i++)
		{
			x=(int) (Math.random()*count);
			y=(int) (Math.random()*count);
			co=0;
			for(j=0;j<count;j++)
			{	
				if(animalArray[j] instanceof Carnivorous)
				{
					if(animalArray[j].isDead==false)
					{
						co++;
					}
				}
	   		}
	   		if(co<=1)
			{	        	
		       	break;
		    }
	        if(animalArray[x] instanceof Carnivorous && animalArray[y] instanceof Carnivorous)
			{
	        if(x!=y)
			{			   
			    if(animalArray[x].isDead==false && animalArray[y].isDead==false)
				{   
				   Animal temp;
				   System.out.println(animalArray[x].animalName +" Vs "+animalArray[y].animalName);				   
		   		    temp=((Carnivorous) animalArray[x]).fight(animalArray[y]);	            
					if(temp==animalArray[x])
					{
						System.out.println(" winner==" + animalArray[x].animalName);
						animalArray[x].strength=(animalArray[x].strength-1);
						System.out.println("looser==" + animalArray[y].animalName);
						animalArray[y].strength=(animalArray[y].strength-2);
						if(animalArray[x].strength<=0)
					 	{
					 		animalArray[x].isDead=true;
					 		System.out.println("\t\t\tDead==" + animalArray[x].animalName);
					 		
					 	}
					 	if(animalArray[y].strength<=0)
					 	{
					 		animalArray[y].isDead=true;
					 		System.out.println("\t\t\tDead==" + animalArray[y].animalName);
					 	
					 	}
					} 	
					else
					{
					 	System.out.println(" winner==" + animalArray[y].animalName);
					 	animalArray[y].strength=(animalArray[y].strength-1);
						System.out.println("looser==" + animalArray[x].animalName);
						animalArray[x].strength=(animalArray[x].strength-2);
						 	if(animalArray[y].strength<=0)
					 	{
					 		animalArray[y].isDead=true;
					 		System.out.println("\t\t\tDead==" + animalArray[y].animalName);
					 	}
					 	if(animalArray[x].strength<=0)
					 	{
					 		animalArray[x].isDead=true;
					 		System.out.println("\t\t\tDead===" + animalArray[x].animalName);
					 	}					
					}									
				}
   			}	        	
		}
	}
	System.out.println("\n");
	for(j=0;j<count;j++)
	{
		System.out.println(animalArray[j].animalName+" is dead= "+animalArray[j].isDead);
	}	
    }	

}





	
			
		
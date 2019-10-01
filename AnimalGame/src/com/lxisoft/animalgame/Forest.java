package com.lxisoft.animalgame;
import java.util.Scanner;
import com.lxisoft.animalgame.Animal;
public class Forest
{
	Animal[] animalArray;		
	public void animalMeet()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\n\t\t  ------SHANTHI VANAM --------");
		System.out.println("enter the number of tiger");			
	 	int t=sc.nextInt();	
	 	System.out.println("enter the number of lion");			
	 	int l=sc.nextInt();	 
	 	System.out.println("enter the number of rabbit");			
	 	int r=sc.nextInt();
	 	System.out.println("enter the number of Deer");			
	 	int d=sc.nextInt();
	 	int total=t+l+r+d;
	 	animalArray=new Animal[total];	 	
	 	animalDetails(t,l,r,d,total);				
	}	
	public void meetFight()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n-------Animals meet and fight begins---------\n");
		int total,x,y,co=1;
		int[] arr=new int[animalArray.length];
		total=animalArray.length;		
		for(int i=0;true;i++)
		{
			x=(int) (Math.random()*animalArray.length);
			y=(int) (Math.random()*animalArray.length);
			co=winner();
			if(co==1)
			{
				break;
			}
			if(animalArray[x] instanceof Carnivorous)
			{
				arr=animalRange(x,y);				
				if(animalArray[y] instanceof Herbivorous)
					setWinner(x,y,arr);
				else
					winnerCarnivorous(x,y,arr);	
			}
		}
	}	
	public void animalDetails(int t,int l,int r,int d,int total)
	{
		Scanner sc=new Scanner(System.in);				
	 	for(int i=0;i<t;i++)
	 	{
	 		Tiger tiger=new Tiger();	 		
	 		System.out.println("name of the tiger");
	  		tiger.animalName=sc.next();
	  		System.out.println("strength of tiger");
	  		tiger.strength=sc.nextInt();
	  		tiger.isDead=false;
	  		tiger.range=50;
	  		tiger.hunger=Hunger.LOW;
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
		  	lion.range=40;
		  	lion.hunger=Hunger.LOW;
		  	animalArray[i]=lion;		
		}		
	 	for(int i=t+l;i<t+l+d;i++)
	 	{
	 		Deer deer=new Deer();
			System.out.println("name of the deer");			
	  		deer.animalName=sc.next();
			System.out.println("strength of deer");
			deer.strength=sc.nextInt();
			deer.isDead=false;
			deer.range=30;
			deer.hunger=Hunger.LOW;
			animalArray[i]=deer;	
		}	
		for(int i=t+l+d;i<total;i++)
	 	{
	 		Rabbit rabbit=new Rabbit();
			System.out.println("name of the rabbit");			
	  		rabbit.animalName=sc.next();
			System.out.println("strength of rabbit");
			rabbit.strength=sc.nextInt();
			rabbit.isDead=false;
			rabbit.range=20;
			rabbit.hunger=Hunger.LOW;
			animalArray[i]=rabbit;	 				
		}
		randomLocation();	
		animalLuck();
		meetFight();
							
	}	
	public void randomLocation()
	{	
	 	int i;
	  	for(i=0;i<animalArray.length;i++)
	  	{
	  		animalArray[i].xAxis=(int) (Math.random()*10+1);
	  		animalArray[i].yAxis=(int) (Math.random()*10+1);	  		
	  	}
	}		
	public int winner()
	{
		int win=0,a,count=0,p=0;
		a=animalArray.length;	
		for(int j=0;j<a;j++)
		{
			if((animalArray[j] instanceof Carnivorous)&&(animalArray[j].isDead==false))
			{

				win=j;
				count++;
			}
		}
		if(count<=1)
		{
			System.out.println("WINNER=="+animalArray[win].animalName);
			p=1;
		}
		return p;
	}
	public void setWinner(int x,int y,int[] arr)
	{			

		int count=arr.length;
		if((animalArray[x].isDead==false)&&(animalArray[y].isDead==false)&(x!=y))
		{
			if((animalArray[x] instanceof Herbivorous)&(animalArray[y] instanceof Herbivorous))
			{
				System.out.println("\t\t\t"+animalArray[x].animalName +" Vs "+animalArray[y].animalName+"\n\t\t\t NO FIGHT");
			}
			if((animalArray[x] instanceof Herbivorous)&(animalArray[y] instanceof Carnivorous))
			{
				System.out.println(animalArray[x].animalName +" Vs "+animalArray[y].animalName);
			}				
			if(count==1)
			{
				((Herbivorous)animalArray[x]).escape(animalArray[arr[0]]);
				animalArray[arr[0]]=hungerLevel(animalArray[arr[0]]);
			}
			else if(count==2)
			{
				((Herbivorous)animalArray[x]).escape(animalArray[arr[0]],animalArray[arr[1]]);		
				for(int i=0;i<2;i++)
				{	
					animalArray[arr[i]]=hungerLevel(animalArray[arr[i]]);
				}
			}	
			else if(count==3)
			{
				((Herbivorous)animalArray[x]).escape(animalArray[arr[0]],animalArray[arr[1]],animalArray[arr[2]]);				 
				 for(int i=0;i<3;i++)
				{		
					animalArray[arr[i]]=hungerLevel(animalArray[arr[i]]);
				}
			}
			else
			{
				System.out.println("low hunger level");
			}	
		}
	}
	public void winnerCarnivorous(int x,int y,int[] arr)
	{		
		Animal temp;
		if((animalArray[x].isDead==false)&&(animalArray[y].isDead==false)&(x!=y))
		{
			if((animalArray[x] instanceof Carnivorous)&&(animalArray[y] instanceof Carnivorous))
			{
				int range=0;
				range=animalLocation(x,y);
				if(range<50)
				{
					System.out.println("\t\t"+animalArray[x].animalName +" Vs "+animalArray[y].animalName);
					System.out.println("Distance "+ animalArray[x].animalName +" and "+animalArray[y].animalName+" is ="+range);				   
					temp=((Carnivorous) animalArray[x]).fight(animalArray[y]);	  
					if(temp==animalArray[x])
					{	
						System.out.println("\t\twinner=="+ animalArray[x].animalName+"  (strength="+(animalArray[x].strength-=1)+")");
						System.out.println("\t\tlooser==" + animalArray[y].animalName+"  (strength="+(animalArray[y].strength-=2)+")");
						if(animalArray[y].strength<=0)
						{
							animalArray[y].isDead=true;
							System.out.println("\t\t\tDead==" + animalArray[y].animalName);
						}
					}
					if(temp==animalArray[y])
					{
						System.out.println("\t\twinner=="+ animalArray[y].animalName+"  (strength="+(animalArray[y].strength-=1)+")");
						System.out.println("\t\tlooser==" + animalArray[x].animalName+"  (strength="+(animalArray[x].strength-=2)+")");
						if(animalArray[x].strength<=0)
						{
							animalArray[x].isDead=true;
							System.out.println("\t\t\tDead==" + animalArray[x].animalName);					 	
						}
					}
				}
			}				
		}
	}	
	public void animalLuck()
	{
	 	int a=animalArray.length,i;
	 	for( i=0;i<a;i++)
	 	{
	 		animalArray[i].luck=(int) (Math.random()*100);
	 	}
	}
	public int animalLocation(int x,int y)
	{		
	 	int distance=(int) (Math.sqrt((animalArray[y].xAxis-animalArray[x].xAxis)*(animalArray[y].xAxis-animalArray[x].xAxis)+(animalArray[y].yAxis-animalArray[x].yAxis)*(animalArray[y].yAxis-animalArray[x].yAxis)));
	 	return distance;
	}	
	public int[] animalRange(int x,int y)
	{
		int count=0;		
		int[] arr=new int[animalArray.length];
		int distance=animalLocation(x,y);
		System.out.println("\tnearest animals==========="+animalArray[y].animalName);		
		for(int i=0;i<animalArray.length;i++)
		{
			if(animalArray[i] instanceof Carnivorous)
			{
				if(animalArray[i].range>distance)
				{
					arr[count]=i;
					count++;
				}   
			}
		}
		return arr;
	}
	public Animal hungerLevel(Animal animal) 
 	{     
 		System.out.println("hunger level");   
   		switch(animal.hunger)
    	{
        case LOWEST:
        animal.hunger=Hunger.LOW;
        System.out.println("hunger level"+animal.hunger);
        break;
        case MEDIUM:
        animal.hunger=Hunger.MEDIUM;
        System.out.println("hunger level"+animal.hunger);
        break;     
   		default:   		
   		System.out.println("low hunger level"); 
   		}      
        return animal;
   }
    public Animal animalHungerFight(Animal animal)
    {
    		switch(animal.hunger)
     	{
         case LOW:
         animal.hunger=Hunger.MEDIUM;
         System.out.println("medium hunger level"+animal.hunger);
         break;
         case MEDIUM:
         animal.hunger=Hunger.LOW;
         System.out.println("lowest hunger level"+animal.hunger);
         break;                
    		}
    		return animal;
    }  
}


	 	 	  




















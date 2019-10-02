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
    int[] position;
    int range;
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
			tiger.locationX=(int)(Math.random()*10);
			tiger.locationY=(int)(Math.random()*10);
			tiger.range=20;
			tiger.sight=18;
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
			lion.locationX=(int)(Math.random()*10);
			lion.locationY=(int)(Math.random()*10);
			lion.range=17;
			lion.sight=15;
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
			rabbit.locationX=(int)(Math.random()*10);
			rabbit.locationY=(int)(Math.random()*10);
			rabbit.range=13;
			rabbit.sight=19;
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
			deer.locationX=(int)(Math.random()*10);
			deer.locationY=(int)(Math.random()*10);
			deer.range=10;
			deer.sight=17;
			deer.isDead=false;
			animalArr[i]=deer;
		}
		deer.run();
        deer.eat();
        meetFight(tot,animalArr);
    }
	public void meetFight(int tot,Animal animalArr[])
	{
		animalArr=location(animalArr);
		int count,c,w=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("\n---ANIMAL DETAILS---");
		System.out.println("\nAnimal Meet & Fight Starts\n-----------------------------");
        for(int i=0;true;i++)
		{
			c=0;
			int m=(int)(Math.random()*animalArr.length);
			int n=(int)(Math.random()*animalArr.length);
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
			if((animalArr[m].isDead==false)&(animalArr[n].isDead==false)&(m!=n))
			{
				escapeHerbivore(animalArr,m,n);
				carnivoreWinner(animalArr,m,n);
			}
		}
	}
	public void escapeHerbivore(Animal animalArr[],int m,int n)
	{
		if((animalArr[m]instanceof Herbivore)&(animalArr[n] instanceof Carnivore))
		{
			int[] nearbyAnimal=new int[animalArr.length];
			nearbyAnimal=isSight(m,n,animalArr);
			System.out.println(" lennghth of count=="+nearbyAnimal.length);	
			if(nearbyAnimal.length==1)
			{
				((Herbivore)(animalArr[m])).escape(animalArr[nearbyAnimal[0]]);	
			}
			if(nearbyAnimal.length==2)
			{
				((Herbivore)(animalArr[m])).escape(animalArr[nearbyAnimal[0]],animalArr[nearbyAnimal[1]]);	
			}
			if(nearbyAnimal.length==3)
			{
				((Herbivore)(animalArr[m])).escape(animalArr[nearbyAnimal[0]],animalArr[nearbyAnimal[1]],animalArr[nearbyAnimal[2]]);	
			}
			if(nearbyAnimal.length==4)
			{
				((Herbivore)(animalArr[m])).escape(animalArr[nearbyAnimal[0]],animalArr[nearbyAnimal[1]],animalArr[nearbyAnimal[2]],animalArr[nearbyAnimal[3]]);	
			}
		}
    }
    public void carnivoreWinner(Animal animalArr[],int m,int n)
    {
		if((animalArr[m].isDead==false)&(animalArr[n].isDead==false)&(m!=n))
		{
			if((animalArr[m] instanceof Carnivore)&(animalArr[n] instanceof Carnivore))
			{
				System.out.println("\n"+animalArr[m].animalName+"  VS  "+animalArr[n].animalName);	
				((Carnivore)(animalArr[m])).fight(animalArr[n]);
			}
		}
	}
    public boolean isRange(int locationX,int locationY,int range,int[] position)
    {
    	boolean temp=true;
    	int distance=(int)(Math.sqrt(((position[0]-locationX)*(position[0]-locationX))+((position[1]-locationY)*(position[1]-locationY))));
		System.out.println("Distance= "+distance);
     	if(range<distance)
     	{
        	temp=false;
     	}
     	 return temp;
 	}
 	public Animal[] location(Animal[] animalArr)
 	{
 		boolean returns=false;
    	int[] position=new int[2];
   		for(int i=0;i<animalArr.length;i++)
   		{
   			System.out.println(animalArr[i].animalName);
   			System.out.println("------------");
    		if(animalArr[i] instanceof Herbivore)
    		{
    			do
    			{
    				position=((Herbivore)(animalArr[i])).graze();
    				returns=isRange(animalArr[i].locationX,animalArr[i].locationY,animalArr[i].range,position);
    			}while(returns==true);
    			System.out.println("Position1= "+position[0]+"\nPosition2= "+position[1]);
    	    }
    	    else
    		{
    			do
    			{
    				position=((Carnivore)(animalArr[i])).roam();
    				returns=isRange(animalArr[i].locationX,animalArr[i].locationY,animalArr[i].range,position);
    		    }while(returns==true);
    		    System.out.println("Position1= "+position[0]+"\nPosition2= "+position[1]);
    		}
         	animalArr[i].locationX=position[0];
         	animalArr[i].locationY=position[1];
 	    }
 	    return animalArr; 
    }

    public int[] isSight(int m,int n,Animal[] animals)
    {		
    	int count=0;
    	boolean temp=true;
    	int[] near=new int[animals.length];;
    	int distance=(int)(Math.sqrt(((animals[m].locationX-animals[n].locationX)*(animals[m].locationX-animals[n].locationX))+((animals[n].locationX-animals[m].locationY)*(animals[n].locationX-animals[m].locationY))));
		System.out.println("Distance= "+distance);
		for(int i=0;i<animals.length;i++)
     	{
	    	if(animals[m].sight>distance)
	     	{
	        	near[count]=i;
				count++;
	     	}
	    }    		
		int[] nearAnimal =new int[count];
		for(int i=0;i<count;i++)
		{
			nearAnimal[i]=near[i];
		}
        return nearAnimal;  
    }
   
}
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
    int[] position=new int[2];
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
			int[] location=new int[2];

			tiger =new Tiger();
			System.out.println("Enter Tiger name:");
			tiger.animalName=sc.next();
			System.out.println("Enter Tiger strength:");
			tiger.strength=sc.nextInt();
			System.out.println("Enter Tiger locationX:");
			tiger.locationX=sc.nextInt();
			System.out.println("Enter Tiger locationY:");
			tiger.locationY=sc.nextInt();
			System.out.println("Enter Tiger range:");
			tiger.range=sc.nextInt();
			tiger.isDead=false;
			animalArr[i]=tiger;
		}
		tiger.run();
		tiger.eat();
		// position=((Carnivore)(tiger)).roam();
		// System.out.println("1st position= "+position[0]);
		// System.out.println("2nd position= "+position[1]+"\n");
		//int result=distance(tiger.locationX,tiger.locationY,position);
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
			System.out.println("Enter Lion locationX:");
			lion.locationX=sc.nextInt();
			System.out.println("Enter Lion locationY:");
			lion.locationY=sc.nextInt();
			System.out.println("Enter Lion range:");
			lion.range=sc.nextInt();
			lion.isDead=false;
			animalArr[i]=lion;
		}
		lion.run();
		lion.eat();
		// position=((Carnivore)(lion)).roam();
		// System.out.println("1st position= "+position[0]);
		// System.out.println("2nd position= "+position[1]+"\n");
		// int result=distance(lion.locationX,lion.locationY,position);
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
			System.out.println("Enter Rabbit locationX:");
			rabbit.locationX=sc.nextInt();
			System.out.println("Enter Rabbit locationY:");
			rabbit.locationY=sc.nextInt();
			System.out.println("Enter Rabbit range:");
			rabbit.range=sc.nextInt();
			rabbit.isDead=false;
			animalArr[i]=rabbit;
		}
		rabbit.run();
		rabbit.eat();
		// position=((Herbivore)(rabbit)).graze();
		// System.out.println("1st position= "+position[0]);
		// System.out.println("2nd position= "+position[1]+"\n");
		//int result=distance(rabbit.locationX,rabbit.locationY,position);
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
			System.out.println("Enter Deer locationX:");
			deer.locationX=sc.nextInt();
			System.out.println("Enter Deer locationY:");
			deer.locationY=sc.nextInt();
			System.out.println("Enter Deer range:");
			deer.range=sc.nextInt();
			deer.isDead=false;
			animalArr[i]=deer;
		}
		deer.run();
        deer.eat();
        meetFight(tot,animalArr);
  //       position=((Herbivore)(deer)).graze();
		// System.out.println("1st position= "+position[0]);
		// System.out.println("2nd position= "+position[1]+"\n");
		// int result=distance(deer.locationX,deer.locationY,position);
		
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
    	//int[] newlocation=location(animalArr);
    	int m=(int)(Math.random()*animalArr.length);
		int n=(int)(Math.random()*animalArr.length);
		//boolean isRange;
		if((animalArr[m].isDead==false)&(animalArr[n].isDead==false)&(m!=n))
		{
			if((animalArr[m] instanceof Carnivore)&(animalArr[n] instanceof Carnivore))
			{
				//isRange=isRange(result,range);
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
   			System.out.println(animalArr[i].animalName+" name");
    		if(animalArr[i] instanceof Herbivore)
    		{
    			do
    			{
    				position=((Herbivore)(animalArr[i])).graze();
    				returns=isRange(animalArr[i].locationX,animalArr[i].locationY,animalArr[i].range,position);
    			}while(returns==true);
    			System.out.println(position[0]+"  position "+position[1]);
    	    }
    	    else
    		{
    			do
    			{
    			position=((Carnivore)(animalArr[i])).roam();
    			returns=isRange(animalArr[i].locationX,animalArr[i].locationY,animalArr[i].range,position);
    		    }while(returns==true);
    		    System.out.println(position[0]+"  position "+position[1]);
    		}
         	animalArr[i].locationX=position[0];
         	animalArr[i].locationY=position[1];
 	    }
 	    return animalArr; 
    }
}
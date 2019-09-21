package com.lxisoft.animalgame;
import java.util.Scanner;
import com.lxisoft.animalgame.Animal;
public class Forest
{
	Animal animal;
	Animal[] animalArray;
	Animal temp;
	Animal tt;	
	Tiger tiger;
	Lion lion;
	Rabbit rabbit;
	Deer deer;
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
	 	Animal[] animalArray=new Animal[total];	 	
	 	animalDetails(t,l,r,d,total,animalArray);		
	}	
	public void meetFight(Animal animalArray[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n-------Animals meet and fight begins---------\n");
		int total,x,y,co=1,count=4,n=1;
		total=animalArray.length;		
		for(int i=0;true;i++)
		{
			x=(int) (Math.random()*animalArray.length);
			y=(int) (Math.random()*animalArray.length);
			co=winner(animalArray);
			if(co==1)
			{
				break;
			}
			setWinner(animalArray,tt);
			winnerCarnivorous(x,y,n,animalArray,temp);
		}
	}
	public void animalDetails(int t,int l,int r,int d,int total,Animal animalArray[])
	{
		Scanner sc=new Scanner(System.in);
		Tiger tiger;		
	 	for(int i=0;i<t;i++)
	 	{
	 		tiger=new Tiger();	 		
	 		System.out.println("name of the tiger");
	  		tiger.animalName=sc.next();
	  		System.out.println("strength of tiger");
	  		tiger.strength=sc.nextInt();
	  		tiger.eat();
	  		tiger.isDead=false;
	  		animalArray[i]=tiger;
		}
		Lion lion;		
	 	for(int i=t;i<t+l;i++)
	 	{
	 	    lion=new Lion();
		 	System.out.println("name of the lion");		  
	  		lion.animalName=sc.next();
		  	System.out.println("strength of lion");
		  	lion.strength=sc.nextInt();
		  	lion.eat();
		  	lion.isDead=false;
		  	animalArray[i]=lion;		
		}		
		Rabbit rabbit;
	 	for(int i=t+l;i<t+l+r;i++)
	 	{
	 		rabbit=new Rabbit();
			System.out.println("name of the rabbit");			
	  		rabbit.animalName=sc.next();
			System.out.println("strength of rabbit");
			rabbit.strength=sc.nextInt();
			rabbit.eat();
			rabbit.isDead=false;
			animalArray[i]=rabbit;		
		}		
		Deer deer;
		int tot=t+l+d+r;
		for(int i=t+l+d;i<total;i++)
	 	{
	 		deer=new Deer();
			System.out.println("name of the deer");			
	  		deer.animalName=sc.next();
			System.out.println("strength of deer");
			deer.strength=sc.nextInt();
			deer.eat();
			deer.isDead=false;
			animalArray[i]=deer;		
		}	
		meetFight(animalArray);				
	}			
	public int winner(Animal animalArray[])
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
	public void setWinner(Animal animalArray[],Animal tt)
	{
		int x=(int) (Math.random()*animalArray.length);
		int y=(int) (Math.random()*animalArray.length);
		if((animalArray[x].isDead==false)&&(animalArray[y].isDead==false)&(x!=y))
		{
		if((animalArray[x] instanceof Herbivorous)&(animalArray[y] instanceof Herbivorous))
		{
			System.out.println("\t\t\t"+animalArray[x].animalName +" Vs "+animalArray[y].animalName+"\n\t\t\t NO FIGHT");
		}
		if((animalArray[x] instanceof Herbivorous)&(animalArray[y] instanceof Carnivorous))
		{
			System.out.println(animalArray[x].animalName +" Vs "+animalArray[y].animalName);
			tt=((Herbivorous)animalArray[x]).escape(animalArray[y]);
			if(tt==animalArray[x])
			{
				System.out.println("escape=="+ animalArray[x].animalName);	
 			}	
 			if(tt==animalArray[y])
 			{
 				System.out.println(animalArray[y].animalName+" eat "+animalArray[x].animalName);
 				animalArray[x].isDead=true;
				System.out.println(" winner---"+animalArray[y].animalName+"(strength=="+animalArray[y].strength+")");	
 			}				
		}
	}
	}
	public void winnerCarnivorous(int x,int y,int n,Animal animalArray[],Animal temp)
	{		
		if((animalArray[x] instanceof Carnivorous)&&(animalArray[y] instanceof Carnivorous))
		{
			if((animalArray[x].isDead==false)&&(animalArray[y].isDead==false)&(x!=y))
			{
				System.out.println("\t\t"+animalArray[x].animalName +" Vs "+animalArray[y].animalName);				   
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



	



	





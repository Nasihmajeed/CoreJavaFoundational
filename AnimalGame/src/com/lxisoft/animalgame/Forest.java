package com.lxisoft.animalgame;
import java.util.Scanner;
import com.lxisoft.animalgame.Animal;
public class Forest
{
	Animal animal;
	Animal[] animalArray;
	Animal temp;	
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
	 	int total=(t+l+r+d);
	 	Animal[] animalArray=new Animal[total];
	 	animalDetails(t,l,r,d,animalArray);
		meetFight(animalArray);
	}	

	public void meetFight(Animal animalArray[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n");
		System.out.println("-------Animals meet and fight begins---------");
		System.out.println("\n");	
		int total,x,y,co,count=0,n=1;
		total=animalArray.length;		
		for(int i=0;true;i++)
		{
			x=(int) (Math.random()*count);
			y=(int) (Math.random()*count);
			co=winner(animalArray);
			if(co==1)
			{
				break;
			}
			if((animalArray[x].isDead==false)&&(animalArray[y].isDead==false))
			{
				if(x!=y)
				{
					setWinner(animalArray,x,y);
				    winnerCarnivorous(x,y,n,animalArray,temp);
				}
			}
		}
	}

	public void animalDetails(int t,int l,int r,int d,Animal animalArray[])
	{
		Scanner sc=new Scanner(System.in);
		int a=1;
		tiger.eat();
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
		lion.eat();		
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
		rabbit.eat();
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
		deer.eat();
		int total=t+l+d+r;
		for(int i=t+l+d;i<total;i++)
	 	{
	 		Deer deer=new Deer();
			System.out.println("name of the deer");			
	  		deer.animalName=sc.next();
			System.out.println("strength of deer");
			deer.strength=sc.nextInt();
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
			if((animalArray[j] instanceof Carnivorous)&(animalArray[j].isDead==false))
			{
				win=j;
				count++;
			}
		}
		if(count<=1)
		{
			System.out.println("WINNER=="+animalArray[win].animalName);
			

		}
		return p;
	}
	
	public void setWinner(Animal animalArray[],int x,int y)
	{
		if((animalArray[x] instanceof Herbivorous)&(animalArray[y] instanceof Herbivorous))
		{
			System.out.println(animalArray[x].animalName +" Vs "+animalArray[y].animalName);
		}
		if(animalArray[x] instanceof Carnivorous && animalArray[y] instanceof Herbivorous)
		{
			System.out.println(animalArray[x].animalName +" Vs "+animalArray[y].animalName);
			System.out.println(" "+animalArray[y].animalName+"----Dead");
			animalArray[x].strength=(animalArray[x].strength-1);
			System.out.println("\n "+animalArray[x].animalName+" eat "+animalArray[y].animalName);
			System.out.println(" winner---"+animalArray[x].animalName+"(strength=="+animalArray[x].strength+")");
		}
	}

	public void winnerCarnivorous(int x,int y,int n,Animal animalArray[],Animal temp)
	{
		if((animalArray[x] instanceof Carnivorous)&&(animalArray[y] instanceof Carnivorous))
		{
		System.out.println(animalArray[x].animalName +" Vs "+animalArray[y].animalName);				   
		temp=((Carnivorous) animalArray[x]).fight(animalArray[y]);	            
		if(temp==animalArray[x])
		{	
			System.out.println(" winner==" + animalArray[x].animalName);
			animalArray[x].strength=(animalArray[x].strength-1);
			System.out.println("looser==" + animalArray[y].animalName);
			animalArray[y].strength=(animalArray[y].strength-2);

			if(animalArray[y].strength<=0)
			{
				animalArray[y].isDead=true;
				System.out.println("\t\t\tDead==" + animalArray[x].animalName);
			}
			if(temp==animalArray[y])
			{
				System.out.println(" winner==" + animalArray[y].animalName);
				animalArray[y].strength=(animalArray[y].strength-1);
				System.out.println("looser==" + animalArray[x].animalName);
				animalArray[x].strength=(animalArray[x].strength-2);
			}
			if(animalArray[y].strength<=0)
			{
				animalArray[y].isDead=true;
				System.out.println("\t\t\tDead==" + animalArray[y].animalName);					 	
			}
		} 	
		n++;
		}
	}			
}



	



	





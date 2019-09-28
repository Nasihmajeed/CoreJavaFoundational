package com.lxisoft.animalgame;
import java.util.Scanner;
import com.lxisoft.animalgame.*;
public class Forest 
{
	String name;
	Animal animals;
	Animal[] animalArr;

	public void meetAnimal()
	{
		Scanner s=new Scanner(System.in);
		int a=0;
		System.out.println("\nanimal details\n-----------------");
		String nameAnimal[]={"tiger","lion","bear","rabbit"};
		int[] number;
		number=new int[4];
		for(int i=0;i<4;i++)
		{
			System.out.println("enter number of "+nameAnimal[i]);
			number[i]=s.nextInt();
			a=a+number[i];
		}
		animalArr=new Animal[a];
		setTigerDetails(number);
		setLionDetails(number);
		setBearDetails(number);
		setRabbitDetails(number);
		animalLuck();
		fight();
	}
	public void fight()
	{
		int a,count,win=0,w=0,i,n=1,r=1;
		a=animalArr.length;
		System.out.println("\t\tjungle\n\t\t-------\n\t\tanimals meet and fight begins\n\t\t------------------------------");
		for(i=0;true;i++)
		{
			count=0;
			int x=(int) (Math.random()*a);
			int y=(int) (Math.random()*a);
			for(int j=0;j<a;j++)
			{
				if((animalArr[j] instanceof Carnivores)|(animalArr[x] instanceof Carnivores))
				{
					if((animalArr[j].isDead==false))
					{
						win=j;
						count++;
					}
				}
			}
			if(count<=1)
			{
				System.out.println("WINNER=="+animalArr[win].animalName);
				break;
			}
			if((animalArr[x] instanceof Carnivores)&(animalArr[x].isDead==false)&(animalArr[y].isDead==false)&(x!=y))
			{
				n=winnerCarnivores(n,x,y);
				setWinner(r,x,y);	  
			}  
		}
	}
	public void setTigerDetails(int number[])
	{
		Scanner s=new Scanner(System.in);
		int t=1;
		System.out.println("\ntiger details");
		System.out.println("________________");
		Animal aTiger=new Tiger();
		aTiger.run();
		aTiger.eat();
		for(int i=0;i<number[0];i++)
		{
			aTiger=new Tiger();
			System.out.println("enter name of tiger-"+t);
			aTiger.animalName=s.next();
			System.out.println("enter strength level of tiger-"+t);
			aTiger.strength=s.nextInt();
			aTiger.xAxis=(int) (Math.random()*10);
			aTiger.yAxis=(int) (Math.random()*10);
			aTiger.sight=15;
			aTiger.range=6;
			aTiger.isDead=false;
			animalArr[i]=aTiger;
			t++;
		}
	}
	public void setLionDetails(int number[])
	{
		Scanner s=new Scanner(System.in);
		int l=1;
		System.out.println("\nlion details");
		System.out.println("________________");
		Animal aLion=new Lion();
		aLion.run();
		aLion.eat();
		for(int j=number[0];j<(number[0]+number[1]);j++)
		{
			aLion=new Lion();
			System.out.println("enter name of lion-"+l);
			aLion.animalName=s.next();
			System.out.println("enter strength level  of lion-"+l);
			aLion.strength=s.nextInt();
			aLion.xAxis=(int) (Math.random()*10);
			aLion.yAxis=(int) (Math.random()*10);
			aLion.sight=12;
			aLion.range=5;
			aLion.isDead=false;
			animalArr[j]=aLion;
			l++;
		}
	}
	public void setBearDetails(int number[])
	{
		Scanner s=new Scanner(System.in);
		int b=1;
		System.out.println("\nbear details");
		System.out.println("________________");
		Animal aBear=new Bear();
		aBear.run();
		aBear.eat();
		for(int k=(number[0]+number[1]);k<(number[0]+number[1]+number[2]);k++)
		{
		    aBear=new Bear();	
			System.out.println("enter name of bear-"+b);
			aBear.animalName=s.next();
			System.out.println("enter strength level of bear-"+b);
			aBear.strength=s.nextInt();
			aBear.xAxis=(int) (Math.random()*10);
			aBear.yAxis=(int) (Math.random()*10);
			aBear.sight=8;
			aBear.range=4;
			aBear.isDead=false;
			animalArr[k]=aBear;
			b++;
		}
	}
	public void setRabbitDetails(int number[])
	{
		Scanner s=new Scanner(System.in);
		int r=1;
		System.out.println("\nrabbit details");
		System.out.println("________________");
		Animal aRabbit=new Rabbit();
		aRabbit.run();
		aRabbit.eat();
		for(int g=(number[0]+number[1]+number[2]);g<(number[0]+number[1]+number[2]+number[3]);g++)
		{
			aRabbit=new Rabbit();
			System.out.println("enter name of rabbit-"+r);
			aRabbit.animalName=s.next();
			System.out.println("enter strength level of rabbit-"+r);
			aRabbit.strength=s.nextInt();
			aRabbit.xAxis=(int) (Math.random()*10);
			aRabbit.yAxis=(int) (Math.random()*10);
			aRabbit.sight=6;
			aRabbit.range=3;
			aRabbit.isDead=false;
			animalArr[g]=aRabbit;
			r++;
		}
	}
	public void setWinner(int r,int x,int y)
	{
		int a=animalArr.length;
		Animal herb=null;
		if((animalArr[y]) instanceof Herbivores)
		{
			int[] arr=animalInSight(y);
			int e=arr.length;
			if(e==1)
			{
				((HerbivoresAnimal)animalArr[y]).attack(animalArr[arr[0]]);
			}
			else if(e==2)
			{
				((HerbivoresAnimal)animalArr[y]).attack(animalArr[arr[0]],animalArr[arr[1]]);
			}
			else if(e>=3)
			{
				((HerbivoresAnimal)animalArr[y]).attack(animalArr,arr);
			}
			
		}
	}
	public int winnerCarnivores(int n,int x,int y)
	{
		int a=animalArr.length,range=0,location=0;
		Animal temp=null;
		if((animalArr[y]) instanceof Carnivores)
		{
			int[] positionX=((CarnivoresAnimal)(animalArr[x])).roam();
			int[] positionY=((CarnivoresAnimal)(animalArr[y])).roam();
			int z=animalLocation(positionX,positionY);
			if(z<=(animalArr[x].range))
			{
				System.out.println("\n\t\tFight no---"+(n++));
				temp=((CarnivoresAnimal)(animalArr[x])).fight(animalArr[y]);
			}
		}
		return n;
	}
	public void animalLuck()
	{
		for(int i=0;i<animalArr.length;i++)
		{
			animalArr[i].luck=(int) (Math.random()*100);
		}
	}
	public int animalLocation(int positionX[],int positionY[])
	{
		
		int location=(int) (Math.sqrt((positionY[0]-positionX[0])*(positionY[0]-positionX[0])+(positionY[1]-positionX[1])*(positionY[1]-positionX[1])));
		return location;
	}
	public int[] animalInSight(int y)
	{
		int distance=0,count=0;
		int[] arr=new int[animalArr.length];
		int[] axisH=((Herbivores)(animalArr[y])).graze();
		for(int j=0;j<animalArr.length;j++)
		{
			if(animalArr[j] instanceof Carnivores)
			{
				int[] axisC=((CarnivoresAnimal)(animalArr[j])).roam();
				distance=animalLocation(axisC,axisH);
			}
			if(distance<animalArr[y].sight)
			{
			 	arr[count]=j;	
			 	count++;			
			}
		}
		return arr;
	}

}

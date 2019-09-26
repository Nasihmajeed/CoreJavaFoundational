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
		setTigerDetails(number,animalArr);
		setLionDetails(number,animalArr);
		setBearDetails(number,animalArr);
		setRabbitDetails(number,animalArr);
		animalLuck();
		fight(animalArr);
	}
	public void fight(Animal animalArr[])
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
				if((animalArr[j] instanceof Carnivores)&(animalArr[j].isDead==false))
				{
					win=j;
					count++;
				}
			}
			if(count<=1)
			{
				System.out.println("WINNER=="+animalArr[win].animalName);
				break;
			}
			n=winnerCarnivores(animalArr,n,x,y);
			r=setWinner(animalArr,r,x,y);	    
		}
	}
	public void setTigerDetails(int number[],Animal animalArr[])
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
			aTiger.range=6;
			aTiger.isDead=false;
			animalArr[i]=aTiger;
			t++;
		}
	}
	public void setLionDetails(int number[],Animal animalArr[])
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
			aLion.range=5;
			aLion.isDead=false;
			animalArr[j]=aLion;
			l++;
		}
	}
	public void setBearDetails(int number[],Animal animalArr[])
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
			aBear.range=4;
			aBear.isDead=false;
			animalArr[k]=aBear;
			b++;
		}
	}
	public void setRabbitDetails(int number[],Animal animalArr[])
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
			aRabbit.range=3;
			aRabbit.isDead=false;
			animalArr[g]=aRabbit;
			r++;
		}
	}
	public int setWinner(Animal animalArr[],int r,int x,int y)
	{
		int a=animalArr.length;
		// int x=(int) (Math.random()*a);
		// int y=(int) (Math.random()*a);
		Animal animal=null;
		if((animalArr[x].isDead==false)&(animalArr[y].isDead==false)&(x!=y))
		{
			if((animalArr[x] instanceof Herbivores)&(animalArr[y] instanceof Herbivores))
			{
				System.out.println("\n\t\t\t    "+animalArr[x].animalName+"  v  "+animalArr[y].animalName);
				System.out.println("\t\t\t NO FIGHT ");
			}
			if((animalArr[x] instanceof Herbivores)&(animalArr[y] instanceof Carnivores))
			{
				int[] positionX=((Herbivores)(animalArr[x])).graze();
				int[] positionY=((Carnivores)(animalArr[y])).roam();
				animalSight();
				int z=animalLocation(x,y,animalArr,positionX,positionY);
				if((z<=(animalArr[y].range))|(z<=(animalArr[y].sight)))
				{
					System.out.println("\nAttack no---"+(r++));
					System.out.println("\n "+animalArr[x].animalName+"  v  "+animalArr[y].animalName);

					animal=((Herbivores)(animalArr[x])).escape(animalArr[y]);
					if(animal==animalArr[y])
					{
						System.out.println("\n "+animalArr[y].animalName+" eat "+animalArr[x].animalName);
						animalArr[x].isDead=true;
					}
					if(animal==animalArr[x])
					{
						System.out.println(" "+animalArr[x].animalName+"------ESCAPED TO JUNGLE---------");
					}
				}
			}
		}

		return r;
	}
	public int winnerCarnivores(Animal animalArr[],int n,int x,int y)
	{
		int a=animalArr.length,range=0,location=0;
		Animal temp=null;
		if((animalArr[x].isDead==false)&(animalArr[y].isDead==false)&(x!=y))
		{
			if((animalArr[x] instanceof Carnivores)&(animalArr[y] instanceof Carnivores))
			{
				int[] positionX=((Carnivores)(animalArr[x])).roam();
				int[] positionY=((Carnivores)(animalArr[y])).roam();
				int z=animalLocation(x,y,animalArr,positionX,positionY);
				// int z=(int) (Math.random()*10);
				if(z<=((animalArr[x].range)))
				{
					System.out.println("\n\t\tFight no---"+(n++)+"\n\t\t    "+animalArr[x].animalName+"  v  "+animalArr[y].animalName);
					System.out.println("distance between "+ animalArr[x].animalName +" and "+animalArr[y].animalName+" is ="+z);
					temp=((Carnivores)(animalArr[x])).fight(animalArr[y]);
					if(temp==animalArr[x])
					{
						System.out.println("\t\twinner="+animalArr[x].animalName+" strength=="+(animalArr[x].strength-=1)+"\n\t\tlooser="+animalArr[y].animalName+" strength=="+(animalArr[y].strength-=2));
						if(animalArr[y].strength<=0)
						{
							animalArr[y].isDead=true;
							System.out.println("\n"+animalArr[y].animalName+"------------dead");
						}
					}
					if(temp==animalArr[y])
					{
						System.out.println("\t\twinner="+animalArr[y].animalName+" strength=="+(animalArr[y].strength-=1)+"\n\t\tlooser="+animalArr[x].animalName+" strength=="+(animalArr[x].strength-=2));
						if(animalArr[x].strength<=0)
						{
							animalArr[x].isDead=true;
							System.out.println("\n"+animalArr[x].animalName+"-------------dead");
						}
					}
				}
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
	public int animalLocation(int x,int y,Animal animalArr[],int positionX[],int positionY[])
	{
		
		// int location=(int) (Math.sqrt((animalArr[y].xAxis-animalArr[x].xAxis)*(animalArr[y].xAxis-animalArr[x].xAxis)+(animalArr[y].yAxis-animalArr[x].yAxis)*(animalArr[y].yAxis-animalArr[x].yAxis)));
		int location=(int) (Math.sqrt((positionY[0]-positionX[0])*(positionY[0]-positionX[0])+(positionY[1]-positionX[1])*(positionY[1]-positionX[1])));
		return location;
	}
	public void animalSight()
	{
		for(int i=0;i<animalArr.length;i++)
		{
			animalArr[i].sight=(int) (Math.random()*10);
		}
	}

}

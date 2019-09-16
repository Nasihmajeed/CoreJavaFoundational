package com.lxisoft.animalgame;
import java.util.Scanner;
import com.lxisoft.animalgame.*;
public class Forest 
{
	String name;
	Animal animals;
	Animal[] animalArr;
	Animal temp;
	Animal aTiger;
	Animal aLion;
	Animal aBear;
	Animal aRabbit;
	public void meetAnimal()
	{
		Scanner s=new Scanner(System.in);	
		System.out.println("\nanimal details");
		System.out.println("------------------------");
		System.out.println("enter number of tiger");
		int nt=s.nextInt();
		System.out.println("enter number of lion");
		int nl=s.nextInt();
		System.out.println("enter number of bear");
		int nb=s.nextInt();
		System.out.println("enter number of rabbit");
		int nr=s.nextInt();
		int a=nt+nl+nb+nr;
		System.out.println("array ="+a);
		Animal[] animalArr=new Animal[a];

		int t=1;
		System.out.println("\ntiger details");
		System.out.println("________________");
		Animal aTiger=new Tiger();
		aTiger.run();
		aTiger.eat();
		for(int i=0;i<nt;i++)
		{
			aTiger=new Tiger();
			System.out.println("enter name of tiger-"+t);
			aTiger.animalName=s.next();
			System.out.println("enter strength level of tiger-"+t);
			aTiger.strength=s.nextInt();
			aTiger.isDead=false;
			animalArr[i]=aTiger;
			t++;
		}
		int l=1;
		System.out.println("\nlion details");
		System.out.println("________________");
		Animal aLion=new Lion();
		aLion.run();
		aLion.eat();
		for(int j=nt;j<(nt+nl);j++)
		{
			aLion=new Lion();
			System.out.println("enter name of lion-"+l);
			aLion.animalName=s.next();
			System.out.println("enter strength level  of lion-"+l);
			aLion.strength=s.nextInt();
			aLion.isDead=false;
			animalArr[j]=aLion;
			l++;
		}
		int b=1;
		System.out.println("\nbear details");
		System.out.println("________________");
		Animal aBear=new Bear();
		aBear.run();
		aBear.eat();
		for(int k=(nt+nl);k<(nt+nl+nb);k++)
		{
		    aBear=new Bear();	
			System.out.println("enter name of bear-"+b);
			aBear.animalName=s.next();
			System.out.println("enter strength level of bear-"+b);
			aBear.strength=s.nextInt();
			aBear.isDead=false;
			animalArr[k]=aBear;
			b++;
		}
		int r=1;
		System.out.println("\nrabbit details");
		System.out.println("________________");
		Animal aRabbit=new Rabbit();
		aRabbit.run();
		aRabbit.eat();
		for(int g=(nt+nl+nb);g<a;g++)
		{
			aRabbit=new Rabbit();
			System.out.println("enter name of rabbit"+r);
			aRabbit.animalName=s.next();
			System.out.println("enter strength level of rabbit"+r);
			aRabbit.strength=s.nextInt();
			aRabbit.isDead=false;
			animalArr[g]=aRabbit;
			r++;
		}
		for(int i=0;i<a;i++)
		{
			System.out.println("name"+animalArr[i].animalName);
		}
		meetFight(animalArr);
	}
	public void meetFight(Animal animalArr[])
	{
		System.out.println("\t\tjungle");
		int a,n=1,b=0,m=1,count,j,i,win=0;
		a=animalArr.length;
		
		System.out.println("\n\t\tanimals meet and fight begins");
		System.out.println("\t\t------------------------------");
		
		for(i=0;true;i++)
		{
			int x=(int) (Math.random()*a);
			int y=(int) (Math.random()*a);
			count=0;

			for( j=0;j<a;j++)
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

			if((animalArr[x].isDead==false)&(animalArr[y].isDead==false))
			{
				if(x!=y)
				{
					if((animalArr[x] instanceof Carnivores)&(animalArr[y] instanceof Carnivores))
					{
						System.out.println("\n\t\tFight no---"+n);
						System.out.println("\t\t    "+animalArr[x].animalName+"  v  "+animalArr[y].animalName);
						temp=((Carnivores)(animalArr[x])).fight(animalArr[y]);
						if(temp==animalArr[x])
						{
							animalArr[x].strength=(animalArr[x].strength-1);
							System.out.println("\t\twinner="+animalArr[x].animalName+" strength=="+animalArr[x].strength);
							animalArr[y].strength=(animalArr[y].strength-2);
							System.out.println("\t\tlooser="+animalArr[y].animalName+" strength=="+animalArr[y].strength);
							if(animalArr[y].strength<=0)
							{
								animalArr[y].isDead=true;
								System.out.println("\n"+animalArr[y].animalName+"--------dead");
							}
						}
						if(temp==animalArr[y])
						{
							animalArr[y].strength=(animalArr[y].strength-1);
							System.out.println("\t\twinner="+animalArr[y].animalName+" strength=="+animalArr[y].strength);
							animalArr[x].strength=(animalArr[x].strength-2);
							System.out.println("\t\tlooser="+animalArr[x].animalName+" strength=="+animalArr[x].strength);
							if(animalArr[x].strength<=0)
							{
								animalArr[x].isDead=true;
								System.out.println("\n"+animalArr[x].animalName+"-------------dead");
							}
						}
						n++;
					}
				}
						

			}
			
		}
	
	}
}
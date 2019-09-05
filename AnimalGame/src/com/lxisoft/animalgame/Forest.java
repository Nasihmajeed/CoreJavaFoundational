package com.lxisoft.animalgame;
import java.util.Scanner;
import com.lxisoft.animalgame.Animal;
public class Forest
{
	String name;
	Animal animals;
	Tiger tiger;
	Lion lion;
	Bear bear;
	Rabbit rabbit;
	public void meetAnimal()
	{
		Scanner s=new Scanner(System.in);	
		animals=new Animal();
		System.out.println("\n animal details");
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
		for(int i=0;i<nt;i++)
		{
			Animal aTiger=new Tiger();
			System.out.println("enter name of tiger");
			aTiger.animalName=s.next();
			System.out.println("enter strength level of tiger");
			aTiger.strength=s.nextInt();
			aTiger.isDead=false;
			animalArr[i]=aTiger;
		}
		for(int j=nt;j<(nt+nl);j++)
		{
			Animal aLion=new Lion();
			System.out.println("enter name of lion");
			aLion.animalName=s.next();
			System.out.println("enter strength level of lion");
			aLion.strength=s.nextInt();
			aLion.isDead=false;
			animalArr[j]=aLion;
		}
		for(int k=(nt+nl);k<(nt+nl+nb);k++)
		{
			Animal aBear=new Bear();
			System.out.println("enter name of bear");
			aBear.animalName=s.next();
			System.out.println("enter strength level of bear");
			aBear.strength=s.nextInt();
			aBear.isDead=false;
			animalArr[k]=aBear;
		}
		for(int g=(nt+nl+nb);g<a;g++)
		{
			Animal aRabbit=new Rabbit();
			System.out.println("enter name of rabbit");
			aRabbit.animalName=s.next();
			System.out.println("enter strength level of rabbit");
			aRabbit.strength=s.nextInt();
			aRabbit.isDead=false;
			animalArr[g]=aRabbit;
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
		Animal temp=new Animal();
		System.out.println("\n\t\tanimals meet and fight begins");
		System.out.println("\t\t------------------------------");
		
		for(i=0;true;i++)
		{
			int x=(int) (Math.random()*a);
			int y=(int) (Math.random()*a);
			count=0;
			for( j=0;j<a;j++)
			{
				if(animalArr[j].isDead==false)
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
					
					System.out.println("\n\t\tFight no---"+n);
					System.out.println("\t\t    "+animalArr[x].animalName+"  v  "+animalArr[y].animalName);
					temp=animalArr[x].fight(animalArr[y]);
					
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
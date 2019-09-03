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
		int i;		
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
		Animal[] animalArr=new Animal[a];
		for(i=0;i<nt;i++)
		{
			Tiger tiger=new Tiger();
			System.out.println("enter name of tiger");
			tiger.animalName=s.next();
			System.out.println("enter strength level of tiger");
			tiger.strength=s.nextInt();
			animalArr[i]=tiger;
		}
		for(i=nt;i<(nt+nl);i++)
		{
			Lion lion=new Lion();
			System.out.println("enter name of lion");
			lion.animalName=s.next();
			System.out.println("enter strength level of lion");
			lion.strength=s.nextInt();
			animalArr[i]=lion;
		}
		for(i=(nt+nl);i<(nt+nl+nb);i++)
		{
			Bear bear=new Bear();
			System.out.println("enter name of bear");
			bear.animalName=s.next();
			System.out.println("enter strength level of bear");
			bear.strength=s.nextInt();
			animalArr[i]=bear;
		}
		for(i=(nt+nl+nb);i<a;i++)
		{
			Rabbit rabbit=new Rabbit();
			System.out.println("enter name of rabbit");
			rabbit.animalName=s.next();
			System.out.println("enter strength level of rabbit");
			rabbit.strength=s.nextInt();
			animalArr[i]=rabbit;
		}
		meetFight(animalArr);
	}
	public void meetFight(Animal animalArr[])
	{
		System.out.println("jungle");
		
		int a,n=1,b=0;
		a=animalArr.length;
		System.out.println("\n\t\tanimals meet and fight begins");
		System.out.println("\t\t------------------------------");
		int z=(int) (Math.random()*8);
		System.out.println("\n\t\tnumber of fight=="+z);

		for(int i=0;i<z;i++)
		{
			
			int x=(int) (Math.random()*4);
			int y=(int) (Math.random()*4);
		
			if((animalArr[x].isDead==false)&(animalArr[y].isDead==false))
			{
				if(x!=y)
				{
					System.out.println("\n\t\tFight no---"+n);
					System.out.println("\t\t"+animalArr[x].animalName+"  v  "+animalArr[y].animalName);
					if(animalArr[x].strength<animalArr[y].strength)
					{
						
					 	animalArr[y].strength=(animalArr[y].strength-1);
						System.out.println("\t\twinner="+animalArr[y].animalName+" strength=="+animalArr[y].strength);
						animalArr[x].strength=(animalArr[x].strength-2);
						System.out.println("\t\t"+animalArr[x].animalName+"--looser strength=="+animalArr[x].strength);
						if(animalArr[x].strength<=0)
						{
							animalArr[x].isDead=true;
							System.out.println("\n"+animalArr[x].animalName+"dead");
						}
						if(animalArr[y].strength<=0)
						{
							animalArr[y].isDead=true;
							System.out.println("\n"+animalArr[y].animalName+"dead");
						}
					}

					else
					{
						animalArr[x].strength=(animalArr[x].strength-1);
						System.out.println("\t\twinner="+animalArr[x].animalName+" strength=="+animalArr[x].strength);
						animalArr[y].strength=(animalArr[y].strength-2);
						System.out.println("\t\t"+animalArr[y].animalName+"--looser strength=="+animalArr[y].strength);
						if(animalArr[y].strength==0)
						{
							animalArr[y].isDead=true;
							System.out.println("\n"+animalArr[y].animalName+"****dead");
						}
						if(animalArr[x].strength==0)
						{
							animalArr[x].isDead=true;
							System.out.println("\n"+animalArr[x].animalName+"****dead");
						}
					}
					n++;
				}
			}

			

		}
		System.out.println("\n\t\tanimal list after fight");
		System.out.println("\t\t----------------------------");
		
		for(int i=0;i<a;i++)
		{
			
			if(animalArr[i].isDead==false)
			{
				System.out.println("\n\t\t"+animalArr[i].animalName+" with strength ---"+animalArr[i].strength);
				b=b<(animalArr[i].strength)?(animalArr[i].strength):b;
				
			}
		}
		System.out.println("highest strength-----"+b);
		for(int i=0;i<a;i++)
		{
			if(animalArr[i].strength==b)
			{
				System.out.println("WINNER-----------"+animalArr[i].animalName);
			}
		}
	}
}
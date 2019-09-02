package com.lxisoft.animalgame;
// import java.util.Scanner;
import java.lang.Math;

import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Tiger;
import com.lxisoft.animalgame.Rabbit;
import com.lxisoft.animalgame.Lion;
import com.lxisoft.animalgame.Peacook;
import com.lxisoft.animalgame.Zeebra;
import com.lxisoft.animalgame.Frog;
import com.lxisoft.animalgame.Cheetah;
import com.lxisoft.animalgame.Deer;
import com.lxisoft.animalgame.Elephant;
import com.lxisoft.animalgame.Wolf;

public class Forest
{
	
	public void print()
	{
		// Scanner scan=new Scanner(System.in);

		Animal tiger=new Tiger();
		Animal rabbit=new Rabbit();
		Animal lion=new Lion();
		Animal peacook=new Peacook();
		Animal zeebra=new Zeebra();
		Animal frog=new Frog();
		Animal cheetah=new Cheetah();
		Animal deer=new Deer();
		Animal elephant=new Elephant();
		Animal wolf=new Wolf();
		
		Animal[] animal=new Animal[10];
		animal [0]=new Tiger();
		animal [1]=new Rabbit();
		animal [2]=new Lion();
		animal [3]=new Peacook();
		animal [4]=new Zeebra();
		animal [5]=new Frog();
		animal [6]=new Cheetah();
		animal [7]=new Deer();
		animal [8]=new Elephant();
		animal [9]=new Wolf();


		
		animal [0]=tiger;
		animal [1]=rabbit;
		animal [2]=lion;
		animal [3]=peacook;
		animal [4]=zeebra;
		animal [5]=frog;
		animal [6]=cheetah;
		animal [7]=deer;
		animal [8]=elephant;
		animal [9]=wolf;

		animal[0].name="tiger";
		animal[0].strength=90;
		animal[1].name="rabbit";
		animal[1].strength=30;
		animal[2].name="lion";
		animal[2].strength=100;
		animal[3].name="peacook";
		animal[3].strength=40;
		animal[4].name="zeebra";
		animal[4].strength=45;
		animal[5].name="frog";
		animal[5].strength=10;
		animal[6].name="cheetah";
		animal[6].strength=80;
		animal[7].name="deer";
		animal[7].strength=50;
		animal[8].name="elephant";
		animal[8].strength=70;
		animal[9].name="wolf";
		animal[9].strength=60;


		int x,y;
		for(int i=0; i<10; i++)
		{
			System.out.print(i+" ");
			animal[i].printDetails();
		}
		do
		{
			// System.out.print("enter the no of animal to select");
			x=(int)(10* Math.random());
		}while(x>9);

		do
		{
			// System.out.print("select another animal to fight ");
			// animal[x].printName();
			y=(int)(10* Math.random());
			if(y==x){
				
				y=12;} 
			
		}while(y>9);
		fight(x,y,animal);

			
	}
	public void fight(int x,int y, Animal[] a)
	{
		Animal win;
		int b=0;
		int diff =0;
		// a[x].printDetails();
		System.out.println(a[x].name+" fighting with "+a[y].name);
		if( a[x].strength>a[y].strength)
		{
			System.out.println( a[x].name+" wins");
			win=a[x];
			diff = a[y].strength/2;
			a[x].strength=a[x].strength-diff;
			a[y].strength=0;
			
		}
		else
		{
			System.out.println( a[y].name+" wins");	
			win=a[y];
			diff = a[x].strength/2;
			a[y].strength=a[y].strength-diff;
			a[x].strength=0;
			
		}
		// System.out.println(a[x].strength + "  "+ a[y].strength + " "+diff);
	
		
 	meet(win,a);
	}
	public void meet(Animal winner, Animal[] an)
	{
		// winner.printDetails();
		String opponent=null;
		String opponent1=null;
		// Scanner scan=new Scanner(System.in);
		int count=0;
	
		int c=0;
		Animal [] remaining=new Animal[10];
		// for(int i=0; i<5; i++)
		// {
		// 	int p=an[i].strength;
		// 	if(p!=0)
		// 	{
		// 		count++;


		// 	}

		// }
		for(int i=0; i<10; i++)
		{
			int p=an[i].strength;
			if(p!=0)
			{
				System.out.println(i+"  "+an[i].name+ " "+ an[i].strength);
				remaining[c]=an[i];
				c++;


			}
		
		}
		int loop=0;
		int loop1=0;
		int end=0;
		int index =0;
		int index1= 0;
		
		do
		{
			
			for(int i=0; i<10; i++)
			{
				int p=an[i].strength;
				if (p!=0)
				{
					end++;

				}
				
			}
			if(end==1)
				{
					loop=1;

					
				}

			// System.out.println(loop);


			if(loop==0)
			{	
				// System.out.println("enter name of animal to fight :");
				index=(int)(10* Math.random());
				opponent=an[index].name;
				// System.out.println(opponent);

				for(int i=0; i<c;i++)
				{
					// System.out.println(opponent);
					// System.out.println(remaining[i].name);
					if(opponent.equals(remaining[i].name))
					{
						loop1=1;
						// System.out.println("opponent");
						
					}
					

				}
		
				// System.out.println("enter name of animal to fight with "+opponent+" : ");
				index1=(int)(10* Math.random());
				opponent1=an[index1].name;
				// System.out.println(opponent);

				for(int i=0; i<c;i++)
				{
					// System.out.println(opponent);
					// System.out.println(remaining[i].name);
					if(opponent1.equals(remaining[i].name))
					{
						loop=1;
						// System.out.println("opponent");
						if(opponent.equals(opponent1))
						{
							loop=0;
							// System.out.println("equa");
						}
						if(loop1==0)loop=0;
					}
					

				}
			}
		}while(loop==0);
		int opponent1no=0;
		int opponentno=0;
		// System.out.println(end+"  end");

		if(end!=1)
		{
			for(int i=0;i<10;i++)
			{
				if(opponent1.equals(an[i].name))
				{
					opponent1no=i;
				}
				else if(opponent.equals( an[i].name))
				{
					opponentno=i;
				}
			}
			// System.out.println(winnerno+" "+opponentno);

			fight(opponent1no,opponentno,an);
		}
		else
		{
			System.out.println("winner is "+ winner.name);
		}
	}



} 
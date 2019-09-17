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
		System.out.println("\nanimal details\n-----------------");
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
		setTigerDetails(nt,animalArr);
		setLionDetails(nt,nl,animalArr);
		setBearDetails(nt,nl,nb,animalArr);
		setRabbitDetails(nt,nl,nb,a,animalArr);
		meetFight(animalArr);
	}
	public void meetFight(Animal animalArr[])
	{
		int a,n=1,b=0,m=1,count,j,i;
		a=animalArr.length;
		System.out.println("\t\tjungle\n-------\n\t\tanimals meet and fight begins\n\t\t------------------------------");
		for(i=0;true;i++)
		{
			int x=(int) (Math.random()*a);
			int y=(int) (Math.random()*a);
			int q=winner(animalArr);
			if(q==1)
			{
				break;
			}
			if((animalArr[x].isDead==false)&(animalArr[y].isDead==false))
			{
				if(x!=y)
				{
					setWinner(animalArr,x,y);
					winnerCarnivores(n,x,y,animalArr,temp);
				}		
			}	
		}
	}
	public void setTigerDetails(int nt,Animal animalArr[])
	{
		Scanner s=new Scanner(System.in);
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
	}
	public void setLionDetails(int nt,int nl,Animal animalArr[])
	{
		Scanner s=new Scanner(System.in);
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
	}
	public void setBearDetails(int nt,int nl,int nb,Animal animalArr[])
	{
		Scanner s=new Scanner(System.in);
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
	}
	public void setRabbitDetails(int nt,int nl,int nb,int a,Animal animalArr[])
	{
		Scanner s=new Scanner(System.in);
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
	}
	public int winner(Animal animalArr[])
	{
		int count=0,win=0,a,w=0;
		a=animalArr.length;
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
			w=1;	
		}
		return w;
	}
	public void setWinner(Animal animalArr[],int x,int y)
	{
		if((animalArr[x] instanceof Herbivores)&(animalArr[y] instanceof Herbivores))
		{
			System.out.println("\n\t\t\t    "+animalArr[x].animalName+"  v  "+animalArr[y].animalName);
			System.out.println("\t\t\t NO FIGHT ");
		}
		if((animalArr[x] instanceof Carnivores)&(animalArr[y] instanceof Herbivores))
		{
			System.out.println("\n "+animalArr[x].animalName+"  v  "+animalArr[y].animalName);
			System.out.println(" "+animalArr[y].animalName+"----Dead");
			animalArr[x].strength=(animalArr[x].strength-1);
			System.out.println("\n "+animalArr[x].animalName+" eat "+animalArr[y].animalName);
			System.out.println(" winner---"+animalArr[x].animalName+"(strength=="+animalArr[x].strength+")");
		}
	}
	public void winnerCarnivores(int n,int x,int y,Animal animalArr[],Animal temp)
	{
		if((animalArr[x] instanceof Carnivores)&(animalArr[y] instanceof Carnivores))
		{
			System.out.println("\n\t\tFight no---"+n+"\n\t\t    "+animalArr[x].animalName+"  v  "+animalArr[y].animalName);
			temp=((Carnivores)(animalArr[x])).fight(animalArr[y]);
			if(temp==animalArr[x])
			{
				System.out.println("\t\twinner="+animalArr[x].animalName+" strength=="+(animalArr[x].strength-1)+"\n\t\tlooser="+animalArr[y].animalName+" strength=="+(animalArr[y].strength-2));
				if(animalArr[y].strength<=0)
				{
					animalArr[y].isDead=true;
					System.out.println("\n"+animalArr[y].animalName+"------------dead");
				}
			}
			if(temp==animalArr[y])
			{
				System.out.println("\t\twinner="+animalArr[y].animalName+" strength=="+(animalArr[y].strength-1)+"\n\t\tlooser="+animalArr[x].animalName+" strength=="+(animalArr[x].strength-2));
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

package com.lxisoft.tdd;

import com.lxisoft.jungle.*;
import com.lxisoft.animals.*;
import java.util.*;
public class TDD
{
	public static void main(String [] args)
		{
			
			String ans;
Scanner sc=new Scanner(System.in);
			
			 Random rand = new Random();
			 
		Tiger t=new Tiger();
		Animal []a =new Animal[11];
		a[0]=new Deer();
		a[1]=new Rabbit();
		a[2]=new Sheep();
		a[3]=new Tiger();
		a[4]=new Tiger();
		a[5]=new Lion();
		a[6]=new Giraffee();
		a[7]=new Zebra();
		a[8]=new Crocodile();
		a[9]=new Wolf();
		a[10]=new Leopard();
		//Animal []b={new Herbivores(),new Carnivores()};
		Forest f=new Forest();
				do{
					 int x = rand.nextInt(11);
			  int y=rand.nextInt(11);
		f.fight(a[x],a[y]);
				System.out.println("Do you want to play again :(yes/no)");
			ans=sc.next();
			
			}while(ans.equals("yes"));
		}
}
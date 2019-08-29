package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
import  java.lang.Math;
public class Forest
	{
		
		Animal[] animals;
		Animal tiger;
		Animal lion;
		Animal rabbit;
		Tiger t;
		Lion l;
		Rabbit r;


		public void print()
		{
				System.out.println("Silent valley---");
				animals=new Animal[5];
		        for(int i=0;i<=animals.length;i++)
				{
					int index=(int)(Math.random()*5);
					// animals[i]=index;
					System.out.println("random=====" +index);
					animals[index]=new Animal();
					animals[index].meet();
					index++;
					
				}
		


		}

		

}



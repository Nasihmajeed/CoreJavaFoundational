package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
import  java.lang.Math;
public class Forest
{
		
		
		Animal[] animals;
		Animal tiger;
		Animal lion;
		Animal rabbit;
	//	Animal elephant;

		public void print()
		{
			System.out.println("---Amazon Forest---");
			System.out.println("Animals");

	//-----------		Array creation	---------//			
			animals=new Animal[3];

			tiger=new Tiger();
			lion=new Lion();
			rabbit=new Rabbit();
		//	elephant=new Elephant();

			tiger.name="Tiger";
			tiger.strength=40;
			tiger.display();
			animals[0]=tiger;

			rabbit.name="Rabbit";
			rabbit.strength=10;
			rabbit.display();
			animals[1]=rabbit;

			lion.name="Lion";
			lion.strength=30;
			lion.display();
			animals[2]=lion;

			// elephant.name="Elephant";
			// elephant.strength=20;
			// elephant.display();
			// animals[3]=elephant;


			meet(animals);	// calling meet method using array passing....
	
		}
		public void meet(Animal animal_array[]) 
		{  
			int index2;
			System.out.println("\n");
		//-----------random number generating----------------//	
			int index1=(int)(Math.random()*3);
			do
			{
			index2=(int)(Math.random()*3);
			}while(index1==index2);
			System.out.println(animal_array[index1].name+ " and "+ animal_array[index2].name + " are meeting ");
			fight(index1,index2,animal_array);	//---calling fight method---//
			
		}
		public void s_meet(Animal winner,Animal[] animals_array,int count)
		{
			int index3=0,loop=0;
			Animal[] remain=new Animal[count];

			for(int i=0;i<count;i++)
			{
				if(animals_array[i].strength>0)
					{
						
						remain[i]=animals_array[i];
						System.out.println("\n" +remain[i].name + "\t" +remain[i].strength);
						
					


					
					}
				
			}
			System.out.println("length of remain " +remain.length);
			if(remain.length==2)
			{
				s_fight(index3,winner,remain,count);
			}
			else
			{
				do
				{
				index3=(int)(Math.random()*count);
				
				for(int i=0;i<remain.length;i++)
					{	
						System.out.println("loop front loop"+loop);
						System.out.println("animals_array index==="+animals_array[index3].name);
						System.out.println("remain animal==="+remain[i].name);
					if(animals_array[index3].name.equals(remain[i].name))
							{
								System.out.println("winner animal==="+winner.name);
								if(winner.name==remain[index3].name)
								loop++;

						System.out.println("loop last loop"+loop);
							}
						
					}
				}while(loop==1);
			}
				System.out.println(winner.name+ " and "+ animals_array[index3].name + " are meeting ");
				s_fight(index3,winner,remain,count);
			
		}
		 	
		public void fight(int x,int y,Animal[] a_array)
		{

				Animal r;int count=a_array.length;
			    System.out.println("fightting each other");
			 	int last=a_array.length;
				if(a_array[x].strength>a_array[y].strength)
					{
						System.out.println(a_array[x].name + " wins and " + a_array[y].name + " died");
						System.out.println("");
						a_array[x].strength-=a_array[y].strength;
						a_array[y].strength=0;
						count--;
						r=a_array[x];

					}
					else
					{
						System.out.println(a_array[y].name + " wins and " + a_array[x].name + " died");
						System.out.println("");
						a_array[y].strength-=a_array[x].strength;
						a_array[x].strength=0;
						count--;
						r=a_array[y];
					}
					s_meet(r,a_array,count);
					
						
					}
				
			
			
		
	public void s_fight(int r,Animal alive,Animal[] animal_array,int c)
	{		
			System.out.println("fightting each other");
			if(animal_array[r].strength>alive.strength)
				{
				System.out.println(animal_array[r].name  + " wins and " + alive.name + " died");
				}
				else
				{
				System.out.println(alive.name + " wins and " + animal_array[r].name  + " died");	
				}
		
			// {
		 // 		System.out.println("winner-----" +remain.name);
			// }	
	}


}




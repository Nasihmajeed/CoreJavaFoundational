package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
import  java.lang.Math;
public class Forest
	{
		
		
		Animal[] animals;
		Animal tiger;
		Animal lion;
		Animal rabbit;
		

		public void print()
		{
			System.out.println("---Amazon Forest---");
			System.out.println("Animals");

	//-----------		Array creation	---------//			
			animals=new Animal[3];

			tiger=new Tiger();
			lion=new Lion();
			rabbit=new Rabbit();

			tiger.name="Tiger";
			tiger.strength=10;
			tiger.display();
			animals[0]=tiger;

			rabbit.name="Rabbit";
			rabbit.strength=6;
			rabbit.display();
			animals[1]=rabbit;

			lion.name="Lion";
			lion.strength=8;
			lion.display();
			animals[2]=lion;

			meet(animals);	// calling meet method using array passing....
	
		}
		public void meet(Animal animal_array[]) 
		{  
			
			System.out.println("\n");
		//-----------random number generating----------------//	
			int index1=(int)(Math.random()*3);
			int index2=(int)(Math.random()*3);
			System.out.println(animal_array[index1].name+ " and "+ animal_array[index2].name + " are meeting ");
			fight(index1,index2,animal_array);	//---calling fight method---//
	
		}
		public void s_meet(Animal[] remain_array,Animal[] animals_array)
		{
			int index3=(int)(Math.random()*3);
			do
			{
			//int index3=(int)(Math.random()*3);
			//System.out.println(" hiiiiiiiiiiiiiii\n" +index3);
			//System.out.println(" nnnnnnnnnnhiiiiiiiiiiiiiii\n" + remain_array[0].name);
			//System.out.println(" nexthiiiiiiiiiiiiiii\n" +animals_array[index3].name);
			System.out.println(remain_array[0].name+ " and "+ animals_array[index3].name + " are meeting ");
			s_fight(index3,remain_array,animals_array);
			}while(animals_array[index3].strength==0);
		}
		 	
		public void fight(int x,int y,Animal[] a_array)
		{
			
				
			if(x==y)
			{
				System.out.println("No fight");
				meet(a_array);

			}

			else
			{
				//int j=0; 
				//int count=a_array.length;
				Animal[] remain=new Animal[3];
			    System.out.println("fightting each other");
			 
				if(a_array[x].strength>a_array[y].strength)
					{
						System.out.println(a_array[x].name + " wins and " + a_array[y].name + " died");
						System.out.println("");
						a_array[x].strength-=a_array[y].strength;
						a_array[y].strength=0;
						//count--;
						if(a_array[x].strength>0)
						{

								System.out.println("strenghth after fight= " +a_array[x].strength);
								System.out.println("2nd meetttttt");
												
								remain[0]=a_array[x];
						
								//System.out.println("j="  +j);
							//	System.out.println("count="  +count);
								s_meet(remain,a_array);
								//j++;
								
						}
						
						else
						{
							System.out.println(a_array[x].name +"sdfsgdssh" );
						}
					
						
						//System.out.println(remain[j].name + " last winninggggg");
						
						
						
						//j++;

				}
				else
				{
					System.out.println(a_array[y].name + " wins and " + a_array[x].name + " died");
					System.out.println("");
					a_array[y].strength-=a_array[x].strength;
					a_array[x].strength=0;
					//count--;
					if(a_array[y].strength>0)
					{
						System.out.println("strenghth after fight= " +a_array[y].strength);
						System.out.println("2nd meetttttt");
						remain[0]=a_array[y];
					//	System.out.println("j="  +j);
					//	System.out.println("count="  +count);
						s_meet(remain,a_array);
					//	j++;
						
					}
					
					
				}
			
			
		}	
			
		// }	while()

	}
	public void s_fight(int r,Animal[] remain,Animal[] animal_array)
	{
		
			System.out.println("strength" +animal_array[r].strength);
			System.out.println("fightting each other");
			// if(remain[0].name==animal_array[r].name)
			// {
			// 	s_meet(remain,animal_array);
			// }
			// else 
			// {

				if(animal_array[r].strength>remain[0].strength)
				{
				System.out.println(animal_array[r].name  + " wins and " + remain[0].name + " died");
				}
				else
				{
				System.out.println(remain[0].name + " wins and " + animal_array[r].name  + " died");	
				}
			//}
	}


}




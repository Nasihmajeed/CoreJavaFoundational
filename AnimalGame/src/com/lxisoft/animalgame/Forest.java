package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
import  java.lang.Math;
public class Forest
{
		String name="Galloway";
		
		Animal[] animals;
		Animal buffallo;
		Animal crocodile;
		Animal deer;
		Animal elephant;
		Animal fox;
		Animal lion;
		Animal pig;
		Animal rabbit;
		Animal tiger;
		Animal zeebra;
		
		public void printForest()
		{
			System.out.println("\n");
			System.out.println("\t    Welcome to  "+name +"   Forest");
		}

		public void print()
		{
			
			System.out.println("\t\t  Animals  \n\n ");

	//-----------		Array creation	---------//			
			animals=new Animal[10];

			tiger=new Tiger();
			lion=new Lion();
			rabbit=new Rabbit();
			elephant=new Elephant();
			buffallo=new Buffallo();
			crocodile=new Crocodile();
			deer=new Deer();
			fox=new Fox();
			pig=new Pig();
			zeebra=new Zeebra();

			tiger.name="Tiger";
			tiger.strength=40;
			tiger.isDead=false;
			animals[0]=tiger;

			rabbit.name="Rabbit";
			rabbit.strength=10;
			rabbit.isDead=false;
			animals[1]=rabbit;

			lion.name="Lion";
			lion.strength=30;
			lion.isDead=false;
			animals[2]=lion;

			elephant.name="Elephant";
			elephant.strength=45;
			elephant.isDead=false;
			animals[3]=elephant;

			buffallo.name="Buffallo";
			buffallo.strength=35;
			buffallo.isDead=false;
			animals[4]=buffallo;

			crocodile.name="Crocodile";
			crocodile.strength=15;
			crocodile.isDead=false;
			animals[5]=crocodile;

			deer.name="Deer";
			deer.strength=20;
			deer.isDead=false;
			animals[6]=deer;

			fox.name="Fox";
			fox.strength=32;
			fox.isDead=false;
			animals[7]=fox;

			pig.name="Pig";
			pig.strength=17;
			pig.isDead=false;
			animals[8]=pig;

			zeebra.name="Zeebra";
			zeebra.strength=25;
			zeebra.isDead=false;
			animals[9]=zeebra;
           animalMeet(animals);
          
        }  
		public int randomGeneration(int limit)
		{
				int random=(int)(Math.random()*limit);
				return random;

		}
		public Animal[] isDead(int winner,int looser,Animal[] animal_array)
		{
			int remain=animal_array[winner].strength-animal_array[looser].strength/2;
			animal_array[winner].strength=remain;
			animal_array[looser].strength=0;
			return animal_array;

		}
	    public void isWinner(Animal[] animals,Animal lastAnimal)
	    {
       		int count=0;
        	for(int i=0;i<animals.length;i++)
			{
				if(animals[i] instanceof Carnivore)
				{
					if(animals[i].isDead==false)
					{	
						
						count++;

					}
				}	
			}
			if(count==0)
        	{
        		 
        		System.out.println("\n ******  The  winner is  "+lastAnimal.name +"  ******");
        	}
        	else
        	{
           		animalMeet(animals);
        	}

	    }
	
		public void animalMeet(Animal[] animal_array ) 
		{	
			int count=0,random1,random2;
			Animal win=null;
			for(int i=0;i<animal_array.length;i++)
			{
				
					if(animal_array[i].isDead==false)
					{	
						System.out.print(i + " ");
						animal_array[i].display();
						count++;
					}
				
			}

			boolean check=true;
			do
			{
				check=true; 
				random1=randomGeneration(animals.length);
				if(animals[random1] instanceof Carnivore)
					{
						check=false;
						
					} 

			}while(animal_array[random1].isDead || check);

			do
			{
			
			  random2=randomGeneration(animals.length);
			  

			}while(animal_array[random2].isDead || random1==random2);
			System.out.println(animal_array[random1].name + " meets " +animal_array[random2].name);
			int luckfactor=0;
			luckfactor=randomGeneration(10);
			if(luckfactor==5)
			{
				System.out.println("lucky animal escapped...");
			}
			else
			{
			    win=((Carnivore) (animals[random1])).fight(animals[random2]);

			    if(animals[random1].name==win.name)
			    {
			    	animals=isDead(random1,random2,animals);
			    }
			    else
			    {
			    	animals=isDead(random2,random1,animals);
			    }
		    }
		    isWinner(animals,win);
		}


}
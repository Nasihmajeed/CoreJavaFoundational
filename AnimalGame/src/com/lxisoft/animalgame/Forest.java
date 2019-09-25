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
		
		public void print()
		{
			System.out.println("\n");
			System.out.println("\t    Welcome to  "+name +"   Forest");
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
			tiger.strength=80;
			tiger.isDead=false;
			animals[0]=tiger;
			animals[0].xCordinate=randomGeneration(50);
			animals[0].yCordinate=randomGeneration(50);
			animals[0].range=50;
			animals[0].forsight=10;

			rabbit.name="Rabbit";
			rabbit.strength=10;
			rabbit.isDead=false;
		    ((Animalherbivores)(rabbit)).luckyfact=3;
			animals[1]=rabbit;
			animals[1].xCordinate=randomGeneration(50);
			animals[1].yCordinate=randomGeneration(50);
			animals[1].range=20;
			animals[1].forsight=5;

			lion.name="Lion";
			lion.strength=70;
			lion.isDead=false;
			animals[2]=lion;
			animals[2].xCordinate=randomGeneration(50);
			animals[2].yCordinate=randomGeneration(50);
			animals[2].range=60;
			animals[2].forsight=10;

			elephant.name="Elephant";
			elephant.strength=60;
			elephant.isDead=false;
			((Animalherbivores)(elephant)).luckyfact=7;
			animals[3]=elephant;
			animals[3].xCordinate=randomGeneration(50);
			animals[3].yCordinate=randomGeneration(50);
			animals[3].range=40;
			animals[3].forsight=9;

			buffallo.name="Buffallo";
			buffallo.strength=40;
			buffallo.isDead=false;
			animals[4]=buffallo;
			animals[4].xCordinate=randomGeneration(50);
			animals[4].yCordinate=randomGeneration(50);
			animals[4].range=30;
			animals[4].forsight=6;

			crocodile.name="Crocodile";
			crocodile.strength=45;
			crocodile.isDead=false;
			animals[5]=crocodile;
			animals[5].xCordinate=randomGeneration(50);
			animals[5].yCordinate=randomGeneration(50);
			animals[5].range=30;
			animals[5].forsight=4;

			deer.name="Deer";
			deer.strength=30;
			deer.isDead=false;
			((Animalherbivores)(deer)).luckyfact=4;
			animals[6]=deer;
			animals[6].xCordinate=randomGeneration(50);
			animals[6].yCordinate=randomGeneration(50);
			animals[6].range=50;
			animals[6].forsight=5;

			fox.name="Fox";
			fox.strength=55;
			fox.isDead=false;
			animals[7]=fox;
			animals[7].xCordinate=randomGeneration(50);
			animals[7].yCordinate=randomGeneration(50);
			animals[7].range=50;
			animals[7].forsight=8;


			pig.name="Pig";
			pig.strength=10;
			pig.isDead=false;
			((Animalherbivores)(pig)).luckyfact=8;
			animals[8]=pig;
			animals[8].xCordinate=randomGeneration(50);
			animals[8].yCordinate=randomGeneration(50);
			animals[8].range=50;
			animals[8].forsight=3;

			zeebra.name="Zeebra";
			zeebra.strength=45;
			zeebra.isDead=false;
			((Animalherbivores)(zeebra)).luckyfact=1;
			animals[9]=zeebra;
			animals[9].xCordinate=randomGeneration(50);
			animals[9].yCordinate=randomGeneration(50);
			animals[9].range=50;
			animals[9].forsight=5;

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
		public Animal[] isWeak(Animal[] animals,int[] nearAnimal,int count)
		{
			for(int i=0;i<count;i++)
			{
				if(animals[i]!=animals[nearAnimal[i]])
				{
					animals[nearAnimal[i]].strength=animals[nearAnimal[i]].strength/2;
				}
			}
			return animals;
		}
		public boolean withInRange(int range,int x1,int y1,int[] location)
	 	{
	 		boolean isRange=true;
 		  	int distance=(int)(Math.sqrt((location[0]-x1)*(location[0]-x1)+(location[1]-y1)*(location[1]-y1)));
 		  	if(distance>=range)
 		  	{
 		  		isRange=true;
 		  	}
 		  	else isRange=false;
    		return isRange;
	 	}

	 	public boolean withInSight(int[] x1,int[] y1,int sight)
	 	{
	 		int distance=0,count=0;
	 		boolean isSight=true;
	 		distance=(int)(Math.sqrt((y1[0]-x1[0])*(y1[0]-x1[0]) + (y1[1]-x1[1])*(y1[1]-x1[1])));
 		  	if(distance>=sight)
 		  	{
 		  		isSight=true;
  		  	}
 		  	else isSight=false;
	   		return isSight;
	 	}

	    public void isWinner(Animal[] animals,Animal lastAnimal)
	    {
       		int count=0,alive=0,i;
        	for(i=0;i<animals.length;i++)
			{
				if(animals[i] instanceof Carnivore)
				{
					if(animals[i].isDead==false)
					{	
						alive=i;
						count++;
					}
				}	
			}
			if(count==1)
        	{
          		System.out.println("\n ******  The  winner is  "+animals[alive].name +"  ******");
        	}
        	else
        	{
           		animalMeet(animals);
        	}

	    }
	 	
	 	public Animal[] location(Animal[] animals)
	 	{
	 		boolean isRange=false;
	 		for(int i=0;i<animals.length;i++)
	 		{
	 			if(animals[i].isDead==false)
	 			{	
	 				if(animals[i] instanceof Herbivores)
	 				{
	 					do
	 					{
	 						animals[i].location=((Animalherbivores)(animals[i])).graze();
	 						isRange=withInRange(animals[i].range,animals[i].xCordinate,animals[i].yCordinate,animals[i].location);
			 			}while (isRange);

	 				}
	 				else
	 				{
			 			do
			 			{
			 				animals[i].location=((Animalcarnivores)(animals[i])).roam();  
			 				isRange=withInRange(animals[i].range,animals[i].xCordinate,animals[i].yCordinate,animals[i].location);
			 			}while(isRange);

	 				}
	 			}
	 		}
	 		return animals;	
	 	}
	 	public void aliveAnimals(Animal[] animals)
	 	{
	 		animals=location(animals);
	 		for(int i=0;i<animals.length;i++)
			{
	  			if(animals[i].isDead==false)
	  			{
	  			System.out.print(i + " ");
				animals[i].getDetails();
	 			System.out.println("current: \t"+animals[i].location[0] +"\t"+animals[i].location[1]);
				}
			}
	 	}
	 	public boolean isEscape(Animal[] animal_array,int[] nearbyAnimals,int random2,int count)
	 	{
	 		boolean escape=false;
			if(count==1)
			{
			 System.out.println(animal_array[nearbyAnimals[0]].name + " meets " +animal_array[random2].name);
				 if(animal_array[random2] instanceof Herbivores)
			 	{
			 			((Animalherbivores)(animal_array[random2])).luckyfact=(int)((Animalherbivores)(animal_array[random2])).luckyfact/2;
			 		//	System.out.println("luckyfact  "+((Animalherbivores)(animal_array[random2])).luckyfact);
						escape=((Animalherbivores)(animal_array[random2])).luck();
						  
				}
			}
			if(count==2)
			{
			 System.out.println(animal_array[nearbyAnimals[0]].name+"  "+animal_array[nearbyAnimals[1]].name + " meets " +animal_array[random2].name);
				 if(animal_array[random2] instanceof Herbivores)
			 	{		
			 			((Animalherbivores)(animal_array[random2])).luckyfact=(int)((Animalherbivores)(animal_array[random2])).luckyfact/2;
			 			//System.out.println("luckyfact  "+((Animalherbivores)(animal_array[random2])).luckyfact);
						escape=((Animalherbivores)(animal_array[random2])).luck();
						  
				}
			}
			if(count>=3)
			{
			 System.out.println(animal_array[nearbyAnimals[0]].name+"  "+animal_array[nearbyAnimals[1]].name +"  "+animal_array[nearbyAnimals[2]].name + " meets " +animal_array[random2].name);
			}
		return escape;
	 	}
	
		public void animalMeet(Animal[] animal_array ) 
		{	
			int count=0,random1=0,random2=0;
			Animal win=null;
			aliveAnimals(animal_array);
			//Selecting second animals
			int near=0,loop=10;
			int[] nearbyAnimals=new int[animal_array.length];
			boolean inSight,nextAnimal=true;
			do
			{
 				do
				{
					random2=randomGeneration(animal_array.length);
					//System.out.println("random2==="+animal_array[random2].name);
				}while(animal_array[random2].isDead);

				//first Animal 

				for(int i=0;i<animal_array.length;i++)
				{
					//System.out.println("selecting random 1");
					inSight=true;
					if(i!=random2)
					{
						if(animal_array[i].isDead==false)
						{
							if(animal_array[i] instanceof Carnivore)
							{
								inSight=withInSight(animal_array[i].location,animal_array[random2].location,animal_array[i].forsight);
								//System.out.println("isSight== "+withInSight(animal_array[i].location,animal_array[random2].location,animal_array[i].forsight));
								if(inSight==false)
								{
									nearbyAnimals[near]=i;
									near++;
									nextAnimal=false;
								}
							}
						}
					}
				}
				loop--;
				//System.out.println("loop==="+loop);
				if(loop==0)
				{
				animal_array=location(animal_array);
				loop=10;
				}
			}while(nextAnimal);
			// for(int i=0;i<near;i++)
			// {
			// 	System.out.println("animals is in sight nearby\n..........");
			// 		System.out.println(animal_array[i].name);
			// 		System.out.println(animal_array[random2].name);
			// }
			//System.out.println("isin count" +near);
			random1=nearbyAnimals[0];
			boolean escape=isEscape(animal_array,nearbyAnimals,random2,near);
			//System.out.println("isEscape==="+isEscape(animal_array,nearbyAnimals,random2,near));
			if(escape==false)
			{
				if(near==1)
				{
				    win=((Carnivore)(animal_array[nearbyAnimals[0]])).fight(animal_array[random2]);
				    for(int i=0;i<near;i++)
				    {
					    if(animal_array[nearbyAnimals[0]].name==win.name)
					    {
					    	animal_array=isDead(i,random2,animals);
					    }
				    }
				}  
				if(near==2)
				{
					win=((Carnivore)(animal_array[nearbyAnimals[0]])).fight(animal_array[random2],animal_array[nearbyAnimals[1]]);
					for(int i=0;i<near;i++)
					{
					    if(animal_array[i].name==win.name)
					    {
					    	//animals=isDead(i,random2,animals);
					    	animal_array=isWeak(animal_array,nearbyAnimals,near);
					    }
				   
				    }   
		 	    
		 	    }
		 	    if(near>=3)
		 	    {
		 	    	win=((Carnivore)(animal_array[nearbyAnimals[0]])).fight(animal_array[random2],animal_array,nearbyAnimals,near);
		 	    	animal_array=isWeak(animal_array,nearbyAnimals,near);
		 	    }
		 	    
		    }
	 	isWinner(animal_array,win); 
	 }

}

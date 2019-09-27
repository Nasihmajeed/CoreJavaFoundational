package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
import  java.lang.Math;
public class Forest
{
		
		Animal[] animals=new Animal[10];
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
		
		public void setAnimalDetails()
		{
			
			//System.out.println("\t\t  Animals  \n\n ");

	//-----------		Array creation	---------//			
			

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
			//tiger.strength=80;
			tiger.isDead=false;
			tiger.hunger=Hunger.HUNGRIEST;
			animals[0]=tiger;
			animals[0].location[0]=randomGeneration(50);
			animals[0].location[1]=randomGeneration(50);
			//animals[0].range=50;
			animals[0].speed=100;
			//animals[0].forsight=10;

			rabbit.name="Rabbit";
			//rabbit.strength=10;
			rabbit.isDead=false;
			rabbit.hunger=Hunger.HUNGRIEST;
		    ((Animalherbivores)(rabbit)).luckyfact=3;
			animals[1]=rabbit;
			animals[1].location[0]=randomGeneration(50);
			animals[1].location[1]=randomGeneration(50);
			//animals[1].range=20;
			animals[1].speed=45;
			//animals[1].forsight=5;

			lion.name="Lion";
			//lion.strength=70;
			lion.isDead=false;
			lion.hunger=Hunger.HUNGRIEST;
			animals[2]=lion;
			animals[2].location[0]=randomGeneration(50);
			animals[2].location[1]=randomGeneration(50);
			//animals[2].range=60;
			animals[2].speed=80;
			//animals[2].forsight=10;

			elephant.name="Elephant";
			//elephant.strength=60;
			elephant.isDead=false;
			elephant.hunger=Hunger.HUNGRIEST;
			((Animalherbivores)(elephant)).luckyfact=7;
			animals[3]=elephant;
			animals[3].location[0]=randomGeneration(50);
			animals[3].location[1]=randomGeneration(50);
			//animals[3].range=40;
			animals[3].speed=40;
			//animals[3].forsight=9;

			buffallo.name="Buffallo";
			//buffallo.strength=40;
			buffallo.isDead=false;
			buffallo.hunger=Hunger.HUNGRIEST;
			animals[4]=buffallo;
			animals[4].location[0]=randomGeneration(50);
			animals[4].location[1]=randomGeneration(50);
			//animals[4].range=30;
			animals[4].speed=45;
			//animals[4].forsight=6;

			crocodile.name="Crocodile";
			//crocodile.strength=45;
			crocodile.isDead=false;
			crocodile.hunger=Hunger.HUNGRIEST;
			animals[5]=crocodile;
			animals[5].location[0]=randomGeneration(50);
			animals[5].location[1]=randomGeneration(50);
			//animals[5].range=30;
			animals[5].speed=25;
			//animals[5].forsight=4;

			deer.name="Deer";
			//deer.strength=30;
			deer.isDead=false;
			deer.hunger=Hunger.HUNGRIEST;
			((Animalherbivores)(deer)).luckyfact=4;
			animals[6]=deer;
			animals[6].location[0]=randomGeneration(50);
			animals[6].location[1]=randomGeneration(50);
			//animals[6].range=50;
			animals[6].speed=90;
			//animals[6].forsight=5;

			fox.name="Fox";
			//fox.strength=55;
			fox.isDead=false;
			fox.hunger=Hunger.HUNGRIEST;
			animals[7]=fox;
			animals[7].location[0]=randomGeneration(50);
			animals[7].location[1]=randomGeneration(50);
			//animals[7].range=50;
			animals[7].speed=90;
			//animals[7].forsight=8;


			pig.name="Pig";
			//pig.strength=10;
			pig.isDead=false;
			pig.hunger=Hunger.HUNGRIEST;
			((Animalherbivores)(pig)).luckyfact=8;
			animals[8]=pig;
			animals[8].location[0]=randomGeneration(50);
			animals[8].location[1]=randomGeneration(50);
			//animals[8].range=50;
			animals[8].speed=50;
			//animals[8].forsight=3;

			zeebra.name="Zeebra";
			//zeebra.strength=45;
			zeebra.isDead=false;
			zeebra.hunger=Hunger.HUNGRIEST;
			((Animalherbivores)(zeebra)).luckyfact=1;
			animals[9]=zeebra;
			animals[9].location[0]=randomGeneration(50);
			animals[9].location[1]=randomGeneration(50);
			//animals[9].range=50;
			animals[9].speed=60;
			//animals[9].forsight=5;

          // animalMeet(animals);
          
        }  
        public void levelEasy()
        {
        	animals[0].strength=90;		animals[0].forsight=20; 		animals[0].range=50;
        	animals[1].strength=10;		animals[1].forsight=5; 			animals[1].range=50;
        	animals[2].strength=70;		animals[2].forsight=20; 		animals[2].range=30;
        	animals[3].strength=60;		animals[3].forsight=10; 		animals[3].range=30;
        	animals[4].strength=40;		animals[4].forsight=15; 		animals[4].range=40;
        	animals[5].strength=45;		animals[5].forsight=5; 			animals[5].range=40;
        	animals[6].strength=30;		animals[6].forsight=10; 		animals[6].range=50;
        	animals[7].strength=55;		animals[7].forsight=10; 		animals[7].range=50;
        	animals[8].strength=25;		animals[8].forsight=15; 		animals[8].range=50;
        	animals[9].strength=50;		animals[9].forsight=5; 			animals[9].range=50;

        	animalMeet(animals);



        }
        public void levelMedium()
        {
        	animals[0].strength=80;		animals[0].forsight=10; 		animals[0].range=50;
        	animals[1].strength=5;		animals[1].forsight=5; 			animals[1].range=50;
        	animals[2].strength=60;		animals[2].forsight=10; 		animals[2].range=30;
        	animals[3].strength=50;		animals[3].forsight=5; 			animals[3].range=30;
        	animals[4].strength=30;		animals[4].forsight=10; 		animals[4].range=40;
        	animals[5].strength=35;		animals[5].forsight=5; 			animals[5].range=40;
        	animals[6].strength=20;		animals[6].forsight=10; 		animals[6].range=50;
        	animals[7].strength=45;		animals[7].forsight=10; 		animals[7].range=50;
        	animals[8].strength=15;		animals[8].forsight=10; 		animals[8].range=50;
        	animals[9].strength=40;		animals[9].forsight=5; 			animals[9].range=50;

        	animalMeet(animals);
        }
        public void levelHard()
        {
        	animals[0].strength=70;		animals[0].forsight=7; 			animals[0].range=50;
        	animals[1].strength=5;		animals[1].forsight=3; 			animals[1].range=50;
        	animals[2].strength=50;		animals[2].forsight=7; 			animals[2].range=30;
        	animals[3].strength=40;		animals[3].forsight=3; 			animals[3].range=30;
        	animals[4].strength=30;		animals[4].forsight=5; 			animals[4].range=40;
        	animals[5].strength=25;		animals[5].forsight=2; 			animals[5].range=40;
        	animals[6].strength=10;		animals[6].forsight=5; 			animals[6].range=50;
        	animals[7].strength=35;		animals[7].forsight=5; 			animals[7].range=50;
        	animals[8].strength=15;		animals[8].forsight=7; 			animals[8].range=50;
        	animals[9].strength=30;		animals[9].forsight=3; 			animals[9].range=50;

        	animalMeet(animals);
        }
		public int randomGeneration(int limit)
		{
			int random=(int)(Math.random()*limit);											//.....generating random number....//
			return random;
		}
		public void animalMeet(Animal[] animal_array ) 
		{	
			int count=0,random1=0,random2=0;
			Animal win=null;
			getAliveAnimals(animal_array);
			//..Selecting second animals..//
			int near=0,loop=20;
			int[] nearbyAnimals=new int[animal_array.length];
			boolean inSight,nextAnimal=true;																		//..Animal are meet and select for fight..//
			do
			{
 				do
				{
					random2=randomGeneration(animal_array.length);
				}while(animal_array[random2].isDead || animal_array[random2].hunger==Hunger.OVERFED);

				//..first Animal..//
				for(int i=0;i<animal_array.length;i++)
				{
					inSight=true;
					if(i!=random2)
					{
						if(animal_array[i].isDead==false)
						{	
							if(animal_array[i].hunger!=Hunger.OVERFED)
							{
								if(animal_array[i] instanceof Carnivore)
								{
									inSight=isWithInSight(animal_array[i].location,animal_array[random2].location,animal_array[i].forsight);
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
				}
				loop--;
				if(loop==0)
				{
				animal_array=setLocation(animal_array);
				loop=20;
				}
			}while(nextAnimal);
			random1=nearbyAnimals[0];
			boolean escape=isEscape(animal_array,nearbyAnimals,random2,near);
		
		
			if(escape==false)
			{	
				if(near==1)
				{
				    win=((Carnivore)(animal_array[random1])).fight(animal_array[random2]);
				    for(int i=0;i<near;i++)
				    {
					    if(animal_array[random1].name==win.name) animal_array=isDead(i,random2,animals);
					}
				}  
				if(near==2)
				{
					win=((Carnivore)(animal_array[random1])).fight(animal_array[random2],animal_array[nearbyAnimals[1]]);
					for(int i=0;i<near;i++)
					{
					    if(animal_array[i].name==win.name) animal_array=isWeak(i,animal_array,nearbyAnimals,near);
			        }   
		 	    }
		 	    if(near>=3)
		 	    {
		 	    	win=((Carnivore)(animal_array[random1])).fight(animal_array[random2],animal_array,nearbyAnimals,near);
		 	    	for(int i=0;i<near;i++)
		 	    	{
		 	    		if(animal_array[i].name==win.name) animal_array=isWeak(i,animal_array,nearbyAnimals,near);
		 	    	}	
		 	    }
		 	   	win =isHunger(win); 
		    }
	 		isWinner(animal_array,win); 
	    }
		public Animal[] isDead(int winner,int looser,Animal[] animal_array)
		{
			int remain=animal_array[winner].strength-animal_array[looser].strength/2;		//... setting strength of fighting animals..//
			animal_array[winner].strength=remain;
			animal_array[looser].strength=0;
			return animal_array;
		}
		public Animal[] isWeak(int i,Animal[] animals,int[] nearAnimal,int count)
		{
			for(int j=0;j<count;j++)
			{
			if(animals[i]!=animals[nearAnimal[j]])	animals[nearAnimal[j]].strength=animals[nearAnimal[j]].strength/2;	// ... setting strength after fight..//					
			}
			return animals;
		}
		public boolean isWithInRange(int range,int x1,int y1,int[] location)
	 	{
	 		boolean isRange=true;
 		  	int distance=(int)(Math.sqrt((location[0]-x1)*(location[0]-x1)+(location[1]-y1)*(location[1]-y1)));
 		  	if(distance>=range) isRange=true;
 		  	else isRange=false;
    		return isRange;																							//..checking animal within range of next..//
 	 	}
	 	public boolean isWithInSight(int[] x1,int[] y1,int sight)
	 	{
	 		int distance=0,count=0;
	 		boolean isSight=true;
	 		distance=(int)(Math.sqrt((y1[0]-x1[0])*(y1[0]-x1[0]) + (y1[1]-x1[1])*(y1[1]-x1[1])));					//..checking animal with in sight of next..//
 		  	if(distance>=sight) isSight=true;
   		  	else isSight=false;
	   		return isSight;  	
	 	}

	    public void isWinner(Animal[] animals,Animal lastAnimal)
	    {
       		int count=0,alive=0;
        	for(int i=0;i<animals.length;i++)
			{
				if(animals[i] instanceof Carnivore)
				{																										
					if(animals[i].hunger!=Hunger.OVERFED)														//...selecting one winner animal..//
					{
						if(animals[i].isDead==false)
						{	
							alive=i;
							count++;
						}
					}
				}	
			}
			if(count<=1)System.out.println("\n ******  The  winner is  "+animals[alive].name +"  ******");
        	else animalMeet(animals);
  	    }
	 	public Animal isHunger(Animal animal)
	 	{		//Hunger temp=animal.hunger;
	 			switch(animal.hunger)
	 			{
	 				case HUNGRIEST:animal.hunger=Hunger.HUNGER;break;      		        		//.. checking animal is hunger and setting hungerlevel..//
	 				case HUNGER:animal.hunger=Hunger.OVERFED;break;										
	 	 		}
	 	 	    return animal;
	 	}
	 	public Animal[] setLocation(Animal[] animals)
	 	{
	 		boolean isRange=false;
	 		int[] newLocation=new int[2];
	 		for(int i=0;i<animals.length;i++)													// creatting new location of animal in range..//
	 		{
	 			if(animals[i].isDead==false)
	 			{	
	 				if(animals[i] instanceof Herbivores)
	 				{
	 					do
	 					{
	 						newLocation=((Animalherbivores)(animals[i])).graze();
	 						isRange=isWithInRange(animals[i].range,animals[i].location[0],animals[i].location[1],newLocation);
			 			}while (isRange);

	 				}
	 				else
	 				{
			 			do
			 			{
			 				animals[i].location=((Animalcarnivores)(animals[i])).roam();  
			 				isRange=isWithInRange(animals[i].range,animals[i].location[0],animals[i].location[1],newLocation);
			 			}while(isRange);

	 				}animals[i].location=newLocation;
	 			}
	 		}
	 		return animals;	
	 	}
	 	public void getAliveAnimals(Animal[] animals)
	 	{
	 		animals=setLocation(animals);
	 		System.out.println("Alive Animals \n--------------------");
	 		for(int i=0;i<animals.length;i++)
			{																										//...printing Alive animal details..//
	  			if(animals[i].isDead==false)
	  			{
		  			System.out.print(i + " ");
					animals[i].getAnimalDetails();
		 			System.out.print("current: \t"+animals[i].location[0] +"\t"+animals[i].location[1]+"\t");
		 			System.out.println(animals[i].hunger);
				}
			}
	 	}
	 	public boolean isEscape(Animal[] animal_array,int[] nearbyAnimals,int random2,int count)
	 	{
	 		boolean escape=false;
			if(count==1)
			{																												//..checking animal is escape or not during fight..//
				System.out.println(animal_array[nearbyAnimals[0]].name + " meets " +animal_array[random2].name);
				if(animal_array[nearbyAnimals[0]].speed > animal_array[random2].speed)
					{
						 if(animal_array[random2] instanceof Herbivores)
					 	{
					 		//System.out.println("\n speed of rand1  "+animal_array[nearbyAnimals[0]].speed+"\n speed of rand2  " +animal_array[random2].speed);
				 			((Animalherbivores)(animal_array[random2])).luckyfact=(int)((Animalherbivores)(animal_array[random2])).luckyfact/2;
							//System.out.println(((Animalherbivores)(animal_array[random2])).luckyfact);
							escape=((Animalherbivores)(animal_array[random2])).luck();
								  
						}
					}	
			}
			if(count==2)
			{
			 System.out.println(animal_array[nearbyAnimals[0]].name+"  "+animal_array[nearbyAnimals[1]].name + " meets " +animal_array[random2].name);
			 if(animal_array[nearbyAnimals[0]].speed > animal_array[random2].speed)
				{
					if(animal_array[random2] instanceof Herbivores)
				 	{		
				 			//System.out.println("\n speed of rand1  "+animal_array[nearbyAnimals[0]].speed+"\n speed of rand2  " +animal_array[random2].speed);
				 			((Animalherbivores)(animal_array[random2])).luckyfact=(int)((Animalherbivores)(animal_array[random2])).luckyfact/2;
							//System.out.println(((Animalherbivores)(animal_array[random2])).luckyfact);
							escape=((Animalherbivores)(animal_array[random2])).luck(); 
					}
				}
			}
			if(count>=3)
			{
			 System.out.println(animal_array[nearbyAnimals[0]].name+"  "+animal_array[nearbyAnimals[1]].name +"  "+animal_array[nearbyAnimals[2]].name + " meets " +animal_array[random2].name);
			}
		    return escape;
	 	}
	
		
}

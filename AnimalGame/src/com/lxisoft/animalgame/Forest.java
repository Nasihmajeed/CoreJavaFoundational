package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
import  java.lang.Math;
public class Forest
{
		
		Animal[] animals=new Animal[10];	
		public void setAnimalDetails()
		{
			
			//System.out.println("\t\t  Animals  \n\n ");

	//-----------		Array creation	---------//			
			animals[0]=new Tiger();
			animals[1]=new Rabbit();
			animals[2]=new Lion();
			animals[3]=new Elephant();
			animals[4]=new Buffallo();
			animals[5]=new Crocodile();
			animals[6]=new Deer();
			animals[7]=new Fox();
			animals[8]=new Pig();
			animals[9]=new Zeebra();

			animals[0].name="Tiger";
			animals[0].isDead=false;
			animals[0].hunger=Hunger.HUNGRIEST;
			animals[0].location[0]=randomGeneration(50);
			animals[0].location[1]=randomGeneration(50);
			animals[0].speed=100;

			animals[1].name="Rabbit";
			animals[1].isDead=false;
			animals[1].hunger=Hunger.HUNGRIEST;
		    (animals[1]).luckyfact=3;
			animals[1].location[0]=randomGeneration(50);
			animals[1].location[1]=randomGeneration(50);
			animals[1].speed=45;

			animals[2].name="Lion";
			animals[2].isDead=false;
			animals[2].hunger=Hunger.HUNGRIEST;
			animals[2].location[0]=randomGeneration(50);
			animals[2].location[1]=randomGeneration(50);
			animals[2].speed=80;

			animals[3].name="Elephant";
			animals[3].isDead=false;
			animals[3].hunger=Hunger.HUNGRIEST;
			(animals[3]).luckyfact=7;
			animals[3].location[0]=randomGeneration(50);
			animals[3].location[1]=randomGeneration(50);
			animals[3].speed=40;

			animals[4].name="Buffallo";
			animals[4].isDead=false;
			animals[4].hunger=Hunger.HUNGRIEST;
			animals[4].location[0]=randomGeneration(50);
			animals[4].location[1]=randomGeneration(50);
			animals[4].speed=45;

			animals[5].name="Crocodile";
			animals[5].isDead=false;
			animals[5].hunger=Hunger.HUNGRIEST;
			animals[5].location[0]=randomGeneration(50);
			animals[5].location[1]=randomGeneration(50);
			animals[5].speed=25;

			animals[6].name="Deer";
			animals[6].isDead=false;
			animals[6].hunger=Hunger.HUNGRIEST;
			(animals[6]).luckyfact=4;
			animals[6].location[0]=randomGeneration(50);
			animals[6].location[1]=randomGeneration(50);
			animals[6].speed=90;

			animals[7].name="Fox";
			animals[7].isDead=false;
			animals[7].hunger=Hunger.HUNGRIEST;
			animals[7].location[0]=randomGeneration(50);
			animals[7].location[1]=randomGeneration(50);
			animals[7].speed=90;


			animals[8].name="Pig";
			animals[8].isDead=false;
			animals[8].hunger=Hunger.HUNGRIEST;
			(animals[8]).luckyfact=8;
			animals[8].location[0]=randomGeneration(50);
			animals[8].location[1]=randomGeneration(50);
			animals[8].speed=50;

			animals[9].name="Zeebra";
			animals[9].isDead=false;
			animals[9].hunger=Hunger.HUNGRIEST;
			(animals[9]).luckyfact=1;
			animals[9].location[0]=randomGeneration(50);
			animals[9].location[1]=randomGeneration(50);
			animals[9].speed=60;

          
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

        	animalMeet();



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

        	animalMeet();
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
        	animals[9].strength=30;	animals[9].forsight=3; 			animals[9].range=50;

        	animalMeet();
        }
		public int randomGeneration(int limit)
		{
			int random=(int)(Math.random()*limit);											//.....generating random number....//
			return random;
		}
		public void animalMeet() throws ArrayIndexOutOfBoundsException
		{	
			try
			{
				int count=0,random1=0,random2=0;
				Animal win=null;
				getAliveAnimals(animals);
				//..Selecting second animals..//
				int near=0,loop=20;
				int[] nearbyAnimals=new int[animals.length];
				boolean inSight,nextAnimal=true;																		//..Animal are meet and select for fight..//
				do
				{
	 				do
					{
						random2=randomGeneration(animals.length);
					}while(animals[random2].isDead || animals[random2].hunger==Hunger.OVERFED);

					//..first Animal..//
					for(int i=0;i<animals.length;i++)
					{
						inSight=true;
						if(i!=random2)
						{
							if(animals[i].isDead==false)
							{	
								if(animals[i].hunger!=Hunger.OVERFED)
								{
									if(animals[i] instanceof Carnivore)
									{
										inSight=isWithInSight(animals[i].location,animals[random2].location,animals[i].forsight);
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
					animals=setLocation(animals);
					loop=20;
					}
				}while(nextAnimal);
				random1=nearbyAnimals[0];
				boolean escape=isEscape(animals,nearbyAnimals,random2,near);
			
			
				if(escape==false)
				{	
					if(near==1)
					{
					    win=((Carnivore)(animals[random1])).fight(animals[random2]);
					    for(int i=0;i<near;i++)
					    {
						    if(animals[random1].name==win.name) animals=isDead(i,random2,animals);
						}
					}  
					if(near==2)
					{
						win=((Carnivore)(animals[random1])).fight(animals[random2],animals[nearbyAnimals[1]]);
						for (int i=0;i<near;i++)
						{
						    if(animals[i].name==win.name) animals=isWeak(i,animals,nearbyAnimals,near);
				        }   
			 	    }
			 	    if(near>=3)
			 	    {
			 	    	win=((Carnivore)(animals[random1])).fight(animals[random2],animals,nearbyAnimals,near);
			 	    	for(int i=0;i<near;i++)
			 	    	{
			 	    		if(animals[i].name==win.name) animals=isWeak(i,animals,nearbyAnimals,near);
			 	    	}	
			 	    }
			 	   	win =isHunger(win); 
			    }
		 		isWinner(animals,win); 
		 	}
		 	catch(ArrayIndexOutOfBoundsException a)
		 	{
		 		System.out.println("exception occured " +a);
		 	}
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
        	else animalMeet();
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
	 						newLocation=((Herbivores)(animals[i])).graze();
	 						isRange=isWithInRange(animals[i].range,animals[i].location[0],animals[i].location[1],newLocation);
			 			}while (isRange);

	 				}
	 				else
	 				{
			 			do
			 			{
			 				animals[i].location=((Carnivore)(animals[i])).roam();  
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
				 			(animal_array[random2]).luckyfact=(int)(animal_array[random2]).luckyfact/2;
							//System.out.println(((Animalherbivores)(animal_array[random2])).luckyfact);
							escape=((Herbivores)(animal_array[random2])).luck();
								  
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
				 			(animal_array[random2]).luckyfact=(int)((animal_array[random2])).luckyfact/2;
							//System.out.println(((Animalherbivores)(animal_array[random2])).luckyfact);
							escape=((Herbivores)(animal_array[random2])).luck(); 
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

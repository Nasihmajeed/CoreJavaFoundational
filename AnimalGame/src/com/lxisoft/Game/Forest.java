package com.lxisoft.game;
import java.util.*;
import com.lxisoft.animal.*;
public class Forest
{
	int round=1;
	ArrayList<Animal> animals = new ArrayList<Animal>();
	AnimalFight fight = new AnimalFight();
	

	public void gameStart()
	{
		Scanner in = new Scanner(System.in);
		String yn;
		Clear.cls();
		System.out.println("\t\t ANIMAL GAME ");
		System.out.println("\t --------------------------------------");
		System.out.println("\t => Start Game (yes/no) \n\t => ");
		yn=in.nextLine();
		if(yn.equals("yes"))
		{
			Clear.cls();
			System.out.println("\t\t ANIMAL GAME ");
			System.out.println("\t --------------------------------------");
			
			initializeAnimals();
			chooseMenu();
			Clear.cls();
			
		}
		else
			{
				Clear.cls();
				System.out.println("Thank You..!");}
	}
	public void chooseMenu()
	{

		Scanner in = new Scanner(System.in);
		System.out.println("\n \t 1:] View Animal List \n \t 2:] Start Game\n \t 3:] Exit");
			int ch;
			ch=in.nextInt();
			switch(ch)
			{
				case 1: 
						Clear.cls();
						printAnimalList();
						chooseMenu();
						break;
				case 2:Clear.cls();
						System.out.println("\n\t\tGame Begin");
					    System.out.println("\t---------------------------------------------\n");
						animalMeet();
						restartMenu();
						break;
				case 3 :break;
			}
	}

	public void printAnimalList()
	{
		System.out.println("+-------------------------------------Animal List--------------------------------------------------+");
		System.out.println("       Animal Name \t\t  Animal Energy \t\t Dead/Alive \t\t Killed By");
		System.out.println("+--------------------------------------------------------------------------------------------------+");
		int n=animals.size();
		for(int i=0;i<n;i++)
			{
				System.out.format("%15s %25d %30s %25s  \n" ,animals.get(i).getAnimalName() ,animals.get(i).animalEnergy,animals.get(i).getIsAlive(),animals.get(i). getKilledBy() );
			}
		System.out.println("+--------------------------------------------------------------------------------------------------+");
	}


	public void initializeAnimals()
	{
		animals.add(new Tiger());
		animals.add(new Lion());
		animals.add(new Fox());
		animals.add(new Elephant());
		animals.add(new Rabbit());
		animals.add(new Tiger());
		animals.add(new Lion());
		animals.add(new Fox());
		animals.add(new Elephant());
		animals.add(new Rabbit());


		animals.get(0).setAnimalDetail("Tiger-1",80);
		animals.get(1).setAnimalDetail("Lion-1",100);
		animals.get(2).setAnimalDetail("Fox-1",60);
		animals.get(3).setAnimalDetail("Elephant-1",50);
		animals.get(4).setAnimalDetail("Rabbit-1",18);
		
		animals.get(5).setAnimalDetail("Tiger-2",80);
		animals.get(6).setAnimalDetail("Lion-2",100);
		animals.get(7).setAnimalDetail("Fox-2",60);
		animals.get(8).setAnimalDetail("Elephant-2",50);
		animals.get(9).setAnimalDetail("Rabbit-2",18);

		animals.get(0).setStrength(70);
		animals.get(1).setStrength(80);
		animals.get(2).setStrength(40);
		animals.get(3).setStrength(90);
		animals.get(4).setStrength(20);
		
		animals.get(5).setStrength(70);
		animals.get(6).setStrength(80);
		animals.get(7).setStrength(40);
		animals.get(8).setStrength(90);
		animals.get(9).setStrength(20);
		
		animals.get(0).setRange(16);
		animals.get(1).setRange(20);
		animals.get(2).setRange(8);
		animals.get(3).setRange(12);
		animals.get(4).setRange(5);
		
		animals.get(5).setRange(16);
		animals.get(6).setRange(20);
		animals.get(7).setRange(8);
		animals.get(8).setRange(12);
		animals.get(9).setRange(5);
	}

	private int getRandomNumber()
	{
		Random rand = new Random();
		int n = rand.nextInt(10);
		return n;
	}

	public void animalMeet()
	{


		int r1,r2,n;
		n=animals.size();
		int finished=10;

		while((finished>1) )
		{
			r1=getRandomNumber();
			r2=getRandomNumber();
			if((r1==r2) || animals.get(r1).animalEnergy==0 || animals.get(r2).animalEnergy==0 )
			{
				r1=getRandomNumber();
				r2=getRandomNumber();

			}
			else
			{
				String animal1=animals.get(r1).getAnimalName();
				String animal2=animals.get(r2).getAnimalName();
				System.out.println("\n---------------------------------------------------------------------------");
				System.out.println("\t\t => Round - " + round+ " \t => " + animal1+" Meets "+animal2);
				System.out.println("---------------------------------------------------------------------------");
				if(fight.checkArea(r1,r2,animals))
				{	
								
								round++;
								System.out.print("Animal Energy -->");
								System.out.print(" Before  Fight \n");
								System.out.println("\t\t  **************");
								System.out.println("\t\t"+animal1+" <=> "+animal2);
								System.out.println("\t\t"+animals.get(r1).animalEnergy + "\t     " + animals.get(r2).animalEnergy );
								fight.assignAnimalType(r1,r2,animals);
								fight.checkFightType(r1,r2,animals);
				}
				
				
			}

			finished=gameCompleteOrNot();
		}
		checkGameWinner();
	}

	private void checkGameWinner()
	 {
	 	for(int i=0;i<10;i++)
	 	{
	 		if((animals.get(i).animalEnergy)!=0)
	 		{
	 			System.out.println("\n**************************************************");
	 			System.out.println("=> WINNER IS " + animals.get(i).getAnimalName());
	 			animals.get(i).setKilledBy("WINNER");
	 			System.out.println("**************************************************");
	 		}
	 		
	 	}
	 }

	private int gameCompleteOrNot()
	 {
	 	int finished=0;
	 	for(int k=0;k<10;k++)
	 	{
	 		if(animals.get(k).isAlive==true)
	 		{
	 			if(animals.get(k) instanceof Herbivorus)
	 				numberOfHerbi--;
	 			else
	 				numberOfCarni--;		

	 		finished++;
	 		}
	 	}
	 	return finished;
	 }

	 private void restartMenu()
	 {
	 	

	 	Scanner in = new Scanner(System.in);
		System.out.println("\n \t 1:] View Animal List \n \t 2:] Restart Game\n \t 3:] Exit");
			int ch;
			ch=in.nextInt();
			switch(ch)
			{
				case 1: 
						Clear.cls();
						printAnimalList();
						restartMenu();
						break;
				case 2: Clear.cls();
						animals.clear();
	 					initializeAnimals();
						System.out.println("\n\t\tGame Begin");
					    System.out.println("\t---------------------------------------------\n");
					    animals.clear();
	 					initializeAnimals();
						animalMeet();
						restartMenu();
						break;
				case 3 :break;
			}
	 }
}
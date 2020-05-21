package com.lxisoft.Game;
import java.util.*;
import com.lxisoft.Animal.*;
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
						chooseMenu();
						break;
				case 3 : break;
			}
	}

	public void printAnimalList()
	{
		System.out.println("-----------------Animal List--------------------");
		System.out.println("       Animal Name \t\t  Animal Energy");
		System.out.println("------------------------------------------------");
		int n=animals.size();
		for(int i=0;i<n;i++)
			{
				System.out.format("%15s %25d \n" ,animals.get(i).getAnimalName() ,animals.get(i).animalEnergy);
			}
		System.out.println("------------------------------------------------");
	}


	public void initializeAnimals()
	{
		animals.add(new Tiger());
		animals.add(new Lion());
		animals.add(new Fox());
		animals.add(new Wolf());
		animals.add(new Elephant());
		animals.add(new Tiger());
		animals.add(new Lion());
		animals.add(new Fox());
		animals.add(new Wolf());
		animals.add(new Elephant());


		animals.get(0).setAnimalDetail("Tiger-1",80);
		animals.get(1).setAnimalDetail("Lion-1",100);
		animals.get(2).setAnimalDetail("Fox-1",60);
		animals.get(3).setAnimalDetail("Wolf-1",50);
		animals.get(4).setAnimalDetail("Elephant-1",58);
		
		animals.get(5).setAnimalDetail("Tiger-2",80);
		animals.get(6).setAnimalDetail("Lion-2",100);
		animals.get(7).setAnimalDetail("Fox-2",60);
		animals.get(8).setAnimalDetail("Wolf-2",50);
		animals.get(9).setAnimalDetail("Elephant-2",58);
		
		
	}

	private int randomNumber()
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

		while(finished>1)
		{
			r1=randomNumber();
			r2=randomNumber();
			if((r1==r2) || animals.get(r1).animalEnergy==0 || animals.get(r2).animalEnergy==0 )
			{
				r1=randomNumber();
				r2=randomNumber();

			}
			else
			{
				String animal1=animals.get(r1).getAnimalName();
				String animal2=animals.get(r2).getAnimalName();
				System.out.println("\n\t\tRound - " + round+ " \t => " + animal1+" Meets "+animal2);
				System.out.println("\t----------------------------------------------------------------------------------");
				round++;
				System.out.println(animal1+" <=> "+animal2);
				System.out.println("Animal Energy Before  Fight ");
				System.out.println(animal1+"   <=>   "+animal2);
				System.out.println("  "+animals.get(r1).animalEnergy + "\t     " + animals.get(r2).animalEnergy +"  (Energy)\n");
				fight.assignAnimalType(r1,r2,animals);
				fight.checkType(r1,r2,animals);
				
				
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
	 			System.out.println("\n\n WINNER IS " + animals.get(i).getAnimalName());
	 		
	 	}
	 }

	private int gameCompleteOrNot()
	 {
	 	int finished=0;
	 	for(int k=0;k<10;k++)
	 	{
	 		if(animals.get(k).isAlive==true)
	 			finished++;
	 		
	 	}
	 	return finished;
	 }
}
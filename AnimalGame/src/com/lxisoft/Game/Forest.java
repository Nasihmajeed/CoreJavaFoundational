package com.lxisoft.Game;
import java.util.*;
import com.lxisoft.Animal.*;
public class Forest
{
	String typeOfR1,typeOfR2;
	int round=1;
	int noTiger,noLion,noFox,noWolf,noGorilla;
	public ArrayList<Animal> animals = new ArrayList<Animal>();
	

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
						System.out.println("\nGame Begin");
					    System.out.println("---------------------------------------------\n\n");
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

	private int randomNumber(int x)
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
			r1=randomNumber(n);
			r2=randomNumber(n);
			if((r1==r2) || animals.get(r1).animalEnergy==0 || animals.get(r2).animalEnergy==0 )
			{
				r1=randomNumber(n);
				r2=randomNumber(n);

			}
			else
			{
				System.out.println("\n\t\tRound - " + round);
				System.out.println("\t---------------------------------------------");
				round++;
				String animal1=animals.get(r1).getAnimalName();
				String animal2=animals.get(r2).getAnimalName();

				System.out.println(animal1+" Meets "+animal2);
				System.out.println(animal1+" <=> "+animal2);

				System.out.println("  "+animals.get(r1).animalEnergy + "\t     " + animals.get(r2).animalEnergy +"  (Energy)\n");
				setType(r1,r2);
				checkType(r1,r2);
				
				
			}

			finished=gameCompleteOrNot();
		}
		checkGameWinner();
	}





	public void checkType(int r1,int r2)
	{
		

		if(typeOfR1.equals("Herbivorus") && typeOfR2.equals("Carnivorus"))
		{
			
			((Herbivorus)animals.get(r1)).fight();
			((Carnivorus)animals.get(r2)).fight();
			herbVsCar(r1,r2);
		}
		else if(typeOfR1.equals("Carnivorus") && typeOfR2.equals("Carnivorus"))
		{
			
			((Carnivorus)animals.get(r1)).fight();
			((Carnivorus)animals.get(r2)).fight();
			carVsCar(r1,r2);
		}
		 else if(typeOfR1.equals("Herbivorus") && typeOfR2.equals("Herbivorus"))
		{
			((Herbivorus)animals.get(r1)).fight();
			((Herbivorus)animals.get(r2)).fight();
			herbVsHerb(r1,r2);
		}
		else
		{	
			
			((Carnivorus)animals.get(r1)).fight();
			((Herbivorus)animals.get(r2)).fight();
			carVsHerb(r1,r2);
		}		
	
	}

	public void carVsHerb(int r1,int r2)
	{
		int luckOfHerb = luckFactor();
		if (luckOfHerb==1)
		{
			System.out.println((animals.get(r2)).getAnimalName() +" have Luck -- It escaped from " + (animals.get(r1)).getAnimalName());
		}
		else
		{
			int won = checkEnergy(r1,r2);
			
			if(won==1)
			{
				((Carnivorus)animals.get(r1)).eat(animals.get(r2).animalEnergy);
				
			}
			printResult(won,r1,r2);
		}
	}

	public void herbVsCar(int r1,int r2)
	{

		int luckOfHerb = luckFactor();
		if (luckOfHerb==1)
		{
			System.out.println((animals.get(r1)).getAnimalName() +" have Luck -- It escaped from " + (animals.get(r2)).getAnimalName());
		}
		else
		{
			System.out.println( animals.get(r1).getAnimalName()+" have NO LUCK :) ");
			int won = checkEnergy(r1,r2);
		
			if(won==2)
			{
				((Carnivorus)animals.get(r2)).eat(animals.get(r1).animalEnergy);
				
				
			}
			printResult(won,r1,r2);
		}
	}
	public void carVsCar(int r1,int r2)
	{

		int won = checkEnergy(r1,r2);
		
		if(won==1)
		{
			
			((Carnivorus)animals.get(r1)).eat(animals.get(r2).animalEnergy);
			
		}
		if(won==2)
		{
			
			((Carnivorus)animals.get(r2)).eat(animals.get(r1).animalEnergy);
			
		}
		printResult(won,r1,r2);

	}


	public void herbVsHerb(int r1,int r2)
	{
		System.out.println("Both are Herbivorus Currently No Fight Happens ");
	}


	public int checkEnergy(int r1, int r2)
	{
		int energy1 = animals.get(r1).animalEnergy;
		int energy2 = animals.get(r2).animalEnergy;
		

		if(energy1>energy2)
		{
			
			System.out.println("\tAfter Fight");
			System.out.println("  "+animals.get(r1).animalEnergy + "\t     " + animals.get(r2).animalEnergy +"  (Energy)\n");
			return 1;
		}
		else if(energy2>energy1)
		{
			
			System.out.println("\tAfter Fight");
			System.out.println("  "+animals.get(r1).animalEnergy + "\t     " + animals.get(r2).animalEnergy +"  (Energy)\n");
			return 2;
		}
		else
		{
			int luckOf1=luckFactor();
			if(luckOf1==1)
			{
				System.out.println("==> Both Have Same Energy");
				System.out.println("==> " + animals.get(r1).getAnimalName()+ " have MORE LUCK");
				
				System.out.println("\tAfter Fight");
				System.out.println("  "+animals.get(r1).animalEnergy + "\t     " + animals.get(r2).animalEnergy +"  (Energy)\n");
				return 1;
			}
			else
			{
				System.out.println("==> Both Have Same Energy");
				System.out.println("==> " + animals.get(r2).getAnimalName()+ " have MORE LUCK");
				
				System.out.println("\tAfter Fight");
				System.out.println("  "+animals.get(r1).animalEnergy + "\t     " + animals.get(r2).animalEnergy +"  (Energy)\n");
				return 2;
			}
			
		}
	}


	public void printResult(int won,int r1,int r2)
	 {
	 	if(won==1)
	 	{
	 		System.out.println(animals.get(r1).getAnimalName() +" killed "+animals.get(r2).getAnimalName());
			(animals.get(r2)).dead();
			
	 	}
	 	else if(won==2)
	 	{
	 		System.out.println(animals.get(r2).getAnimalName() +" killed "+animals.get(r1).getAnimalName());
			(animals.get(r1)).dead();
			
	 	}
	 	else
	 	{
	 		System.out.println(animals.get(r1).getAnimalName() +" killed "+animals.get(r2).getAnimalName());
			(animals.get(r2)).dead();
			
	 	}
	 }

	 public int luckFactor()
	 {
	 	Random rand = new Random();
		int n = rand.nextInt(2);
		return n;
	 }
	 public void checkGameWinner()
	 {
	 	for(int i=0;i<10;i++)
	 	{
	 		if((animals.get(i).animalEnergy)!=0)
	 			System.out.println("\n\n WINNER IS " + animals.get(i).getAnimalName());
	 		
	 	}
	 }

	 public int gameCompleteOrNot()
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
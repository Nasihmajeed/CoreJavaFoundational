package com.lxisoft.Game;
import java.util.*;
import com.lxisoft.Animal.*;
public class Forest
{
	public ArrayList<Animal> animals = new ArrayList<Animal>();
	

	public void gameStart()
	{
		Scanner in = new Scanner(System.in);
		String yn;
		System.out.println("\t\tAnimal Game");
		System.out.println("\t\tStart Game(yes/no)");
		yn=in.nextLine();
		if(yn.equals("yes"))
		{
			Clear.cls();
			System.out.println("\nGame Begin");
			setAnimals();
			//printAnimalList();
		}
	}


	public void printAnimalList()
	{
		System.out.println("-----------Animal List-------------");
		int n=animals.size();
		for(int i=0;i<n;i++)
			{
				System.out.println((animals.get(i)).getAnimalName()+" \t "+(animals.get(i)).animalEnergy + "\n" );
			}
		System.out.println("-----------------------------------");
	}


	public void setAnimals()
	{
		animals.add(new Tiger());
		animals.add(new Lion());
		animals.add(new Fox());
		animals.add(new Wolf());
		animals.add(new Rabbit());
		animals.add(new Tiger());
		animals.add(new Lion());
		animals.add(new Fox());
		animals.add(new Wolf());
		animals.add(new Rabbit());


		animals.get(0).setAnimalDetail("Tiger_1",80);
		animals.get(1).setAnimalDetail("Lion_1",100);
		animals.get(2).setAnimalDetail("Fox_1",60);
		animals.get(3).setAnimalDetail("Wolf_1",50);
		animals.get(4).setAnimalDetail("Rabbit_1",20);
		
		animals.get(5).setAnimalDetail("Tiger_2",80);
		animals.get(6).setAnimalDetail("Lion_2",100);
		animals.get(7).setAnimalDetail("Fox_2",60);
		animals.get(8).setAnimalDetail("Wolf_2",50);
		animals.get(9).setAnimalDetail("Rabbit_2",20);
		
		animalMeet();
	}

	public int randomNumber(int x)
	{
		Random rand = new Random();
		int n = rand.nextInt(x);
		return n;
	}

	public void animalMeet()
	{
		int r1,r2,n;
		for(n=animals.size();n>1;)
		{
			r1=randomNumber(n);
			r2=randomNumber(n);
			if((r1==r2))
			{
				r2=randomNumber(n);
			}
			else
			{
				String animal1=animals.get(r1).getAnimalName();
				String animal2=animals.get(r2).getAnimalName();
				System.out.println(animal1+" Meets "+animal2);
				int won = checkEnergy(r1,r2);
				printResult(won,r1,r2);
			}
			n=animals.size();
		}
		System.out.println("Winner is " + animals.get(0).getAnimalName());
	}


	public int checkEnergy(int r1, int r2)
	{
		int energy1 = animals.get(r1).animalEnergy;
		int energy2 = animals.get(r2).animalEnergy;

		if(energy1>energy2)
			return 1;
		else if(energy2>energy1)	
			return 2;
		else
			return 0;
	}


	public void printResult(int won,int r1,int r2)
	 {
	 	if(won==1)
	 	{
	 		System.out.println(animals.get(r1).getAnimalName() +" killed "+animals.get(r2).getAnimalName());
			System.out.println("---------------------------------------------");
			animals.remove(r2);
	 	}
	 	else if(won==2)
	 	{
	 		System.out.println(animals.get(r2).getAnimalName() +" killed "+animals.get(r1).getAnimalName());
			System.out.println("---------------------------------------------");
			animals.remove(r1);
	 	}
	 	else
	 	{
	 		System.out.println(animals.get(r1).getAnimalName() +" killed "+animals.get(r2).getAnimalName());
			System.out.println("---------------------------------------------");
			animals.remove(r2);
	 	}
	 }
}
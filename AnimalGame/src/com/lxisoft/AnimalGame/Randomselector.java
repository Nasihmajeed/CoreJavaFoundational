public class RandomSelection
{
	public static int generateRandomNumber(int x )
	{
	
		Random r =new Random();
		int n = r.nextInt(x);
		return n;

	}

	public static int getNumberOfAnimalsAlive(Arraylist<Animal> gameList)
	{
		int numberOfAnimalsAlive=0;
		for (Animal animal : gameList)
		{
			if(animal.getIsAlive())
			{
				numberOfAnimalsAlive++;				
			}

		}

		return numberOfAnimalsAlive;
	}
	public static String getRandomAnimal()
	{
		String [] animalNames = {""}
	}
	

}

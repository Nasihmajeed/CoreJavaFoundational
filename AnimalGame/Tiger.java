class Tiger extends Animal implements Carnivores 
{
		int energyLevel=10;
		int preyStamina;
		//Deer d=new Deer();
		Animal a=new Animal();
	
	public void fight(Animal a)
		{
			preyStamina=a.getEnergyLevel();
			while(preyStamina>0)
			{
			System.out.println("The "+a.getClass().getName()+" is running");
			preyStamina--;
			}
			System.out.println("The "+a.getClass().getName()+" is caught");
			System.out.println("The "+a.getClass().getName()+" is Dead");
		}
	@Override
	public void stamina()
	{
	
	
	}

}
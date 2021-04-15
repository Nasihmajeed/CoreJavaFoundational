class Tiger extends Animal implements Carnivores 
{
		int energyLevel=10;
		int preyStamina;
		Deer d=new Deer();
	@Override
	public void fight()
		{
			preyStamina=d.getEnergyLevel();
			while(preyStamina>0)
			{
			System.out.println("The "+d.getClass().getName()+" is running");
			preyStamina--;
			}
			System.out.println("The "+d.getClass().getName()+" is caught");
			System.out.println("The "+d.getClass().getName()+" is Dead");
		}
	@Override
	public void stamina()
	{
	
	
	}

}
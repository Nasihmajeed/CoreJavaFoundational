import java.util.*;

class Fight
{

	
	int preyStamina,hunterStamina;
public void fight(Animal a,Animal b)
		{
	
				
		if(( a instanceof Herbivores)&&( b instanceof Herbivores))
			{
		
				System.out.println("There is no fight");
				//break;
			}
			
			else if(( a instanceof  Herbivores)|| ( b instanceof Carnivores))
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
			else if(( a instanceof  Carnivores)||( b instanceof Herbivores))
			{
				preyStamina=b.getEnergyLevel();
			while(preyStamina>0)
			{
			System.out.println("The "+b.getClass().getName()+" is running");
			preyStamina--;
			}
			System.out.println("The "+b.getClass().getName()+" is caught");
			System.out.println("The "+b.getClass().getName()+" is Dead");
			}
			else if(( a instanceof  Carnivores)||( b instanceof Carnivores))
			{
				preyStamina=a.getEnergyLevel();
				hunterStamina=b.getEnergyLevel();
				if(preyStamina<hunterStamina)
				{
			while(preyStamina>0)
			{
			System.out.println("The "+b.getClass().getName()+" is running");
			preyStamina--;
			}
			System.out.println("The "+b.getClass().getName()+" is caught");
			System.out.println("The "+b.getClass().getName()+" is Dead");
			}
				}
			
				else
				{
							while(hunterStamina>0)
						{
						System.out.println("The "+b.getClass().getName()+" is running");
						preyStamina--;
						}
					System.out.println("The "+b.getClass().getName()+" is caught");
					System.out.println("The "+b.getClass().getName()+" is Dead");
				}
				
			
		}

}
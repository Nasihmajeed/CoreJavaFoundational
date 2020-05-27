
package com.lxisoft.behaviours.animalbehaviour ;

import com.lxisoft.forest.Animal ;
import com.lxisoft.game.GameHelper ;
import com.lxisoft.ui_elements.DisplayElements ;

public class PassivePrey implements AnimalBehaviour
{
	public void fight(Animal animal1,Animal animal2)
	{
		
		if(animal2.getEnergy() == 0 || !animal2.getIsAlive() || animal2.getStrength() == 0 )
		{
			System.out.print("\n\n\t\t\t*** " + animal1.getName() + " EASILY KILLS " + animal2.getName()+" *** \n") ;
			animal2.setHealth(0) ;
			animal2.setStrength(0) ;
			animal2.setIsAlive(false) ;

			GameHelper.reduceAnimalEnergy(animal1,15) ;
			GameHelper.reduceAnimalStrength(animal1,20) ;
		}
		else
		{
			GameHelper.reduceAnimalStats(animal1,animal2) ;
			GameHelper.reduceAnimalStats(animal1,animal2) ;
			if(!animal2.getIsAlive())
				DisplayElements.printKillMessage(animal1,animal2) ;
			else if(!animal1.getIsAlive())
				DisplayElements.printKillMessage(animal2,animal1) ;
		}
	}
}

 package com.lxisoft.jungle;
  import com.lxisoft.animals.*;
 
import java.util.*;

public class Forest
{

	
	int preyStamina,hunterStamina;
public void fight(Animal a,Animal b)
		{
	
				
		if(( a instanceof Herbivores)&&( b instanceof Herbivores))
			{
		System.out.println("--------------------------------------------------------------");
				System.out.println("There is no fight");
				System.out.println("--------------------------------------------------------------");
				
				System.out.println("The "+a.getClass().getSimpleName()+" Energy level is:"+a.getEnergyLevel());
				System.out.println("--------------------------------------------------------------");
				
				System.out.println("The "+b.getClass().getSimpleName()+" Energy level is:"+b.getEnergyLevel());
				System.out.println("--------------------------------------------------------------");
				//break;
			}
			
			else if(( a instanceof  Herbivores)|| ( b instanceof Carnivores))
			{System.out.println("--------------------------------------------------------------");
				System.out.println("The "+a.getClass().getSimpleName()+" Energy level is:"+a.getEnergyLevel());
				System.out.println("--------------------------------------------------------------");
				System.out.println("The "+b.getClass().getSimpleName()+" Energy level is :"+b.getEnergyLevel());
				System.out.println("--------------------------------------------------------------");
				System.out.println("---------------------------Fighting -----------------------------------");
				preyStamina=a.getEnergyLevel();
			while(preyStamina>0)
			{
			System.out.println("The "+a.getClass().getSimpleName()+" energy level is decreasing "+preyStamina);
			preyStamina--;
			}
			System.out.println("--------------------------------------------------------------");
			System.out.println("The "+a.getClass().getSimpleName()+" is caught by "+b.getClass().getSimpleName());
			System.out.println("--------------------------------------------------------------");
			System.out.println("The "+a.getClass().getSimpleName()+" is Dead");
						System.out.println("--------------------------------------------------------------");
			System.out.println("The winner is "+b.getClass().getSimpleName());
			System.out.println("--------------------------------------------------------------");
			}
			else if(( a instanceof  Carnivores)||( b instanceof Herbivores))
			{System.out.println("--------------------------------------------------------------");
				System.out.println("The "+b.getClass().getSimpleName()+" Energy level is:"+b.getEnergyLevel());
				System.out.println("--------------------------------------------------------------");
				System.out.println("The "+a.getClass().getSimpleName()+" Energy level is :"+a.getEnergyLevel());
				System.out.println("--------------------------------------------------------------");
				System.out.println("---------------------------Fighting -----------------------------------");
				preyStamina=b.getEnergyLevel();
			while(preyStamina>0)
			{
			System.out.println("The "+b.getClass().getSimpleName()+" energy level is decreasing "+preyStamina);
			preyStamina--;
			}
			System.out.println("--------------------------------------------------------------");
			System.out.println("The "+b.getClass().getSimpleName()+" is caught by "+a.getClass().getSimpleName() );
				System.out.println("--------------------------------------------------------------");
			System.out.println("The "+b.getClass().getSimpleName()+" is Dead");
			System.out.println("--------------------------------------------------------------");
			System.out.println("The winner is "+a.getClass().getSimpleName());
			System.out.println("--------------------------------------------------------------");
			}
			else if(( a instanceof  Carnivores)||( b instanceof Carnivores))
			{System.out.println("--------------------------------------------------------------");
				System.out.println("The "+a.getClass().getSimpleName()+" Energy level is:"+a.getEnergyLevel());
				System.out.println("--------------------------------------------------------------");
				System.out.println("The "+b.getClass().getSimpleName()+" Energy level is :"+b.getEnergyLevel());
				System.out.println("--------------------------------------------------------------");
				System.out.println("---------------------------Fighting -----------------------------------");
				
				preyStamina=a.getEnergyLevel();
				hunterStamina=b.getEnergyLevel();
				if(preyStamina<hunterStamina)
				{
			while(preyStamina>0)
			{
			System.out.println("The "+b.getClass().getSimpleName()+" energy level is decreasing "+preyStamina);
			preyStamina--;
			}
			System.out.println("--------------------------------------------------------------");
			System.out.println("The "+b.getClass().getSimpleName()+" is caught ");
			System.out.println("--------------------------------------------------------------");
			System.out.println("The "+b.getClass().getSimpleName()+" is Dead ");
						System.out.println("--------------------------------------------------------------");
			System.out.println("The winner is "+a.getClass().getSimpleName());
			System.out.println("--------------------------------------------------------------");
			}
				}
			
				else
				{
							while(hunterStamina>0)
						{
						System.out.println("The "+b.getClass().getSimpleName()+"energy level is decreasing "+preyStamina);
						preyStamina--;
						}
							System.out.println("--------------------------------------------------------------");
							System.out.println("The "+b.getClass().getSimpleName()+" is caught by "+a.getClass().getSimpleName());
							System.out.println("--------------------------------------------------------------");
							System.out.println("The "+b.getClass().getSimpleName()+" is Dead");
							System.out.println("--------------------------------------------------------------");
							System.out.println("The winner is "+a.getClass().getSimpleName());
							System.out.println("--------------------------------------------------------------");
				}
				
			
		}

}
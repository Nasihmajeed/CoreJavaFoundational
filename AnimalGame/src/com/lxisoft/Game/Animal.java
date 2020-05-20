package com.lxisoft.Game;
public class Animal
{
	private String animalName;
	public int animalEnergy;
	boolean isAlive;



	public void setAnimalName(String name)
	{
		animalName=name;
		isAlive=true;
	}

	
	public String getAnimalName()
	{
		return animalName;
	}
	public void setAnimalDetail(String name,int energy)
	{
		isAlive=true;
		animalName=name;
		animalEnergy=energy;
	}

	public void setAnimalEnergy(int ener)
	{
		animalEnergy=ener;
	}


	public void updateAnimalEnergy(int otherEnergy)
	{
		this.animalEnergy=this.animalEnergy+(int)(otherEnergy*0.15);
		if(animalEnergy>100)
		{
			this.setAnimalEnergy(100);
		}
	}


	public void dead()
	{
		this.animalEnergy=0;
		isAlive=false;
	}

	public void getType(int r1 , int r2,ArrayList<Animal> animals)
	{
		if(animals.get(r1) instanceof Herbivorus)
			typeOfR1="Herbivorus";
		else 
			typeOfR1="Carnivorus";

		if(animals.get(r2) instanceof Herbivorus)
			typeOfR2="Herbivorus";
		else 
			typeOfR2="Carnivorus";
	}

}
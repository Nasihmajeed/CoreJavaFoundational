package com.lxisoft.Game;
public class Animal
{
	private String animalName;
	public int animalEnergy;



	public void setAnimalName(String name)
	{
		animalName=name;
	}

	
	public String getAnimalName()
	{
		return animalName;
	}
	public void setAnimalDetail(String name,int energy)
	{
		animalName=name;
		animalEnergy=energy;
	}

	public void setAnimalEnergy(int ener)
	{
		animalEnergy=ener;
	}
	public void updateAnimalEnergy(int otherEnergy)
	{
		this.animalEnergy=this.animalEnergy+(int)(otherEnergy/0.5);
		if(animalEnergy>100)
		{
			this.setAnimalEnergy(100);
		}
	}
	public void dead()
	{
		this.animalEnergy=0;
	}

}
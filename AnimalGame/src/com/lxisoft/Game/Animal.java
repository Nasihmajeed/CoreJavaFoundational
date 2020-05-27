package com.lxisoft.game;
public class Animal
{
	private String animalName;
	public int animalEnergy;
	boolean isAlive;
	private String type;
	int luck;
	String killedBy;
	int strength, range;
	int[] location = new int[2];

public void setKilledBy(String by)
{
	killedBy=by;
}

public String getKilledBy()
{
	return killedBy;
}

public int getRange()
{
	return range;
}
public void setRange(int r)
{
	range = r;
}


	public void setAnimalName(String name)
	{
		animalName=name;
		isAlive=true;
	}


	public void setStrength(int str)
	{
		strength=str;
	}

	public int getStrength()
	{
		return strength;
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
		killedBy="----------";
	}
	public void setType(String s)
	{
		type= s;
	}

	public String getType()
	{
		return type;
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
	public String getIsAlive()
	{
		if(isAlive==true)
			return "Alive";
		else
			return "Dead";
	}
	// public void setLocation(int x , int y)
	// {
	// 	location[0]=x;
	// 	location[1]=y;
	// }

	// public int[] getLocation()
	// {
	// 	return location;
	// }

}
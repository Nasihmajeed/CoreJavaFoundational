class Crocodile extends Animal implements Carnivore
{

int energy,stamina,distance,luckFactor;
String name;

public void setName(String name)
{
	this.name=name;
}
public void getName()
{
	return name;
}

public void setEnergy(int energy)
{
	this.energy=energy;
}

public void setDistance(int distance)
{
	this.distance=distance;
}

public void setStamina(int stamina)
{
	this.stamina=stamina;
}

}
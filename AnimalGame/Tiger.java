class Tiger extends Animal implements Carnivore
{

private int energy,stamina,distance,luckFactor;
private String name;

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
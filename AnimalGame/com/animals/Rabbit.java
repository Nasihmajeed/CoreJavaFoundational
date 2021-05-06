import java.util.*;
import java.util.Random;

class Rabbit extends Animal  implements herbivore
{

private int energy,stamina,distance,luckFactor;
private String name;
Random r=new Random();

public void setName(String name)
{
	this.name=name;
}
public void getName()
{
	return name;
}

public void setStamina(int stamina)
{
	this.stamina=stamina;
}

public void setEnergy(int energy)
{
	this.energy=energy;
}

public void setDistance(int distance)
{
	this.distance=distance;
}

public int getLuckFactor()
{
	luckFactor=r.nextInt(2);
}

}
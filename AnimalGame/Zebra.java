import java.util.*;
import java.util.Random;

class Zebra extends Animal  implements herbivore
{

int energy,stamina,distance,luckFactor;
String name;
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
	this.stamina=6;
}

public void setEnergy(int energy)
{
	this.energy=5;
}

public void setDistance(int distance)
{
	this.distance=4;
}

public int getLuckFactor()
{
	luckFactor=r.nextInt(2);
}

}
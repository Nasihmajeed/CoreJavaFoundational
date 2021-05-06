import java.util.*;
import java.util.Random;

class Deer extends Animal  implements herbivore
{

private int energy,stamina,distance,luckFactor;

Random r=new Random();

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
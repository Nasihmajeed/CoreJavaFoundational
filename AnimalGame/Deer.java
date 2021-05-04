import java.util.*;
import java.util.Random;

class Deer extends Animal  implements herbivore
{

int energy,stamina,distance,luckFactor;

Random r=new Random();

public void setStamina(int stamina)
{
	this.stamina=5;
}

public void setEnergy(int energy)
{
	this.energy=5;
}

public void setDistance(int distance)
{
	this.distance=3;
}

public int getLuckFactor()
{
	luckFactor=r.nextInt(2);
}

}
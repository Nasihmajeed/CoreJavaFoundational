import java.util.*;
import java.util.Random;

class Rabbit extends Animal  implements herbivore
{

int energy,stamina,distance,luckFactor;

Random r=new Random();

public void setStamina(int stamina)
{
	this.stamina=3;
}

public void setEnergy(int energy)
{
	this.energy=4;
}

public void setDistance(int distance)
{
	this.distance=2;
}

public int getLuckFactor()
{
	luckFactor=r.nextInt(2);
}

}
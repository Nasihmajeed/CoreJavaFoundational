import java.util.*;
import java.util.Random;

class Antelope extends Animal  implements herbivore
{

int energy,stamina,distance,luckFactor;

Random r=new Random();

public void setStamina(int stamina)
{
	this.stamina=6;
}

public void setEnergy(int energy)
{
	this.energy=6;
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
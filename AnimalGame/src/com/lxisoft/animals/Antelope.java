package src.com.lxisoft.animals;

import java.util.*;
import java.util.Random;

public class Antelope extends Animal implements Herbivore
{

private int luckFactor;

Random r=new Random();
    
	
                                                        //luckFactor
public int getLuckFactor()
{
	luckFactor=r.nextInt(2);
	return luckFactor;
}

}
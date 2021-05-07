package com.animals;

import java.util.*;
import java.util.Random;

public class Deer extends Animal  implements Herbivore
{

private int luckFactor;

Random r=new Random();

public int getLuckFactor()
{
	luckFactor=r.nextInt(6);
	return luckFactor;
}

}
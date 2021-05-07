package com.animals;

import java.util.*;
import java.util.Random;

public class Zebra extends Animal  implements Herbivore
{

private int luckFactor;

Random r=new Random();

                                                  //luckFactor
public int getLuckFactor()
{
	luckFactor=r.nextInt(3);
	return luckFactor;
}

}
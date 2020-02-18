package com.lxisoft.forest;
import java.util.*;

public abstract class Animal
{
 
 private String animalname;
 private int animalStrength;
private boolean isAlive;
private int x,y;
public void setAnimalName(String arg)
{
	this.animalname=arg;

}

public String getAnimalName()
{
	return animalname;
}

public void setAnimalStrength(int str)
{
	this.animalStrength=str;
}
		 
public int getAnimalStrength()
{
	return animalStrength; 
}
public void setAlive(boolean a)
{
	isAlive=a;
}
public boolean getAlive()
{
	return isAlive;

}

public void setxaxis(int x)
{
	this.x=x;
}
public int getxaxis()
{
	return x;

}

public void setyaxis(int y)
{
	this.y=y;
}
public int getyaxis()
{
	return y;

}
}
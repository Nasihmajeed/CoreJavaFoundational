package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
public interface Carnivore
{
	public Animal getFight(Animal animal);
	public Animal getFight(Animal animal,Animal animal1);
	public Animal getFight(Animal animal,Animal[] animal1,int[] near, int count);
	public int[] getRoam();
	
} 
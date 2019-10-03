package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
public interface Herbivore
{
	public void escape(Animal animal);
	public void escape(Animal animal1,Animal animal2);
	public void escape(Animal animal1,Animal animal2,Animal animal3);
	public void escape(Animal[] animalArr,int[] nearbyAnimal);                   
	public int[] graze();
}
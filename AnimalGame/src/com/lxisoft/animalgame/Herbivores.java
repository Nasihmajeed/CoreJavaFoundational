package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
public interface Herbivores
{
	public abstract int attack(Animal enemy1);
	public abstract int attack(Animal enemy1,Animal enemy2);
	public abstract int attack(Animal[] enemy,int e);
	public abstract int[] graze();
	public abstract void run();
	public abstract void eat();
}
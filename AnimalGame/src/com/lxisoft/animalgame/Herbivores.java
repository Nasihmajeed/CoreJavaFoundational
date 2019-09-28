package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
public interface Herbivores
{
	public abstract void attack(Animal enemy1);
	public abstract void attack(Animal enemy1,Animal enemy2);
	public abstract int[] graze();
}
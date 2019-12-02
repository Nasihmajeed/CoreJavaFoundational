package com.lxisoft.animalgame;

public interface Herbivores {
	int attack(Animal enemy1);

	int attack(Animal enemy1, Animal enemy2);

	int attack(Animal[] enemy, int e);

	public abstract int[] graze();

	public abstract void run();

	public abstract void eat();
}
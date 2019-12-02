package com.lxisoft.animalgame;

public abstract class Animal {

	public String animalName;
	public int strength;
	public int range;
	public boolean isDead;
	public int luck;
	public Position pos;
	public int sight;
	public Hunger hunger;
	public int speed;

	public Animal() {
		  
		this.animalName = animalName;
	}

	public abstract void run();

	public abstract void eat();

}

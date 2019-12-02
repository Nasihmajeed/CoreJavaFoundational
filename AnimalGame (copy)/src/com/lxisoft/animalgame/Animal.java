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
		//this();
		this.animalName = animalName;
		
	}

	public abstract void run();

	public abstract void eat();
	public int attack(Animal a1,Animal a2){ return 0;}
	public abstract void bite();
	public abstract int[] roam();

}
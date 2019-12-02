package com.lxisoft.animalgame;

import com.lxisoft.animalgame.*;

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

	// public Animal(String animalName, int strength, int range, boolean isDead, int luck, Position pos, int sight,
	// 		Hunger hunger, int speed) {
	// 	 // this();
	// 	this.animalName = animalName;
	// 	this.strength = strength;
	// 	this.range = range;
	// 	this.isDead = isDead;
	// 	this.luck = luck;
	// 	this.pos = pos;
	// 	this.sight = sight;
	// 	this.hunger = hunger;
	// 	this.speed = speed;
	// }

	public abstract void run();

	public abstract void eat();
	public static void main (String[] args)
	{
		
	}

}
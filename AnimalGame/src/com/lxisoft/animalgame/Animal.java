package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
public abstract class Animal
{
	public String animalName;
	public int strength;
	public boolean isDead;
    public int range;
    public int locationX,locationY;
    public int sight;
    public Hunger hunger;
    public GameLevel speed;

  	public abstract void  run();
  	public abstract void  eat();
  	
}
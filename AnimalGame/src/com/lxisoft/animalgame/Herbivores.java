package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Forest;
import com.lxisoft.animalgame.Bear;
import com.lxisoft.animalgame.Rabbit;
public interface Herbivores
{
	public Animal escape(Animal animal);
	public int[] graze();
}
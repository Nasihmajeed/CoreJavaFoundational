package com.lxisoft.animals;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Herbivorus;
public class Deer extends Animal implements Herbivorus
{
	public String meet()
	{
		String behaviour = "Herbivorus";
		return behaviour;
	}
}
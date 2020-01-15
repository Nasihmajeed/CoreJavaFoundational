package com.lxisoft.animals;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Carnivorus;
public class Tiger extends Animal implements Carnivorus
{
	public String kill()
	{
		String behaviour = "Carnivorus";
		return behaviour;
	}
}
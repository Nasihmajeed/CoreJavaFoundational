package com.Lxisoft.game;
import java.util.Random;

public class Dice {

	private Random random;
	public Dice()
	{
		Random auto = new Random();
	}
	public int rollDice()
	{
		return random.nextInt(6)+1;
	}
}
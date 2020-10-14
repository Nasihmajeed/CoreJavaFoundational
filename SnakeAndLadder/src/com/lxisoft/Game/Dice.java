package com.lxisoft.Game;
import java.util.ArrayList;
import java.util.Random;

public class Dice
{
	ArrayList<Dice> d = new ArrayList<Dice>();
	
	private int number;

	public void setNumber(int a)
	{
       this.number = a;
	}

	public int getNumber()
	{
		return number;
	}

	public void setDice()
    {
    	d.add(new Dice());
        d.get(0).setNumber(1);
        d.add(new Dice());
        d.get(1).setNumber(2);
        d.add(new Dice());
        d.get(2).setNumber(3);
        d.add(new Dice());
        d.get(3).setNumber(4);
        d.add(new Dice());
        d.get(4).setNumber(5);
        d.add(new Dice());
        d.get(5).setNumber(6);        
    }

      public int random()
    {
    	Random r = new Random();
    	int random = r.nextInt(6);
    	return random; 
    }
}
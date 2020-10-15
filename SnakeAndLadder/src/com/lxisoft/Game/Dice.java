package com.lxisoft.Game;
import java.util.Random;

public class Dice
{
    public int random()
    {
    	Random r = new Random();
    	int random = 0;
    	while(true)
    	{
    		random=r.nextInt(7);
    		if(random != 0)
    		{
    			break;
    		}
    	}
    	return random; 
    }
}
package com.lxisoft.Game;
import java.util.Random;
public class Players
{
	private String name;
	private int position;
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setPosition(int position)
	{
		this.position = position;
	}
	public int getPosition()
	{
		return position;
	}
	public int random()
    {
    	Random ran = new Random();
        int random = 0;
        while(true)
        {
        	random = ran.nextInt(7);
        	if(random!=0)
        	{
        		break;
        	}
        }
        return random;
    }
}

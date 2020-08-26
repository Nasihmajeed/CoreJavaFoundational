package com.lxisoft.Game;

public class Blank
{
	public void clear()
	{
		try 
		{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();

		}
		catch (Exception e)
		{
			
		}
	}
}
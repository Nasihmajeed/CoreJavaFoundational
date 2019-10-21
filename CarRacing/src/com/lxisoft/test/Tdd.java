package com.lxisoft.test;
import com.lxisoft.carracing.*;

public class Tdd
{
	public static void main(String[] args)
	{
		Race race=new Race();
		try
		{
			race.raceingSpot();
			race.nonLuxuriousCars();
			race.totalCars();
			race.raceStart();
		}
		catch(Exception e)
		{
			System.out.println("Exception occured:"+e);
		}
	}
}   
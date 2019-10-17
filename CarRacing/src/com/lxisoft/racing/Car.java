package com.lxisoft.racing;
import com.lxisoft.racing.*;

public abstract class Car
{
	public int number;
	public String driver;
	public double speed;
	public Engine engine;
	public Tyre tyre;

	public void setDetails()
	{
		System.out.println(" Number = " + number+" Driver= "+ driver + " speed= " + speed +" engine = "+ engine+ " fuel = "+fuel + " tyre = "+tyre);
	}
	public void setDriverName()
	{
		System.out.println(" Driver= "+ driver );
	}
	public double getSpeed(int distance)
	{
		double pv=distance/speed ;
		return pv;
	}
	public void setPV()
	{
		double tyreFactor=0;
		double fuelFactor=0;
		double ccFactor=0;
		double luxFactor=1;
		switch(engine)
		{
			case 1000: ccFactor=1; break;
			case 1200: ccFactor=1.2; break;
			case 1300: ccFactor=1.3; break;
			case 1500: ccFactor=1.5; break;
		}
		switch(fuel)
		{
			case "petrol" : fuelFactor=1.2; break;
			case "disel" : fuelFactor=1.5; break;
		}
		switch(tyre)
		{
			case "mrf" : tyreFactor=1.5; break;
			case "tvs" : tyreFactor=1.3; break;			
			case "neon" : tyreFactor=1.1; break;
		}
		if (this instanceof Luxury)
		{
			luxFactor=1.1;
		}
		speed=speed*tyreFactor*fuelFactor*ccFactor*luxFactor;
	}
	





}
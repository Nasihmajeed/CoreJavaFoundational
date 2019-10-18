package com.lxisoft.racing;
import com.lxisoft.racing.*;

public class Car
{
	public int number;
	public String driver;
	public double speed;
	public Engine engine=new Engine();
	public Tyre[] tyre=new Tyre[4];
	

	public void setDetails()
	{
		System.out.println(" Number = " + number+" Driver= "+ driver + " speed= " + speed +" engine = "+ engine.cc+ " fuel = "+engine.fuel + " tyres = "+tyre[0].manufacture +" "+tyre[1].manufacture +" "+tyre[2].manufacture +" "+tyre[3].manufacture);
	}
	public void setDriverName()
	{
		System.out.println(" Driver= "+ driver );
	}
	public double getResult(int distance)
	{
		double time=distance/speed ;
		return time;
	}
	public double getResult(int timeSecond, int timeMinute)
	{
		timeSecond+=(timeMinute*60);
		double distance=timeSecond*speed ;
		return distance;
	}
	public void setStart()
	{
		double tyreFactor=0;
		double fuelFactor=0;
		double ccFactor=0;
		double luxFactor=1;
		switch(engine.cc)
		{
			case 1000: ccFactor=1; break;
			case 1200: ccFactor=1.2; break;
			case 1300: ccFactor=1.3; break;
			case 1500: ccFactor=1.5; break;
		}
		switch(engine.fuel)
		{
			case "petrol" : fuelFactor=1.2; break;
			case "disel" : fuelFactor=1.5; break;
		}
		for(int i=0; i<4; i++)
		{
			switch(tyre[i].manufacture)
			{
				case "mrf" : tyreFactor+=1.5; break;
				case "tvs" : tyreFactor+=1.3; break;			
				case "neon" : tyreFactor+=1.1; break;
			}
		}
		if (this instanceof Luxury)
		{
			luxFactor=1.1;
		}
		tyreFactor=tyreFactor/4;
		speed=speed*tyreFactor*fuelFactor*ccFactor*luxFactor;
	}
	





}
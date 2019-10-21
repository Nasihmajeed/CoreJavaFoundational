package com.lxisoft.carproject;
import com.lxisoft.carproject.*;
public class Car 
{
	public String name;
	public int normalSpeed=60;
	public float practicalSpeed;
	public Engine engine;
	public Tyre[] tyres;

	public void tyreDetails()
	{
		for(int i=0;i<4;i++)
		{
			Tyre tyre=new Tyre();
			int a=(int) (Math.random()*4);
		
			switch(a)
	    	{
	    		case 0: tyre.setBrand("MRF"); break;
	    		case 1: tyre.setBrand("Appollo"); break;
	    		case 2: tyre.setBrand("TVS"); break;
	    		case 3: tyre.setBrand("CEAT"); break;
	    	}
	    	switch(a)
	    	{
	    		case 0: tyre.setEfficiency(8); break;
	    		case 1: tyre.setEfficiency(6); break;
	    		case 2: tyre.setEfficiency(5); break;
	    		case 3: tyre.setEfficiency(4); break;
	    	}
	    	tyres[i]=tyre;
		}
	}
	public void engineDetails(int e)
	{
		engine=new Engine();
		switch(e)
		{
			case 1: engine.setEngineCC(1.2F); break;
			case 2: engine.setEngineCC(1.3F); break;
		}
		switch(e)
		{
			case 1: engine.setFuelType("Petrol"); break;
			case 2: engine.setFuelType("Diesel"); break;
		}
		int a=(int) (Math.random()*2);
		switch(a)
		{
			case 0: engine.setPower(6); break;
			case 1: engine.setPower(4); break;
		}
	}
	public float raceSpeed()
	{
		
		int total=0;
		for(int j=0;j<4;j++)
		{	
			total=this.tyres[j].getEfficiency();
			total+=total;
		}
		int totalEfficiency=(total)/4;
		int enginePower=engine.getPower();
		float engineCc=engine.getEngineCC();
		this.practicalSpeed=(this.normalSpeed)*(totalEfficiency)*(enginePower)*(engineCc);
		System.out.println("\tpracticalSpeed--"+practicalSpeed);
		return practicalSpeed;
	}
	public float startRace(Car car,int distance)
	{
		float time=(distance)/(car.practicalSpeed);
		return time;
	}
	public float startRace(Car car)
	{
		int raceTime=50;
		float distance=(raceTime)*(car.practicalSpeed);
		return distance;
	}


}

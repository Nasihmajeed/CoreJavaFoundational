package com.lxisoft.carrise;
import com.lxisoft.carrise.*;
public class Car 
{
	public String carName;
	public int basicSpeed=60;
    public double practicalVelocity;
	public Engine engine=new Engine();
    Tyre[] tyre;

    public void tyreDetails()
    {
    	tyre=new Tyre[4];
    	for(int i=0;i<4;i++)
    	{
    		tyre[i]=new Tyre();	
    		int x=(int)(Math.random()*4);
	    	switch(x)
	    	{
	    		case 0:tyre[i].brand="JK";break;
	    		case 1:tyre[i].brand="APOLLO";break;
	    		case 2:tyre[i].brand="MRF";break;
	    		case 3:tyre[i].brand="CEAT";break;
	    	}
	    }
	}
	
	public void engineDetails()
	{
		int x=(int)(Math.random()*3);
		switch(x)
		{
			case 0:engine.power=1000;break;
			case 1:engine.power=1500;break;
			case 2:engine.power=2000;break;
		}
		int y=(int)(Math.random()*2);
		switch(y)
		{
			case 0:engine.fuelType="Petrol";break;
			case 1:engine.fuelType="Disel";break;
		}
	}



    public double raceSpeed()
	{
		double tyreFactor=0;
		double fuelFactor=0;
		double engineFactor=0;
		double luxuryFactor=1;
        for(int i=0;i<4;i++)
        {
			switch(tyre[i].brand)
			{
				case "JK":tyreFactor+=1.1;break;
				case "APOLLO":tyreFactor+=1.2;break;
				case "MRF":tyreFactor+=1.3;break;
				case "CEAT":tyreFactor+=1.4;break;
			}
		}
		tyreFactor=(tyreFactor/4);
         
         switch(engine.fuelType)
         {
         	case "Petrol":fuelFactor=1.2;break;
         	case "Disel":fuelFactor=1.5;break;
         }

         switch(engine.power)
         {
         	case 1000:engineFactor=1.1;break;
         	case 1500:engineFactor=1.2;break;
         	case 2000:engineFactor=1.3;break;
         }
         
         if(this instanceof LuxuryCar)
         {
         	luxuryFactor=1.2;
         }

		double practicalVelocity=(basicSpeed)*(tyreFactor)*(engineFactor)*(fuelFactor)*(luxuryFactor);
		
		System.out.println("\n");
		return practicalVelocity;
	}

	public double start(int distance)
	{
		practicalVelocity=raceSpeed();
		double time=(distance)/(practicalVelocity);
		System.out.println("\ncar name:"+carName+" time:"+time);
		return time;

	}
}

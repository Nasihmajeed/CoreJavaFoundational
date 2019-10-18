package com.lxisoft.carracing;
import com.lxisoft.carracing.*;

public class Car
{
	String carName;
	int basicSpeed=60;
	Engine engine=new Engine();
	Tyre tyre=new Tyre();

	public double start(int distance)																					
	{
		double vTime=0,vSpeed=0;
		double speedFactor=vehicle();
		vSpeed=speedFactor*this.basicSpeed;
		vTime=distance/vSpeed;
		System.out.print(" carname-"+this.carName+"  pv is-"+vSpeed+" time-"+vTime+"S\n");
		return vTime;
	}

	public double start(float time)																					
	{
		double vDistance=0,vSpeed=0;
		double speedFactor=vehicle();					
		vSpeed=speedFactor*this.basicSpeed;
		vDistance=vSpeed*time;
		System.out.print(" carname-"+this.carName+"  pv is-"+vSpeed+" dis-"+vDistance+"M\n");
		return vDistance;
	}

	public double vehicle()
	{
		double l=1,t=1,c=1,f=1;
		if(this instanceof Luxury)
		{
			l=1.2;
		}
		
		{
			if(this.engine.cc>1250)
				c=1.5;
			else
				c=1.1;
		}
		{
			if(this.engine.fuel==0)
				f=1.1;
			else if(this.engine.fuel==1)
				f=1.3;
		}
		{
			if(this.tyre.brand==0)
				t=1.1;
			else if(this.tyre.brand==1)
				t=1.2;
			else if(this.tyre.brand==2)
				t=1.3;
			else if(this.tyre.brand==3)
				t=1.4;
		}
		return (l*t*c*f);	
	}
}
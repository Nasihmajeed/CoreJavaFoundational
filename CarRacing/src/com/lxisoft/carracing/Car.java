package com.lxisoft.carracing;
import com.lxisoft.carracing.*;

public class Car
{
	String carName;
	int basicSpeed=60;
	int tyre;
	int cc;
	int fuel;

	public double start(int distance)																					
	{
		double vTime=0,vSpeed=0;
		double speedFactor=vehicle();
		vSpeed=speedFactor*this.basicSpeed;
		//System.out.println("vTime speed"+vSpeed);
		vTime=distance/vSpeed;
		//System.out.println("vTime"+vTime);
		return vTime;
	}

	public double start(float time)																					
	{
		double vDistance=0,vSpeed=0;
		double speedFactor=vehicle();					
		//System.out.println("sfactr "+speedFactor);
		vSpeed=speedFactor*this.basicSpeed;
		//System.out.println("vSpeed "+vSpeed);
		vDistance=vSpeed*time;
		//System.out.println("vdist "+vDistance);
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
			if(this.cc>1500)
				c=1.5;
			else
				c=1.1;
		}
		{
			if(this.fuel==0)
				f=1.1;
			else if(this.fuel==1)
				f=1.3;
		}
		{
			if(this.tyre==0)
				t=1.1;
			else if(this.tyre==1)
				t=1.2;
			else if(this.tyre==2)
				t=1.3;
			else if(this.tyre==3)
				t=1.4;
		}
		return (l*t*c*f);	
	}
}
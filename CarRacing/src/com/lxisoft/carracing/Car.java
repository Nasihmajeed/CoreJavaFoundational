package com.lxisoft.carracing;
import com.lxisoft.carracing.*;

public class Car
{
	String carName;
	int basicSpeed=60;
	int tyre;
	int cc;
	int fuel;

	public float start(int distance)																					
	{
		float vTime=0,vSpeed=0;
		float speedFactor=vehicle();
		vSpeed=speedFactor*this.basicSpeed;
		System.out.println("vTime speed"+vSpeed);
		System.out.println("vTime"+vTime);
		vTime=distance/vSpeed;
		System.out.println("vTime"+vTime);
		return vTime;
	}

	public float start(float time)																					
	{
		float vDistance=0,vSpeed=0;
		float speedFactor=vehicle();
		vSpeed=speedFactor*this.basicSpeed;
		System.out.println("vdist "+vDistance);
		vDistance=vSpeed*time;
		System.out.println("vdist "+vDistance);
		return vDistance;
	}

	public float vehicle()
	{
		float l=1,t=1,c=1,f=1;
		if(this instanceof Luxury)
		{
			l=1;
		}
		
		{
			if(this.cc>1500)
				c=1;
			else
				c=1;
		}
		{
			if(this.fuel=='p')
				f=1;
			else if(this.fuel=='d')
				f=1;
		}
		{
			if(this.tyre==0)
				t=1;
			else if(this.tyre==1)
				t=1;
			else if(this.tyre==2)
				t=1;
			else if(this.tyre==3)
				t=1;
		}
		return (l*t*c*f);	
	}
}
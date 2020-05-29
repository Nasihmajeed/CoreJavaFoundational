package com.lxisoft.company;
import com.lxisoft.shope.*;
import com.lxisoft.company.*;
import java.util.*;
public class Company
{
ArrayList<Ball> balls=new ArrayList<Ball>();
Shope shop=new Shope();
public void creatCompany()
	{
		creatBalls();
		setBalls();
		shop.creatShope(balls);
	}

 public void creatBalls()

	{
		balls.add(new CricketBall());
		balls.add(new FootBall());
		balls.add(new TennisBall());
		balls.add(new VollyBall());
	}

public void setBalls()

	{
		balls.get(0).setBallName("CricketBall");
		balls.get(0).setBallRate(200);
		balls.get(1).setBallName("FootBall");
		balls.get(1).setBallRate(1500);
		balls.get(2).setBallName("TennisBall");	
		balls.get(2).setBallRate(200);
		balls.get(3).setBallName("VolleyBall");	
		balls.get(3).setBallRate(900);
	}

public void checkBallProperty(ArrayList<Ball> purchasedballs)
   {
	int numberofAirfillable=0,numberofBoubcable;
	
			if(balls.get(temp) instanceof Airfillable)
				{
					numberofAirfillable=numberofAirfillable+1;
				}
			else if(balls.get(temp) instanceof Bounceble)
				{
					numberofBoubcable=numberofBoubcable+1;
				}
   		
	}


}


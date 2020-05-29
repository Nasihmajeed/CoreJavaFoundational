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
	int numberofAirfillable=0,numberofBoubcable=0;
		for (int i=0;i<purchasedballs.size();i++)
		 {
			if(purchasedballs.get(i) instanceof Airfillable)
				{
					numberofAirfillable=numberofAirfillable+1;
				}
			else if(purchasedballs.get(i) instanceof Bounceble)
				{
					numberofBoubcable=numberofBoubcable+1;
			}
		}
   		checkdiscout(numberofAirfillable,numberofBoubcable,purchasedballs);
	}
public void checkdiscout(int number1,int number2,ArrayList<Ball> purchasedballs)
	{
		int amount=0;
		for(int i=0;i<purchasedballs.size();i++)
		{
			amount=amount+purchasedballs.get(i).getBallRate();
		}
		if(number1>2)
		{
			System.out.println("You have a Air Pumb As Reward");
		}

		if(number2>4)
		{
			System.out.println("You have a 20% Discount in the Amount");
			System.out.println("You Total amount = "+(amount-((amount/20)*100)));

		}

		if((number1+number2)>5)
		{
			System.out.println("You have a 10% Discount in the Amount");
			System.out.println("You Total amount = "+(amount-((amount/10)*100)));	
		}
	}

}


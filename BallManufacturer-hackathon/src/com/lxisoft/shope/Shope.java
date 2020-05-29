package com.lxisoft.shope;
import com.lxisoft.company.*;
import java.util.*;
public class Shope
{
ArrayList<Ball> purchasedBalls =new ArrayList<Ball>();
static Scanner input =new Scanner(System.in);
Company company=new Company();
public void creatShope(ArrayList<Ball> balls)
{
	displayShope(balls);
}

public void displayShope(ArrayList<Ball> balls)
	{
		int flag=0;
		System.out.println("\tShope Name");
		System.out.println("********************************");
		displayBalls(balls);

		do{
			purchase(balls);
			System.out.print("Press 1 to Continue Purchase\n Press 0 To Print Bill ");
			flag=input.nextInt();

		  }while(flag>0);
		company.checkBallProperty(purchasedBalls)
	}



public void displayBalls(ArrayList<Ball> balls)

	{
		   // for (Ball ball : balls)
		   //  {
     //      	 	System.out.println(i+"."+ball); 
     //       	 }  

		for (int i=1;i<=balls.size();i++)
		{
			System.out.println(i+"."+balls.get(i).getBallName()+"\t Rate = "+balls.get(i).getBallRate());
		}
	}

public void purchase(ArrayList<Ball> balls)
	{
		System.out.print("\nEnter  the Item Number You Want to purchase = ");
		int choise=input.nextInt();
		System.out.println("\nYou Selected "+balls.get(choise-1).getBallName());
		System.out.print("\nEnter  the Quantity = ");
		int quantity=input.nextInt();
		int temp=quantity+purchasedBalls.size();
		for (int i=purchasedBalls.size();i<temp;i++)
		{
			switch(choise)
			 case 1:
				purchasedBalls.add(new CricketBall());
				purchasedBalls.get(i).setBallName(balls.get(choise-1).getBallName());
				purchasedBalls.get(i).setBallRate(balls.get(choise-1).getBallRate());
			break;
			 case 2:
				purchasedBalls.add(new FootBall());
				purchasedBalls.get(i).setBallName(balls.get(choise-1).getBallName());
				purchasedBalls.get(i).setBallRate(balls.get(choise-1).getBallRate());
			 break;
			 case 3:
				purchasedBalls.add(new TennisBall());
				purchasedBalls.get(i).setBallName(balls.get(choise-1).getBallName());
				purchasedBalls.get(i).setBallRate(balls.get(choise-1).getBallRate());
			 break; 	
			 case 4:
				purchasedBalls.add(new  VollyBall());
				purchasedBalls.get(i).setBallName(balls.get(choise-1).getBallName());
				purchasedBalls.get(i).setBallRate(balls.get(choise-1).getBallRate());
			 break; 	 
		}

	}	

}
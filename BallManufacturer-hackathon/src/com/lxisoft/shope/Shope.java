package com.lxisoft.shope;
import com.lxisoft.company.*;
import java.util.*;
public class Shope
{
ArrayList<Ball> purchasedBalls =new ArrayList<Ball>();
static Scanner input =new Scanner(System.in);
Company company;
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
		  int amount=0;
		for(int i=0;i<purchasedBalls.size();i++)
		{
			amount=amount+purchasedBalls.get(i).getBallRate();
		}
		System.out.println("\nYour Total Amount = "+amount);
		checkballs();
		company=new Company();  	
		company.checkBallProperty(purchasedBalls);

	}



public void displayBalls(ArrayList<Ball> balls)

	{
		   // for (Ball ball : balls)
		   //  {
     //      	 	System.out.println(i+"."+ball); 
     //       	 }  

		for (int i=0;i<balls.size();i++)
		{
			System.out.println((i+1)+"."+balls.get(i).getBallName()+"\t Rate = "+balls.get(i).getBallRate());
		}
	}

public void purchase(ArrayList<Ball> balls)
	{
		System.out.print("\nEnter  the Item Number You Want to purchase = ");
		int choise=input.nextInt();
		System.out.println("\nYou Selected "+balls.get(choise-1).getBallName());
		System.out.println("\nEnter  the Quantity = ");
		int quantity=input.nextInt();
		System.out.println("\nAmout = "+quantity*balls.get(choise-1).getBallRate());
		
		int temp=quantity+purchasedBalls.size();
		for (int i=purchasedBalls.size();i<temp;i++)
		{
			switch(choise)
			{
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

public void checkballs()
	{
		Random objGenerator = new Random();
		int value = objGenerator.nextInt(5);
		for (int i=0;i<purchasedBalls.size();i++)
		{
			if(value==2)
			{
				System.out.println("\nThe "+purchasedBalls.get(i).getBallName()+ "is Damaged");
				System.out.println("\nWe removed The ball from Your Purchased List");
				purchasedBalls.remove(i);
			}
			else
			{
				System.out.println("\nThe "+purchasedBalls.get(i).getBallName()+ "is Approved");
			}			
		}
	}


}
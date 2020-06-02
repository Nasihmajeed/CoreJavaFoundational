package com.lxisoft.Ballproject;
import com.lxisoft.Ballproject.*;
import java.util.*; 
import java.io.*; 
public class Compani
{
	String name;
	int itemQuantity;
	public ArrayList<Ball> ball=new ArrayList<Ball>();
	FileRepository fr=new FileRepository();
	static Scanner sc=new Scanner(System.in);
	public void menuList()
	{
		boolean test=false;
		do
		{
			System.out.println("\n1.Available Balls \n2.Add Stock \n3.Print Bill \n4.Display \n5.Exit");
			test=false;
			int menu=sc.nextInt();		
			switch (menu)
			{
				case 1: balls(); test=true; break;
				case 2: ballDetails(); test=true; break;
				case 3:	printBill(); test=true; break;	
				case 4: displayDetails(); test=true; break;
				case 5: System.exit(0); break;	
			}
		}while(test);			
	}
	public void balls()
	{
		System.out.printf("%-20.30s %-20.30s %-20.30s %-20.30s%n","\nCricketball-200Rs","\nFootball-1500Rs","\nTennisball-500Rs","\nVolleyball-900Rs");
	}
	public void ballDetails()
	{
		try
		{
			boolean check=false;
			do
			{
				System.out.println("\n Balls are \n\n1.Cricketball \n2.Volleyball \n3.Tennisball \n4.Football ");
				check=false;
				int c=sc.nextInt();		
				switch (c)
				{
					case 1:	cricketBallDetails(); break;				
					case 2: volleyBallDetails(); break;
					case 3: tennisBallDetails(); break;		
					case 4: footBallDetails(); break;
				}
			}while(check);
		}
		catch(InputMismatchException e)
		{
			System.out.println("eeeeeeeeeeeeeeeee"+e);
		}
	}		
	public void cricketBallDetails()
	{
		System.out.println("Type of Cricketball");
		Ball cBall=new CricketBall();
		cBall.setType(sc.next());
		System.out.println("Ball price");
		cBall.setPrice(sc.nextInt());
		System.out.println("Quantity");
		cBall.setQuantity(sc.nextInt());
		ball.add(cBall);
		fr.writeFile(ball);
		fr.readFile();
	}
	public void volleyBallDetails()
	{
		System.out.println("Type of Volleyball");
		Ball vBall=new VolleyBall();
		vBall.setType(sc.next());
		System.out.println("Ball price");
		vBall.setPrice(sc.nextInt());
		System.out.println("Quantity");
		vBall.setQuantity(sc.nextInt());
		ball.add(vBall);
		fr.writeFile(ball);
		fr.readFile();
	}
	public void tennisBallDetails()
	{
		System.out.println("Type of Tennisball");
		Ball tBall=new TennisBall();
		tBall.setType(sc.next());
		System.out.println("Ball price");
		tBall.setPrice(sc.nextInt());
		System.out.println("Quantity");
		tBall.setQuantity(sc.nextInt());
		ball.add(tBall);
		fr.writeFile(ball);
		fr.readFile();
	}
	public void footBallDetails()
	{
		System.out.println("Type of Football");
		Ball fBall=new FootBall();
		fBall.setType(sc.next());
		System.out.println("Ball price");
		fBall.setPrice(sc.nextInt());
		System.out.println("Quantity");
		fBall.setQuantity(sc.nextInt());
		ball.add(fBall);
		fr.writeFile(ball);
		fr.readFile();
	}
	public void displayDetails()
	{	
		System.out.println("\nDisplay stock details");
		System.out.printf("%-20.30s %-20.30s %-20.30s%n","Ball Type","Price","Quantity");
		for(int i=0;i<ball.size();i++)
		{			
			System.out.printf("%-20.30s %-20.30s %-20.30s%n",ball.get(i).getType(),ball.get(i).getPrice(),ball.get(i).getQuantity());	
		}	 		      	                                          	
	}
	public void printBill()
	{
		boolean sample=false;	
		do{
			sample=false;
			displayDetails();
			System.out.println("\nWhich Type Ball you want");
			curentStock();
			System.out.println("Do you want More 1.No 2.Yes");
			int n=sc.nextInt();
			if (n==1)
			{
				break;
			}
			else
			{
				continue;
			}	
		}
		while(sample);			
	}
	public void curentStock()
	{
		for(int j=0;j<ball.size();j++)
		{
			String d=sc.next();
			if((ball.get(j).getType()).equals(d))				
			{
				System.out.println("How much ball do you want");
				itemQuantity=sc.nextInt();	
                int val=(ball.get(j).getQuantity()-itemQuantity);
                ball.get(j).setQuantity(val);
                System.out.println("Current stock"+(ball.get(j).getQuantity()));				
				System.out.println("\nAvailable Stocks");
				System.out.printf("%-20.30s %-20.30s %-20.30s%n","Ball Type","Price","Quantity");
				System.out.printf("%-20.30s %-20.30s %-20.30s%n",ball.get(j).getType(),ball.get(j).getPrice(),itemQuantity);	
				System.out.println("Total Bill Amount="+((ball.get(j).getPrice())*(itemQuantity)));											}		
		}	
	}		
	public void discount()
	{
		// if(Tennisball instanceof Bouncable)
		// {
		// 	System.out.println("Bill have 20% discount");
		// 	//System.out.println("Bill"+((ball.getPrice())*(itemQuantity)));
		// } 
	}
	public void testBalls()
	{

	}

}


		
	
	
	

	
		
	
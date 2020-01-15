package com.lxisoft.nivea;
import java.util.*;
import java.io.*;
import com.lxisoft.FileRepository.*;
import com.lxisoft.BallInterface.*;
public class Nivea
{
	public static Scanner scanner = new Scanner(System.in);
	private String name;
	public Nivea(String name)
	{
		this.name = name;
	}
	FileRepository fileReppo = new FileRepository();
	public void ballManufacturing()
	{
		ArrayList<Integer> noOfBalls = new ArrayList<Integer>();
		ArrayList<Ball> ball;
		try
		{
			Boolean isTrue = false;
			do
			{
				isTrue = false;
				System.out.println("*****"+name+"*****");
				ball=productList();
				print(ball);
				System.out.println("Select Balls To Add To Cart");
				int selectedBall = scanner.nextInt();
				System.out.println("==> Press 1.Test Ball 2.Add to Cart");
				int test = scanner.nextInt();
				switch(test)
				{
				case 1:
					test(selectedBall,ball);
					isTrue = true;
					break;
				case 2:

					break;
				default :
					System.out.println("!!! Select Options From Above !!!");
					break;
				}
			}while(isTrue);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public ArrayList<Ball> setBall()
	{
		ArrayList<Ball> ball = new ArrayList<Ball>();
		ball.add(new FootBall());
		ball.add(new FootBall());
		ball.add(new VollyBall());
		ball.add(new VollyBall());
		ball.add(new VollyBall());
		ball.add(new CricketBall());
		ball.add(new CricketBall());
		ball.add(new TennisBall());
		ball.add(new TennisBall());
		ball.add(new TennisBall());

		ball.get(0).setName("FootBall");
		ball.get(1).setName("FootBall");
		ball.get(2).setName("VollyBall");
		ball.get(3).setName("VollyBall");
		ball.get(4).setName("VollyBall");
		ball.get(5).setName("CricketBall");
		ball.get(6).setName("CricketBall");
		ball.get(7).setName("TennisBall");
		ball.get(8).setName("TennisBall");
		ball.get(9).setName("TennisBall");
		return ball;
	}
	public ArrayList<Ball> productList()
	{
		ArrayList<Ball> ballArray = new ArrayList<Ball>();
		try
		{
			ArrayList<Ball> ball = setBall();
			 
			File file = fileReppo.ifExists();
			fileReppo.writeToFile(file,ball);
			 ballArray = fileReppo.readFromFile(file,ballArray);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ballArray;
	}
	public void addToCart(int x)
	{


	}
	public void test(int y,ArrayList<Ball> ball)
	{
		int x =(int)(Math.random()*3);
		if(x==2)
		{
			System.out.println("Manufacturing Defect");
		}
		else if(x<2)
		{
			System.out.println(ball.get(y).getName()+" is Good");
		}
	}
	public void printBill()
	{

	}
	public void print(ArrayList<Ball> ball)
	{
		int j =1;
		for(int i=0;i<ball.size();i++)
		{
			if(ball.get(i) instanceof Bouncable)
			{
				System.out.print(j+"."+ball.get(i).getName());
				System.out.println(" +"+((Bouncable)ball.get(i)).bounce());
				j++;
			}
			else if(ball.get(i) instanceof Fillable)
			{
				System.out.print(j+"."+ball.get(i).getName());
				System.out.println(" + "+((Fillable)ball.get(i)).fill());
				j++;
			}
		}
	}
}
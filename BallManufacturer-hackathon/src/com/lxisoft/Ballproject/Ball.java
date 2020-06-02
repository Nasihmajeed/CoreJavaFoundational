package com.lxisoft.Ballproject;
import com.lxisoft.Ballproject.*;
import java.util.Scanner;
public class Ball
{		
	private String ballType;
	private int ballPrice;
	private  int ballQuantity;
	CricketBall cBall;
	VolleyBall vBall;
	TennisBall tBall;
	FootBall fBall;
	static Scanner sc=new Scanner(System.in);
	public void setType(String ballType)
	{
		this.ballType=ballType;
	}
	public String getType()
	{
		return this.ballType;
	}
	public void setPrice(int ballPrice)
	{
		this.ballPrice=ballPrice;
	}
	public int getPrice()
	{
		return this.ballPrice;
	}
	public void setQuantity(int ballQuantity)
	{
		this.ballQuantity=ballQuantity;
	}
	public int getQuantity()
	{
		return this.ballQuantity;
	}
	
}	
		
	
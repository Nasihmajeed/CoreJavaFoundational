package com.lxisoft.test;
import com.lxisoft.carproject.*;
public class Tdd
{
	public static void main(String[] args)
	{
		Race s=new Race();
		s.setCarDetails();
		s.show();
	}
	static
	{
		System.out.println("CAR RACING PARTICIPANTS");
		System.out.println("........................");
	}
}
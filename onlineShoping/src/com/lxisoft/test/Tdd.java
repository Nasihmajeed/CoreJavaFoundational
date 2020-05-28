package com.lxisoft.test;
import com.lxisoft.onlineshoping.Displaypage;
import com.lxisoft.onlineshoping.Cart;
import java.util.Scanner;
public class Tdd
{
	public static void main(String[] args) throws Exception 
	{
		
		Scanner scr=new Scanner(System.in);
		System.out.println("       Yellow.coM");
		System.out.println("       1 : Login \n       2 : Signup ");		
		int num=scr.nextInt();
		Displaypage dp=new Displaypage();
		switch(num)
		{
			case 1:
					dp.login();
					break;

			case 2:
					dp.signup();
					break;
			

		}
	}
}
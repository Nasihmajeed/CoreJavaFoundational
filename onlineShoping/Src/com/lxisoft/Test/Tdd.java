package com.lxisoft.Test;
import com.lxisoft.OnlineShoping.DisplayPage;
import java.util.Scanner;
public class Tdd
{
	public static void main(String[] args) 
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("Yellow.coM");
		System.out.println("1 : Login \n2 : Signup");		
		int num=scr.nextInt();
		DisplayPage dp=new DisplayPage();
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
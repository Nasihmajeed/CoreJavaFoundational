package com.lxisoft.Test;
import com.lxisoft.OnlineShoping.DisplayPage;
import java.util.Scanner;
public class Tdd
{
	public static void main(String[] args) throws Exception 
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("       Yellow.coM");
		System.out.println("       1 : Login \n       2 : Signup \n       3 : view");		
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
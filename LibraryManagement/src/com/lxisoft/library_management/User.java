package com.lxisoft.library_management;
import java.util.*;
public class User
{
	public void returnBook()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n           Enter How many days before you take book:");
		int day=sc.nextInt();
		if(day>=10)
		{
			day+=10;
			System.out.println("           !!!Pay Fine!!!\tFine is:"+day);
		}
		else
		{
			System.out.println("           !!!Thanks For Return the Book!!!");	
		}
	}
}
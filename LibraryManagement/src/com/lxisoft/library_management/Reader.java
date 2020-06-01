package com.lxisoft.library_management;
import com.lxisoft.repository.*;
import java.util.*;
public class Reader
{
	public int display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n             Enter your choice:");
		System.out.println("             1-Read From Library\n             2-Read From Home\n             3-Exit");
		int c=sc.nextInt();
		return c;
	}

	public void readLibrary()
	{
		System.out.println("Reading Book !!!!!!!!!!");
	}


	public void returnBook()
	{
		int day=5;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n           Enter How many days before you take book:");
		int a=sc.nextInt();
		if(day>10)
		{
			System.out.println("           !!!Pay Fine!!!\tFine is 10 Rupees!!!");
		}
		else
		{
			System.out.println("           !!!Thanks For Return the Book!!!");	
		}
	}
}
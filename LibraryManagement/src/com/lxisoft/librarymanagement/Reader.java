package com.lxisoft.librarymanagement;
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


	public void readHome()
	{
		int a=0;
		System.out.println("Due date is 5 days !!!!!!!!!!!!!");
		if(a<=5)
		{
			System.out.println("Thanks For Return the Bokk!!!!!!!!!!!!!");
		}
		else
		{
			System.out.println("Pay Fine!!!!!!!!!!!!!");
		}
	}
}
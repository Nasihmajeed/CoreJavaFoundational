package com.lxisoft.Hotel;
import com.lxisoft.Person.*;

import java.util.*;
public class Hotel
{
	public int ch;
	public String hotelName=" A2B ";
	public int ac=0,uc=0;
	public String str="open";
	public Admin ad = new Admin();
	
	public void checkPerson()
	{
		Scanner in = new Scanner(System.in);
		do
		{
			System.out.println("Select an option \n 1. Admin \n 2. User \n");
			ch=in.nextInt();
			switch(ch)
			{
				case 1: ad.checkAdmin(ac);
						ac=ac+1;
						break;
				case 2: ad.passToUser(uc,ac);
						uc=uc+1;
						break;
				default: System.out.println("Invalid Choice"); 
						 break;
			}
			System.out.println("GO Back to Main Menu(yes/no)");
			in.nextLine();
			str=in.nextLine();
		}while((str.equals("yes")));
		
		
	}
	
	public void printDetails()
	{
		System.out.println("\n\t"+hotelName+"\n");
		
		
	}
}
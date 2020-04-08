package com.lxisoft.Hotel;
import com.lxisoft.Person.*;

import java.util.*;
public class Hotel
{
	 
	String hotelName=" A2B ";
	public int adminCount=0,userCount=0; 
	public Admin ad = new Admin();
	
	public void checkPerson()
	{
		int ch;
		String str="open";
		Scanner in = new Scanner(System.in);
		do
		{
			System.out.println("Select an option \n 1. ADMIN \n 2. USER \n");
			ch=in.nextInt();
			switch(ch)
			{
				case 1: ad.checkAdmin(adminCount);
						adminCount++;
						break;
				case 2: ad.passToUser(userCount,adminCount);
						userCount++;
						break;
				default:System.out.println("Invalid Choice"); 
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

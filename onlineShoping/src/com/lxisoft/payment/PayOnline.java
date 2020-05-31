package com.lxisoft.payment;
import java.util.*;
public class PayOnline implements Paymentmanager
{
	public void payCash()
		{
			System.out.println("   PayOnline");
			System.out.println(" =================");
			System.out.println("\n");
			Scanner scr=new Scanner(System.in);
			System.out.println("   select Bank : ");
			System.out.println(" =================");
			System.out.println("south indian bank : 1 , indian bank: 2 , canara bank : 3 ");
			int slct=scr.nextInt();

			switch(slct)
			{
				case 1:
						System.out.println("South INDIAN Bank");
				case 2:
						System.out.println("INDIAN Bank");
				case 3:
						System.out.println("Canara Bank");
			}

			System.out.println("   Bank Details");
			System.out.println(" =================");

			System.out.println("Bank Id : ");
			String id=scr.next();

			System.out.println("Bank pasword : ");
			String password=scr.next();
		}
}
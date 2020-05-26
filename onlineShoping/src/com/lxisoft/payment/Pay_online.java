package com.lxisoft.payment;
public class Pay_online extends Paymentmanager
{
	public void payCash()
		{
			System.out.println("select Bank : ");
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

			System.out.println("Bank Id : ");
			String id=scr.next();

			System.out.println("Bank pasword : ");
			String password=scr.next();
		}
}
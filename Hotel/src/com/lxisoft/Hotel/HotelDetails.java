package com.lxisoft.Hotel ;

import java.util.* ;
import com.lxisoft.Customer.* ;
import com.lxisoft.Console.* ;

public class HotelDetails
{
	Scanner in = new Scanner(System.in) ;

	Bill mainBill = new Bill() ;

	private String hName = "BADUSHA",type = "NON-VEG",lMark = "Near Greens Avenue", street = "Desamangalam" ,city = "Thrissur" ,state = "Kerala", phNo = "9072331122",gstNo = "27AADFH5037M1Z6" ; 
	private int pinCode = 675232, adminPin=420 ;
	private int cusNo = 0 ; 

	Inventory inv = new Inventory() ;

	Customer[] cus = new Customer[50] ;

	public String getHName()
	{
		return hName ;
	}

	public void incCustNo()
	{
		cusNo++ ;
	}

	

	public int checkIfAdmin()
	{
		int pin ;

		System.out.print("\n\n\n     INPUT ADMIN PIN : ") ;
		pin = in.nextInt() ;
		in.nextLine() ;

			if(pin == adminPin)
				return 1 ;
			else
				System.out.print("\n\n\n     INVALID PIN. ACCESS DENIED! ") ;

		return 0 ;
	} 


	public void editAddress()
	{
		
	
		System.out.print("\n\n\n     Street : ") ;
		this.street = in.nextLine() ;

		System.out.print("\n\n\n     City : ") ;
		this.city = in.nextLine() ;

		System.out.print("\n\n\n     State : ") ;
		this.state = in.nextLine() ;

		System.out.print("\n\n\n     Pin Code : ") ;
		this.pinCode = in.nextInt() ;
		in.nextLine() ;	

		System.out.print("\n\n\n     Phone Number : ") ;
		this.phNo = in.nextLine() ;
			
	}

	public void setDiscount()
	{
		System.out.print("\n\n\n     CURRENT DISCOUNT RATES : " + this.mainBill.getDiscPer() +"%") ;
		System.out.print("\n\n     NEW DISCOUNT RATE : ") ;

		int newDisc = in.nextInt() ;
		in.nextLine() ;

		System.out.print("\n\n     DISCOUNT RATES UPDATED FROM " + this.mainBill.getDiscPer() + "% TO " + newDisc + "% .") ;

		this.mainBill.setDiscPer(newDisc) ;
	}

	public void newCustomer()
	{
		cus[cusNo] = new Customer() ;

		cus[cusNo].transferInventoryandBill(inv,mainBill) ;

		inv.viewMenu() ;

		cus[cusNo].placeOrder() ;

	}

	public void customerBill()
	{
		cus[cusNo].b.printBill(cusNo) ;

	}

	public void displayAddressBanner()
	{
		System.out.print("\t\t      "+ this.type +" RESTAURANT \n\n\t\t      " +this.lMark + "\n\t\t    " + this.street + ", " + this.city + ", \n\t\t\t" + this.state + " " + this.pinCode + "\n\t\t      Ph.No : " + this.phNo + "\n") ;
	}

	public void displayBillFooter()
	{
		System.out.print("\n   GST NO : " + gstNo + "\t\t\t" + java.time.LocalTime.now()) ;
		System.out.print("\n\n\t\t     THANK YOU. VISIT AGAIN. :)") ;
		

		System.out.print("\n |_____________________________________________________________| \n") ;
	}

	public void adminPinReset()
	{
		System.out.print("\n\n\n     OLD PIN : ") ;
		int oPin = in.nextInt() ;
		in.nextLine() ;

			if(oPin == adminPin)
			{
				System.out.print("\n\n     NEW PIN : ") ;
				adminPin = in.nextInt() ;
				in.nextLine() ;

				System.out.print("\n\n\n     ADMIN PIN SUCCESSFULLY CHANGED.") ;
			}
			else
			{
				System.out.print("\n\n     INCORRECT PIN. TRY AGAIN. ") ;
				this.adminPinReset() ;
			}
	} 

	public void ratingsAndReviews()
	{

	}

	public void purAndSal()
	{
		
	}
}
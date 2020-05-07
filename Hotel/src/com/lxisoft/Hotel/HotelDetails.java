package com.lxisoft.Hotel ;

import java.util.* ;
import com.lxisoft.Customer.* ;
import com.lxisoft.Console.* ;
import com.lxisoft.FileOperations.* ;

public class HotelDetails
{
	Scanner in = new Scanner(System.in) ;

	Bill mainBill = new Bill() ;

	private String hName = "THE LAZY GOOSE",type = "NON-VEG RESTAURANT",lMark = "Below Nerul Bridge", street = "Nerul Candolim Road" ,city = "Candolim" ,state = "Goa", phNo = "+917775958419",gstNo = "27AADFH5037M1Z6" ; 
	private int pinCode = 403001, adminPin=420 ;
	private int cusNo = 0 ; 

	Inventory inv = new Inventory() ;

	InventoryManager im = new InventoryManager() ;

	StaffManager sm = new StaffManager() ;

	Customer[] cus = new Customer[50] ;
	Staff[] st = new Staff[20] ;

	int numOfStaff ;

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
		System.out.format("\n\n %39s \n %41s \n\n %41s \n %42s \n %41s \n\n %42s \n",hName,type,lMark,(street+","),(city+","+state+" "+pinCode),("Ph.No : "+phNo)) ;		
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

	public void setStaff()
	{
		for(int i=0;i<20;i++)
		{
			st[i] = new Staff() ;
		}

		numOfStaff = sm.fetchDataFromFile(st) ;
	}

	public void viewStaff()
	{
		sm.syncFileData(st,numOfStaff) ;
 
		System.out.print("\n   No. \t        NAME                 DESIGNATION       SALARY \n |-----||------------------------||---------------||-----------|\n") ;
		for(int i=0 ; i<=numOfStaff ; i++)
		{
			System.out.format("\n %4d      %-20s %15s %10d",st[i].getEmpNo(),st[i].getStaffName(),st[i].getStaffDesignation(),st[i].getStaffSalary()) ;
		}
	}

	public void syncStaffDetails()
	{
		sm.syncFileData(st,numOfStaff) ;
	}

	public void employStaff()
	{
		numOfStaff++ ;

		System.out.print("\n\n     NEW STAFF NAME : ") ;
		String staffName = in.nextLine() ;
		st[numOfStaff].setStaffName(staffName) ;

		System.out.print("\n     DESIGNATION : ") ;
		String staffDes = in.nextLine() ;
		st[numOfStaff].setStaffDesignation(staffDes) ;

		st[numOfStaff].setEmpNo(numOfStaff+1) ;

		System.out.print("\n     STAFF SALARY : ") ;
		int sal = in.nextInt() ;
		in.nextLine() ;
		st[numOfStaff].setStaffSalary(sal) ;
		
		System.out.print("\n\n     NEW STAFF EMPLOYED. ") ;


		syncStaffDetails() ;
	}

	public void relieveStaff()
	{
		int stRem ;
	
		System.out.print("\n\n     STAFF EMP NO : ") ;
		stRem = in.nextInt() ;
		in.nextLine() ; 

		System.out.print("\n\n     REMOVE STAFF NO." + stRem + " " + st[stRem].getEmpNo() + " ? (Y/N) : " ) ;
		char conf = in.next().charAt(0) ;
		in.nextLine() ;

			if(conf=='y' || conf=='Y')
			{
				System.out.print("\n \n " + stRem + " " + st[stRem].getStaffName() + "TERMINATED FROM HOTEL.\n \n" ) ;

				st[stRem].setStaffName(st[numOfStaff].getStaffName()) ;
				st[stRem].setStaffDesignation(st[numOfStaff].getStaffDesignation()) ;
				st[stRem].setEmpNo(st[numOfStaff].getEmpNo()) ;
				st[stRem].setStaffSalary(st[numOfStaff].getStaffSalary()) ;

				--numOfStaff ;

				sm.syncFileData(st,numOfStaff) ;
			}
	}



	public void ratingsAndReviews()
	{
		System.out.print("\n   B.No        CUSTOMER NAME        RATING         REVIEW \n |------||-----------------------||-------||-------------------|\n") ;
		
		System.out.format("\n   1230\t 	DINESH\t	    9/10	    AMAZING! \n") ;
		System.out.format("\n   1231\t 	SUMESH\t	    7/10	    VERY GOOD! \n") ;
		System.out.format("\n   1232\t 	RAJESH\t	    5/10	    TOO SPICY \n") ;
	}

	public void purAndSal()
	{
		
	}
}
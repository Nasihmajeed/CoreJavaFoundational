package com.lxisoft.Hotel ;

import java.util.* ;
import com.lxisoft.Console.* ;

public class Bill
{

	Item[] bill = new Item[25] ;

	private int itemCount = 0,subTotal = 0,billNo=1232,discPer = 10,discAmt,netTotal,cgst,sgst,grandTotal;

	private int[] qty = new int[25] ;

	private int[] itemTotal = new int[25] ;

	private String cName ;

	public int getDiscPer()
	{
		return discPer ;
	}

	public void setDiscPer(int disc)
	{
		discPer = disc ;
	}

	public void fetchItems(Item i,int q)
	{
		
		bill[itemCount] = i ;
		qty[itemCount] = q ;

		itemCount++ ;
	}

	public void generateBill(String cusName)
	{
		cName = cusName ;

		for(int i=0 ; i<itemCount ; i++)
		{
			itemTotal[i] = bill[i].getItemPrice() * qty[i] ;	
			subTotal += itemTotal[i] ;
		}

		discAmt = (subTotal*discPer)/100 ;
		netTotal = subTotal-discAmt ;
		cgst = (netTotal*9)/100 ;
		sgst = (netTotal*9)/100 ;
		grandTotal = netTotal+cgst+sgst ;


	}

	public void printBill(int bNo)
	{
		billNo += bNo ;
				
		System.out.print("\n |======================== TAX INVOICE ========================| \n") ;
							  
		System.out.print("\n    Date : " + java.time.LocalDate.now()); // Print the Current Date

		System.out.print("\t\t\t\tBill No : " + billNo + "\n    Customer Name : " + this.cName) ;

		System.out.print("\n |-------------------------------------------------------------|") ;		

		System.out.print("\n\n    No. \t   PARTICULARS          QTY    RATE    AMOUNT \n  |----||----------------------------||-----||------||--------|") ;

			for(int i=0 ; i<itemCount ; i++)
			{
				System.out.print("\n    ") ;
				System.out.print(i+1 + "\t  " + bill[i].getItemName() + " \t\t\t " + qty[i] + " \t" + bill[i].getItemPrice() + " \t " + itemTotal[i]) ;
			}
		System.out.print("\n\n\t\t\t\t\t\t      --------") ;

		System.out.print("\n\t\t\t\t\t     SUB TOTAL : "+ subTotal) ;
		System.out.print("\n\t\t\t\t\t   Disc. @ "+discPer+"% : " + discAmt) ;

		System.out.print("\n\t\t\t\t\t\t      --------") ;

		System.out.print("\n\t\t\t\t\t     NET TOTAL : "+ netTotal) ;
		System.out.print("\n\t\t\t\t\t     CGST @ 9% : " + cgst) ;
		System.out.print("\n\t\t\t\t\t     SGST @ 9% : " + sgst) ;

		System.out.print("\n |-------------------------------------------------------------|") ;
		System.out.print("\n\t\t\t\t\t   GRAND TOTAL : "+ grandTotal) ;		
		System.out.print("\n |-------------------------------------------------------------|\n") ;

	}						 



	
}
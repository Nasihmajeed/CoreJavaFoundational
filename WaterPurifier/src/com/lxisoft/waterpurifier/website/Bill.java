package com.lxisoft.waterpurifier.website ;

import java.util.* ;

public class Bill
{

	public ArrayList<Purifier> itemList = new ArrayList<Purifier>() ;

	private int itemCount = 0,subTotal = 0,serviceNo=1232,discPer = 10,discAmt,netTotal,cgst,sgst,grandTotal;

	private int[] qty = new int[25] ;

	private int[] itemTotal = new int[25] ;

	private String cName ;

	public int getDiscPer()
	{
		return discPer ;
	}

	public int getServiceNo()
	{
		return serviceNo ;
	}

	public void setDiscPer(int disc)
	{
		discPer = disc ;
	}

	public void addItem(Purifier p,int q)
	{
		
		itemList.add(p) ;
		qty[itemCount] = q ;
		itemCount++ ;
	}

	public void generateBill(String cusName)
	{
		cName = cusName ;
		int i = 0 ;
		for(Purifier p:itemList)
		{
			itemTotal[i] = p.getPrice() * qty[i] ;	
			subTotal += itemTotal[i] ;
			i++ ;
		}

		discAmt = (subTotal*discPer)/100 ;
		netTotal = subTotal-discAmt ;
		cgst = (netTotal*9)/100 ;
		sgst = (netTotal*9)/100 ;
		grandTotal = netTotal+cgst+sgst ;

	}

	public void printBill()
	{
		serviceNo = 10 + (int) (Math.random()*50);
				
		System.out.print("\n |======================== TAX INVOICE ========================| \n") ;
							  
		System.out.print("\n    Date : " + java.time.LocalDate.now()); // Print the Current Date

		System.out.print("\t\t\t\tService No : " + serviceNo + "\n    Customer Name : " + this.cName) ;

		System.out.print("\n |-------------------------------------------------------------|") ;		

		System.out.print("\n\n    No. \t   PARTICULARS          QTY    RATE    AMOUNT \n  |----||----------------------------||-----||------||--------|") ;

			int i = 0 ;
			for(Purifier p:itemList)
			{
				System.out.print("\n    ") ;
				System.out.print(i+1 + "\t  " + p.getName() + " \t\t\t " + qty[i] + " \t" + p.getPrice() + " \t " + itemTotal[i]) ;
				i++ ;
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
package com.lxisoft.Customer ;

import com.lxisoft.Hotel.* ;
import com.lxisoft.Console.* ;
import java.util.* ;

public class Customer
{
  String cName,review ; 
  int rat ; 		// Customer Rating.


  public Bill b = new Bill() ;

  Inventory inven = new Inventory() ;

  Scanner in = new Scanner(System.in) ;

  	public void transferInventoryandBill(Inventory i, Bill bill)
  	{
  		inven = i ;

  		b = bill ;
  	}
	
	public void placeOrder()
	{
		int itNo,qty ;
		char again ;

		System.out.print("\n |-------------------- KINDLY PLACE ORDER ---------------------| \n") ;
		
		do
		{
		
			System.out.print("\n     ITEM NO : ") ;
			itNo = in.nextInt() ;
			in.nextLine() ;
		
			itNo = inven.checkItemNo(itNo) ;

			System.out.print("    QUANTITY : ") ;
			qty = in.nextInt() ;
			in.nextLine() ;

			qty = inven.checkQty(itNo,qty) ;

			b.fetchItems(inven.it[itNo],qty) ;

			inven.it[itNo].stock -= qty ;

			System.out.print("\n     Order Another Dish? (Y/N) : ") ;
			again = in.next().charAt(0) ;
			in.nextLine() ;

		}while(again=='y' || again=='Y') ;



		System.out.print("\n |-------------------YOUR ORDER IS PLACED!---------------------| \n\n     CUSTOMER NAME : ") ;
		this.cName = in.nextLine() ;

		b.generateBill(cName) ;

		this.rating() ;

	}

	public void rating()
	{
		System.out.print("\n\n     How would you rate your experience (1-10) : ") ;
		rat = in.nextInt() ;
		in.nextLine() ;

		System.out.print("\n\n     Any Suggestions? : ") ;
		review = in.nextLine() ;

	}
}
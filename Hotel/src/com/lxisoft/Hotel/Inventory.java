package com.lxisoft.Hotel ;

import java.util.* ;
import com.lxisoft.Console.* ;

public class Inventory
{

 Scanner in = new Scanner(System.in) ;

 public Item[] it = new Item[50] ;

 private int numOfItems = 9 ;

 	/* Preset Food Items */

 	public void setMenu()
 	{
 		it[1] = new Item() ;
		it[2] = new Item() ;
		it[3] = new Item() ;
		it[4] = new Item() ;
		it[5] = new Item() ;
		it[6] = new Item() ;
		it[7] = new Item() ;
		it[8] = new Item() ;

		it[1].setItemNo(1) ;
		it[1].setItemName("Chapathi") ;
		it[1].setItemPrice(10) ;
		it[1].setStock(50) ;

		it[2].setItemNo(2) ;
		it[2].setItemName("Porotta  ") ;
		it[2].setItemPrice(12) ;
		it[2].setStock(60) ;

		it[3].setItemNo(3) ;
		it[3].setItemName("Dosa    ") ;
		it[3].setItemPrice(8) ;
		it[3].setStock(25) ;

		it[4].setItemNo(4) ;
		it[4].setItemName("Appam    ") ;
		it[4].setItemPrice(8) ;
		it[4].setStock(35) ;

		it[5].setItemNo(5) ;
		it[5].setItemName("Chicken Curry") ;
		it[5].setItemPrice(120) ;
		it[5].setStock(30) ;

		it[6].setItemNo(6) ;
		it[6].setItemName("Beef Fry") ;
		it[6].setItemPrice(140) ;
		it[6].setStock(25) ;

		it[7].setItemNo(7) ;
		it[7].setItemName("Veg. Kuruma") ;
		it[7].setItemPrice(60) ;
		it[7].setStock(15) ;

		it[8].setItemNo(8) ;
		it[8].setItemName("Egg Curry") ;
		it[8].setItemPrice(35) ;
		it[8].setStock(50) ;
	}

 	public void addItem()
	{
		
		it[numOfItems] = new Item() ;

		System.out.print("\n\n     NEW DISH NAME : ") ;
		String itemName = in.nextLine() ;
		it[numOfItems].setItemName(itemName) ;

		System.out.print("\n     PRICE : ") ;
		int itemPrice = in.nextInt() ;
		in.nextLine() ;
		it[numOfItems].setItemPrice(itemPrice) ;

		it[numOfItems].setItemNo(numOfItems) ;

		System.out.print("\n     REMAINING STOCK : ") ;
		int stock = in.nextInt() ;
		in.nextLine() ;
		it[numOfItems].setStock(stock) ;
		
		System.out.print("\n\n     NEW DISH SUCCESSFULLY ADDED. ") ;

		++numOfItems ;

	}

	public void removeItem()
	{
		int itRem ;
	
		System.out.print("\n\n     ITEM NO : ") ;
		itRem = in.nextInt() ;
		in.nextLine() ; 

		System.out.print("\n\n     REMOVE ITEM NO." + itRem + " " + it[itRem].getItemName() + " ? (Y/N) : " ) ;
		char conf = in.next().charAt(0) ;
		in.nextLine() ;

			if(conf=='y' || conf=='Y')
			{
				System.out.print("\n \n " + itRem + " " + it[itRem].getItemName() + "SUCCESFULLY REMOVED.\n \n" ) ;

				it[itRem].setItemName(it[numOfItems-1].getItemName()) ;
				it[itRem].setItemPrice(it[numOfItems-1].getItemPrice()) ;
				it[itRem].setStock(it[numOfItems-1].getStock()) ;

				--numOfItems ;

			}
	}

	public void changePrice()
	{
		int itPr,newPrice ;
	
		
		System.out.print("\n\n     ITEM NO : ") ;
		itPr = in.nextInt() ;
		in.nextLine() ; 

		System.out.print("\n\n     CHANGE PRICE OF ITEM NO." + itPr + " " + it[itPr].getItemName() + " ? (Y/N) : " ) ;
		char conf = in.next().charAt(0) ;
		in.nextLine() ;

			if(conf=='y' || conf=='Y')
			{
				System.out.print("\n\n    NEW PRICE : " ) ;
				newPrice = in.nextInt() ;
				in.nextLine() ;

				System.out.print("\n PRICE OF ITEM NO." + itPr + " " + it[itPr].getItemName() + " SUCCESSFULLY CHANGED FROM " + it[itPr].getItemPrice() + " TO " + newPrice + " ." ) ;

				it[itPr].setItemPrice(newPrice) ;
			}
	}

	public void changeStock()
	{
		int itSt,newStock ;
	
		System.out.print("\n\n    ITEM NO : ") ;
		itSt = in.nextInt() ;
		in.nextLine() ; 

		System.out.print("\n\n     UPDATE STOCK OF ITEM NO." + itSt + " " + it[itSt].getItemName() + " ? (Y/N) : " ) ;
		char conf = in.next().charAt(0) ;
		in.nextLine() ;

			if(conf=='y' || conf=='Y')
			{
				System.out.print("\n\n     UPDATED STOCK : " ) ;
				newStock = in.nextInt() ;
				in.nextLine() ;

				System.out.print("\n      STOCK OF ITEM NO." + itSt + " " + it[itSt].getItemName() + " SUCCESSFULLY CHANGED FROM " + it[itSt].getStock() + " TO " + newStock + " ." ) ;

				it[itSt].setStock(newStock) ;
			}
	
	}

 /* ---------------------------------------------------------  CUSTOMER  --------------------------------------------------------------*/

	public void viewMenu()
	{
		System.out.print("\n\n |---------------------------- MENU ---------------------------| \n") ;
		
		System.out.print("\n       No. \t   PARTICULARS             RATE    REM.STOCK \n     |----||----------------------------||------||-----------|\n") ;


		for(int i=1 ; i<numOfItems ; i++)
		{
			System.out.print("\n       " + it[i].getItemNo() + "    	" + it[i].getItemName() + "		    " + it[i].getItemPrice() + "	     " + it[i].getStock()) ;
		}

		System.out.print("\n\n |-------------------------------------------------------------| \n") ;
	}

	
	public int checkItemNo(int no)
	{
		int validItem=no,chkNo ;

		if(no>= this.numOfItems)
				{
					System.out.print("\n\n     ENTER A VALID ITEM NO.") ;
					validItem = this.inputValidItemNo() ;
				}		
		return validItem ;
	}

	public int inputValidItemNo()
	{
		int chk ;

		System.out.print("\n\n     ITEM NO : ") ;
		chk = in.nextInt() ;
		in.nextLine() ;

		this.checkItemNo(chk) ;

		return chk ;

	}

	public int checkQty(int no,int q)
	{
		int validQ=no ;

		if(it[no].getStock()-q <0)
			{
				System.out.print("\n\n     ENTER A VALID QUANTITY. ONLY "+ it[no].getStock() + "NOS LEFT!") ;
				validQ = this.inputValidQty(no) ; 
			}
		return validQ ;
	}

	public int inputValidQty(int n)
	{
		int chk ;

		System.out.print("\n\n     QTY : ") ;
		chk = in.nextInt() ;
		in.nextLine() ;

		this.checkQty(n,chk) ;

		return chk ;

	}

}

	

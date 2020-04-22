package com.lxisoft.Hotel ;

import java.util.* ;
import com.lxisoft.Console.* ;

public class Inventory
{

 Scanner in = new Scanner(System.in) ;

 public Item[] it = new Item[50] ;

 public int numOfItems = 9 ;

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

		it[1].itemNo = 1 ;
		it[1].itemName = "Chapathi" ;
		it[1].itemPrice = 10 ;
		it[1].stock = 50 ;

		it[2].itemNo = 2 ;
		it[2].itemName = "Porotta  " ;
		it[2].itemPrice = 12 ;
		it[2].stock = 60 ;

		it[3].itemNo = 3 ;
		it[3].itemName = "Dosa    " ;
		it[3].itemPrice = 8 ;
		it[3].stock = 25 ;

		it[4].itemNo = 4 ;
		it[4].itemName = "Appam    " ;
		it[4].itemPrice = 8 ;
		it[4].stock = 35 ;

		it[5].itemNo = 5 ;
		it[5].itemName = "Chicken Curry" ;
		it[5].itemPrice = 120 ;
		it[5].stock =  30 ;

		it[6].itemNo = 6 ;
		it[6].itemName = "Beef Fry" ;
		it[6].itemPrice = 140 ;
		it[6].stock = 25 ;

		it[7].itemNo = 7 ;
		it[7].itemName = "Veg. Kuruma" ;
		it[7].itemPrice = 60 ;
		it[7].stock = 15 ;

		it[8].itemNo = 8 ;
		it[8].itemName = "Egg Curry" ;
		it[8].itemPrice = 35 ;
		it[8].stock = 50 ;
	}

 	public void addItem()
	{
		
		it[numOfItems] = new Item() ;

		System.out.print("\n\n     NEW DISH NAME : ") ;
		it[numOfItems].itemName = in.nextLine() ;

		System.out.print("\n     PRICE : ") ;
		it[numOfItems].itemPrice = in.nextInt() ;
		in.nextLine() ;
		it[numOfItems].itemNo = numOfItems ;

		System.out.print("\n     REMAINING STOCK : ") ;
		it[numOfItems].stock = in.nextInt() ;
		in.nextLine() ;
		
		System.out.print("\n\n     NEW DISH SUCCESSFULLY ADDED. ") ;

		++numOfItems ;

	}

	public void removeItem()
	{
		int itRem ;
	
		System.out.print("\n\n     ITEM NO : ") ;
		itRem = in.nextInt() ;
		in.nextLine() ; 

		System.out.print("\n\n     REMOVE ITEM NO." + itRem + " " + it[itRem].itemName + " ? (Y/N) : " ) ;
		char conf = in.next().charAt(0) ;
		in.nextLine() ;

			if(conf=='y' || conf=='Y')
			{
				System.out.print("\n \n " + itRem + " " + it[itRem].itemName + "SUCCESFULLY REMOVED.\n \n" ) ;

				it[itRem].itemName = it[numOfItems-1].itemName ;
				it[itRem].itemPrice = it[numOfItems-1].itemPrice ;
				it[itRem].stock = it[numOfItems-1].stock ;

				--numOfItems ;

			}
	}

	public void changePrice()
	{
		int itPr,newPrice ;
	
		
		System.out.print("\n\n     ITEM NO : ") ;
		itPr = in.nextInt() ;
		in.nextLine() ; 

		System.out.print("\n\n     CHANGE PRICE OF ITEM NO." + itPr + " " + it[itPr].itemName + " ? (Y/N) : " ) ;
		char conf = in.next().charAt(0) ;
		in.nextLine() ;

			if(conf=='y' || conf=='Y')
			{
				System.out.print("\n\n    NEW PRICE : " ) ;
				newPrice = in.nextInt() ;
				in.nextLine() ;

				System.out.print("\n PRICE OF ITEM NO." + itPr + " " + it[itPr].itemName + " SUCCESSFULLY CHANGED FROM " + it[itPr].itemPrice + " TO " + newPrice + " ." ) ;

				it[itPr].itemPrice = newPrice ;
			}
	}

	public void changeStock()
	{
		int itSt,newStock ;
	
		System.out.print("\n\n    ITEM NO : ") ;
		itSt = in.nextInt() ;
		in.nextLine() ; 

		System.out.print("\n\n     UPDATE STOCK OF ITEM NO." + itSt + " " + it[itSt].itemName + " ? (Y/N) : " ) ;
		char conf = in.next().charAt(0) ;
		in.nextLine() ;

			if(conf=='y' || conf=='Y')
			{
				System.out.print("\n\n     UPDATED STOCK : " ) ;
				newStock = in.nextInt() ;
				in.nextLine() ;

				System.out.print("\n      STOCK OF ITEM NO." + itSt + " " + it[itSt].itemName + " SUCCESSFULLY CHANGED FROM " + it[itSt].stock + " TO " + newStock + " ." ) ;

				it[itSt].stock = newStock ;
			}
	
	}

 /* ---------------------------------------------------------  CUSTOMER  --------------------------------------------------------------*/

	public void viewMenu()
	{
		System.out.print("\n\n |---------------------------- MENU ---------------------------| \n") ;
		
		System.out.print("\n       No. \t   PARTICULARS             RATE    REM.STOCK \n     |----||----------------------------||------||-----------|\n") ;


		for(int i=1 ; i<numOfItems ; i++)
		{
			System.out.print("\n       " + it[i].itemNo + "    	" + it[i].itemName + "		    " + it[i].itemPrice + "	     " + it[i].stock) ;
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

		if(it[no].stock-q <0)
			{
				System.out.print("\n\n     ENTER A VALID QUANTITY. ONLY "+ it[no].stock + "NOS LEFT!") ;
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

	

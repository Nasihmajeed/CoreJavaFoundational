package com.lxisoft.Hotel ;

import java.util.* ;
import com.lxisoft.Console.* ;
import com.lxisoft.Item.* ;
import com.lxisoft.FileOperations.*; 

public class Inventory
{

 Scanner in = new Scanner(System.in) ;

 public Item[] it = new Item[30] ;

 public InventoryManager im = new InventoryManager() ; // <-- Pass item array to the file manager

 private int numOfItems ;

 	
	public void setMenu()
	{
		for(int i=0;i<30;i++)
		{
			it[i] = new Item() ;
		}
		numOfItems = im.fetchDataFromFile(it) ;
	}



 	public void addItem()
	{
				
		numOfItems++ ;
				
		System.out.print("\n\n     NEW DISH NAME : ") ;
		String itemName = in.nextLine() ;
		it[numOfItems].setItemName(itemName) ;

		System.out.print("\n     PRICE : ") ;
		int itemPrice = in.nextInt() ;
		in.nextLine() ;
		it[numOfItems].setItemPrice(itemPrice) ;

		it[numOfItems].setItemNo(numOfItems+1) ;

		System.out.print("\n     REMAINING STOCK : ") ;
		int stock = in.nextInt() ;
		in.nextLine() ;
		it[numOfItems].setItemStock(stock) ;
		
		System.out.print("\n\n     NEW DISH SUCCESSFULLY ADDED. ") ;


		im.syncFileData(it,numOfItems) ;

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

				it[itRem].setItemName(it[numOfItems].getItemName()) ;
				it[itRem].setItemPrice(it[numOfItems].getItemPrice()) ;
				it[itRem].setItemStock(it[numOfItems].getItemStock()) ;

				--numOfItems ;

				im.syncFileData(it,numOfItems) ;

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

				im.syncFileData(it,numOfItems) ;
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

				System.out.print("\n      STOCK OF ITEM NO." + itSt + " " + it[itSt].getItemName() + " SUCCESSFULLY CHANGED FROM " + it[itSt].getItemStock() + " TO " + newStock + " ." ) ;

				it[itSt].setItemStock(newStock) ;

				im.syncFileData(it,numOfItems) ;
			}
	
	}

 /* ---------------------------------------------------------  CUSTOMER  --------------------------------------------------------------*/

	public void viewMenu()
	{
		im.syncFileData(it,numOfItems) ;

		System.out.print("\n\n |---------------------------- MENU ---------------------------| \n") ;
		
		System.out.print("\n       No. \t   PARTICULARS             RATE    REM.STOCK \n     |----||----------------------------||------||-----------|\n") ;


		for(int i=0 ; i<=numOfItems ; i++)
		{
			//System.out.print("\n       " + it[i].getItemNo() + "    	" + it[i].getItemName() + "		    " + it[i].getItemPrice() + "	     " + it[i].getItemStock()) ;
			System.out.format("\n %8d      %-25s %5d %10d",it[i].getItemNo(),it[i].getItemName(),it[i].getItemPrice(),it[i].getItemStock()) ;
		}

		System.out.print("\n\n |-------------------------------------------------------------| \n") ;
	}

	
	public int checkItemNo(int no)
	{
		int validItem=no,chkNo ;

		if(no>(numOfItems+1))
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

		if(it[no].getItemStock()-q <0)
			{
				System.out.print("\n\n     ENTER A VALID QUANTITY. ONLY "+ it[no].getItemStock() + "NOS LEFT!") ;
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

	

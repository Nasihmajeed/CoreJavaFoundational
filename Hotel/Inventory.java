import java.util.* ;

public class Inventory
{

 Scanner in = new Scanner(System.in) ;

 Item[] it = new Item[50] ;

 int numOfItems = 0 ;


 	void addItem()
	{
		
		it[numOfItems] = new Item() ;

		System.out.print("\n Name of Dish : ") ;
		it[numOfItems].itemName = in.nextLine() ;

		System.out.print("\n Price : ") ;
		it[numOfItems].itemPrice = in.nextInt() ;
		in.nextLine() ;
		it[numOfItems].itemNo = numOfItems ;

		System.out.print("\n Total Stock : ") ;
		it[numOfItems].stock = in.nextInt() ;
		in.nextLine() ;
		
		++numOfItems ;

	}

	void removeItem()
	{
		int itRem ;
	
		System.out.print("---------- \n MENU \n --------\n") ;
		this.viewMenu() ;

		System.out.print("\n\n Input Item Number of Dish to be removed : ") ;
		itRem = in.nextInt() ;
		in.nextLine() ; 

		System.out.print("\n \n Remove Item No." + itRem + " " + it[itRem].itemName + " ? (Y/N) : " ) ;
		char conf = in.next().charAt(0) ;
		in.nextLine() ;

			if(conf=='y' || conf=='Y')
			{
				System.out.print("\n \n " + itRem + " " + it[itRem].itemName + "REMOVED.\n \n" ) ;

				it[itRem].itemName = it[numOfItems-1].itemName ;
				it[itRem].itemPrice = it[numOfItems-1].itemPrice ;
				it[itRem].stock = it[numOfItems-1].stock ;

				--numOfItems ;

			}
		System.out.print("\n UPDATED INVENTORY : \n ") ;
		
		this.viewMenu() ; 


	}

	void changePrice()
	{
		int itPr,newPrice ;
	
		System.out.print("---------- \n MENU \n --------\n") ;
		this.viewMenu() ;

		System.out.print("\n\n Input Item Number of Dish to Change Price : ") ;
		itPr = in.nextInt() ;
		in.nextLine() ; 

		System.out.print("\n \n Change Price of" + itPr + " " + it[itPr].itemName + " ? (Y/N) : " ) ;
		char conf = in.next().charAt(0) ;
		in.nextLine() ;

			if(conf=='y' || conf=='Y')
			{
				System.out.print("\n \n New Price : " ) ;
				newPrice = in.nextInt() ;
				in.nextLine() ;

				System.out.print("\n PRICE OF " + itPr + " " + it[itPr].itemName + " CHANGED FROM " + it[itPr].itemPrice + " TO " + newPrice + " ." ) ;

				it[itPr].itemPrice = newPrice ;
			}
		System.out.print("\n UPDATED INVENTORY : \n ") ;
		
		this.viewMenu() ; 
	}

	void changeStock()
	{
		int itSt,newStock ;
	
		System.out.print("---------- \n MENU \n --------\n") ;
		this.viewMenu() ;

		System.out.print("\n\n Input Item Number of Dish to Change Stock : ") ;
		itSt = in.nextInt() ;
		in.nextLine() ; 

		System.out.print("\n \n Change Stock of" + itSt + " " + it[itSt].itemName + " ? (Y/N) : " ) ;
		char conf = in.next().charAt(0) ;
		in.nextLine() ;

			if(conf=='y' || conf=='Y')
			{
				System.out.print("\n \n New Stock : " ) ;
				newStock = in.nextInt() ;
				in.nextLine() ;

				System.out.print("\n STOCK OF " + itSt + " " + it[itSt].itemName + "CHANGED FROM " + it[itSt].stock + " TO " + newStock + " ." ) ;

				it[itSt].stock = newStock ;
			}

		System.out.print("\n UPDATED INVENTORY : \n ") ;

		this.viewMenu() ; 
	}


	void viewAll()
	{
		
		System.out.print("\n   ITEM NO   	DISH		PRICE 	STOCK\n   -------   	----		-----	-----") ;


		for(int i=0 ; i<numOfItems ; i++)
		{
			System.out.print("\n     " + it[i].itemNo + "    	" + it[i].itemName + "		 " + it[i].itemPrice + "	" + it[i].stock) ;
		}
	}

	void viewMenu()
	{
		
		System.out.print("\n   ITEM NO   	DISH		PRICE\n   -------   	----		-----") ;


		for(int i=0 ; i<numOfItems ; i++)
		{
			System.out.print("\n     " + it[i].itemNo + "    	" + it[i].itemName + "		 " + it[i].itemPrice ) ;
		}
	}

	void orderMeal()
	{
		int itNo,qty ;
		this.viewMenu() ;

		System.out.print("\n --------------------------------------------------------------------- \n") ;

		System.out.print("\n ITEM NO : ") ;
		itNo = in.nextInt() ;
		in.nextLine() ;

		System.out.print("\n QUANTITY : ") ;
		qty = in.nextInt() ;
		in.nextLine() ;





	}
	
}
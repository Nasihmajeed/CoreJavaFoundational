import java.util.* ;

public class Inventory
{

 Scanner in = new Scanner(System.in) ;

 Item[] it = new Item[50] ;

 int numOfItems = 8 ;

 Bill b = new Bill() ;

 	/* Preset Food Items */

 	void setMenu()
 	{
 		it[0] = new Item() ;
		it[1] = new Item() ;
		it[2] = new Item() ;
		it[3] = new Item() ;
		it[4] = new Item() ;
		it[5] = new Item() ;
		it[6] = new Item() ;
		it[7] = new Item() ;

		it[0].itemNo = 0 ;
		it[0].itemName = "Chapathi" ;
		it[0].itemPrice = 10 ;
		it[0].stock = 70 ;

		it[1].itemNo = 1 ;
		it[1].itemName = "Porotta  " ;
		it[1].itemPrice = 12 ;
		it[1].stock = 70 ;

		it[2].itemNo = 2 ;
		it[2].itemName = "Dosa    " ;
		it[2].itemPrice = 8 ;
		it[2].stock = 70 ;

		it[3].itemNo = 3 ;
		it[3].itemName = "Appam    " ;
		it[3].itemPrice = 8 ;
		it[3].stock = 70 ;

		it[4].itemNo = 4 ;
		it[4].itemName = "Chicken Curry" ;
		it[4].itemPrice = 120 ;
		it[4].stock =  70 ;

		it[5].itemNo = 5 ;
		it[5].itemName = "Beef Fry" ;
		it[5].itemPrice = 140 ;
		it[5].stock = 70 ;

		it[6].itemNo = 6 ;
		it[6].itemName = "Veg. Kuruma" ;
		it[6].itemPrice = 60 ;
		it[6].stock = 70 ;

		it[7].itemNo = 7 ;
		it[7].itemName = "Egg Curry" ;
		it[7].itemPrice = 35 ;
		it[7].stock = 70 ;
	}

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
		
		System.out.print("\n   ITEM NO   	DISH		\t PRICE 	STOCK\n   -------   	----		\t -----	-----") ;


		for(int i=0 ; i<numOfItems ; i++)
		{
			System.out.print("\n     " + it[i].itemNo + "    	" + it[i].itemName + "		 " + it[i].itemPrice + "	" + it[i].stock) ;
		}
	}

 /* ---------------------------------------------------------  CUSTOMER  --------------------------------------------------------------*/

	void viewMenu()
	{
		C.cls() ;
		
		System.out.print("\n   ITEM NO   	DISH		\t PRICE\n   -------   	----		\t -----") ;


		for(int i=0 ; i<numOfItems ; i++)
		{
			System.out.print("\n     " + it[i].itemNo + "    	" + it[i].itemName + "		 " + it[i].itemPrice ) ;
		}
	}

	void orderMeal()
	{
		int itNo,qty ;
		this.viewMenu() ;
		char again ;

		System.out.print("\n --------------------------------------------------------------------- \n") ;

		do
		{
		
			System.out.print("\n ITEM NO : ") ;
			itNo = in.nextInt() ;
			in.nextLine() ;

				if(itNo>= numOfItems)
				{
					System.out.print("Invalid Item No.") ;
					break ;
				}	

			System.out.print("\n QUANTITY : ") ;
			qty = in.nextInt() ;
			in.nextLine() ;

			int flag = this.checkQty(itNo,qty) ;

				if(flag==1)
				{
					System.out.print("\n Not Enough in Stock. Order less than " + it[itNo].stock + ".") ;
					System.out.print("\n QUANTITY : ") ;
					qty = in.nextInt() ;
					in.nextLine() ;
				}

			b.fetchItems(it[itNo],qty) ;

			it[itNo].stock -= qty ;

			System.out.print("\n Order Another Dish? (Y/N) : ") ;
			again = in.next().charAt(0) ;
			in.nextLine() ;

		}while(again=='y' || again=='Y') ;

		b.generateBill() ;


	}

	void printBill()
	{
		
		b.printBill() ;
	}

	int checkQty(int no,int q)
	{
		if(it[no].stock-q <=0)
			return 1 ; 
		return 0 ;
	}
}

	

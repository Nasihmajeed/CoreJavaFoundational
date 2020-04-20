import java.util.* ;

public class Customer
{
  String cName ;
  int rat ; 		// Customer Rating.

  Bill b = new Bill() ;

  Inventory inven = new Inventory() ;

  Scanner in = new Scanner(System.in) ;

  	public void transferInventory(Inventory i)
  	{
  		inven = i ;
  	}
	
	public void placeOrder()
	{
		int itNo,qty ;
		char again ;

		System.out.print("\n |-------------------- KINDLY PLACE ORDER ---------------------| \n") ;
		
		do
		{
		
			System.out.print("\n\n     ITEM NO : ") ;
			itNo = in.nextInt() ;
			in.nextLine() ;

				if(itNo>= inven.numOfItems)
				{
					System.out.print("Invalid Item No.") ;
					again = 'y' ;
					break ;
				}	

			System.out.print("\n    QUANTITY : ") ;
			qty = in.nextInt() ;
			in.nextLine() ;


			int flag = inven.checkQty(itNo,qty) ;

				if(flag==1)
				{
					System.out.print("\n Not Enough in Stock. Order less than " + inven.it[itNo].stock + ".") ;
					System.out.print("\n     QUANTITY : ") ;
					qty = in.nextInt() ;
					in.nextLine() ;
				}

			b.fetchItems(inven.it[itNo],qty) ;

			inven.it[itNo].stock -= qty ;

			System.out.print("\n\n     Order Another Dish? (Y/N) : ") ;
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

	}
}
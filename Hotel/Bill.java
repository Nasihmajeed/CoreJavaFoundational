import java.util.* ;

public class Bill
{

	Item[] bill = new Item[25] ;

	int itemCount = 0,totalAmt = 0;

	int[] qty = new int[25] ;

	int[] itemTotal = new int[25] ;

	void fetchItems(Item i,int q)
	{
		
		bill[itemCount] = i ;
		qty[itemCount] = q ;

		itemCount++ ;
	}

	void generateBill()
	{
		for(int i=0 ; i<itemCount ; i++)
		{
			itemTotal[i] = bill[i].itemPrice * qty[i] ;	
			totalAmt += itemTotal[i] ;
		}

	}

	void printBill()
	{
		System.out.print("\n \n ------- \n BILL \n ------- \n") ;
		System.out.print("\n Sl.No. \t Item Name \t Quantity \t Rate \t Total \n ------ \t --------- \t --------- \t ----- \t -----") ;

			for(int i=0 ; i<itemCount ; i++)
			{
				System.out.print("\n ") ;
				System.out.print(i+1 + " \t \t " + bill[i].itemName + " \t \t " + qty[i] + " \t " + bill[i].itemPrice + " \t " + itemTotal[i]) ;
			}
		System.out.print("\n ------------------------------------------------------------- \n") ;
		System.out.print("\n \t \t \t \t \t \t TOTAL : "+ totalAmt) ;
		System.out.print("\n ______________________________________________________________ \n") ;
	}





	
}
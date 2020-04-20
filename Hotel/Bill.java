import java.util.* ;

public class Bill
{

	Item[] bill = new Item[25] ;

	int itemCount = 0,subTotal = 0,billNo=1232,discPer = 10,discAmt,netTotal,cgst,sgst,grandTotal;

	int[] qty = new int[25] ;

	int[] itemTotal = new int[25] ;

	String cName ;

	void fetchItems(Item i,int q)
	{
		
		bill[itemCount] = i ;
		qty[itemCount] = q ;

		itemCount++ ;
	}

	void generateBill(String cusName)
	{
		billNo++ ;

		cName = cusName ;

		for(int i=0 ; i<itemCount ; i++)
		{
			itemTotal[i] = bill[i].itemPrice * qty[i] ;	
			subTotal += itemTotal[i] ;
		}

		discAmt = (subTotal*discPer)/100 ;
		netTotal = subTotal-discAmt ;
		cgst = (netTotal*9)/100 ;
		sgst = (netTotal*9)/100 ;
		grandTotal = netTotal+cgst+sgst ;


	}

	public void printBill()
	{
				
		System.out.print("\n |======================== TAX INVOICE ========================| \n") ;
							  
		System.out.print("\n    Date : " + java.time.LocalDate.now()); // Print the Current Date

		System.out.print("\t\t\t\tBill No : " + billNo + "\n    Customer Name : " + this.cName) ;

		System.out.print("\n |-------------------------------------------------------------|") ;		

		System.out.print("\n\n    No. \t   PARTICULARS          QTY    RATE    AMOUNT \n  |----||----------------------------||-----||------||--------|") ;

			for(int i=0 ; i<itemCount ; i++)
			{
				System.out.print("\n    ") ;
				System.out.print(i+1 + "\t  " + bill[i].itemName + " \t\t\t " + qty[i] + " \t" + bill[i].itemPrice + " \t " + itemTotal[i]) ;
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
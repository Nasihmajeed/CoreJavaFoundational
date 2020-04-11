
import java.util.*

public class HotelMain
{
	String hName ;

	char again ;

	Scanner in = new Scanner() ;

	void menu()
	{
		System.out.print("\n ----------------- \n HOTEL MENU \n ----------------- \n") ;
		System.out.print("\n (1) ADMIN ACCESS \n \n (2) CUSTOMER ACCESS \n \n : ") ;
		char op = in.next().charAt(0) ;

			switch (op)
			{

				case '1' :
					this.admin() ;
					break ;

				case '2' :
					this.customer() ;
					break ;

				default :
					System.out.print("\n \n INVALID CHOICE. Try Again? (Y/N) : ") ;
					again = in.next().charAt(0) ;
			}
	}

	void admin()
	{
		
		do
		{
				System.out.print("\n ----------------- \n ADMIN PANEL \n ----------------- \n") ;
				System.out.print("\n (1) EDIT HOTEL INFO \n \n (2) MANAGE INVENTORY \n \n : ") ;
				char op = in.next().charAt(0) ;

			switch (op)
			{

				case '1' :
					this.hotelInfo() ;
					break ;

				case '2' :
					this.manageInventory() ;
					break ;

				default :
					System.out.print("\n \n INVALID CHOICE. Try Again? (Y/N) : ") ;
					again = in.next().charAt(0) ;
			}

		}while(again == 'y' || again == 'Y') ;
	}


	void hotelInfo()
	{

		System.out.print("\n ------------------- \n  HOTEL DETAILS \n ------------------- \n") ;

		System.out.print("\n \n Name : ") ;
		this.hName = in.nextLine() ;

		Address hAd = new Address() ;
		System.out.print("\n \n Address : \n______________\n ") ;
		hAd.inputAddress() ;
	}

	void manageInventory()
	{
		do
		{
				System.out.print("\n ----------------- \n MANAGE INVENTORY \n ----------------- \n") ;
				System.out.print("\n (1) ADD ITEM \n \n (2) REMOVE ITEM \n \n (3) CHANGE PRICE \n \n (4) VIEW ALL \n \n : ") ;
				char op = in.next().charAt(0) ;

			switch (op)
			{

				case '1' :
					this.hotelInfo() ;
					break ;

				case '2' :
					this.manageInventory() ;
					break ;

				default :
					System.out.print("\n \n INVALID CHOICE. Try Again? (Y/N) : ") ;
					again = in.next().charAt(0) ;
			}

		}while(again == 'y' || again == 'Y') ;
	}



	

}
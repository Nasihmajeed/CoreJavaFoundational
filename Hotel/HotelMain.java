
import java.util.* ;

public class HotelMain
{
	String hName ;

	char again ;

	Scanner in = new Scanner(System.in) ;

	Address hAd = new Address() ;

	Inventory inv = new Inventory() ;

	Customer[] cus = new Customer[50] ;


	void mainMenu()
	{
		inv.setMenu() ;
		
		do
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

			System.out.print("\n \n BACK TO MAIN MENU? (Y/N) : ") ;
			again = in.next().charAt(0) ;
			in.nextLine() ;

		}while (again == 'y' || again == 'Y') ;
	}

/* -------------------------------------------------------- ADMIN SIDE ----------------------------------------------------------------- */

	void admin()
	{
		
		do
		{
				System.out.print("\n ----------------- \n ADMIN PANEL \n ----------------- \n") ;
				System.out.print("\n (1) EDIT HOTEL INFO \n \n (2) MANAGE INVENTORY \n \n : ") ;
				char op = in.next().charAt(0) ;
				in.nextLine() ;


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
					in.nextLine() ;
			}

			System.out.print("\n \n GO BACK? (Y/N) : ") ;
			again = in.next().charAt(0) ;
			in.nextLine() ;

		}while(again == 'y' || again == 'Y') ;
	}


	void hotelInfo()
	{

		System.out.print("\n ------------------- \n  HOTEL DETAILS \n ------------------- \n") ;

		System.out.print("\n \n Name : ") ;
		this.hName = in.nextLine() ;

		System.out.print("\n \n Address : \n ---------\n ") ;
		hAd.inputAddress() ;
	}

	void manageInventory()
	{
		do
		{
				System.out.print("\n ----------------- \n MANAGE INVENTORY \n ----------------- \n") ;
				System.out.print("\n (1) ADD ITEM \n \n (2) REMOVE ITEM \n \n (3) CHANGE PRICE \n \n (4) CHANGE STOCK \n \n (5) VIEW ALL \n \n : ") ;
				char op = in.next().charAt(0) ;
				in.nextLine() ;

			switch (op)
			{

				case '1' :
					
					do
					{
						inv.addItem() ;
						this.again() ;
					}while(again=='y' || again=='Y') ;

					break ;

				case '2' :
					
					do
					{
						inv.removeItem() ;
						this.again() ;
					}while(again=='y' || again=='Y') ;
					break ;

				case '3' :
					do
					{
						inv.changePrice() ;
						this.again() ;
					}while(again=='y' || again=='Y') ;
					break ;

				case '4' :
					do
					{
						inv.changeStock() ;
						this.again() ;
					}while(again=='y' || again=='Y') ;
					break ;
					
				case '5' :
					inv.viewAll() ;
					break ;


				default :
					System.out.print("\n \n INVALID CHOICE. Try Again? (Y/N) : ") ;
					again = in.next().charAt(0) ;
					in.nextLine() ;
			}

			System.out.print("\n \n GO BACK? (Y/N) : ") ;
			again = in.next().charAt(0) ;
			in.nextLine() ;

		}while(again == 'y' || again == 'Y') ;
	}

	void again()
	{
		System.out.print("\n \n AGAIN? (Y/N) : ") ;
		again = in.next().charAt(0) ;
		in.nextLine() ;
	}


/* -------------------------------------------------------- CUSTOMER SIDE ----------------------------------------------------------------- */

	 void customer()
 	 {
		
		do
		{
				System.out.print("\n ----------------- \n CUSTOMER PANEL \n ----------------- \n") ;
				System.out.print("\n (1) VIEW MENU \n \n (2) ORDER MEAL \n \n (3) GENERATE BILL \n \n : ") ;
				char op = in.next().charAt(0) ;
				in.nextLine() ;


			switch (op)
			{
 
				case '1' :
					inv.viewMenu() ;
					break ;

				case '2' :
					inv.orderMeal() ;
					break ;

				case '3' :
					inv.printBill() ;
					break ;

				default :
					System.out.print("\n \n INVALID CHOICE. Try Again? (Y/N) : ") ;
					again = in.next().charAt(0) ;
					in.nextLine() ;
			}

			if(again == 'n' || again == 'N')
				break ;

			System.out.print("\n \n GO BACK? (Y/N) : ") ;
			again = in.next().charAt(0) ;
			in.nextLine() ;

		}while(again == 'y' || again == 'Y') ;

	 }


}
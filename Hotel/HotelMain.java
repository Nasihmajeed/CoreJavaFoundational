
import java.util.* ;

public class HotelMain
{

	char again ;

	Scanner in = new Scanner(System.in) ;

	HotelDetails hAd = new HotelDetails() ;

	Inventory inv = new Inventory() ;

	Customer[] cus = new Customer[50] ;


	public void mainMenu()
	{
		inv.setMenu() ;
		
		do
		{
			C.cls() ;

			this.titleMenu() ;

			System.out.print("\n |=============================================================|") ;
			System.out.print("\n\n |------------------------- MAIN MENU -------------------------| \n") ;

			System.out.print("\n\n\n     [1] ADMIN ACCESS \n\n\n     [2] CUSTOMER ACCESS \n\n\n     : ") ;
			char op = in.next().charAt(0) ;

			switch (op)
			{

				case '1' :
					this.adminCheck() ;
					this.retunToMainPrompt() ;
					break ;

				case '2' :
					this.customer() ;
					this.retunToMainPrompt() ;
					break ;

				default :
					System.out.print("\n\n\t INVALID CHOICE. Try Again? (Y/N) : ") ;
					again = in.next().charAt(0) ;
			}			

		}while (again == 'y' || again == 'Y') ;
	}

	
	public void titleMenu()
	{
		System.out.print("\n |=============================================================|	\n\n \t\t\t HOTEL " + hAd.hName + "\n\n") ;
                              
		hAd.displayAddressBanner() ;

	}

	public void retunToMainPrompt()
	{
		System.out.print("\n\n\t RETURN TO MAIN MENU? (Y/N) : ") ;
		this.promptInput() ;
	}

	public void invalidPrompt()
	{
		System.out.print("\n\n\t INVALID CHOICE. Try Again? (Y/N) : ") ;
		this.promptInput() ;
	}

	public void promptInput()
	{
		again = in.next().charAt(0) ;
		in.nextLine() ;
	}


/* -------------------------------------------------------- ADMIN SIDE ----------------------------------------------------------------- */

	public void adminCheck()
	{
		C.cls() ;

		this.titleMenu() ;
		System.out.print("\n |=============================================================|") ;
		System.out.print("\n\n |------------------------ ADMIN PANEL ------------------------| \n") ;

		int fl = hAd.checkIfAdmin() ;

			if(fl == 1)
				this.admin() ;
	}

	void admin()
	{
		
		do
		{
				C.cls() ;

				this.titleMenu() ;
				System.out.print("\n |=============================================================|") ;
				System.out.print("\n\n |------------------------ ADMIN PANEL ------------------------| \n") ;

				System.out.print("\n\n\n     [1] EDIT HOTEL INFO \n\n\n     [2] MANAGE INVENTORY \n\n\n     : ") ;
				char op = in.next().charAt(0) ;
				in.nextLine() ;


			switch (op)
			{
				
				case '1' :
					this.hotelInfoEdit() ;
					this.goBackPrompt() ;
					break ;

				case '2' :
					this.manageInventory() ;
					this.goBackPrompt() ;
					break ;

				default :
					this.invalidPrompt() ;
					
			}

		}while(again == 'y' || again == 'Y') ;
	}

	public void goBackPrompt()
	{
		System.out.print("\n\n\t GO BACK? (Y/N) : ") ;
		this.promptInput() ;
	} 

	void hotelInfoEdit()
	{
		C.cls() ;

		System.out.print("\n ------------------- \n  HOTEL DETAILS \n ------------------- \n") ;

		System.out.print("\n \n Address : \n ---------\n ") ;
		hAd.inputAddress() ;
	}

	void manageInventory()
	{
		do
		{
				C.cls() ;

				System.out.print("\n ----------------- \n MANAGE INVENTORY \n ----------------- \n") ;
				System.out.print("\n [1] ADD ITEM \n \n [2] REMOVE ITEM \n \n [3] CHANGE PRICE \n \n [4] CHANGE STOCK \n \n [5] VIEW ALL \n \n : ") ;
				char op = in.next().charAt(0) ;
				in.nextLine() ;

			switch (op)
			{

				case '1' :
					
					do
					{
						inv.addItem() ;
						this.againPrompt() ;
					}while(again=='y' || again=='Y') ;

					break ;

				case '2' :
					
					do
					{
						inv.removeItem() ;
						this.againPrompt() ;
					}while(again=='y' || again=='Y') ;
					break ;

				case '3' :
					do
					{
						inv.changePrice() ;
						this.againPrompt() ;
					}while(again=='y' || again=='Y') ;
					break ;

				case '4' :
					do
					{
						inv.changeStock() ;
						this.againPrompt() ;
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

	public void againPrompt()
	{
		System.out.print("\n\n\t AGAIN? (Y/N) : ") ;
		this.promptInput() ;
	}


/* -------------------------------------------------------- CUSTOMER SIDE ----------------------------------------------------------------- */

	 void customer()
 	 {
		
		do
		{
				C.cls() ;

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
					C.cls() ;
					this.titleMenu() ;
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
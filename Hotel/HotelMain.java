
import java.util.* ;

public class HotelMain
{

	char again ;

	Scanner in = new Scanner(System.in) ;

	HotelDetails hDetail = new HotelDetails() ;

	public void mainMenu()
	{
		hDetail.inv.setMenu() ;
		
		do
		{
			C.cls() ;

			this.topBanner() ;
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
					this.invalidPrompt() ;
			}			

		}while (again == 'y' || again == 'Y') ;
	}

	
	public void titleMenu()
	{
		System.out.print("\n |=============================================================|	\n\n \t\t\t HOTEL " + hDetail.hName + "\n\n") ;
                              
		hDetail.displayAddressBanner() ;

	}

	public void topBanner()
	{
		this.titleMenu() ;
		System.out.print("\n |=============================================================|") ;
	}

	public void retunToMainPrompt()
	{
	
		System.out.print("\n\n\n\t RETURN TO MAIN MENU? (Y/N) : ") ;
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

		this.topBanner() ;
		System.out.print("\n\n |------------------------ ADMIN PANEL ------------------------| \n") ;

		int fl = hDetail.checkIfAdmin() ;

			if(fl == 1)
				this.admin() ;
	}

	public void admin()
	{
		
		do
		{
				C.cls() ;

				this.titleMenu() ;
				System.out.print("\n |=============================================================|") ;
				System.out.print("\n\n |------------------------ ADMIN PANEL ------------------------| \n") ;

				System.out.print("\n\n\n     [1] EDIT HOTEL INFO \n\n\n     [2] MANAGE INVENTORY \n\n\n     [3] GO BACK \n\n\n     : ") ;
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

				case '3' :
					again = 'n' ;
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

	public void hotelInfoEdit()
	{
		C.cls() ;

		this.topBanner() ;
		System.out.print("\n\n |----------------------- HOTEL DETAILS -----------------------| \n") ;

		System.out.print("\n\n\n     [1] EDIT HOTEL ADDRESS \n\n\n     [2] EDIT DISCOUNT RATES  \n\n\n     [3] RESET ADMIN PIN  \n\n\n     : ") ;
		char op = in.next().charAt(0) ;
		in.nextLine() ;

			switch(op)
			{
				case '1' :
					
					hDetail.editAddress() ;
					break ;

				case '2' :
					//hDetail.setDiscount() ;
					break ;
			}
	}

	void manageInventory()
	{
		do
		{
				C.cls() ;

				this.topBanner() ;
				System.out.print("\n\n |------------------------- INVENTORY -------------------------| \n") ;

				System.out.print("\n\n\n     [1] ADD ITEM \n\n\n     [2] REMOVE ITEM \n\n\n     [3] CHANGE PRICE \n\n\n     [4] CHANGE STOCK \n\n\n     [5] VIEW ALL \n\n\n : ") ;
				char op = in.next().charAt(0) ;
				in.nextLine() ;

			switch (op)
			{

				case '1' :
					
					do
					{
						hDetail.inv.addItem() ;
						this.againPrompt() ;
					}while(again=='y' || again=='Y') ;
					
					this.goBackPrompt() ;
					break ;

				case '2' :
					
					do
					{
						hDetail.inv.removeItem() ;
						this.againPrompt() ;
					}while(again=='y' || again=='Y') ;
					
					this.goBackPrompt() ;
					break ;

				case '3' :
					do
					{
						hDetail.inv.changePrice() ;
						this.againPrompt() ;
					}while(again=='y' || again=='Y') ;
					
					this.goBackPrompt() ;
					break ;

				case '4' :
					do
					{
						hDetail.inv.changeStock() ;
						this.againPrompt() ;
					}while(again=='y' || again=='Y') ;
					
					this.goBackPrompt() ;
					break ;
					
				case '5' :
					hDetail.inv.viewAll() ;
					
					this.goBackPrompt() ;
					break ;

				default :
					this.invalidPrompt() ; 
			}

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
		
				C.cls() ;

				this.titleMenu() ;
				System.out.print("\n |=============================================================|") ;
							
				hDetail.newCustomer() ;

				this.bill() ;
	 }

	 public void bill()
	 {
	 	C.cls() ;

	 	this.topBanner() ;

	 	hDetail.customerBill() ;

	 	hDetail.displayBillFooter() ;
	 }

}

import java.util.* ;

public class Register
{
	School nSchool = new School();
	char again = 'n';

	Scanner input = new Scanner(System.in) ;

	public void registerSchool()
	{
	
		C.cls() ;
				
		do
		{
			again = 'n' ;

			C.cls() ;

			System.out.println("\n ________________________________________________________ \n \n Welcome To The Directory of Higher Secondary Schools \n ________________________________________________________ \n ") ;

			System.out.print("\n (1) Register a New School \n \n (2) Edit School Details \n \n ------------------------------------------------------ \n ") ;
			char op = input.next().charAt(0);

			switch(op)
			{
				case '1' :
					
					this.newSchool() ;
					break ;

				case '2' :

					this.editSchool() ;
					break ;			
				
				default :
					this.invalidChoice() ;
			} 	

		} while(again == 'y' || again == 'Y') ;

	}	

	public void newSchool() 
	{
		nSchool = new School() ;
		nSchool.newSchool() ;
					
		this.returnToMain();
		
	}

	public void editSchool()
	{
		
			C.cls() ;

			System.out.print("\n ____________________ \n \n SELECT SCHOOL \n ____________________ \n \n") ;

			System.out.print("(1) " + nSchool.sAd.sName + "\n \n : ") ;
			char sSelect = input.next().charAt(0) ;
							
				do
				{

					C.cls() ;

					System.out.print("\n ____________________ \n \n" + nSchool.sAd.sName +"\n ____________________ \n \n") ;

					System.out.print("(1) Display School Info \n \n(2) Manage Classrooms \n \n : ") ;
					sSelect = input.next().charAt(0) ;

						switch (sSelect)
						{
							case '1' :

								this.displayData() ;
		   						break ;

		   					case '2' :
				   						
		   						this.manageData() ;
		   						break ;

		   					default :

		   						this.invalidChoice() ;

						}

				}while(again == 'y' || again == 'Y') ;	

		this.returnToMain();
	   	
	}

	public void displayData() 
	{
		C.cls() ;

		nSchool.displayInfo() ;
		this.returnToMain();
		
	}

	public void manageData()
	{
		C.cls() ;

		System.out.print("\n \n Select Classroom \n ____________________ \n \n") ;
		nSchool.selectClass() ;
		System.out.print("\n \n : ") ;
		int cl = input.nextInt() ;
		input.nextLine() ;

		nSchool.editClass(cl-1) ;

	}

	public void returnToMain() 
	{
		System.out.print("\n \n \n Return to Main? (Y/N) : ") ;
		again = input.next().charAt(0) ;		
	}

	public void invalidChoice()
	{

		System.out.print("\n \n \nInvalid Choice. Try Again? (Y/N) : ") ;
		again = input.next().charAt(0) ;
	}



}
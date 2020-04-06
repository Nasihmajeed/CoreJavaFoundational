
import java.util.* ;

public class TDD
{

	public static void main(String[] args)
	{
	
		Scanner input = new Scanner(System.in) ;

		C.cls() ;

		char again = 'n',sSelect ;
		School nSchool = new School();

		int i ;

				
		do
		{
			again = 'n' ;

			C.cls() ;

			System.out.println("\n ________________________________________________________ \n \n Welcome To The Directory of Higher Secondary Schools \n ________________________________________________________ \n \n (1) Register a New School \n \n (2) Edit School Details \n \n ------------------------------------------------------ \n ") ;
			char op = input.next().charAt(0);

			switch(op)
			{
				case '1' :
					
					nSchool = new School() ;
					nSchool.NewSchool() ;
					
					System.out.print("\n \n All Required Data Entered. Return to Main? (Y/N) : ") ;
				    again = input.next().charAt(0) ;
					break ;
				
				case '2' :
					C.cls() ;

					System.out.print("\n ____________________ \n \n SELECT SCHOOL \n ____________________ \n \n") ;

					System.out.print("(1) " + nSchool.sAd.sName + "\n \n : ") ;
					sSelect = input.next().charAt(0) ;

						
							
							do
							{

								C.cls() ;

								System.out.print("\n ____________________ \n \n" + nSchool.sAd.sName +"\n ____________________ \n \n") ;

								System.out.print("(1) Display School Info \n \n(2) Manage Classrooms \n \n : ") ;
								sSelect = input.next().charAt(0) ;

								switch (sSelect)
								{
									case '1' :

										C.cls() ;

										nSchool.DisplayInfo() ;
										System.out.print("\n \n \n Return to Main? (Y/N) : ") ;
				   						again = input.next().charAt(0) ;
				   						break ;

				   					case '2' :
				   						
				   						C.cls() ;

				   						System.out.print("\n \n Select Classroom \n ____________________ \n \n") ;
				   						nSchool.SelectClass() ;
				   						System.out.print("\n \n : ") ;
				   						int cl = input.nextInt() ;
										input.nextLine() ;

				   						nSchool.EditClass(cl-1) ;

				   					   	break ;

				   					default :

				   						System.out.print("\n \n \nInvalid Choice. Return to Main? (Y/N) : ") ;
				   						again = input.next().charAt(0) ;

								}

							}while(again == 'y' || again == 'Y') ;	


					break ;
				
				default :
					System.out.println("\n \n Invalid Option Chosen. Try Again? (Y/N) : ") ;
				    again = input.next().charAt(0) ;
			} 	

		} while(again == 'y' || again == 'Y') ;

	}	

}
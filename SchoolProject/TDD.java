
import java.util.* ;

public class TDD
{

	public static void main(String[] args)
	{
	
		Scanner input = new Scanner(System.in) ;

		char again = 'n' ;
				
		do
		{
			again = 'n' ;

			System.out.println("\n ________________________________________________________ \n \n Welcome To The Directory of Higher Secondary Schools \n ________________________________________________________ \n \n (1) Register a New School \n \n (2) Login \n \n -------------------------------------------------------- \n ") ;
			char op = input.next().charAt(0);

			switch(op)
			{
				case '1' :
					RegisterSchool nSchool = new RegisterSchool() ;
					nSchool.NewSchool() ;
					break ;
				
				case '2' :
					break ;
				
				default :
					System.out.println("\n \n Invalid Option Chosen. Try Again? (Y/N) : ") ;
				    again = input.next().charAt(0) ;
			} 	

		} while(again == 'y' || again == 'Y') ;

	}	

}
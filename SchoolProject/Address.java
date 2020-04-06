import java.util.* ;

public class Address
{
	String sName,street,city,state ; //sNAme : Name of School
	int pinCode ;

	public void InputAddress()
	{
		Scanner in = new Scanner(System.in) ;

		C.cls() ;	

		System.out.print("\n ------------------- \n  NEW SCHOOL DETAILS \n ------------------- \n") ;

		System.out.print("\n \n Name : ") ;
		this.sName = in.nextLine() ;

		System.out.print("\n Street : ") ;
		this.street = in.nextLine() ;

		System.out.print("\n City : ") ;
		this.city = in.nextLine() ;

		System.out.print("\n State : ") ;
		this.state = in.nextLine() ;

		System.out.print("\n Pin Code : ") ;
		this.pinCode = in.nextInt() ;
		in.nextLine() ;		
	}

	public void DisplayAddress()
	{
		System.out.print("\n \n School Name : "+ this.sName + "\n Street : " + this.street + "\n City : " + this.city + "\n State : " + this.state + "\n Pin Code : " + this.pinCode) ;
	}
}
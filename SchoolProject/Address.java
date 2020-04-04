import java.util.* ;

public class Address
{
	String sName,street,city,state ; //sNAme : Name of School
	int pinCode ;

	public void InputAddress()
	{
		Scanner in = new Scanner(System.in) ;

		System.out.print("Input Name of the New School : ") ;
		this.sName = in.nextLine() ;

		System.out.print(" Street : ") ;
		this.street = in.nextLine() ;

		System.out.print(" City : ") ;
		this.city = in.nextLine() ;

		System.out.print(" State : ") ;
		this.state = in.nextLine() ;

		System.out.print(" Pin Code : ") ;
		this.pinCode = in.nextInt() ;
		in.nextLine() ;			
	}

	public void DisplayAddress()
	{
		System.out.print("\n \n School Name : "+ this.sName + "\n Street : " + this.street + "\n City : " + this.city + "\n State : " + this.state + "\n Pin Code : " + this.pinCode) ;
	}
}
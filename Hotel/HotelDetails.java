import java.util.* ;

public class HotelDetails
{
	Scanner in = new Scanner(System.in) ;

	String hName = "BADUSHA",type = "NON-VEG",lMark = "Near Greens Avenue", street = "Desamangalam" ,city = "Thrissur" ,state = "Kerala", phNo = "9072331122",gstNo = "27AADFH5037M1Z6" ; 
	int pinCode = 675232, adminPin=420 ;

	public int checkIfAdmin()
	{
		int pin ;

		System.out.print("\n\n\n     INPUT ADMIN PIN : ") ;
		pin = in.nextInt() ;
		in.nextLine() ;

			if(pin == adminPin)
				return 1 ;
			else
				System.out.print("\n\n\n     INVALID PIN. ACCESS DENIED! ") ;

		return 0 ;
	}


	public void inputAddress()
	{
		Scanner in = new Scanner(System.in) ;

		System.out.print("\n Hotel Type : ") ;
		this.type = in.nextLine() ;
		
		System.out.print("\n Street : ") ;
		this.street = in.nextLine() ;

		System.out.print("\n City : ") ;
		this.city = in.nextLine() ;

		System.out.print("\n State : ") ;
		this.state = in.nextLine() ;

		System.out.print("\n Pin Code : ") ;
		this.pinCode = in.nextInt() ;
		in.nextLine() ;	

		System.out.print("\n Phone Number : ") ;
		this.phNo = in.nextLine() ;
			
	}

	public void displayAddressBanner()
	{
		System.out.print("\t\t      "+ this.type +" RESTAURANT \n\n\t\t      " +this.lMark + "\n\t\t    " + this.street + ", " + this.city + ", \n\t\t\t" + this.state + " " + this.pinCode + "\n\t\t      Ph.No : " + this.phNo + "\n") ;
	}

	public void displayBillFooter()
	{
		System.out.print("\n   GST NO : " + gstNo + "\t\t\t" + java.time.LocalTime.now()) ;
		System.out.print("\n\n\t\t     THANK YOU. VISIT AGAIN. :)") ;
		

		System.out.print("\n |_____________________________________________________________| \n") ;
	}
}
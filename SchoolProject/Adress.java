import java.util.Scanner;
public class Adress
{
String place,pincode,state,distrt;

static Scanner input =new Scanner(System.in);
void CreateAdress()
	{
		System.out.println("State = ");
		state=input.next();
		System.out.println("District = ");
		distrt=input.next();
		System.out.println("Place = ");
		place=input.next();
		System.out.println("Pincode  = ");
		pincode=input.next();
		
	}

void printAdress() 
	{
	System.out.println("State = "+this.state);
	System.out.println("District = "+this.distrt);	
	System.out.println("Place = "+this.place);
	//System.out.println("House name  = "+this.housename);
	System.out.println("Pincode  = "+this.pincode);
	}

}

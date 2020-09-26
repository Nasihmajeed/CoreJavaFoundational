import java.util.Scanner;
public class School
{
	String Name,Principal,Address,Teacher,Students;
	int division;
	public void Schooldetails()
	{
		System.out.println("                SCHOOL NAME IS VYASA VIDYA PEETHAM               ");




		System.out.println(" vyasa vidya peetham \n Near District Police camp \n kallekkad (po) ,palakkad \n pincode :678006");

    	System.out.println(" Principal of vyasa vidya peetham is       : ABCD");

    	System.out.println(" Contact number :   160057");
    }






    public void Display()
    {
    	Classroom cr1 = new Classroom();
    	Classroom cr2 = new Classroom();
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("          ENTER THE DETAILS OF CLASS          ");


        System.out.println(" Enter the name of 1st Class teacher : ");
        cr1.teacher1=scanner.next();
        System.out.println(" Enter the name of 2nd Class teacher : ");
        cr2.teacher2=scanner.next();
        System.out.println(" Enter the 1st Class teachers division : ");
        cr1.division=scanner.nextInt();
        System.out.println(" Enter the 2nd Class teachers division : ");
        cr2.division=scanner.nextInt();
        cr1.studentdetails1();
    }

}

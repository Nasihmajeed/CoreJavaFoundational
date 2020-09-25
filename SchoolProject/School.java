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
    	Classroom cr = new Classroom();
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("          ENTER THE DETAILS OF CLASS          ");


        System.out.println(" Enter the name of the teacher : ");
        cr.teacher=scanner.next();
        System.out.println(" Enter the division : ");
        cr.division=scanner.nextInt();
    	cr.studentdetails();
    }

}

import java.util.*;
public class School
{
	String name;
	int code;
	Scanner scan=new Scanner(System.in);
	Classroom c1=new Classroom();
	public void setDetails()
	{
		System.out.println("Enter the school name : ");
		name=scan.next();
		System.out.println("Enter the school code : ");
		code=scan.nextInt();
		c1.setDetails();

	}
	public void getDetails()
	{
		System.out.println("School name is "+name);
		System.out.println("School code is "+code);
		c1.getDetails();
	}

}
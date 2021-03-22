import java.util.Scanner;

public class School
{
	String schoolName;
	
	public void schoolDisplay()
	{
		System.out.println("Please enter the name of the School ");
		Scanner sc=new Scanner(System.in);
		schoolName=sc.nextLine();
		System.out.println("Our School Name is : "+schoolName);
		}
		
}
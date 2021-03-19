import java.util.Scanner;
public class Standard
{
	String standardName;
	
	public void studentStandard()
	{
		System.out.println("Enter the class in which student is studying : ");
		Scanner sc=new Scanner(System.in);
		standardName=sc.nextLine();
		
		System.out.println("The Student is studying in "+standardName+" standard");
	}
}
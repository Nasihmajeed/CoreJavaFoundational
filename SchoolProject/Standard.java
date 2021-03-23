import java.util.Scanner;
public class Standard
{	
	public void studentStandard()
	{
		System.out.println("Enter the class in which student is studying : ");
		Scanner sc=new Scanner(System.in);
		String standardName=sc.nextLine();
		System.out.println("The Student is studying in "+standardName+" standard");
	}
}
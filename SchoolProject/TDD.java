import java.util.Scanner;
public class TDD
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the school name");
		String name=scan.nextLine();		
		
		School school=new School(name);
		school.getDetails();
		school.printDetails();
		school.rankList();
	
	

	}
}
import java.util.Scanner;
public class TDD
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the school name");
		String name=scan.nextLine();
		System.out.println("enter no of classrooms in "+name);
		int no=scan.nextInt();
		
		School school=new School(name,no);
		school.printDetails();
		school.rankList();
	
	

	}
}
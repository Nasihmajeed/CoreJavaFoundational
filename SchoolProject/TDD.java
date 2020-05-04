import java.util.Scanner;
public class TDD{
	public static void main(String[] arg)
	{
		School school;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter school name");
		String schoolName=sc.nextLine();
		System.out.println("enter school place");
		String place=sc.nextLine();
		school=new School(schoolName,place);    
		school.setDetails();
		school.printDetails();	
		 
	}
}

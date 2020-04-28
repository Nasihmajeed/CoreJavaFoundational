import java.util.Scanner;

public class Teacher extends Students
{
	String teacher1, teacher2;
	String subject1,subject2;
	public String teacherDetail1()
		{
			Scanner mytech=new Scanner(System.in);
			System.out.println("Enter teacher1 name");
			String teacher1=mytech.nextLine();
			
		}



		public String subject1Detail()
		{
			Scanner mysub=new Scanner(System.in);
			System.out.println("Enter subject1 name");
			String subject1=mysub.nextLine();
		}



	
	public String teacherDetail2()
	{
		Scanner mytech1=new Scanner(System.in);
			System.out.println("Enter teacher2 name");
			String teacher2=mytech1.nextLine();
			
		
	}



	public String subject2Deatail()
	{
		Scanner mysub2=new Scanner(System.in);
			System.out.println("Enter subject2 name");
			String subject2=mysub2.nextLine();
	}
}
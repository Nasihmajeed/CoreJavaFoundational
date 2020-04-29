import java.util.Scanner;

public class Teacher extends Students
{
	String teacher1, teacher2;
	String subject1,subject2;
	public void TeacherDetail1()
		{
			Scanner mytech=new Scanner(System.in);
			System.out.println("Enter teacher1 name");
			 teacher1=mytech.nextLine();
			System.out.println("the teacherone  is"+teacher1);
			
		}



		public void Subject1Detail()
		{
			Scanner mysub=new Scanner(System.in);
			System.out.println("Enter subject1 name");
			 subject1=mysub.nextLine();
			System.out.println("the subject  is"+subject1);
			
		}



	
	public void TeacherDetail2()
	{
		Scanner mytech1=new Scanner(System.in);
			System.out.println("Enter teacher2 name");
			 teacher2=mytech1.nextLine();
			System.out.println("the teacher two is"+teacher2);
			
			
		
	}



	public void Subject2Deatail()
	{
		Scanner mysub2=new Scanner(System.in);
			System.out.println("Enter subject2 name");
			 subject2=mysub2.nextLine();
			System.out.println("the subject  is"+subject2);
			
	}
}
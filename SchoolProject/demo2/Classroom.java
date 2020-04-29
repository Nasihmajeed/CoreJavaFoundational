import java.util.Scanner;

public class Classroom extends Teacher
{
	
		public  void ClassDetail1()
		{
			String class1;
			Scanner myclass=new Scanner(System.in);
			System.out.println("Enter the class name1");
			 class1=myclass.nextLine();
			System.out.println("classname is" +class1);
		}

		
		public void ClassDetail2()
		{
			String class2;
			Scanner myclass1=new Scanner(System.in);
			System.out.println("Enter the class name2");
			class2=myclass1.nextLine();
			System.out.println("classname is" +class2);
		}
		
		
}


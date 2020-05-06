import java.util.Scanner;

public class School extends Classroom
{

	Classroom class1=new Classroom();
	Classroom class2=new Classroom();
	
	String schoolname;
	
	public void Printdetail()
	{
System.out.println("--------------------------------------------------------------------------");	
Scanner myObj = new Scanner(System.in);
System.out.println("Enter school name");
String schoolname=myObj.nextLine();
System.out.println("The school name is" +schoolname);//make this the last line


			Scanner myclass=new Scanner(System.in);
			System.out.println("Enter the class name1");
			 class1=myclass.nextLine();
			System.out.println("classname is" + class1);


			Scanner myclass2=new Scanner(System.in);
			System.out.println("Enter the class name2");
			class2=myclass2.nextLine();
			System.out.println("classname is" + class2);

			Scanner mystud=new Scanner(System.in);
			System.out.println("Enter subject1 name");
			 student1=mystud.nextLine();
			System.out.println("the student one is"+student1);


			Scanner mystud2=new Scanner(System.in);
			System.out.println("Enter subject1 name");
			 student2=mystud2.nextLine();
			System.out.println("the student one is"+student2);

			Scanner mytech=new Scanner(System.in);
			System.out.println("Enter teacher1 name");
			 teacher1=mytech.nextLine();
			System.out.println("the teacherone  is"+teacher1);


			Scanner mytech1=new Scanner(System.in);
			System.out.println("Enter teacher2 name");
			 teacher2=mytech1.nextLine();
			System.out.println("the teacher two is"+teacher2);
			
			Scanner mysub=new Scanner(System.in);
			System.out.println("Enter subject1 name");
			 subject1=mysub.nextLine();
			System.out.println("the subject  is"+subject1);

			Scanner mysub2=new Scanner(System.in);
			System.out.println("Enter subject2 name");
			 subject2=mysub2.nextLine();
			System.out.println("the subject  is"+subject2);

			
			




System.out.println("\n Class names are " +class1+ " and " +class2);


System.out.println("\n Teacher names are " +teacher1+ " and " +teacher2);


System.out.println("\n Student names are " +subject1+ " and " +subject2);



System.out.println("\n Student names are " +student1+ " and " +student2);

	}



	


}
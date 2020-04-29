import java.util.Scanner;

public class School extends Classroom
{
	
	String schoolname;
	School h;
	
	public void Printdetail()
	{
System.out.println("--------------------------------------------------------------------------");	
Scanner myObj = new Scanner(System.in);
System.out.println("Enter school name");
String schoolname=myObj.nextLine();
System.out.println("The school name is" +schoolname);
System.out.println("School name is " +schoolname);


System.out.println("\n Class names are " +class1+ " and " +class2);
System.out.println("\n Teacher names are " +teacher1+ "\n subject " +subject1+"\n \nTEACHER2"+teacher2+"\n\nSUBJECT"+subject2);


System.out.println("\n Student names are " +student1+ " and " +student2);

	}


}
import java.util.Scanner;
public class School
{
	String schoolName;
	String place;
	Classroom  classes=new Classroom("10 e");
	public School(String sName,String sPlace)
	{
		schoolName=sName;
		place=sPlace;
	}	
	public void printDetails()
	{
		System.out.println("name of the school is" +schoolName);
		System.out.println("situated in "+place);
		classes.printDetails();	
    }
}	

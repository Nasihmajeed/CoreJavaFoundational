import java.util.Scanner;
public class School
{
	String schoolName;
	String place;
	Classroom  classes;
	public School(String sName,String sPlace)
	{
		schoolName=sName;
		place=sPlace;
	}
	public void setDetails()
	{				
		Scanner sc=new Scanner(System.in);
		System.out.println("enter standard");	    
		String standard=sc.nextLine();
		classes=new Classroom(standard);
		classes.setDetails();
	}	
	public void printDetails()
	{
		System.out.println("name of the school is" +schoolName);
		System.out.println("situated in "+place);
		classes.printDetails();	
    }
}	
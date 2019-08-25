import java.util.Scanner; 

public class School
{
	String schoolName;
	String place;
	Classroom classes;
	public School(String sName,String sPlace)
	{
		schoolName=sName;
		place=sPlace;
		classes=new Classroom(8);
	}
	
	public void print()
		{
			System.out.println(" name of the school is "+schoolName);
			System.out.println("situated in "+place);
			System.out.println("\n");
			classes.print();

		}
	
}
	
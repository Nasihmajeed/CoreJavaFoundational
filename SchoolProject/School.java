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
	}

	public void scan()
	{
		Scanner read=new Scanner(System.in);
		System.out.println("enter standard  ");
		int cStd=read.nextInt();
		classes=new Classroom(8);
		classes.scan();
	}
	
	public void print()
		{
			System.out.println(" name of the school is "+schoolName);
			System.out.println("situated in "+place);
			System.out.println("\n");
			classes.print();

		}
	
}
	
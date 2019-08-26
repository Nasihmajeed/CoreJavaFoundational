import java.util.Scanner; 

public class School
{
	String schoolName;
	String place;
	Classroom[] classes;
	public School(String sName,String sPlace)
	{
		schoolName=sName;
		place=sPlace;
	}

	public void scan()
	{
		Scanner read=new Scanner(System.in);
		System.out.println("enter no of classes  ");
		int n=read.nextInt();
		classes=new Classroom[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the division  ");
			int cStd=read.nextInt();
			classes[i]=new Classroom(cStd);
			classes[i].scan();
		}
	}
	
	public void print()
	{
		System.out.println(" name of the school is "+schoolName);
		System.out.println("situated in "+place);
		System.out.println("\n");
		int n=classes.length;
		for(int i=0;i<n;i++)
		{
			classes[i].print();
		}
	}
	
}
	
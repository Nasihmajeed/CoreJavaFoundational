import java.util.Scanner;

public class School
{
	String schoolName,s_topperName;
	float s_topperMarks;
	Standard[] std=new Standard[3];

public void init()
{
	std[0]=new Standard();
	std[1]=new Standard();
	std[2]=new Standard();
}
	
	public void schoolsName()
	{
		System.out.println("Please enter the name of the School ");
		Scanner sc=new Scanner(System.in);
		schoolName=sc.nextLine();
		System.out.println("Our School Name is : "+schoolName);
	}
	
	Teacher t=new Teacher();
	
	public void schoolDisplay()
	    {	
		init();
		std[0].studentDisplayDetails();
		std[1].studentDisplayDetails();
		std[2].studentDisplayDetails();
		}
		
		public void stopperDisplay()
		{
		
		s_topperMarks=t.schoolTopper(std);
		System.out.println("Marks obtained by School Topper is : "+s_topperMarks);
		}
		
		
}
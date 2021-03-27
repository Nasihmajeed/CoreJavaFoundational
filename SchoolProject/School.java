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
	
	public void schoolName()
	{
		System.out.println("Please enter the name of the School ");
		Scanner sc=new Scanner(System.in);
		schoolName=sc.nextLine();
		System.out.println("Our School Name is : "+schoolName);
	}
	

	
	public void schoolDisplay()
	    {	
		init();
		std[0].studentDisplayDetails();
		std[1].studentDisplayDetails();
		std[2].studentDisplayDetails();
		}
		
		
		public float schoolTopper(Standard std[])
      {
	init();
	large=std[0].topMarks;
	if(std[1].topMarks<large)
	{
		if(std[2].topMarks<large)
		{
			System.out.println("Topper of the School is : "+std[0].st[0].sname);
		}
		return std[0].topMarks;
	}
	else if(std[1].topMarks>large)
	{
		if(std[2].topMarks<std[1].topMarks)
		{
			System.out.println("Topper of the School is : "+std[1].st[0].sname);
		}
		return std[1].topMarks;
	}
	else
	{
		System.out.println("Topper of the School is : "+std[2].st[0].sname);
	}
	return std[2].topMarks;
}

		public void stopperDisplay()
		{
        	
		s_topperMarks=schoolTopper(std);
		System.out.println("Marks obtained by School Topper is : "+s_topperMarks);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
}
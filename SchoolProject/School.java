import java.util.*;

public class School
{
	String sch_Name;
	
	float large;
	
	Scanner sc=new Scanner(System.in);
	Standard[] std=new Standard[3];
	
	public void init()
	{
		std[0]=new Standard();
		std[1]=new Standard();
		std[2]=new Standard();
	}
	
	public void schoolDetails()
	{
		System.out.println("Enter the name of your School");
		sch_Name=sc.nextLine();
		System.out.println("Name of your School is : "+sch_Name);
	}
	
	
	public void displayAllDetails()
	{
		init();
		std[0].setStandard();
		std[0].setStudent();
		std[0].displayStandard();
		std[0].classTopperCheck();
		
		std[1].setStandard();
		std[1].setStudent();
	    std[1].displayStandard();
        std[1].classTopperCheck();
		
		std[2].setStandard();
		std[2].setStudent();
	    std[2].displayStandard();
        std[2].classTopperCheck();
		
	}
	
	public void schoolTopperCheck()
	{	
		large=std[0].topMarks;
		
		if(std[1].topMarks>large && std[1].topMarks>std[2].topMarks)
		{
			large=std[1].topMarks;
			System.out.println("School Topper is "+std[1].classTopper+" with marks "+large);
		}
		
		else if(std[2].topMarks>large && std[2].topMarks>std[1].topMarks)
		{
			large=std[2].topMarks;
			System.out.println("School Topper is "+std[2].classTopper+" with marks"+large);
		}
		
		else
		{
			System.out.println("School Topper is "+std[0].classTopper+" with marks"+large);
		}
		
	}
}
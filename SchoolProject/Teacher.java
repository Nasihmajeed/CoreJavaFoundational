import java.util.*;
public class Teacher
{
	String teacher_Name,topperName;
	
	float topperMarks,large;
	
	Scanner sc=new Scanner(System.in);
	
	Student s=new Student();
	
	public void teacherName()
	{
		System.out.println("Enter the name of your Teacher : ");
		teacher_Name=sc.nextLine();
		System.out.println("Name of yout Teacher is : "+teacher_Name);
	}
	
	public void checkPassOrFail(Student s)
	{
		if(s.physics>=35)
		{
			System.out.println("The student"+s.student_Name+" has passed in PHYSICS ");
		}
		else
		{
			System.out.println("The student"+s.student_Name+" has failed in PHYSICS ");
		}
		if(s.chemistry>=35)
		{
			System.out.println("The student"+s.student_Name+" has passed in CHEMISTRY ");
		}
		else
		{
		System.out.println("The student"+s.student_Name+" has failed in CHEMISTRY ");	
		}
		if(s.maths>=35)
		{
			System.out.println("The student"+s.student_Name+" has passed in MATHS ");
		}
		else
		{
			System.out.println("The student"+s.student_Name+" has failed in MATHS");
		}
	}

public String topper(Student s[])
	{		
	        String studentName;
			studentName=s[0].student_Name;
		    large=s[0].total;
		
		if(s[1].total>large&&s[1].total>s[2].total)
		{		
				large=s[1].total;
				topperMarks=large;
				topperName=s[1].student_Name;
			    System.out.println("Topper of the class is "+s[1].student_Name);	
		}
		else if(s[2].total>large&&s[2].total>s[1].total)
		{
			    large=s[2].total;
				topperMarks=large;
				topperName=s[2].student_Name;
				System.out.println("Topper of the class is "+s[2].student_Name);
		}
		else
		    {
			topperName=s[0].student_Name;
			topperMarks=s[0].total;
			System.out.println("Topper of the class is "+s[0].student_Name);
			}
		return topperName;
	}
}
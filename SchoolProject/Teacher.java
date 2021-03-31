import java.util.*;

class Teacher
{
	String classTeacherName,topperName;
	float topperMarks;
	
	Scanner sc = new Scanner(System.in);
	
	Student s=new Student();
		
	public void checkPassOrFail(Student s)
	{
		if(s.maths>=35)
		{
			System.out.println("The Student :"+s.studentName+" has passed in Maths");
		}
		else
		{
			System.out.println("The Student :"+s.studentName+" failed in maths");
			
		}
		if(s.science>=35)
		{
			System.out.println("The Student :"+s.studentName+" has passed in Science");
		}
		else
		{
			System.out.println("The Student :"+s.studentName+" failed in Science");
			
		}
		if(s.english>=35)
		{
			System.out.println("The Student :"+s.studentName+" has passed in English");
		}
		else
		{
			System.out.println("The Student :"+s.studentName+" failed in English");
		}
	}
	
	public String topper(Student stu[])
	{		
	        String studentName;
			studentName=stu[0].studentName;
			float large=stu[0].total;
		
		if(stu[1].total>large)
		{		
				large=stu[1].total;
				topperMarks=large;
				topperName=stu[1].studentName;
				
			System.out.println("Topper of the class is "+stu[1].studentName);
			
		}
		else if(stu[2].total>large)
		{
			large=stu[2].total;
				topperMarks=large;
				topperName=stu[2].studentName;
				System.out.println("Topper of the class is "+stu[2].studentName);
		}
			
		else {
			topperName=stu[0].studentName;
			topperMarks=stu[0].total;
			System.out.println("Topper of the class is "+stu[0].studentName);
			}
		
		return topperName;
	}
	public void teacherName()
	{	
		System.out.println("Enter the name of your Class Teacher : ");
		classTeacherName=sc.nextLine();
		System.out.println("Your class teacher is : "+classTeacherName );
	}
	
}
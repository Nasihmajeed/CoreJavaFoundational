import java.util.*;
public class ClassRoom
{
	Scanner sc = new Scanner(System.in);
	int noOfStudent;
	Teacher t ;
	Student s[] ;

	void classCreate()
	{
	System.out.println("Enter number of Student:");
	noOfStudent = sc.nextInt();
	s = new Student[noOfStudent];	
	t = new Teacher();
	
	for(int i=0;i<noOfStudent;i++)
	{
		s[i] = new Student();
		s[i].createStudent();
	}
	
	t.createTeacher();

	}


	void classDetails()
	{
		t.teacherDeatils();
		for(int i=0;i<noOfStudent;i++)
		{

			s[i].studentDetails();
		}
		
	}

}
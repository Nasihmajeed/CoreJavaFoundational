import java.util.*;
public class ClassRoom
{
	Teacher t = new Teacher();
	Student[] s;
	Subject[] sub;

	static int gt = 0;
	
	void classCreate()
	{

	Scanner sc = new Scanner(System.in);	
	System.out.println("Enter number of Student:");
	int noOfStudent = sc.nextInt();
	s = new Student[noOfStudent];	
	
	for(int i=0;i<s.length;i++)
	{
		s[i] = new Student();
		s[i].createStudent();
		 
		gt = gt + s[i].totalMark;
	}
	
	t.createTeacher();

	}


	void studentSort()
	{
		Student temp;

		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].totalMark<s[j].totalMark)
				{
					temp = new Student();
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}

			}
		}
	}

	void classDetails()
	{

		t.teacherDetails();
		System.out.println("\n");
		for(int i=0;i<s.length;i++)
		{

			s[i].studentDetails();
			System.out.println("\n");
		}
		
	}


}
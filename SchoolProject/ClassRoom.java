import java.util.*;
public class ClassRoom
{
	Teacher t = new Teacher();
	Student[] student;
	//Subject[] sub;

	static int gt = 0;
	
	void classCreate()
	{

	Scanner sc = new Scanner(System.in);	
	System.out.println("Enter number of Student:");
	int noOfStudent = sc.nextInt();
	student = new Student[noOfStudent];	
	
	for(int i=0;i<student.length;i++)
	{
		student[i] = new Student();
		student[i].createStudent();
		 
		gt = gt + student[i].totalMark;
	}
	
	t.createTeacher();

	}


	void studentSort()
	{
		Student temp;

		for(int i=0;i<student.length;i++)
		{
			for(int j=i+1;j<student.length;j++)
			{
				if(student[i].totalMark<student[j].totalMark)
				{
					temp = new Student();
					temp = student[i];
					student[i] = student[j];
					student[j] = temp;
				}

			}
		}
	}

	void classDetails()
	{

		t.teacherDetails();
		System.out.println("\n");
		for(int i=0;i<student.length;i++)
		{

			student[i].studentDetails();
			System.out.println("\n");
		}
		
	}


}
import java.util.*;
public class ClassRoom
{
	Teacher t = new Teacher();
	Student[] student;
	int gt = 0;
	int sum=0;
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
		//sum = sum + noOfStudent ;
		gt = gt + student[i].totalMark;
	}
	
	//System.out.println(sum );
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

	void printClassDetails()
	{

		t.printTeacherDetails();
		System.out.println("\n");
		for(int i=0;i<student.length;i++)
		{

			student[i].printStudentDetails();
			System.out.println("\n");
		}
		
	}


}
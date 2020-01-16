import java.util.*;
public class Student
{
	String studentName;
	int rollNo;
	Mark m = new Mark();
	void createStudent()
	{		
			Scanner sc = new Scanner(System.in);
			System.out.println("Name of Student :");
			studentName = sc.nextLine();
			System.out.println("Roll No Of Student:");
			rollNo = sc.nextInt();
			m.mark();
			

	}


	void studentDetails()
	{
		System.out.println("Name Of Student:"+this.studentName);
		System.out.println("RollNo Of Student:"+this.rollNo);
		
		m.printMark();
		if(m.average>45)
			{
			System.out.println("Passed");
			}
			else
			{
			System.out.println("Failed");
			}
	}

}
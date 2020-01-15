import java.util.*; 

class ClassRoom
{
	
	Student s1,s2;
	int noOfstudents;
	Teacher t1;
	
	void createTeacher()
	{
		t1 = new Teacher();
		t1.name = "Sindhu";
		t1.subject = "English";
		
	}
	void createStudent()
	{
		s1 = new  Student();
		s2 = new  Student();
		s1.rollNo = 46;
		s1.studentName = "Rahul";
		s2.rollNo = 45;
		s2.studentName = "Ashik";
		
	}
	
	void classDetails()
	{
		t1.teacherDetails();
		System.out.println("No.Of Students:"+ this.noOfstudents);
		s1.studentDetails();
		s2.studentDetails();
	}
}
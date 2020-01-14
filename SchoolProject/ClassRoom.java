public class ClassRoom
{
	Student s1;
	Student s2;
	int noOfstudents;
	String nameOfTeacher;
	
	
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
		System.out.println("No.Of Students:"+ this.noOfstudents);
		System.out.println("Teacher Name:" + this.nameOfTeacher);
		s1.studentDetails();
		s2.studentDetails();
	}
}
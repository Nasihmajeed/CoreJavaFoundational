public class ClassRoom
{
	int noStudent;
	String teacher;
	Student ss1,ss2;
	
	void CreateStudent()
	{
		ss1=new Student();
		ss2=new Student();
		ss1.name="Ashik";
		ss1.roll=14;
		ss2.name="Rahul";
		ss2.roll=16;
	}
	
	void printDetails() 
	{
		
		System.out.println("\nName Of teacher ="+this.teacher);
		System.out.println("\nNo of Students = "+this.noStudent);
		ss1.studentDetails();
		ss2.studentDetails();
	}
}
public class School
{
	String name;
	ClassRoom cr1,cr2;
	
	
	void createClass()
	{
		cr1  = new ClassRoom();
		cr2  = new ClassRoom();
		cr1.createTeacher();
		cr1.createStudent();
		cr1.noOfstudents = 25;
		cr2.createTeacher();
		cr2.createStudent();
		cr2.noOfstudents = 35;
		
		
		
	}
	
	void schoolDetails()
	{
		System.out.println("School Name:"+this.name);
		System.out.println("CLASS 1");
		cr1.classDetails();
		System.out.println("CLASS 2");
		cr2.classDetails();		
		
	}
}
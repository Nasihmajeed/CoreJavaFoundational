public class School
{
	String name;
	ClassRoom cr1;
	ClassRoom cr2;	
	
	void createClass()
	{
		cr1  = new ClassRoom();
		cr2  = new ClassRoom();
		cr1.nameOfTeacher = "divya";
		cr1.createStudent();
		cr1.noOfstudents = 25;
		cr2.noOfstudents = 35;
		cr2.nameOfTeacher = "Maya";
		cr2.createStudent();
		
		
	}
	
	void schoolDetails()
	{
		System.out.println("School Name:"+this.name);
		cr1.classDetails();
		cr2.classDetails();		
		
	}
}
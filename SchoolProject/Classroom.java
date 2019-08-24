public class Classroom
{
	int std;
    Teacher teacher;
	Student student;
	
	public Classroom(int standard)
	{
		std=standard;
	}

    public void getClassroomDetails()
	{

		teacher=new Teacher("Aswathy","Maths");
	    student=new Student(1,"Ahalya");
		System.out.println("\nStandard "+std);
		System.out.println("Teacher Details");
   		System.out.println("----------------");
		teacher.getTeacherDetails();
	   	System.out.println("Student Details");
		System.out.println("----------------");
	    student.getStudentDetails();
	}
}



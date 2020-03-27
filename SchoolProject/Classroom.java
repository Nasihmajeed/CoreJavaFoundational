public class Classroom
{
	String cName;
	int totStudent;
	Student[] st = new Student[5];
	Teacher[] t = new Teacher[3];
	public void setStudentDetails()
	{
		st[0]=new Student("hari",1);
		st[1]=new Student("Manu",2);
		st[2]=new Student("Akshay",3);
		st[3]=new Student("Vishnu",4);
		st[4]=new Student("Midhun",5);
		
		//set subjects
		
		for(int i=0;i<5;i++)
		{
			st[i].setSubject();
		}
		setTeacherDetails();
		
		
	}
	
	public void  setTeacherDetails()
	{
		t[0] = new Teacher("smitha","Chemistry");
		t[1] = new Teacher("Subin","Physics");
		t[2] = new Teacher("jisha" , "Maths");
	}
	void printClassDetails()
	{
		
		System.out.println("Class Name : "+this.cName);
		System.out.println("Number Of Students = "+this.totStudent+"\n");
		System.out.println("Student Info\n");
		System.out.println("*****************************");
		for(int i=0;i<totStudent;i++)
		{
			st[i].printStudentDetails();
		}
		
		
		
	}
	void printTeacherDetails()
	{
		
		System.out.println("\n\nFaculty Info");
		System.out.println("*****************************");
		for(int i=0;i<3;i++)
		{
			System.out.println("\nTeacher Name : "+t[i].tName);
			System.out.println("\nTeacher's Subject : "+t[i].tSub);
		}
		System.out.println("*****************************");

	}
}
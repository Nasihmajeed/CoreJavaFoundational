public class School
{
	String sName="SKPHSS";
	int sCode=100020;
	Classroom a= new Classroom();
	Student[] st = new Student[5];
	void createStudent()
	{
		a.cName="CSE";
		st[0]=new Student("hari",1,10,10,8);
		st[1]=new Student("Manu",2,20,14,8);
		st[2]=new Student("Akshay",3,15,12,8);
		st[3]=new Student("Vishnu",4,14,2,8);
		st[4]=new Student("Midhun",5,1,25,8);
		for(int i=0;i<5;i++)
		{
			st[i].totalMark();
		}
	}
	
	
	
	
	void printSchoolDetails()
	{
		System.out.println("School Name : "+sName);
		System.out.println("School Code : "+sCode);
		System.out.println("Class Name : "+a.cName);
		printStudentDetails();

	}
	void printStudentDetails()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("\nStudent Name : "+st[i].studName);
			System.out.println("Student Roll Number : "+st[i].rollNum);	
			System.out.println("\n Total Mark = "+ st[i].total)	;
		}
	}
}
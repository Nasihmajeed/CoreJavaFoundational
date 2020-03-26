public class School
{
	String sName="SKPHSS";
	int sCode=100020;
	Classroom a= new Classroom();
	Student[] st = new Student[5];
	void createStudent()
	{
		
		a.cName="CSE";
		for(int j=0;j<5;j++)
		{
			st[j] = new Student();
		}
		st[0].studName="Hari";
		st[0].rollNum=01;
		st[1].studName="Akhil";
		st[1].rollNum=02;
		st[2].studName="Manu";
		st[2].rollNum=03;
		st[3].studName="Midhun";
		st[3].rollNum=04;
		st[4].studName="Vishnu";
		st[4].rollNum=05;
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
		}
	}
}
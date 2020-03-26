public class School
{
	String sName="SKPHSS";
	int sCode=100020;
	int numClass=1;
	Classroom a= new Classroom();
	Student[] st = new Student[5];
	Teacher[] t = new Teacher[3];
	
	void insertDetails()
	{
		a.totStudent=5;
		a.cName="CSE";
		st[0]=new Student("hari",1,10,10,8);
		st[1]=new Student("Manu",2,20,14,8);
		st[2]=new Student("Akshay",3,15,12,8);
		st[3]=new Student("Vishnu",4,14,2,8);
		st[4]=new Student("Midhun",5,1,25,8);
		for(int i=0;i<a.totStudent;i++)
		{
			st[i].totalMark();
		}
		t[0] = new Teacher("smitha","Chemistry");
		t[1] = new Teacher("Subin","Physics");
		t[2] = new Teacher("jisha" , "Maths");
	}
	
	
	
	
	void printSchoolDetails()
	{	System.out.println("School Info");
		System.out.println("*****************************");
		System.out.println("School Name : "+sName);
		System.out.println("School Code : "+sCode);
		System.out.println("*****************************");
		printClassDetails();
		System.out.println("********************************\n\n");
		//System.out.println("********************************");
		printStudentDetails();
		//System.out.println("********************************\n\n");
		printTeacherDetails();
		//System.out.println("********************************\n\n");

	}
	
	
	void printClassDetails()
	{
		System.out.println("Class Info");
		System.out.println("*****************************");
		for(int i=0;i<numClass;i++)
		{
			System.out.println("Class Number-"+i+1);
			System.out.println("Class Name : "+a.cName);
			System.out.println("Number Of Students = "+a.totStudent );
		}
		
	}
	
	
	void printStudentDetails()
	{
		System.out.println("Student Info");
		System.out.println("*****************************");
		for(int i=0;i<a.totStudent;i++)
		{	
			System.out.println("\nStudent Name : "+st[i].studName);
			System.out.println("Student Roll Number : "+st[i].rollNum);	
			System.out.println("\n Total Mark = "+ st[i].total)	;
		}
		System.out.println("*****************************");
		System.out.println("\n\n");
		
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
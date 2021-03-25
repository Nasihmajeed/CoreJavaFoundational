import java.util.Scanner;
public class Standard
{	
String standardName;

Scanner sc=new Scanner(System.in);

School school=new School();


Student []st=new Student[3];	
	public void initializeArray()
	      {
		st[0]=new Student();
        st[1]=new Student();
        st[2]=new Student();
	      }


	public void studentDisplayDetails()
	{ 
	school.schoolDisplay();
	initializeArray();
	System.out.println("Enter the class in which student is studying : ");
		
	standardName=sc.nextLine();
	System.out.println("The Student is studying in "+standardName+" standard");

	st[0].studentName();
	System.out.println("----------------------------");
System.out.println("-----------------"+st[0].sname+"----------------");
	st[0].studentMarks();
		System.out.println("----------------------------");
		
	//---------------------------------------------------------------
	
	
	
	st[1].studentName();
	System.out.println("----------------------------");
System.out.println("-----------------"+st[1].sname+"----------------");

	st[1].studentMarks();
		System.out.println("----------------------------");

//--------------------------------------------------------------------

st[2].studentName();
	System.out.println("----------------------------");
System.out.println("-----------------"+st[2].sname+"----------------");

	st[2].studentMarks();
		System.out.println("----------------------------");		
		


System.out.println("-----------------"+st[0].sname+"----------------");

	st[0].studentDetails();
		System.out.println("----------------------------");

System.out.println("-----------------"+st[1].sname+"----------------");

	st[1].studentDetails();	
		System.out.println("----------------------------");

System.out.println("-----------------"+st[2].sname+"----------------");

	st[2].studentDetails();
		System.out.println("----------------------------");

	
    Teacher teach=new Teacher();

System.out.println("-----------------"+st[0].sname+"----------------");

	teach.passOrFail(st[0]);
	System.out.println("----------------------------");
	
	
System.out.println("-----------------"+st[1].sname+"----------------");
	
	teach.passOrFail(st[1]);
	System.out.println("----------------------------");
	
	
System.out.println("-----------------"+st[2].sname+"----------------");
	
	teach.passOrFail(st[2]);
	System.out.println("----------------------------");
	
	teach.teacherDetails();
	teach.teacherName();
     teach.topper(st);

	}
	
}
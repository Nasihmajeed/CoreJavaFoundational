public class School
{
	String sName="SKPHSS";
	int sCode=100020;
	int numClass=1;
	Address ad = new Address();
	Classroom a= new Classroom();
	
	
	void insertDetails()
	{
		ad.city="Sreekrishnapuram";
		ad.district="palakkad";
		ad.state = "Kerala";
		ad.pin=679513;
		
		
		//Class Details
		a.totStudent=5;
		a.cName="CSE";
		a.setStudentDetails();
		
		
		
		
		
		
	}
	
	
	
	
	void printSchoolDetails()
	{	System.out.println("School Info");
		System.out.println("*****************************");
		System.out.println("School Name : "+sName);
		System.out.println("School Code : "+sCode);
		System.out.println("School Address: \n"+ad.city+"\n"+ad.district+"\n"+ad.state+"\n"+ad.pin+"\n");
		System.out.println("*****************************");
		System.out.println("Class Info");
		System.out.println("*****************************");
		for(int i=0;i<numClass;i++)
		{
			System.out.println("Class-"+ i+1);
			a.printClassDetails();
		}
		a.printTeacherDetails();
		//System.out.println("********************************\n\n");

	}
	
	
}
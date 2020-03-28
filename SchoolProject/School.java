import java.util.*;
public class School
{
	String sName;
	int sCode;
	int numClass;
	Address ad = new Address();
	Classroom[] a ;
	String printOrNot;
	
	
	void insertDetails()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("School Name : \t");
		sName = in.nextLine();
		System.out.println("School Code :\t");
		sCode = in.nextInt();
		in.nextLine();
		
		//***********Address******************
		ad.setAddress();
		
		//**********Classroom Details*********
		System.out.println("Number Of Classes:\t");
		numClass = in.nextInt();
		in.nextLine();
		a= new Classroom[numClass];
		for(int i=0;i<a.length;i++)
		{
			a[i] = new Classroom();
			System.out.println("Number Of Students in class "+ (i+1) + " : ");
			a[i].setClassroomDetails();
			
		}
	}
	void printSchoolDetails()
	{	Scanner in = new Scanner(System.in);
		System.out.println("Do you want to display the school details(yes/no)");
		printOrNot=in.nextLine();
		if(printOrNot.equals("yes"))
		{
			System.out.println("School Info");
			System.out.println("*****************************");
			System.out.println("School Name : "+sName);
			System.out.println("School Code : "+sCode);
			ad.printAddress();
		}
		
		
	
		System.out.println("\n\t\tClass Info");
		System.out.println("\t*****************************");
		System.out.println("NUMBER OF CLASS = " + numClass);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("\n \t Class-"+ (i+1));
			System.out.println("--------------------------------");
			a[i].printClassDetails();
			a[i].printTeacherDetails();
		} 

	}
	
	
}
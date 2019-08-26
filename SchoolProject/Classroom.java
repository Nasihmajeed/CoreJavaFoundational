import java.util.Scanner;
public class Classroom
{
	String standard;
	Teacher teacher;
	Student[] students;
	public void setDetails()
	{ 	
		int l;		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter standard");
		standard=sc.nextLine();		
		System.out.println("enter the number of students");		
		l=sc.nextInt();
		students=new Student[l];
		teacher=new Teacher();		
		teacher.setDetails();
		for(int i=0;i<l;i++)
		{
			students[i]=new Student();
	    	students[i].setDetails();
		}
	}
	public void printDetails()
	{
		int l;
		l=students.length;
		System.out.println("standard is : "+standard);
		teacher.printDetails();
		for(int i=0;i<l;i++)
		{	
			students[i].printDetails();
		}
	}
    
}



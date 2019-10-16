import java.util.Scanner;
public class Classroom
{
	int std;
    Teacher teacher;
	Student[] student;
	
	public Classroom(int standard)
	{
		std=standard;
	}
	void setClassroomDetails()
	{
		System.out.println("\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter teacher details");
		System.out.println("Enter teacher name");
		String name=sc.nextLine();
	    teacher=new Teacher(name);
		System.out.println("\nEnter  no of student");
        int n=sc.nextInt();
        student=new Student[n];
	    System.out.println("\nEnter  details of student");
	    for(int i=0;i<n;i++)
	       { 
	         System.out.println("\nEnter " +(i+1)+"th student details");
			 System.out.println("Enter roll no:	");
			 int  rollNo=sc.nextInt();
			 System.out.println("Enter name: ");
			 String sname=sc.next();
	 	     student[i]=new Student(rollNo,sname);
	 	     student[i].setStudentDetails();
	 	     
	       }
	}
	void getClassDetails()
	{
		
		System.out.println("standard: "+ std) ;
	    teacher.getTeacherDetails();
		System.out.println("Student Details");
		System.out.println("-----------------");
		for(int i=0;i<student.length;i++)
		{
			student[i].getStudentDetails();
		}
	}
	void rankList()
	{
		int n=student.length;
		Student temp=new Student();
        Student[] rank=new Student[n];;
		for(int i=0;i<n;i++)
		{
		   	rank[i]=student[i];
	    }
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(rank[i].total>rank[j].total)
				{
					temp=rank[i];
					rank[i]=rank[j];
					rank[j]=temp;
				}
			}
		}
		System.out.println("class ranklist");
		System.out.println("----------------");		
		for(int i=0; i<n; i++)
		{
			System.out.println("Rank: " +(i+1)+"\t"+ " Name: "+rank[i].name+"\t"+" Total marks:"+rank[i].total);
		}
		System.out.println("\n");
	}	
}
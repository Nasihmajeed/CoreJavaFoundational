import java.util.Scanner;
public class Classroom
{
	int std;
    Teacher teacher;
	Student[] student;
	
	public void setClassroomDetails()
	{
		Scanner sc=new Scanner(System.in); 
	    System.out.println("\nEnter standard:");
	    std=sc.nextInt();
	    teacher=new Teacher();
	    System.out.println("\nEnter teacher details");
	    teacher.setTeacherDetails();
	    System.out.println("\nEnter  no of student");
        int n=sc.nextInt();
        student=new Student[n];
	    System.out.println("\nEnter  details of student");
	    for(int i=0;i<n;i++)
	       { 
	         System.out.println("\nEnter " +(i+1)+"th student details");
	 	     student[i]=new Student();
	 	     student[i].setStudentDetails();
	       }
    }


    public void getClassroomDetails()
	{
		int n=student.length;
		System.out.println("\nStandard "+std);
		System.out.println("Teacher Details");
   		System.out.println("----------------");
		teacher.getTeacherDetails();
	   	System.out.println("Student Details");
		System.out.println("----------------");
	   	for(int i=0;i<n;i++)
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
			System.out.println(rank[i].name);
			System.out.println(rank[i].total);
		}
	}
}
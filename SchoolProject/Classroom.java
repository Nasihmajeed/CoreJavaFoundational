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

	public void scan()
  	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("\nteacher details");
	    System.out.println("Enter Tr name:");
	    String tName=sc.nextLine();
	    teacher=new Teacher(tName);
	    System.out.println("Enter no.of students");
	    int n=sc.nextInt();
	    student=new Student[n];
	    System.out.println("\nEnter  details of student");
		for(int i=0;i<n;i++)
			{ 
				System.out.println("\nEnter " +(i+1)+"th student details");
			    System.out.println("Enter Rollno:");
			    int rollno=sc.nextInt();
			    System.out.println("Enter Name:");
			    String sName=sc.next();
			    student[i]=new Student(rollno,sName);
			    student[i].scan();
	  		}
  	}

    public void getClassroomDetails()
	{ 
		System.out.println("\nStandard "+std);
		teacher.getTeacherDetails();
		System.out.println("Student details");
		for(int i=0;i<student.length;i++)
		{
	    	student[i].getStudentDetails();
	    }
	}
	void rankList()
	{
		int n=student.length;
		Student temp;
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



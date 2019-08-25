import java.util.Scanner;
public class Classroom
{
	
	String div;
	Teacher teacher;
	Student[] student;
	
	
    public Classroom(String sdiv, int scount)
	{
		int n=scount;
		div=sdiv;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the teacher name: ");
		String tname=scan.nextLine();
		teacher =new Teacher(tname);
		
		student=new Student[n];
		
		for(int i=0; i<n; i++)
		{
			System.out.println("enter student "+(i+1)+" details\n");
			System.out.println("enter student name");
			String name=scan.next();
			System.out.println("enter count of subjects: ");
			int count=scan.nextInt();
			student[i]=new Student(name,count); 
		
		}
		
	
	}
	void printDetails()
	{

		

		System.out.println("class room div= "+div);
		teacher.printDetails();
		int n=student.length;
		
		for(int i=0; i<n; i++)
		{
			System.out.println(+(i+1)+"th student details");
			student[i].printDetails();
		}
		
	}
	void rankList()
	{
		
		int n=student.length;
		Student[] rank=new Student[n];
		Student temp;
		for(int i=0; i<n; i++)
		{
			
			rank[i]=student[i];
		}

		for(int i=0; i<n; i++)
		{
			
			for(int j=0; j<n; j++)
			{
				if(rank[i].tmark>rank[j].tmark)
				{
					temp=rank[i];
					rank[i]=rank[j];
					rank[j]=temp;

				}
			}
		}
		

	
		for(int i=0; i<n; i++)
		{
			System.out.print(rank[i].studentName+" : ");
			System.out.println(rank[i].tmark);

		}
	}

}
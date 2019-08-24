import java.util.Scanner; 

public class Student
{
	String stName;
	int rNo;
	int total=0;
	Subject[] subject;

	public void scan()
	{
		int i,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student name");
		stName=sc.nextLine();
		System.out.println("enter student rollno");
		rNo=sc.nextInt();
		System.out.println("how many subjects");
		p=sc.nextInt();

		subject=new Subject[p];

		for(i=0;i<p;i++)
		{
			subject[i]=new Subject();
			subject[i].scan();
		}
	}

	public void print()
	{
		int i,p;
		p=subject.length;
		System.out.println(" rollno of the student is "+rNo+" and name is "+stName);
		for(i=0;i<p;i++)
		{
			subject[i].print();
			total=total+subject[i].marks;
		}
		System.out.println("The total mark= "+total);
		System.out.println("\n");
		}
}
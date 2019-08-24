import java.util.Scanner;
public class Student
{
	int rollno;
	String name;
	Subject[] subject;
	int totalMark;
	public void scan()
	{
		int i,r;
		Scanner s=new Scanner(System.in);
		System.out.println("enter student roll no");
		rollno=s.nextInt();
		System.out.println("enter student name");
		name=s.next();
		System.out.println("enter number of subject for student");
		r=s.nextInt();
		subject=new Subject[r];
		
		for(i=0;i<r;i++)
		{
			subject[i]=new Subject();
			subject[i].scan();
		}
	}
	public void print()
	{
		int i,r;
		r=subject.length;
		System.out.println("\n");
		System.out.println("student "+name+" with roll no "+rollno);
		for(i=0;i<r;i++)
		{
			subject[i].print();
			totalMark+=subject[i].mark;
		}	
		System.out.println("total mark="+totalMark);
	}
	
}

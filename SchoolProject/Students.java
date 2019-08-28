import java.util.Scanner;
public class Students
{
	String studentname;
	int rollno;
	Subject subject;
	public Students(String stname,int rno)
	{		

		studentname=stname;
		rollno=rno;
	}
	public void input()
	{
		Scanner stn=new Scanner(System.in);
		System.out.println("enter subject name : ");
		String subname=stn.nextLine();
		System.out.println("enter subject mark : ");
		int mrk=stn.nextInt();

		subject=new Subject(subname,mrk);
		subject.printdetail();
			
	}
	public void printdetail()
	{
		System.out.println("student name : "+studentname);
		System.out.println("rollno : "+rollno);
		subject.printdetail();
	}
}


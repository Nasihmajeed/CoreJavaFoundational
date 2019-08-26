public class Students
{
	String studentname;
	int rollno;
	Subject subject=new Subject("maths",80);
	public Students(String stname,int rno)
	{
		studentname=stname;
		rollno=rno;
	}
	public void printdetail()
	{
		System.out.println("student name : "+studentname);
		System.out.println("rollno : "+rollno);
		subject.printdetail();
	}
}


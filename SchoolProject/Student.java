public class Student
{
	int rollno;
	String name;
	Subject subject=new Subject("maths",34);
	public Student(int no,String sName)
	{
		rollno=no;
		name=sName;
	}
	
	public void print()
	{
		
		System.out.println("\n");
		System.out.println("student "+name+" with roll no "+rollno);
		subject.print();
	}
	
}

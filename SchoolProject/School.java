public class School
{
	String schoolname;
	Classroom classroom=new Classroom("10F",5);
	public School(String sclname )
	{
		schoolname=sclname;
	}
	
	public void printdetail()
	{
		
		System.out.println("school name :"+schoolname);
		classroom.printdetail();
	}
}
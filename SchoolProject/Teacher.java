public class Teacher
{
	String name;
	int id;
	public Teacher(String tName,int identity)
	{
		name=tName;
		id=identity;
	}
	public void print()
	{	
		System.out.println("name of teacher "+name+" and id is "+id);
	}
}
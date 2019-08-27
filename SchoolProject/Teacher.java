import java.util.Scanner;
public class Teacher
{
	
  String name;
  public Teacher(String tname)
	{
		name=tname;
		
	}
	void getTeacherDetails()
	{
		System.out.println("Teacher: "+name);
		System.out.println("\n");
	}
}
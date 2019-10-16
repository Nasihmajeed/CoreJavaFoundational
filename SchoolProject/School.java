import java.util.*;
public class School
{
	public String name;
	public Classroom c1;
	public void scan()
	{
		c1=new Classroom();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name of the School : ");
		name=s.next();
		c1.scan();
		
		}
		public void print()
		{
			System.out.println("\n\t\t\t "+name);
			c1.print();
			c1.maxTotal();
		}
}			
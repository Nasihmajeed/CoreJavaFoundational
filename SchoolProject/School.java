public class School
{ 
	String schoolName;
	String schoolPlace;
	Classroom classes=new Classroom(4,"A");
	public School(String sName,String sPlace)
	{
		schoolName=sName;
		schoolPlace=sPlace;
	}
	public void print()
	{
		
		System.out.println("\n");
		System.out.println("school "+schoolName+" is located in "+schoolPlace);
		classes.print();
	}
}

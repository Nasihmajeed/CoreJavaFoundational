public class TDD
{
	public static void main(String arg[])
	{
		School sc = new School();
		Classroom c = new Classroom();
		Student st = new Student();
		sc.name="skphss";
		c.classname="CSE";
		st.studname="Hari";
		st.rollno=5;
		sc.printDetails();
		c.printDetails();
		st.printDetails();
		
	}
}
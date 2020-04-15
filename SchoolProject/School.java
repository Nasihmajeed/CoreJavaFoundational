public class School
{

	String schoolname;
	Teacher t1,t2;
	Student s1,s2,s3,s4;
	Classroom c1,c2;

	public void Printdetail()
	{
		System.out.println("--------------------------------------------------------------------------");
		
		System.out.println("DONBOSCO INTERNATIONAL SCHOOL");

		System.out.println("\n Student Details :   "+s1.printDetail());
		System.out.println("\n Student Details :   "+s2.printDetail());
		System.out.println("\n Student Details :   "+s3.printDetail());
		System.out.println("\n Student Details :   "+s4.printDetail());


		
		System.out.println("\n Teacher Details : "+t1.printDetail());
		System.out.println("\n Teacher Details : "+t2.printDetail());



		
	}
}
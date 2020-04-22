import java.util.Scanner;

public class School extends Classroom
{
	
	String schoolname;
	School h;;
	
	public void Printdetail()
	{
System.out.println("--------------------------------------------------------------------------");		
System.out.println("School name is " +schoolname);
System.out.println("\n Class names are " +classDetail1()+ " and " +classDetail12());
System.out.println("\n Teacher names are " +teacherDetail1()+ "\n subject " +subject1Detail()+"\n \nTEACHER2"+teacherDetail2()+"\n\nSUBJECT"+subject2Deatail());
System.out.println("\n Student names are " +studentDetail1()+ " and " +studentDetail2());
	}

	public void Total()
	{
		System.out.println("\nStudents in 10A are");
		System.out.println("\nAkil");
		System.out.println("\nJamal");
		System.out.println("\nMarks of  Akil in english"+m1);
		System.out.println("\nMarks of  AKIL in maths"+m2);
		System.out.println("\nMarks of  AKIL in science"+m3);

		t1=m1+m2+m3;

		System.out.println("\nTotal marks of AKIL"+t1);
		System.out.println("\nMarks of Jamal in english "+n1);
		System.out.println("\nMarks of Jamal in maths"+n2);
		System.out.println("\nMarks of Jamal in science"+n3);
		t2=n1+n2+n3;

		System.out.println("Total marks of Jamal"+t2);



		System.out.println("\n Students in 10B are");
		System.out.println("\n Aswin");
		System.out.println("\n Bavitha");
		System.out.println("\n Marks of  Aswin in english"+l1);
		System.out.println("\n Marks of  Aswin in maths"+l2);
		System.out.println("\n Marks of  Aswin in science"+l3);

		t3=l1+l2+l3;

		System.out.println("\n Total marks of Aswin"+t3);
		System.out.println("\n Marks of Bavitha in english "+p1);
		System.out.println("\n Marks of Bavitha in maths"+p2);
		System.out.println("\n Marks of Bavitha in science"+p3);
		t4=p1+p2+p3;

		System.out.println("Total marks of Bavitha"+t4);



	}
}
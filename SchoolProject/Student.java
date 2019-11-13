import java.util.*;
public class Student
{
	
	Scanner scan=new Scanner(System.in);
	String name;
	int rollno;
	Mark m1=new Mark();
	Mark m2=new Mark();
	public void setDetails()
	{
		
		System.out.println("Enter the student name : ");
		name=scan.next();
		

		System.out.println("Enter the rollno : ");
		rollno=scan.nextInt();
		System.out.println("Enter the mark1 out of(100) : ");
		m1.m=scan.nextInt();
		System.out.println("Enter the mark2  out of (100): ");
		m2.m=scan.nextInt();
		

	


	}
	public void getDetails()
	{
		System.out.println("The name is "+name);
		System.out.println("The rollno is "+rollno);
		System.out.println("The mark1 is "+m1.m);
		System.out.println("The mark2 is "+m2.m);
		System.out.println("Average is "+this.average());
		System.out.println("Percentage is "+this.percentage());
		

	}

public float average()
{
	float avg=(float)(m1.m+m2.m)/2;
		return avg;
}

public float percentage()
{
	float percentage=(float)(m1.m+m2.m)/100*100;
	return percentage;
}
}
import java.util.*;
public class Student
{
	
	Scanner scan=new Scanner(System.in);
	String name;
	int rollno;
	
	Subject[] sub=new Subject[3];


	//Subject m1=new Subject();
	//Subject m2=new Subject();
	public void setDetails()
	{
		
		System.out.println("Enter the student name : ");
		name=scan.next();
		

		System.out.println("Enter the rollno : ");
		rollno=scan.nextInt();
		

		for(int i=0;i<3;i++)
		{
			sub[i]=new Subject();
			
		System.out.println("Enter the name of subject:");
		sub[i].name=scan.next();
		System.out.println("Enter the mark out of (100): ");
		sub[i].mark=scan.nextInt();
		}

	


	}
	public void getDetails()
	{
		
		 System.out.println("The name is "+name);
		System.out.println("The rollno is "+rollno);
		for(int i=0;i<3;i++)
		{
		System.out.println(" Subject is :"+sub[i].name);
		 System.out.println("The mark is "+sub[i].mark);
		  
		}
		System.out.println("Total is "+this.total());
		System.out.println("Average is "+this.average());
		System.out.println("Percentage is "+this.percentage());

		

	}
public float total()
{
	float total=0;
	for(int i=0;i<3;i++)
	{
	total=total+sub[i].mark;
	 }
	 
	return total;
}

 public float average()
{
	float avg=0,total=0;
	for(int i=0;i<3;i++)
	{
	total=total+sub[i].mark;
	 

}
avg=(float)(total)/3;
	 return avg;

}
public float percentage()

{
	float percentage=0;
	for(int i=0;i<3;i++)
	{
	 percentage=(float)(sub[i].mark)/100*100;
}
	return percentage;
}
}

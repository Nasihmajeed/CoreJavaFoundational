import java.util.*;
public class Student
{
	String studName;
	int rollNum;
	int total;
	int numOfSub;
	Subject[] sub;
	
	
	public void setStudentDetails()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Student Name : ");
		studName=in.nextLine();
		System.out.println("Student Roll number : ");
		rollNum=in.nextInt();
		in.nextLine();
		System.out.println("Number of subject = ");	
		numOfSub=in.nextInt();
		in.nextLine();
		sub = new Subject[numOfSub];
		for(int i=0;i<numOfSub;i++)
		{
			sub[i] = new Subject();
			sub[i].setSubjectDetails();
		}
	}
	
	
	
	public void setTotalMark()
	{
		for(int i=0;i<numOfSub;i++)
		{
			this.total=this.total+sub[i].subMark;
		}
	  
	}
	
	void printStudentDetails()
	{
		
		System.out.println("Student Name : "+this.studName);
		System.out.println("Student Roll Number : "+this.rollNum);	
		System.out.println("Subject Name - Subject Mark");
		for(int i=0;i<sub.length;i++)
		{
			sub[i].printSubject();
		}
		System.out.println("Total Mark = "+ this.total);
		
		
	}
}
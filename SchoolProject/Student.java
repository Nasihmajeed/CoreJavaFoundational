import java.util.*;
public class Student
{
	String studentName;
	int rollNo,totalMark ;
	Subject[] sub;

	void createStudent()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Name of Student :");
		studentName = sc.nextLine();
		System.out.println("Roll No Of Student:");
		rollNo = sc.nextInt();
		System.out.println("Enter Number Of Subjects: ");
		int noOfSub = sc.nextInt();
		sub = new Subject[noOfSub];
		for(int i=0;i<sub.length;i++)
		{
			sub[i] = new Subject();
			sub[i].markCreate();
			totalMark = totalMark + sub[i].subMark;
		}
	}


	void studentDetails()
	{
		System.out.println("Name Of Student:"+this.studentName);
		
		System.out.println("RollNo Of " + this.studentName +" = " +this.rollNo);
		
		for(int i=0;i<sub.length;i++)
		{
			sub[i].subjectDetails();
		}

		System.out.println("Total Mark : " +this.totalMark+"\n");
		

	}


}
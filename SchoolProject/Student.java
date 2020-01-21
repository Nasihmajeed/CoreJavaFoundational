import java.util.*;
public class Student
{
	String studentName;
	int rollNo,totalMark ;
	Subject[] subject;

	
	void createStudent()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Name of Student :");
		studentName = sc.nextLine();
		System.out.println("Roll No Of Student:");
		rollNo = sc.nextInt();
		System.out.println("Enter Number Of Subjects: ");
		int noOfSub = sc.nextInt();
		subject = new Subject[noOfSub];
		for(int i=0;i<subject.length;i++)
		{
			subject[i] = new Subject();
			subject[i].markCreate();
			totalMark = totalMark + subject[i].subMark;
			
		}
	}


	void printStudentDetails()
	{

		System.out.println("\nName|RollNo");
		System.out.println("__________________");
		System.out.println(this.studentName+"\t"+this.rollNo+"\n");

		System.out.println("\nSubject|Mark");
		System.out.println("_________________________");

		for(int i=0;i<subject.length;i++)
		{
			subject[i].printSubjectDetails();
		}
		System.out.println("__________________");
		System.out.println("Total Mark : " +this.totalMark+"\n");
		

	}


	


}
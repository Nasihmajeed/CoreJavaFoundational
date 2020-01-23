import java.util.*;
public class Student
{
	String studentName;
	int rollNo;
	float totalMark;
	float averageMark;
	Subject[] subject;

	void createStudent()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Name of Student :\t");
		studentName = sc.nextLine();
		System.out.println("Roll No Of Student:\t");
		rollNo = sc.nextInt();
		System.out.println("Enter Number Of Subjects: \t");
		int noOfSub = sc.nextInt();
		subject = new Subject[noOfSub];
		for(int i=0;i<subject.length;i++)
		{
			subject[i] = new Subject();
			subject[i].markCreate();
			totalMark = totalMark + subject[i].subjectMark;

			averageMark = (totalMark/300)*100;
		}
	}


	void printStudentDetails()
	{

		System.out.println("\nName|RollNo");
		System.out.println("__________________________________");
		System.out.println(this.studentName+"\t"+this.rollNo);

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
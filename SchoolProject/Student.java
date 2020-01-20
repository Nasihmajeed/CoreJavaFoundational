import java.util.*;
public class Student
{
Subject subject[];
int roll,totalmark;
String name;
static Scanner input =new Scanner(System.in);
void CreateStudent()
	{

		System.out.println("Name of  Student  =");
		name=input.next();
		System.out.println("Roll no.=");
		roll=input.nextInt();
		System.out.println("No.of of  Subject  =");
		int subt=input.nextInt();
		subject=new Subject[subt];
		for(int i=0;i<subject.length;i++)
			{
				subject[i]=new Subject();
				subject[i].SubjectCreat();
			    totalmark=totalmark+subject[i].mark;
			}

	}




void studentDetails() 
	{

		System.out.println("\nStudent name = "+this.name);
		
		System.out.println("roll number  = "+this.roll);
	for(int i=0;i<subject.length;i++)
			{
				System.out.println("------------------");
				subject[i].SubjectDisplay();

			}
			System.out.println("_________________");
		System.out.println("\nTotal Mark = "+this.totalmark);
		
	}
}
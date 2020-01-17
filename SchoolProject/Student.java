import java.util.*;
public class Student
{
Subject sub[]=new Subject[5];
int roll,n1,ns,total,temp;
String name;
Scanner input =new Scanner(System.in);
void CreateStudent()
	{
		System.out.println("Name of  Student  =");
		name=input.next();
		System.out.println("Roll no.=");
		roll=input.nextInt();
		System.out.println("No.of of  Subject  =");
		ns=input.nextInt();
		for(int i=1;i<=ns;i++)
			{
				sub[i]=new Subject();
				sub[i].SubjectCreat();
				total=total+sub[i].m1;
			}

	}




void studentDetails() 
	{

		System.out.println("\n\nStudent name = "+this.name);
		
		System.out.println("roll number  ="+this.roll);
	for(int i=1;i<=ns;i++)
			{
				sub[i].SubjectDisplay();

			}
		System.out.println("Total Mark ="+this.total);
		
	}
}
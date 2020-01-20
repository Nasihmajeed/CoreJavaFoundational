import java.util.*;
public class Student
{
Subject sub[];
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
		sub=new Subject[subt];
		for(int i=0;i<sub.length;i++)
			{
				sub[i]=new Subject();
				sub[i].SubjectCreat();
			    totalmark=totalmark+sub[i].m1;
			}

	}




void studentDetails() 
	{

		System.out.println("\n\nStudent name = "+this.name);
		
		System.out.println("roll number  ="+this.roll);
	for(int i=0;i<sub.length;i++)
			{
				sub[i].SubjectDisplay();

			}
		System.out.println("Total Mark ="+this.totalmark);
		
	}
}
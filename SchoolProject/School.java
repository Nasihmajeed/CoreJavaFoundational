import java.util.Scanner;
public class School
{
	int i,cls;
String name;
ClassRoom cl[] = new ClassRoom[5];
Scanner input =new Scanner(System.in);
void classCreat()
{
	for(i=1;i<=cls;i++)
	{
		cl[i] = new ClassRoom();
		System.out.println("Class "+i+" Details");
		cl[i].CreateTeacher(); 
		System.out.println("Enter Number of students in  class  "+ i +":");
		cl[i].n = input.nextInt();
		cl[i].CreateStudent();
		
		
	}
	//cl1.CreateTeacher();
	//cl1.CreateStudent();

	
}

void printDetail()
{
	System.out.println("Name OF School"+this.name);
	for(i=1;i<=cls;i++)
	{

	System.out.println("\nclass "+ i +"\n");
	System.out.println("No of Students   = "+this.cl[i].n);
	cl[i].printDetails();
	
	
	}
}
}
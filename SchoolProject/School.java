import java.util.Scanner;
public class School
{
String name;
ClassRoom cl1,cl2;
Scanner input =new Scanner(System.in);
void classCreat()
{
	cl1 =new ClassRoom();
	System.out.println("Enter the No of Students =");
	cl1.n1=input.nextInt();
	cl1.CreateTeacher();
	cl1.CreateStudent();
	
	
	System.out.println("\n 2ndclass \n");
	new ClassRoom();
	cl2=new ClassRoom();
	System.out.println("Enter the No of Students =");
	cl1.n2=input.nextInt();
	cl2.CreateTeacher();
	cl2.CreateStudent();
	
	
}

void printDetail()
{
	System.out.println("\nclass 1\n");
	System.out.println("Name OF School"+this.name); 
	System.out.println("\nclass 1\n");	
	cl1.printDetails();
	System.out.println("No of Students   = "+this.cl1.n1);
	System.out.println("\nclass 2\n");
	cl2.printDetails();
	System.out.println("No of Students   = "+this.cl2.n2);
}
}
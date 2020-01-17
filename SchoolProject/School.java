import java.util.Scanner;
public class School
{
	
String name;
int cls;

ClassRoom cl[]=new ClassRoom[5];
Scanner input =new Scanner(System.in);

void createSchool()
{

	System.out.println("Enter the Name of School =");
	name =input.next();
	System.out.println("Enter the No of class =");
	cls =input.nextInt();
	for(int i=1;i<=cls;i++)
	{
		cl[i]=new ClassRoom();
		cl[i].classCreat();
	}
}

	


void schoolDetail()
{
	
	System.out.println("Name OF School\t"+this.name); 
	for(int j=1;j<=cls;j++)
	{
	System.out.println("\nclass "+j+"\n");
	cl[j].sorting();	
	cl[j].printDetails();
	System.out.println("\n\nNo of Students   = "+this.cl[j].n1);
	}
}
}
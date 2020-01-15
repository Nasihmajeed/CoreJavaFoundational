import java.util.Scanner;
public class School
{
	int cls;
String name;
ClassRoom cl[]=new ClassRoom[5];
Scanner input =new Scanner(System.in);
void classCreat()
{
	for(int j=1;j<=cls;j++)
	{
	System.out.println("\n "+j+"stclass \n");
	
	cl[j] =new ClassRoom();
	System.out.println("Enter the No of Students =");
	cl[j].n1=input.nextInt();
	cl[j].CreateTeacher();
	cl[j].CreateStudent();
	}
	
}

void printDetail()
{
	System.out.println("Name OF School\t"+this.name); 
	for(int j=1;j<=cls;j++)
	{
	System.out.println("\nclass "+j+"\n");	
	cl[j].printDetails();
	System.out.println("\n\nNo of Students   = "+this.cl[j].n1);
	}
}
}
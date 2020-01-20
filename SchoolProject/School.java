import java.util.Scanner;
public class School
{
	
String name;
ClassRoom classroom[];

static Scanner input =new Scanner(System.in);

void createSchool()
{

	System.out.println("Enter the Name of School =");
	name =input.next();
	System.out.println("Enter the No of class =");
	int clsses =input.nextInt();
	classroom=new ClassRoom[clsses];
	for(int i=0;i<classroom.length;i++)
	{
		classroom[i]=new ClassRoom();
		classroom[i].classCreat();

	}
}

void classSorting()
{
	for (int i=0;i<classroom.length;i++)
	{
		for (int j=i+1;j<classroom.length;j++)
		{
		if(classroom[i].grandtotal<classroom[j].grandtotal)
		{

	ClassRoom tempc=new ClassRoom();
		tempc=classroom[i];
		classroom[i]=classroom[j];
		classroom[j]=tempc;
		}
		}
	
	}
}	


void schoolDetail()
{
	
	System.out.println("Name OF School\t:  "+this.name); 
	for(int j=0;j<classroom.length;j++)
	{
		System.out.println("--*--*--*--*--*--*--");
	System.out.println("\n\nClass "+(j+1)+"\n");
	classroom[j].studentSorting();	
	classroom[j].printDetails();
	System.out.println("\n\nNo of Students   = "+this.classroom[j].student.length);
	}
}
}
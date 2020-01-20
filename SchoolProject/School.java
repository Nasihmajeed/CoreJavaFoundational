import java.util.Scanner;
public class School
{
	
String name;
ClassRoom cl[];

static Scanner input =new Scanner(System.in);

void createSchool()
{

	System.out.println("Enter the Name of School =");
	name =input.next();
	System.out.println("Enter the No of class =");
	int clsses =input.nextInt();
	cl=new ClassRoom[clsses];
	for(int i=0;i<cl.length;i++)
	{
		cl[i]=new ClassRoom();
		cl[i].classCreat();

	}
}

void classSorting()
{
	for (int i=0;i<cl.length;i++)
	{
		for (int j=i+1;j<cl.length;j++)
		{
		if(cl[i].grandtotal<cl[j].grandtotal)
		{

	ClassRoom tempc=new ClassRoom();
		tempc=cl[i];
		cl[i]=cl[j];
		cl[j]=tempc;
		}
		}
	
	}
}	


void schoolDetail()
{
	
	System.out.println("Name OF School\t"+this.name); 
	for(int j=0;j<cl.length;j++)
	{
	System.out.println("\nclass "+j+"\n");
	cl[j].studentSorting();	
	cl[j].printDetails();
	System.out.println("\n\nNo of Students   = "+this.cl[j].ss.length);
	}
}
}
import java.util.Scanner;
public class School
{
	
String name;
ClassRoom classroom[];
Student tem[];
	int k=0;
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

	tem=new Student[20];
	//while(k<5)
	//{
	for(int i=0;i<classroom.length;i++)
	{
	for (int j=0;j<classroom[i].student.length;j++)
	{
		tem[k]=new Student();
		tem[k]=classroom[i].student[j];
		k++;
	}
	
	}
//}

	for (int x=0;x<k;x++)
	{
		for (int y=x+1;y<5;y++)
		{
		if(tem[x].totalmark<tem[y].totalmark)
		{
		Student temp=new Student();
		temp=tem[x];
		tem[x]=tem[y];
		tem[y]=temp;
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
void schoolRankList()
{
	System.out.println(" School wise Result");
	System.out.println("--*--*--*--*--*--*--");
	for(int m=0;m<k;m++)
	{
	tem[m].studentDetails();
	}

}
}
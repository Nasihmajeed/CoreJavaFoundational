import java.util.Scanner;
public class School
{
	
String name;
Adress adress;
ClassRoom[] classroom;
Student[] stdnt;
int totalstdnt=0;
static Scanner input =new Scanner(System.in);

void createSchool()
{

	System.out.println("Enter the Name of School =");
	name =input.next();
	adress = new Adress();
	adress .CreateAdress();
	System.out.println("Enter the No of class =");
	int clsses =input.nextInt();
	classroom=new ClassRoom[clsses];
	for(int i=0;i<classroom.length;i++)
	{
		classroom[i]=new ClassRoom();
		classroom[i].classCreat();

	}
	schoolDetail();
	
	classSorting();
	schoolRankList();
}

void classSorting()
{

	stdnt=new Student[20];
	
	for(int i=0;i<classroom.length;i++)
	{
	for (int j=0;j<classroom[i].student.length;j++)
	{
		stdnt[totalstdnt]=new Student();
		stdnt[totalstdnt]=classroom[i].student[j];

		totalstdnt++;
	}

	// for(int m=0;m<totalstdnt;m++)
	// {
	// stdnt[m].rankList();
	// }
	}


	for (int x=0;x<totalstdnt;x++)
	{
		for (int y=x+1;y<totalstdnt;y++)
		{
		if(stdnt[x].totalmark<stdnt[y].totalmark)
		{
		Student temp=new Student();
		temp=stdnt[x];
		stdnt[x]=stdnt[y];
		stdnt[y]=temp;
		}
		}
	
	}

}	


void schoolDetail()
{
	
	System.out.println("\n\nName OF School\t:  "+this.name); 
	adress.printAdress() ;
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
	System.out.println("\n School wise Result");
	System.out.println("--*--*--*--*--*--*--");
	System.out.println("\n Rank\tname\t Mark\tpercentage ");
	System.out.println("\t__________________________________________");	
	for(int m=0;m<totalstdnt;m++)
	{
	System.out.print((m+1)+"\t");
	
	stdnt[m].rankList();
	}

}
}
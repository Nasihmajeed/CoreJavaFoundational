import java.util.Scanner;
public class School
{ 
	String schoolName;
	String schoolPlace;
	Classroom[] classes;

	public void scan()
	{
		int i,c;	
		Scanner s=new Scanner(System.in);
		System.out.println("enter school name");
		schoolName=s.nextLine();
		System.out.println("enter school place");
		schoolPlace=s.nextLine();
		System.out.println("enter number of classes");
		c=s.nextInt();
		classes=new Classroom[c];
		
		for(i=0;i<c;i++)
		{
			classes[i]=new Classroom();
			classes[i].scan();
		}
	}
	public void print()
	{
		int i,c;
		c=classes.length;
		System.out.println("\n");
		System.out.println("school "+schoolName+" is located in "+schoolPlace);
		for(i=0;i<c;i++)
		{
			classes[i].print();
			System.out.println("class wise ranklist");
			System.out.println("----------");
			classes[i].rankList();
		}
		
	}
	public void rankList()
	{
		int i,j,c,t=0;
		c=classes.length;
		for(i=0;i<c;i++)
		{
			t=classes[i].student.length;
		}
		Classroom[] classroomTemp=new Classroom[c];
		Classroom[] classroomRank=new Classroom[c];
		for(i=0;i<c;i++)
		{
			classroomTemp[i]=classes[i];
		}
		for(i=0;i<c;i++)
		{
			for(j=0;j<c;j++)
			{
				if(classroomTemp[i].student[i].totalMark>classroomTemp[j].student[j].totalMark)
				{
					classroomRank[1]=classroomTemp[i];
					classroomTemp[i]=classroomTemp[j];
					classroomTemp[j]=classroomRank[1];
				}
			}

		}
		for(i=0;i<c;i++)
		{
			classroomRank[i]=classroomTemp[i];
		}
		for(i=0;i<c;i++)
		{
			for(j=0;j<t;j++)
			{
				System.out.println("name="+classroomRank[i].student[j].name+"   ,mark="+classroomRank[i].student[j].totalMark);
			}
		}
	}
}
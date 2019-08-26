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
		int i,j,c,count=0,m,k,l=0;
		int[] t=new int[10];
		c=classes.length;
		for(i=0;i<c;i++)
		{
			t[i]=classes[i].student.length;
			count+=t[i];
		}
		Classroom[] classroomTemp=classes;
		Student temp=new Student();
		for( i=0;i<c;i++)
		{ 
		 	for(j=0;j<t[i];j++)
			{
				for(k=0;k<t[j];k++)
				{					
					if(classroomTemp[i].student[j].totalMark>classroomTemp[j].student[k].totalMark)
					{
						temp=classroomTemp[i].student[j];
						classroomTemp[i].student[j]=classroomTemp[j].student[k];
						classroomTemp[j].student[k]=temp;
						
					}
				}
			}
		}
		for(i=0;i<c;i++)
		{
			m=classes[i].student.length;
			for(j=0;j<m;j++)
			{
				System.out.println("Rank="+(l+1)+"name="+classroomTemp[i].student[j].name+"  mark="+classroomTemp[i].student[j].totalMark);
				l++;	
			}
		}
	}
}
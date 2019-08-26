import java.util.Scanner;
public class School
{
	String schoolName;
	String place;
	Classroom[] classes;
	public void setDetails()
	{	
		int lt;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter school name");
		schoolName=sc.nextLine();	
		System.out.println("enter school place");
		place=sc.nextLine();		
		System.out.println("enter the classes");
		lt=sc.nextInt();
		classes=new Classroom[lt];		
		for(int i=0;i<lt;i++)
		{
			classes[i]=new Classroom();
			classes[i].setDetails();
		}
	}
	public void printDetails()
	{
		int lt;
		lt=classes.length;
		System.out.println(" name of the school is "+schoolName);
		System.out.println("situated in "+place);	
		for(int i=0;i<lt;i++)
		{	
			classes[i].printDetails();
		 }	
	}	
	public void rankList()
	{  // System.out.print("haiiiiiiiiiiiiiiiiiiii");
		int length=0;
		int n=classes.length;
		Student temp=new Student();							
		for(int i=0;i<n;i++)
		{
			int stdlength=classes[i].students.length;
			for(int j=0;j<stdlength;j++)
			{
			 length++;
			}
		}
		Student[] rank=new Student[length];	
		int m=0;
		for(int i=0;i<n;i++)
		{	
			int stdlength=classes[i].students.length;
			for(int k=0;k<stdlength;k++)
			{   
				rank[m]=classes[i].students[k];
				m++;
			}
		}
		for(int i=0;i<length;i++)
		{	

			for(int j=0;j<length;j++)
			{		
				if(rank[i].totalMark>rank[j].totalMark)
				{
				temp=rank[i];
				rank[i]=rank[j];
				rank[j]=temp;
				}
			}
		}		
		for(int i=0;i<length;i++)
			{
				System.out.print(rank[i].studentName +"  ");				
				System.out.println(rank[i].totalMark);
			}	

	}	
}
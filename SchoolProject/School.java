import java.util.Scanner;
public class School
{
	
	String name;
 
 	Classroom classroom[];
 	public  void getDetails()
	{
		Scanner word=new Scanner(System.in);
		int n;
		System.out.println("enter the school name");
		name=word.nextLine();

		System.out.println("enter the no of classrooms");
		n=word.nextInt();
		classroom=new Classroom[n];
		for(int i=0; i<n; i++)
		{
			System.out.println("enter "+(i+1)+"th classroom details");
			
			classroom[i]=new Classroom();
			classroom[i].getDetails();
		}
	}
	public void printDetails()
	{
		int n=classroom.length;
		
		System.out.println("School name = "+name);
		for(int i=0; i<n; i++)
			{
				System.out.println(+(i+1)+"th classroom details");
				classroom[i].printDetails();
			}		
	}
	public void rankList()
	{
		int m=classroom.length;
		
		Student temp;
		int l=0,u=0;

		for(int j=0;j<m;j++)
			{
				int n=classroom[j].student.length;
				for(int i=0; i<n; i++)
				{
					l++;
				}
			}
		Student[] rank=new Student[l];		
		
			for(int j=0;j<m;j++)
			{
				int n=classroom[j].student.length;
				for(int i=0; i<n; i++)
				{
					
					rank[u]=classroom[j].student[i];
					
					System.out.println("shgfsgdfjahfgjhagfjhgs ="+rank[u].studentName + rank[u].tmark);
					u++;
				}
			}
		
		
		for(int i=0; i<l;i++)
		{
			System.out.println(rank[i].studentName);
		}	

		for(int i=0; i<l; i++)
		{
			
			for(int j=0; j<l; j++)
			{
				if(rank[i].tmark>rank[j].tmark)
				{
					temp=rank[i];
					rank[i]=rank[j];
					rank[j]=temp;

				}
			}
		}
		System.out.println("school ranklist =");
		for(int i=0; i<l; i++)
		{
			System.out.print(rank[i].studentName+" : ");
			System.out.println(rank[i].tmark);

		}
	}
}


// another method
public void rankList1()
	{
		int m=classroom.length;
		Student[] rank=new Student[50];
		Student temp;
		int l=0;
		
			for(int j=0;j<m;j++)
			{
				int n=classroom[j].student.length;
				for(int i=0; i<n; i++)
				{
					
					rank[l]=classroom[j].student[i];
					
					// System.out.println("shgfsgdfjahfgjhagfjhgs ="+rank[l].studentName +  [l].tmark);
					l++;
				}
			}

		System.out.println(l);
		for(int g=0; g<m; g++)
		{
			
		for(int h=0; h<m; h++)
			{int s=classroom[g].student.length;
				int a=classroom[h].student.length;
		for(int i=0; i<s; i++)
		{
			for(int j=0; j<a; j++)
			{
				if(classroom[g].student[i].tmark>classroom[h].student[j].tmark)
				{
					temp=classroom[g].student[i];
					classroom[g].student[i]=classroom[h].student[j];
					classroom[h].student[j]=temp;

				}
			}
		}}}
		System.out.println("school ranklist =");
		for(int u=0; u<m; u++)
			{
				int n=classroom[u].student.length;
				for(int i=0; i<n; i++)
				{
					System.out.print(classroom[u].student[i].studentName+" : ");
					System.out.println(classroom[u].student[i].tmark);

		}
}




		
		

		 

	}
}

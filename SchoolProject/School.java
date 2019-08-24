import java.util.Scanner; 

public class School

{
	String schoolName;
	String place;
	Classroom[] classes;

	public void scan()
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the school name ");
		schoolName=sc.nextLine();
		System.out.println(" enter the school location ");
		place=sc.nextLine();
		System.out.println("enter the no. of classes");
		n=sc.nextInt();

		classes=new Classroom[n];
		
		for(i=0;i<n;i++)
		{
			classes[i]=new Classroom();
			classes[i].scan();
		}

	}

	public void print()
	{
		int n,i;
		n=classes.length;
		System.out.println(" name of the school is "+schoolName);
		System.out.println("situated in "+place);
		System.out.println("\n");
		for(i=0;i<n;i++)
		{
			classes[i].print();
			classes[i].rank();
			System.out.println("________________________________________________");
		}

	}

	public void rank()
	{
		int n,i,j,k,z,count=0,m;
		int[] o=new int[10];
		n=classes.length;
		for(z=0;z<n;z++)
		{
			o[z]=classes[z].student.length;
			count+=o[z];
		}
		Student temp=new Student();
		for(z=0;z<n;z++)
		{
			for(i=0;i<o[z];i++)
			{
				for(j=0;j<o[z]-1;j++)
				{
					for(k=0;k<o[z]-1;k++)
					{
						if(classes[i].student[j].total>classes[j].student[k].total)
						{
							temp=classes[i].student[j];
							classes[i].student[j]=classes[j].student[k];
							classes[j].student[k]=temp;
						}
					}
				}
			}
		}
		int l=0;
		System.out.println("Schoolwise rank");
		for(i=0;i<n;i++)
		{
			m=classes[i].student.length;
			for(j=0;j<m;j++)
			{
				System.out.println("Rank: "+(l+1)+" Totalmark: "+(classes[i].student[j].total)+" Name is "+(classes[i].student[j].stName));
				l++;
			}	
		}	
				
	}


}
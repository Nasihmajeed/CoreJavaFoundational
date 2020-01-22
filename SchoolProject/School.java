import java.util.*;
public class School
{
	String schoolName;
	String principalName; 
	ClassRoom classroom[];
	Student[] temp1;
	//Student[] newtemp;

	int count=0;
	void createSchool()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of School:");	
		schoolName = sc.nextLine();
		System.out.println("Enter Name of Principal:");	
		principalName = sc.nextLine();
		System.out.println("Enter Numer of classroom:");
		int noOfClass = sc.nextInt();

		classroom = new ClassRoom[noOfClass];

		for(int i=0;i<classroom.length;i++)
		{	
		classroom[i] = new ClassRoom();
		classroom[i].classCreate();
		}

	}

	void schoolSort()
	{
		temp1 = new Student[25];
		
		for(int i=0;i<classroom.length;i++)
		{
			for(int j=0;j<classroom[i].student.length;j++)
			{
				temp1[count] = new Student();
				temp1[count] = classroom[i].student[j]; 
				count++;
			}
		}

		Student newtemp = new Student();
		for(int p=0;p<count;p++)
		{
			for(int q=p+1;q<count;q++)
			{
				if(temp1[p].totalMark<temp1[q].totalMark)
				{
					//newtemp= new Student();
					newtemp = temp1[p];
					temp1[p] = temp1[q];
					temp1[q] = newtemp;
				}
			}
		}
		
	}

	void printSchooDeatails()
	{
		System.out.println("\n*****"+this.schoolName+"*****\n");
		System.out.println("\nPrincipal Name:"+this.principalName);
		
		for(int i=0;i<classroom.length;i++)
		{
			System.out.println("\n");
		    System.out.println("CLASS  "+(i+1));
		    System.out.println("Number Of Students :" + this.classroom[i].student.length);
			classroom[i].studentSort();
			classroom[i].printClassDetails();
			
		
		}
	}


	void rankWiseResult()
	{
		System.out.println("Rank Wise Result");
		System.out.println("___________________");
		for(int x=0;x<count;x++)
		{
			temp1[x].printStudentDetails();
		}
	}
}



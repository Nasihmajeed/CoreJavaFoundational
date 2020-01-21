import java.util.*;
public class School
{
	String schoolName;
	String principalName; 
	ClassRoom classroom[];
	Student[] temp;


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
		int k=0;
		Student temps;
		Student[] student;
		temp = new Student[20];
		while(k<6)
		{

		for(int i=0;i<classroom.length;i++)
		{
			for(int j=0;j<classroom[i].student.length;j++)
			{
				// if(classroom[i].student[j].totalMark<classroom[i].student[k].totalMark)
				// {
					
				// 	System.out.println("foo");


				// 	//System.out.println(classroom[i].student[j].totalMark);
				// 	// temps = new Student();
				// 	// temps = classroom[i].student[j];
				// 	// classroom[i].student[j] = classroom[i].student[k] ;
				// 	// classroom[i].student[k] = temps;
				// }
		
				temp[k] =  new Student();
				temp[k] = classroom[i].student[j];
				k++;
			}




			}

		}


		for(int p=0;p<10;p++)
		{
			for(int q=p+1;q<10;q++)
			{
				if(temp[p].totalMark<temp[q].totalMark)
				{
					Student t = new Student();
					t = temp[p];
					temp[p] = temp[q];
					temp[q] = t;
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
		for(int m=0;m<6;m++)
		{
			temp[m].printStudentDetails();
		}


}
}
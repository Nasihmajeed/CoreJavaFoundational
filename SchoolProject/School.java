import java.util.*;
public class School
{
	String schoolName;
	String principalName; 
	ClassRoom classroom[];


	void start()
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

	void classSort()
	{
		ClassRoom tempclass;
		for(int i=0;i<classroom.length;i++)
		{
			for(int j=i+1;j<classroom.length;j++)
			{
				if(classroom[i].gt<classroom[j].gt)
				{
					tempclass= new ClassRoom();
					tempclass = classroom[i];
					classroom[i] = classroom[j];
					classroom[j] = tempclass;
				}

			}
		}
	}


	void schooDeatils()
	{
		System.out.println("\n*****School Name:"+this.schoolName+"*****\n");
		System.out.println("\nPrincipal Name:"+this.principalName);
		
		for(int i=0;i<classroom.length;i++)
		{
			System.out.println("\n");
		    System.out.println("CLASS  "+(i+1));
		    System.out.println("Number Of Students :" + this.classroom[i].student.length);
			classroom[i].studentSort();
			classroom[i].classDetails();
			
		
		}
	}


}
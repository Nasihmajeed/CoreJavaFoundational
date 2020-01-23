import java.util.*;
public class School
{
	String schoolName,principalName;
	Adress adress = new Adress();
	ClassRoom[] classRoom;
	Student[] tempStudent;
	Student student ;
	int studentCount = 0;
	int noOfClassRoom;
	void createSchool()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("School Name::\t");
		schoolName = sc.nextLine();
		System.out.println("School Address::\t");
		adress.state = sc.nextLine();
		adress.district = sc.nextLine();
		adress.place = sc.nextLine();
		adress.pincode = sc.nextLine();
		
		System.out.println("Principal Name::\t");
		principalName = sc.nextLine();
		System.out.println("No.Of ClassRoom::\t");
		noOfClassRoom = sc.nextInt();
		classRoom = new ClassRoom[noOfClassRoom];

		for(int i=0;i<classRoom.length;i++)
		{
			classRoom[i] = new ClassRoom();
			classRoom[i].classCreate();
		}

		schoolSort();
		printSchooDeatails();
		rankWiseResult();
	}

	void schoolSort()
	{
		tempStudent = new Student[25];
		
		for(int i=0;i<classRoom.length;i++)
		{
			for(int j=0;j<classRoom[i].student.length;j++)
			{
				tempStudent[studentCount] = new Student();
				tempStudent[studentCount] = classRoom[i].student[j]; 
				studentCount++;
			}
		}

		Student newStudent = new Student();
		for(int p=0;p<studentCount;p++)
		{
			for(int q=p+1;q<studentCount;q++)
			{
				if(tempStudent[p].totalMark<tempStudent[q].totalMark)
				{
					
					newStudent = tempStudent[p];
					tempStudent[p] = tempStudent[q];
					tempStudent[q] = newStudent;
				}
			}
		}
		
	}

	void printSchooDeatails()
	{
		System.out.println("\t\t"+this.schoolName+"\n");
		System.out.println("ADDRESS\n"+adress.state+"\n"+adress.district+"\n"+adress.place+"\n"+adress.pincode+"\n"); 		
		System.out.println("\tPrincipal Name:"+this.principalName+"\n");
		
		for(int i=0;i<classRoom.length;i++)
		{
			System.out.println("\n");
		    System.out.println("CLASS  "+(i+1));
		    System.out.println("Number Of Students :\t" + this.classRoom[i].student.length);
			classRoom[i].studentSort();
			classRoom[i].printClassDetails();
			
		
		}
	}


	void rankWiseResult()
	{
		System.out.println("Rank Wise Result");
		System.out.println("___________________");

		System.out.println("\nRank | Name | RollNo | TotalMark | Percentage ");
		System.out.println("____________________________________________");
		
		for(int x=0;x<studentCount;x++)
		{
			student = new Student();
			System.out.println((x+1)+"\t"+tempStudent[x].studentName+"\t"+tempStudent[x].rollNo+"\t"+tempStudent[x].totalMark+"\t   "+tempStudent[x].averageMark);
		}
	}



}
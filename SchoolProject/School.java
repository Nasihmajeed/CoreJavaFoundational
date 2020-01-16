import java.util.*;
public class School
{
	Scanner sc = new Scanner(System.in);
	String schoolName;
	String principalName;
	int noOfClass; 
	ClassRoom cr[];
	
	void start()
	{
	System.out.println("Enter Name of School:");	
	schoolName = sc.nextLine();
	System.out.println("Enter Name of Principal:");	
	principalName = sc.nextLine();
	System.out.println("Enter Numer of classroom:");
	noOfClass = sc.nextInt();
    
    cr = new ClassRoom[noOfClass];

	for(int i=0;i<noOfClass;i++)
	{
		cr[i] = new ClassRoom();
		cr[i].classCreate();
	}


	}
	
	void schooDeatils()
	{
		System.out.println("School Name:"+this.schoolName);
		System.out.println("Principal Name:"+this.principalName);
		for(int i=0;i<noOfClass;i++)
		{
		    System.out.println("CLASS"+(i+1));
			cr[i].classDetails();
		
		}
	}

}
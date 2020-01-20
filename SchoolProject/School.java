import java.util.*;
public class School
{
	String schoolName;
	String principalName; 
	ClassRoom cr[];


	void start()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of School:");	
		schoolName = sc.nextLine();
		System.out.println("Enter Name of Principal:");	
		principalName = sc.nextLine();
		System.out.println("Enter Numer of classroom:");
		int noOfClass = sc.nextInt();

		cr = new ClassRoom[noOfClass];

		for(int i=0;i<cr.length;i++)
		{	
		cr[i] = new ClassRoom();
		cr[i].classCreate();
		}

	}

	void classSort()
	{
		ClassRoom tempclass;
		for(int i=0;i<cr.length;i++)
		{
			for(int j=i+1;j<cr.length;j++)
			{
				if(cr[i].gt<cr[j].gt)
				{
					tempclass= new ClassRoom();
					tempclass = cr[i];
					cr[i] = cr[j];
					cr[j] = tempclass;
				}

			}
		}
	}


	void schooDeatils()
	{
		System.out.println("School Name:"+this.schoolName);
		System.out.println("Principal Name:"+this.principalName);
		
		for(int i=0;i<cr.length;i++)
		{
			System.out.println("\n");
		    System.out.println("CLASS  "+(i+1));
		    System.out.println("Number Of Students :" + this.cr[i].s.length);
			cr[i].studentSort();
			cr[i].classDetails();
			
		
		}
	}


}
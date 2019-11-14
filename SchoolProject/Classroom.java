import java.util.*;
public class Classroom
{
	Scanner scan=new Scanner(System.in);
	String name;
	int num;
	Student[] stud= new Student[2];
     
    	
	

	Teacher t=new Teacher();
	public void setDetails()
	{

		System.out.println("Enter the batch: ");
		name=scan.next();
		System.out.println("Enter the teacher name : ");
		t.name=scan.next();
		System.out.println("Enter the no.of students");
		num=scan.nextInt();
		for(int i=0;i<num;i++)
		{
			stud[i]=new Student();
			stud[i].setDetails();
			}	
}
/*public void sort()
{	
	float temp=0;
	for(int i=0;i<num;i++)
	{
		for(int j=0;j<i;j++)
		{
			if(stud[i].total()<stud[j].total())
			{

				temp=stud[i].total();
				stud[i].total()=stud[j].total();
				temp=stud[j].total();
			}
		}
	}*/
	public void getDetails()
	{
		System.out.println("The batch is "+name);
		System.out.println("Teacher name is "+t.name);
		for(int i=0;i<num;i++)
		{
		stud[i].getDetails();
		}
		
		
		
	}
		}

import java.util.*;
public class Classroom
{
	Scanner scanner=new Scanner(System.in);
	String name;
	int num;
	Student[] student= new Student[10];
	Teacher teacher = new Teacher();
	public void setDetails(int number)
	{
		/*System.out.println("Enter the batch: ");
		name=scan.next();*/
		System.out.println("Enter the teacher name : ");
		teacher.name=scan.next();
		/*System.out.println("Enter the no.of studentents");
		num=scan.nextInt();*/
		for(int i=0;i<number;i++)
		   {
			student[i]=new Student();
			System.out.print("Enter Student Name : ");
			student[i].name = scanner.next();
			System.out.print("Enter RollNo : ");
			student[i].rollno = scanner.nextInt();
			/*student[i].setDetails();*/
		   }	
	
   }
	public void sort()
	{	
		for(int i=0;i<student.length;i++)
		{
			for(int j=i+1;j<student.length;j++)
			{
				if(student[i].total()>student[j].total())
				{
					Student temp=student[i];
					student[i]= student[j];
					temp=student[j];
				}

			}
			System.out.println(student[i].name);
		}
	}
	public void getDetails()
	{
		System.out.println("The batch is "+name);
		System.out.println("Teacher name is "+t.name);
			for(int i=0;i<num;i++)
			{
			student[i].getDetails();
			}

		}

}
import java.util.Scanner;
public class Classroom
{
	String division;
	int strength;
	Teacher teacher;
	Students[] students;	
	public Classroom(String div,int stren)
	{	
		division=div;
		strength=stren;
	}
	public void Input()
	{
		Scanner clr=new Scanner(System.in);

		System.out.println("enter teacher name : ");
		String tname=clr.nextLine();

		System.out.println("enter teacher subject : ");
		String sub=clr.nextLine();
		teacher=new Teacher(tname,sub);
		student=new Student[n];
		for (i=0;i<n ;i++ ) 
		{
			System.out.println("enter"(+(i+1)+" student name : ");
			String stname=clr.nextLine();

			System.out.println("enter student rollno : ");
			int rno=clr.nextInt();
			students[i]=new Students(stname,rno);
			students[i].input();		
		}
				
	}
	
	public void printdetail()
	{
		
		System.out.println("div :"+division);
		System.out.println("strength :"+strength);
		teacher.printdetail();
		for(int i=0; i<n; i++)
		{
			System.out.println(+(i+1)+"th student details");
			student[i].printDetails();
		}	
	}

}
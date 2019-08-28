import java.util.Scanner;
public class School
{
	String schoolname[];
	Classroom classroom[];//=new Classroom(division,strength);
	public School(String sclname )
	{

		schoolname=sclname;
	}
	
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of classroom : ");
		int n=sc.nextInt();
		classroom=new Classroom[n];
		for (i=0;i<n ;i++ )
		{

			
			System.out.println("enter" +(i+1)+ "class division : ");
			String div=sc.nextLine();
			System.out.println("enter strength of Classroom : ");
			int stren=sc.nextInt();
			classroom[i]=new Classroom(div,stren);	
			classroom[i].Input();
		}

	}
	public void printdetail()
	{
		
		System.out.println("school name :"+schoolname);
		classroom.printdetail();
		for(int i=0; i<n; i++)
		{
			System.out.println(+(i+1)+"th classroom dets");
			classroom[i].printDetails();
		}
	}
}
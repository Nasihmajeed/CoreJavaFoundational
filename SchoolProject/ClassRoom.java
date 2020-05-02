import java.util.Scanner;
public class ClassRoom
{
	Scanner s=new Scanner(System.in);
	int n,total=0,Std;
	System.out.println (" Enter number of students ");
	n=s.nextInt();
    Student std=new Student();
    Student std=new Student[50];
    std(i)=new Student()
    
     for (int i=1; i<=n; i++)
     {
        System.out.println("enter 1st student details: ");
        System.out.println("enter name of the student: ");
		String name=s.nextLine();
		System.out.println("enter roll no: ");
		int rNo=s.nextInt();	
		s.nextLine();
		System.out.println("enter  semester one  mark: ");
		int t1=s.nextInt();
		s.nextLine();
		System.out.println("enter  semester two  mark: ");
		int t2=s.nextInt();
		s.nextLine();
		System.out.println("enter parent's contact number: ");
		int parentNo=s.nextInt();
		s.nextLine();
		System.out.println("\n student detail: ");
		System.out.println(" name : "+name);
		System.out.println("Roll no: "+rNo);
		System.out.println("total marks= "+(t1+t2));
		System.out.println("Parent's contact number= "+parentNo);
	  }
}
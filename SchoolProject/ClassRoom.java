import java.util.Scanner;
public class ClassRoom
{
	Scanner s=new Scanner(System.in);
	int n,i,total=0,Std;
	public void setStudent()
	{
	System.out.println (" Enter number of students ");
	n=s.nextInt();
    s.nextLine();
    Student[] std=new Student[10];
    for (int i=1; i<=n; i++)
     {
     	std[i]=new Student();
        System.out.println("enter student details");
        System.out.println("enter name of the student: ");
		std[i].name=s.nextLine();
		System.out.println("enter roll no: ");
		std[i].rNo=s.nextInt();	
		s.nextLine();
		System.out.println("enter  semester one  mark: ");
		std[i].t1=s.nextInt();
		s.nextLine();
		System.out.println("enter  semester two  mark: ");
		std[i].t2=s.nextInt();
		s.nextLine();
		std[i].total=std[i].t1+std[i].t2;
		System.out.println("enter parent's contact number: ");
		std[i].parentNo=s.nextInt();
		s.nextLine();
		System.out.println("\n student detail: ");
		System.out.println(" \n name : "+std[i].name);
		System.out.println("Roll no: "+std[i].rNo);
		System.out.println("total marks= "+std[i].total);
		System.out.println("Parent's contact number= "+std[i].parentNo);
	  }
}
}
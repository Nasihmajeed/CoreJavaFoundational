import java.util.Scanner;

public class Teacher
{
float total;

Student st=new Student();

public void teacherName()
{
	System.out.println("Enter the name of the Teacher ");
	Scanner sc=new Scanner(System.in);
	String tname=sc.nextLine();
	System.out.println("Name of the Teacher is : "+tname);
}

public void totalMarks()
{
total=st.physics+st.chemistry+st.maths;
System.out.println("Total Marks obtained by the student is : "+total);	
}

}
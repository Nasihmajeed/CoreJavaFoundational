import java.util.Scanner;

public class Classroom
{
	int division;
	String dept;
	Student[] student = new Student[3];
	Scanner scanner;
	

	public void setStudents()
	{
      scanner = new Scanner(System.in);
	  for(int i=0;i<2;i++)
		{
      System.out.println("enter the register number: ");
      student[i].regNo = scanner.nextInt();
      System.out.println("enter the name of the student: ");
      student[i].name = scanner.next(); 
        }
    }
      
     public void getStudents()
     {
        System.out.println("register number: "+student[i].regNo);
        System.out.println("name: "+student[i].name);
        
     }
}
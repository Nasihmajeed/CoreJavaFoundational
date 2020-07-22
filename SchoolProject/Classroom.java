import java.util.Scanner;

public class Classroom
{
	int division;
	String dept;
	Student[] student = new Student[3];
	Scanner scanner;
	int i;

	public void setStudents()
	{
      scanner = new Scanner(System.in);
	  for(i=0;i<3;i++)
		{
			student[i] = new Student();
			
      System.out.println("enter the register number: ");
      student[i].regNo = scanner.nextInt();
      System.out.println("enter the name of the student: ");
      student[i].name = scanner.next(); 
      System.out.println(" \n ");
        }
    }
      
     public void getStudents()
     {
     	for(i=0;i<3;i++)
     	{
        System.out.println("register number: "+student[i].regNo);
        System.out.println("name: "+student[i].name);
        System.out.println(" \n ");
        }
     }
}
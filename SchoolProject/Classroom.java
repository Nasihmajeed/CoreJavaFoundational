import java.util.Scanner;

public class Classroom
{
	int division;
	String dept;
	Student[] student = new Student[3];
	Student[] sub1 = new Sub();
	Student[] sub2 = new Sub();
	Student[] sub3 = new sub();
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
      System.out.println("enter the mark of physics: ");
      student[i].sub1 = scanner.nextInt();
      System.out.println("enter the mark of chemistry: ");
      student[i].sub2 = scanner.nextInt();
      System.out.println("enter the mark of maths: ");
      student[i].sub3 = scanner.nextInt(); 
      student[i].total = student[i].sub1+student[i].sub2+student[i].sub3;
      student[i].percentage = (student[i].total/300)*100;
      System.out.println(" \n ");
        }
    }
      
     public void getStudents()
     {
     	for(i=0;i<3;i++)
     	{
        System.out.println("register number: "+student[i].regNo);
        System.out.println("name: "+student[i].name);
        System.out.println("physics: "+student[i].sub1);
        System.out.println("chemistry: "+student[i].sub2);
        System.out.println("maths: "+student[i].sub3);
        System.out.println("total mark: "+student[i].total);
        System.out.println("percentage: "+student[i].percentage);
        System.out.println(" \n ");
        }
     }
}
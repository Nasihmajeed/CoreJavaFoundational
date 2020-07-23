import java.util.Scanner;

public class Classroom
{
	int division;
	String dept;
	String teacher;
	Student[] student = new Student[3];
	Subject[] subject = new Subject[3];
	Scanner scanner;
	int i;

	public void setStudents()
	{
      scanner = new Scanner(System.in);
	  for(i=0;i<3;i++)
		{
			student[i] = new Student();
			subject[i] = new Subject();  
			
      System.out.println("enter the register number: ");
      student[i].regNo = scanner.nextInt();
      System.out.println("enter the name of the student: ");
      student[i].name = scanner.next();
      System.out.println("enter the mark of physics: ");
      subject[i].sub1 = scanner.nextInt();
      System.out.println("enter the mark of chemistry: ");
      subject[i].sub2 = scanner.nextInt();
      System.out.println("enter the mark of maths: ");
      subject[i].sub3 = scanner.nextInt(); 
      subject[i].total = subject[i].sub1+subject[i].sub2+subject[i].sub3;
      subject[i].percentage = (subject[i].total/300f)*100;
      System.out.println(" \n ");
        }
    }
      
     public void getStudents()
     {
     	for(i=0;i<3;i++)
     	{
        System.out.println("register number: "+student[i].regNo);
        System.out.println("name: "+student[i].name);
     	System.out.println("physics: "+subject[i].sub1);
        System.out.println("chemistry: "+subject[i].sub2);
        System.out.println("maths: "+subject[i].sub3);
        System.out.println("total mark: "+subject[i].total);
        System.out.println("percentage: "+subject[i].percentage);
         
      if(subject[i].percentage>=40)
      {
      	System.out.println("result: pass");
      }
      else
      {
        System.out.println("result: fail");
      }
        System.out.println(" \n ");
        }
     }
}
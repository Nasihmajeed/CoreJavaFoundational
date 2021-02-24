
import java.util.Scanner;
public class Classroom
{
	int clas;
	String division;
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
			
      System.out.println("Enter the register number: ");
      int regNo = scanner.nextInt();
      student[i].setRegNo(regNo);
      System.out.println("Enter the name of the student: ");
      String name = scanner.next();
      student[i].setName(name);
      System.out.println("Enter the mark of English: ");
      subject[i].sub1 = scanner.nextInt();
      System.out.println("Enter the mark of Hindi: ");
      subject[i].sub2 = scanner.nextInt();
      System.out.println("Enter the mark of Malayalam: ");
      subject[i].sub3 = scanner.nextInt();
      subject[i].total = subject[i].sub1+subject[i].sub2+subject[i].sub3;
      subject[i].percentage = (subject[i].total/300)*100;
      System.out.println(" \n ");
        }
        
    }
      
     public void getStudents()
     {
     	for(i=0;i<3;i++)
     	{
        System.out.println("Reg No.: "+student[i].getRegNo());
        System.out.println("Name: "+student[i].getName());
     	  System.out.println("English: "+subject[i].sub1);
        System.out.println("Hindi: "+subject[i].sub2);
        System.out.println("Malayalam: "+subject[i].sub3);
        System.out.println("Total mark: "+subject[i].total);
        System.out.println("Tercentage: "+subject[i].percentage);
         
      if(subject[i].percentage>=40)
      {
      	System.out.println("Result : PASS");
      }
      else
      {
        System.out.println("Result : FAIL");
      }

        System.out.println(" \n ");
        }
     }
     

     public void topper()
     {
     	float max = subject[0].percentage;
     	String name = null; 
     	for(i=0;i<3;i++)
     	{
     		if(subject[i].percentage > max)
     		{
     			max = subject[i].percentage;
     			name = student[i].getName();
     		}

     	}
     		System.out.println("Topper: "+name+"\n"+"Percentage:"+max);
     }
}
./*}
import java.util.Scanner;
public class Student
{
  int rollno;
  String sName;
  Subject subject;

  public Student(int stRollno,String stName)
  {
    rollno=stRollno;
    sName=stName;
  }

  public void scan()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter mark:");
    int mark=sc.nextInt();
    System.out.println("Enter name of subject:");
    String subName=sc.next();
    subject=new Subject(mark,subName);

    }
  void getStudentDetails()
  {   
    
    System.out.println("Rollno: "+rollno);
    System.out.println("Name: "+sName);
    subject.getSubDetails();  
    System.out.println("\n");
  }
}



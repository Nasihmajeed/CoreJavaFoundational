import java.util.Scanner;
public class Student
{
  int rollno;
  String name;
  int total;
  Subject[] subject;

  public Student(int stRollno,String stName)
  {
    rollno=stRollno;
    name=stName;
  }

  public void scan()
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Details of Subject");
      System.out.println("Enter no.of subjects");
      int n=sc.nextInt();
      subject=new Subject[n];
      for(int i=0;i<n;i++)
      {
          System.out.println("Enter subject Name: ");
          String subName=sc.next();
          System.out.println("Enter mark: ");
          int mark=sc.nextInt();
          subject[i]=new Subject(mark,subName);    
      }
          System.out.println("\n");
  }
  void getStudentDetails()
  {   
    total=0;
    int n=subject.length;
    System.out.println("Rollno: "+rollno);
    System.out.println("Name: "+name);
    for(int i=0;i<subject.length;i++)
       {
          subject[i].getSubDetails(); 
          total=total+subject[i].mark;
       }
          System.out.println("Total :" +total);  
          System.out.println("\n");
  }
}



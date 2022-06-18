public class Student
{
 String name ;
 String subject; 
 String mark;
 String rollnumber;   

  
    

    Student(String name, String subject, String mark, String rollnumber) {
        this.name= name;
        this.subject = subject;
        this.mark = mark;
        this.rollnumber = rollnumber;
}
public void printStudentDetails()
{
System.out.println("Student Name:"+this.name);
System.out.println("Student Subject :"+this.subject);
System.out.println("Student Mark :"+this.mark);
System.out.println("Student RollNumber :"+this.rollnumber);
System.out.println("\n");




 

}

}
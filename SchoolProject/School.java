import java.util.Scanner;
public class School
{
 String name;
 String place;
 Classroom classes;

 public School(String sName,String sPlace)
 {
 	name=sName;
 	place=sPlace;
 }
  public void scan()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter standard:");
    int std=sc.nextInt();
    classes=new Classroom(std);
    classes.scan();
  }


 void getSchoolDetails()
 {
	System.out.println(name);
	System.out.println("Situated in "+place);
	System.out.println("---------------------");
	classes.getClassroomDetails();
 } 
}



 
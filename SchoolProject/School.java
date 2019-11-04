import java.util.Scanner;
public class School
{
static Scanner scanner = new Scanner(System.in);
String name,classRoom;
int code,noOfStudents;
Student[] students = new Student[5];
Teacher teacher = new Teacher();
Student student;
void details()
 { 
	System.out.println("Enter School Name");
	name = scanner.next();
	System.out.println("Enter School Code");
	code = scanner.nextInt();
	System.out.println("Enter ClassRoom");
	classRoom = scanner.next();
	setTeacher();
	System.out.println("How Many Students");
    noOfStudents = scanner.nextInt();
	setDetails();
	yesNo();
 }
 void setDetails()
 {
	 for(int i=0;i<noOfStudents;i++)
      {
	    students[i] = new Student();
      }
	  for(int i=0;i<noOfStudents;i++)
      {
	   System.out.println("Enter Student Name");
	   students[i].name=scanner.next();
	   System.out.println("Enter Register Number");
	   students[i].regNo=scanner.nextInt(); 
	   System.out.println("Enter Physics Mark");
	   students[i].physics=scanner.nextInt();
	   System.out.println("Enter Chemistry Mark");
	   students[i].chemistry=scanner.nextInt();
	   System.out.println("Enter Maths Mark");
	   students[i].maths=scanner.nextInt();
	   students[i].setTotal(students[i].physics,students[i].chemistry,students[i].maths);
      }
 }
 void getDetails()
 {
   student = new Student();
   for(int i=0;i<noOfStudents;i++)
    {
	   System.out.println("Name        : "+students[i].name);
	   System.out.println("Register No : "+students[i].regNo);
	   System.out.println("Physics     : "+students[i].physics);
	   System.out.println("Chemistry   : "+students[i].chemistry);
	   System.out.println("Maths       : "+students[i].maths);
	   students[i].getTotal();
    }
  }
 void setTeacher()
    {
	  System.out.println("Enter Teacher Name : ");
	  teacher.name = scanner.next();
    }	
 void getTeacher()
    {
	  System.out.println("Teacher Name   : "+teacher.name);
    }
 void yesNo()
	{
		student = new Student();
		String yes = "yes",no = "no";
		System.out.println("Do you want to Display the school details ? yes or no");
	    String yesNo = scanner.next();
	    if (yesNo.equals(yes))
		{
			System.out.println("School Name : "+name);
			System.out.println("School Code : "+code);
			System.out.println("Class Room  : "+classRoom);
			getTeacher();
			System.out.println("Number of Students : "+noOfStudents);
			getDetails();
		}
		else if (yesNo.equals(no))
		{
			String pass = "pass",fail = "fail";
			System.out.println("pass Students or fail Students ?");
			String failPass = scanner.next();
			if(failPass.equals(pass))
			{
				for(int i=0;i<noOfStudents;i++)
				{
					if(students[i].percentage>35)
					{
						System.out.println(students[i].name);
						System.out.println(students[i].regNo);
						System.out.println(students[i].percentage);
					}
				}
			}
			else if(failPass.equals(fail))
			{
				for(int i=0;i<noOfStudents;i++)
				{
			            System.out.println(students[i].name);
						System.out.println(students[i].regNo);
						System.out.println(students[i].percentage);	
				}
			}
		}
	}
}
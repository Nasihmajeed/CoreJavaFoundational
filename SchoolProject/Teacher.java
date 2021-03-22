import java.util.Scanner;

public class Teacher
{

String teacherName;

//creating 3 student objects 	
Student s[ ]=new Student[3];
s[0]=new Student();
s[1]=new Student();
s[2]=new Student();


public void teacherDetails()
{
	System.out.println("Enter the name of the Teacher : ");
	Scanner sc=new Scanner(System.in);
	teacherName=sc.nextLine();
	System.out.println("You entered the name of the Teacher as : "+teacherName);
}

Student student=new Student();

public void studentDetails()
{
   public void totalMarks()
      {
              float total=student.physics+student.chemistry+student.maths;
               System.out.println("Total marks obtained by the student is : "+total); 
      }

      public void passOrFail()
          {
	
	if(student.physics>35)
		{
			System.out.println("Student has passed in Physics");
		}
		else
		{
			System.out.println("Student failed in Physics");
		}			
		
		if(student.chemistry>35)
		{
			System.out.println("Student has passed in Chemistry");
		}
		else
		{
			System.out.println("Student failed in Chemistry");
		}			
		
		if(student.maths>35)
		{
			System.out.println("Student has passed in Maths");
		}
		else
		{
			System.out.println("Student failed in Maths");
		}			
	}

       public void topperDetails()
        {
	  
	   float t0=s[0].total,  t1=s[1].total,  t2=s[2].total;
	   
	   if(t0>t1 && t0>t2)
	   {
		   System.out.println("Topper of the class is : "+s[0].Student.student.sname);
	   }
	   
	   else if (t1>t0 && t1>t2)
	   {
		    System.out.println("Topper of the class is : "+s[1].Student.student.sname);
	   }
	   
	   else if (t2>t0 && t2>t1)
	   {
		    System.out.println("Topper of the class is : "+s[2].Student.student.sname);
	   }
   }
   }
  }
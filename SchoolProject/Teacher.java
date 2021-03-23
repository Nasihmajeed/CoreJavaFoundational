import java.util.Scanner;

public class Teacher
{

float physics,chemistry,maths;

public void teacherDetails()
{
	System.out.println("Enter the name of the Teacher : ");
	Scanner sc=new Scanner(System.in);
	String teacherName=sc.nextLine();
	System.out.println("You entered the name of the Teacher as : "+teacherName);
}

public void studentDetails()
{
   public void totalMarks()
      {
              float total=physics+chemistry+maths;
               System.out.println("Total marks obtained by the student is : "+total); 
      }

      public void passOrFail()
          {
	
	if(physics>35)
		{
			System.out.println("Student has passed in Physics");
		}
		else
		{
			System.out.println("Student failed in Physics");
		}			
		
		if(chemistry>35)
		{
			System.out.println("Student has passed in Chemistry");
		}
		else
		{
			System.out.println("Student failed in Chemistry");
		}			
		
		if(maths>35)
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
		   System.out.println("Topper of the class is : "+);
	   }
	   
	   else if (t1>t0 && t1>t2)
	   {
		    System.out.println("Topper of the class is : "+);
	   }
	   
	   else if (t2>t0 && t2>t1)
	   {
		    System.out.println("Topper of the class is : "+);
	   }
   }
   }
  }
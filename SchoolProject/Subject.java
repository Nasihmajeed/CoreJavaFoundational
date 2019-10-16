import java.util.Scanner;
public class Subject
{
   int mark;
   String subName;
   
   	public Subject(int marks,String sName)
		{
			mark=marks;
			subName=sName;
			
		}

	void getSubDetails()
	   {
		    System.out.println("SubjectName :" +subName);
			System.out.println("Marks :" +mark);
 		 
      }
}

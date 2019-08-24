import java.util.Scanner;
public class Subject
{
   int mark;
   String subName;
   
   	public void setSubDetails()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter subject Name:	");
			subName=sc.nextLine();
			System.out.println("Enter mark:	");
			mark=sc.nextInt();
		}

	void getSubDetails()
	   {
		    System.out.println("SubjectName :" +subName);
			System.out.println("Marks :" +mark);
 		 
      }
}

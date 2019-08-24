import java.util.Scanner;
public class Tdd
	{
		public static void main(String []args)
		{
			
	   		Scanner sc=new Scanner(System.in);
    		System.out.println("Enter Name of school:");
     		String name=sc.nextLine();
     		System.out.println("Enter place of school:");
     		String place=sc.nextLine();
     		School school=new School(name,place);
     		school.scan();

     		school.getSchoolDetails();
        }
    }
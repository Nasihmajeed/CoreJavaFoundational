
import java.util.Scanner;
public class Tdd
	{
		public static void main(String []args)
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name of school:");
			String name =sc.nextLine();
			System.out.println("Enter place:");
			String place =sc.nextLine();
			System.out.println("\n ");
			School s=new School(name,place);
			System.out.println("\n");
			s.getSchoolDetails();
			s.rankList();
			
			//System.out.println("Rank List");
	        //s.rankList();
		}
}
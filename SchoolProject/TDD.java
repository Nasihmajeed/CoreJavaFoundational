import java.util.Scanner;
public class TDD
{
	public static void main(String[] args)
	{
	Scanner sn=new Scanner(System.in);
	System.out.println("enter school name : ");
	String sclname=sn.nextLine();
	
	School school=new School(sclname);
	school.input();
	school.printdetail();
	}
}

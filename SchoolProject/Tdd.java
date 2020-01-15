import java.util.Scanner;
class Tdd
{
public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
	 School s1=new School();
	 System.out.println("Enter the Name of School =");
		s1.name =input.next();
		
		s1.classCreat();
		
		s1.printDetail();
		
	}
}

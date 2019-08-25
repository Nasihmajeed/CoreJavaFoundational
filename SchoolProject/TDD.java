import java.util.Scanner; 

public class TDD{
	public static void main(String[] arg)
	{
		Scanner read=new Scanner(System.in);
		System.out.println("enter name of the school");
		String sName=read.nextLine();
		System.out.println("place of school ");
		String sPlace=read.nextLine();

		School school=new School(sName,sPlace);
		school.scan();
		System.out.println("\n");
		school.print();	
		
	}
}
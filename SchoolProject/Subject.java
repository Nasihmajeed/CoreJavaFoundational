import java.util.* ;

public class Subject 
{
	String subName ;
	
	public void NewSubject(int i)
	{
		Scanner in = new Scanner(System.in); 
		
		System.out.print("\n Name of Subject " + i + " : ") ;
		subName = in.nextLine();
	}

}
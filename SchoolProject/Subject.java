import java.util.* ;

public class Subject 
{
	String subName ;
	int sMark ;

	public void NewSubject()
	{
		Scanner in = new Scanner(System.in); 
		
		System.out.print(" Input Name of Subject : ") ;
		subName = in.nextLine();
	}

}
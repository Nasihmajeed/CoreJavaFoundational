import java.util.* ;

public class Subject 
{
	String subName ;
	int subAvg = 0;
	
	public void newSubject(int i)
	{
		Scanner in = new Scanner(System.in); 
		
		System.out.print("\n Name of Subject " + i + " : ") ;
		subName = in.nextLine();
	}

}
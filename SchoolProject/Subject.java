import java.util.*;
public class Subject
{
	String subject;
	int mark;
	
	public void addMarkDetails()
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Subject :");
		this.subject = s.nextLine();
		System.out.println("Marks 	:");
		this.mark = s.nextInt();
		
	}
	
	public void printMarkDetails()
	{
		System.out.println("Subject \t: "+this.subject);
		System.out.println("Mark    \t: "+this.mark);
		
	}
}
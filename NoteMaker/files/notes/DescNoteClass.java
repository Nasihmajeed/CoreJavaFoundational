package files.notes;
import files.notes.content.Description;
import java.util.Scanner;
import files.notes.Notes;

public class DescNoteClass extends Notes
{
	public static Scanner scan=new Scanner(System.in);
	Description description;
	public void createDescNote()
	{
		description=new Description();
		description.createDesc("hello description  ");
	}

	public void view()
	{
	
		description.printDescription();

	}
	public void create()
	{
		System.out.println("enter text");
		String newText=scan.next();
		description.createDesc(newText);
	}

	public void edit()
	{
		System.out.println("enter line number to be edited:");
		int id=scan.nextInt();
		
	}

	public void delete()
	{
		System.out.println("enter line number to be deleted:");
		int id=scan.nextInt();
		
		System.out.println("line "+id+ " deleted\n");
		view();

	}

}
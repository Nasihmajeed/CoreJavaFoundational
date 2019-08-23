package noteMaker.notes;
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
		description.createDesc("this is..");
	}
}
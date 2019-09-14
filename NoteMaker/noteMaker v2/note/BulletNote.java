package noteMaker.note;
import noteMaker.note.noteContent.NoteContent;
import noteMaker.note.noteContent.BulletContent;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class BulletNote extends Note
{
	public BulletNote(String title,NoteContent noteContent)
	{
		super(title,noteContent);

	}
	public void create()
	{

	}

	public void read()
	{
		System.out.println(getTitle()+((BulletContent)getNoteContent()).getBulletPoints());
	}

	public void delete()
	{

		((BulletContent)getNoteContent()).setBulletPoints(null);
		System.out.println(getTitle()+((BulletContent)getNoteContent()).getBulletPoints());
	}
	
	public void update()
	{
		Scanner scan=new Scanner(System.in);
		((BulletContent)getNoteContent()).setBulletPoints(null);
		System.out.println(getTitle()+((BulletContent)getNoteContent()).getBulletPoints());
		System.out.println("Enter edited text:");
		String edited=scan.next();
		ArrayList<String> updated=new ArrayList<String>(Arrays.asList(edited));
		((BulletContent)getNoteContent()).setBulletPoints(updated);
		
		System.out.println(getTitle()+((BulletContent)getNoteContent()).getBulletPoints());

	}

}	

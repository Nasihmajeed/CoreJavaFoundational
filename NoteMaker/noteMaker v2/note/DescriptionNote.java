package noteMaker.note;
import noteMaker.note.noteContent.NoteContent;
import noteMaker.note.noteContent.DescContent;
import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays;
public class DescriptionNote extends Note
{
	Scanner scan=new Scanner(System.in);
	public DescriptionNote(String title,NoteContent noteContent)
	{
		super(title,noteContent);

	}
	public void create()
	{
	 System.out.println("\nenter Description Notes title:");
		 String descTitle=scan.next();
		 System.out.println("\nenter Description Notes title:");
		   String descCont=scan.next();
			//descContent[createDesc]=new DescContent();
			//((DescContent)descContent[createDesc]).setLine(descCont);
			//descriptionNote[createDesc]=new DescriptionNote(descTitle,descContent[createDesc]);
			//System.out.println(descriptionNote[createDesc].getTitle()+((DescContent)(descriptionNote[createDesc].getNoteContent())).getLine());
	}

	public void read()
	{
		System.out.println(getTitle()+((DescContent)getNoteContent()).getLine());
	}

	public void delete()
	{
		((DescContent)getNoteContent()).setLine(null);
		System.out.println(getTitle()+((DescContent)getNoteContent()).getLine());
	}

	public void update()
	{
		
		//((DescContent)getNoteContent()).setBulletPoints(null);
		//System.out.println(getTitle()+((BulletContent)getNoteContent()).getBulletPoints());
		
		((DescContent)getNoteContent()).setLine(null);
		System.out.println(getTitle()+((DescContent)getNoteContent()).getLine());

		System.out.println("Enter edited text:");
		String edited=scan.next();
		
		((DescContent)getNoteContent()).setLine(edited);
		System.out.println(getTitle()+((DescContent)getNoteContent()).getLine());
		//ArrayList<String> updated=new ArrayList<String>(Arrays.asList(edited));
		//((BulletContent)getNoteContent()).setBulletPoints(updated);
		
		//System.out.println(getTitle()+((BulletContent)getNoteContent()).getBulletPoints());

	}
}
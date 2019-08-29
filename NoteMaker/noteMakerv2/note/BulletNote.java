package noteMaker.note;
import noteMaker.note.noteContent.NoteContent;
public class BulletNote extends Note
{
	public BulletNote(String title,NoteContent noteContent)
	{
		super(title,noteContent);

	}
	public void read()
	{
		System.out.println(getTitle()+getNoteContent().getLine());
	}


}	

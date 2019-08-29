package noteMaker.note;
import noteMaker.note.noteContent.NoteContent;
public abstract class Note
{
	String title;
	NoteContent noteContent;

	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getTitle()
	{
		return title;
	}
	public void setNoteContent(NoteContent noteContent)
	{
		this.noteContent=noteContent;
	}
	public NoteContent getNoteContent()
	{
		return noteContent;
	}
	public abstract void read();
	public abstract void update();
	public Note(String title,NoteContent noteContent)
	{
		super();
		setTitle(title);
		setNoteContent(noteContent);
		//System.out.println(getTitle()+getNoteContent());
	}

}
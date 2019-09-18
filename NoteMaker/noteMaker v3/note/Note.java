package noteMaker.note;
import noteMaker.note.noteContent.NoteContent;
public abstract class Note
{
	int id;
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

	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public abstract void read();
	public abstract void update();
	public abstract void delete();
	public Note(int id,String title,NoteContent noteContent)
	{
		super();
		setId(id);
		setTitle(title);
		setNoteContent(noteContent);
	}

}
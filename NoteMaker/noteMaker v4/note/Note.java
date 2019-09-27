package noteMaker2.note;
import noteMaker2.noteContent.NoteContent;
public abstract class Note
{
	private int id;
	private String title;
	private NoteContent noteContent;
	
	public Note(int id,String title,NoteContent noteContent)
	{
		super();
		setId(id);
		setTitle(title);
		setNoteContent(noteContent);
	}

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
	

}
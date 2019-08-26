package files.notes;
import java.util.Scanner;
import files.notes.BulletClass;
import files.notes.content.Content;
public abstract class Notes
{
	private int id;
	private String title;
	private Content content;
	public Scanner scan=new Scanner(System.in);
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getTitle()
	{
		return title;
	}

	public void setContent(Content content)
	{
		this.content=content;
	}
	public Content getContent()
	{
		return content;
	}

	public void createNote()
	{
		Notes bulletClass=new BulletClass();
	}

	public void createBulletNote()
	{
		
	}
	public void createDescNote()
	{

	}
	public abstract void create();
	public abstract void view();
	public abstract void edit();
	public abstract void delete();
	
}
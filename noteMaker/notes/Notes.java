package noteMaker.notes;
import java.util.Scanner;
import files.notes.BulletClass;
import files.notes.content.Content;
public abstract class Notes
{
	private int id;
	private String title;
	private Content content;
	public Content bulletContent;
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
		BulletClass bulletClass=new BulletClass();
		bulletContent=new Content();
	}
	public abstract void createBulletNote();
	public abstract void createDescNote();
	public abstract void create();
	public abstract void view();
	public abstract void edit();
	public abstract void delete();
}
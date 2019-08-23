package noteMaker.notes.content;
import files.notes.content.Content;
public class Description
{
	Content content;
		String line;
	public void createDesc()
	{
		 content=new Content();
		 content.setLine(line);
		System.out.println("description entered "+ content.getLine());
	}
	public void printDescription()
	{
		System.out.println(content.getLine());
	}

}

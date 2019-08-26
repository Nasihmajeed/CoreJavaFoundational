package files.notes.content;
import files.notes.content.Content;
public class Description
{
	Content content=new Content();
		String line;

	public void createDesc(String line)
	{
		 content.setLine(content.getLine()+line);
	}

	public void printDescription()
	{
		if(content.getLine()!=null)
		{
			System.out.println(content.getLine()+"  ");
		}
	}
}

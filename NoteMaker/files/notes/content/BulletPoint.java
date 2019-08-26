package files.notes.content;
import files.notes.content.Content;
public class BulletPoint
{
	Content content;
	String line;
	public void createBullet(String line)
	{
		content=new Content();
		content.setLine(line);
	}

	public void printBulletPoint()
	{
		System.out.println("* "+content.getLine());
	}

}
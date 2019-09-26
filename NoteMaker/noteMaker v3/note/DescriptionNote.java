package noteMaker.note;
import noteMaker.note.noteContent.NoteContent;
import noteMaker.note.noteContent.DescContent;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class DescriptionNote extends Note
{
	Scanner scan=new Scanner(System.in);
	public DescriptionNote(int id,String title,NoteContent noteContent)
	{
		super(id,title,noteContent);

	}
	
	public void read()
	{
		int id;
		BufferedReader reader2;
		try {
			reader2 = new BufferedReader(new FileReader("Description.txt"));
			String line = reader2.readLine();
			while (line != null) {
				System.out.println(line);
				line = reader2.readLine();
			}
			reader2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void delete()
	{
		((DescContent)getNoteContent()).setLine(null);
		System.out.println(getTitle()+((DescContent)getNoteContent()).getLine());
	}

	public void update()
	{
		
		
		((DescContent)getNoteContent()).setLine(null);
		System.out.println(getTitle()+((DescContent)getNoteContent()).getLine());

		System.out.println("Enter edited text:");
		String edited=scan.next();
		
		((DescContent)getNoteContent()).setLine(edited);
		System.out.println(getTitle()+((DescContent)getNoteContent()).getLine());
		
	}
}
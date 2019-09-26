package noteMaker.note;
import noteMaker.note.noteContent.NoteContent;
import noteMaker.note.noteContent.BulletContent;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
public class BulletNote extends Note
{
	public BulletNote(int id,String title,NoteContent noteContent)
	{
		super(id,title,noteContent);

	}
	

	public void read()
	{
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("BulletNote.txt"));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void delete()
	{

		((BulletContent)getNoteContent()).setBulletPoints(null);
		System.out.println(getId()+getTitle()+((BulletContent)getNoteContent()).getBulletPoints());
	
			
	}
	
	public void update()
	{
		Scanner scan=new Scanner(System.in);
		((BulletContent)getNoteContent()).setBulletPoints(null);
		System.out.println(getTitle()+((BulletContent)getNoteContent()).getBulletPoints());
		System.out.println("Enter edited text:");
		String edited=scan.next();
		ArrayList<String> updated=new ArrayList<String>(Arrays.asList(edited));
		((BulletContent)getNoteContent()).setBulletPoints(updated);
		
		System.out.println(getTitle()+((BulletContent)getNoteContent()).getBulletPoints());

	}

}	

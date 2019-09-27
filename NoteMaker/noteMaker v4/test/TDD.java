package noteMaker2.test;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.Console;
import noteMaker2.note.BulletNote;
import noteMaker2.note.DescNote;
import noteMaker2.noteContent.BulletContent;
import noteMaker2.noteContent.DescContent;
import noteMaker2.noteContent.NoteContent;
public class TDD
{
	public static  List<BulletNote> bulletNotes;
	public static List<DescNote> descNotes;
	static Scanner scan=new Scanner(System.in);
	static Console console = System.console();   
	public static void main(String args[])
	{
		bulletNotes=new ArrayList(Arrays.asList(
		new BulletNote(1,"forest",new BulletContent(Arrays.asList("trees "," animals"))),
		new BulletNote(2,"company",new BulletContent(Arrays.asList("boss","worker")))	
		));

		descNotes=new ArrayList(Arrays.asList(
		new DescNote(1,"Literature",new DescContent("novels,stories and epics")),
		new DescNote(2,"art",new DescContent("paintings,sculptures"))	
		));

		while(true)
		{
			System.out.println("\nMENU\n1.show  2.Edit  3.Delete  4.exit");
			int choice=scan.nextInt();
			switch(choice)
			{
				case 1:
				System.out.println("1.Bullet Note or 2.Description Note");
				int note=scan.nextInt();
				if(note==1)
				{
					print();
				}
				if(note==2)
				{
					printDesc();
				}
				break;

				case 2:
				System.out.println("1.Bullet Note or 2.Description Note");
				int upNote=scan.nextInt();
				if(upNote==1)
				{
					update();
				}
				if(upNote==2)
				{
					updateDesc();
				}
				break;

				case 3:
				System.out.println("1.Bullet Note or 2.Description Note");
				int del=scan.nextInt();
				if(del==1)
				{
					delete();
				}
				if(del==2)
				{
					deleteDesc();
				}
				break;

				case 4:
				return;
			}
		}
		
	}

	static void print()
	{
		for(BulletNote bulletNote:bulletNotes)
		{
			System.out.println("id="+bulletNote.getId()+"\ntitle="+bulletNote.getTitle()+"\n");
			for(String bulletPoint: ( ( (BulletContent) (bulletNote.getNoteContent()) ).getBulletPoints() )  )
			{
				System.out.println("**  " +bulletPoint);
			}
			System.out.println();
		}
	}

	static void delete()
	{
		System.out.println("enter id to delete: ");
		int id=scan.nextInt();
		bulletNotes.get(id-1);
		bulletNotes.remove(bulletNotes.get(id-1));
		print();
	}
	static void update()
	{
		System.out.println("enter id to update: ");
		int upId=scan.nextInt();
		BulletNote bulletNote1=bulletNotes.get(upId-1);
		System.out.println("update 1.title  2.bulletpoints: ");
		int upChoice=scan.nextInt();
		if(upChoice==1)
		{
			editTitle(bulletNote1);
			print();
		}
		if(upChoice==2)
		{
			System.out.println("enter bulletpoint number ");
			int upBullet=scan.nextInt();
			editBulletPoint(bulletNote1,upBullet);
		}
	}

	static void editTitle(BulletNote bulletNote)
	{
		System.out.println("new title: ");
		String newTitle=console.readLine();
		bulletNote.setTitle(newTitle);
	}
	static void editBulletPoint(BulletNote bulletNote,int bulletId)
	{
		System.out.println("Enter new text: ");
		((BulletContent)(bulletNote.getNoteContent())).getBulletPoints().set(bulletId-1,console.readLine());
		print();
	}

	static void printDesc()
	{
		for(DescNote descriptionNote:descNotes)
		{
			System.out.println("\nid="+descriptionNote.getId()+"\ntitle="+descriptionNote.getTitle()+"\n------- \n"+( ( (DescContent) (descriptionNote.getNoteContent()) ).getLine() ));
			
		}
	}

	static void deleteDesc()
	{
		System.out.println("enter id to delete: ");
		int id=scan.nextInt();
		descNotes.get(id-1);
		//System.out.println(descNotes.get(id-1).getTitle());
		descNotes.remove(descNotes.get(id-1));
		printDesc();
	}

	static void updateDesc()
	{
		System.out.println("enter id to update: ");
		int upDesc=scan.nextInt();
		DescNote descNote1=descNotes.get(upDesc-1);
		System.out.println("update 1.title  2.description content: ");
		int upChoice=scan.nextInt();
		if(upChoice==1)
		{
			editDescTitle(descNote1);
			
		}
		if(upChoice==2)
		{
			editDescLine(descNote1);
		}
	}

	static void editDescTitle(DescNote descNote)
	{

		System.out.println("new title: ");
		String newDescTitle=console.readLine();
		descNote.setTitle(newDescTitle);
		printDesc();
	}

	static void editDescLine(DescNote descNote)
	{
		System.out.println("Enter new text: ");
		String newDescContent=console.readLine();
		((DescContent)(descNote.getNoteContent())).setLine(newDescContent);
		printDesc();
	}

}
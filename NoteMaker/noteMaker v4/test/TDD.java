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

		printMenu();
		
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
		print();
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

	static void createBullet()
	{
		System.out.println("Enter id: ");
		int newId=scan.nextInt();
		System.out.println("Enter title: ");
		String newBulletTitle=console.readLine();
		System.out.println("Enter bullet point 1: ");
		String newBulletPoint1=console.readLine();
		System.out.println("Enter bullet point 2: ");
		String newBulletPoint2=console.readLine();
		bulletNotes.add(new BulletNote(newId,newBulletTitle,new BulletContent(Arrays.asList(newBulletPoint1,newBulletPoint2))));
		print();
	}
	static void createDesc()
	{
		System.out.println("Enter id: ");
		int newDescId=scan.nextInt();
		System.out.println("Enter title: ");
		String newDescTitle=console.readLine();
		System.out.println("Enter content : ");
		String newDescLine=console.readLine();
		descNotes.add(new DescNote(newDescId,newDescTitle,new DescContent(newDescLine)));
		printDesc();
	}

	static void printMenu()
	{
		while(true)
		{
			System.out.println("\nMENU\n1.show  2.Edit  3.Delete  4.create 5.exit");
			int choice=scan.nextInt();
			System.out.println("1.Bullet Note or 2.Description Note");
			int note=scan.nextInt();
			switch(choice)
			{
				case 1:
				show(note);
				break;

				case 2:
				update(note);
				
				break;

				case 3:
				delete(note);
				break;

				case 4:
				create(note);
				break;

				case 5:
				return;
			}
		}
	}

	static void show(int note)
	{
		if(note==1)
		{
			print();
		}
		if(note==2)
		{
			printDesc();
		}
	}
	static void update(int note)
	{
		if(note==1)
		{
			update();
		}
		if(note==2)
		{
			updateDesc();
		}
	}

	static void delete(int note)
	{
		if(note==1)
		{
			delete();
		}
		if(note==2)
		{
			deleteDesc();
		}
	}
	static void create(int note)
	{
		if(note==1)
		{
			createBullet();
		}
		if(note==2)
		{
			createDesc();
		}	
	}

}
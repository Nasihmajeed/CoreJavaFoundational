package noteMaker2.test;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.Console;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.Exception;
import noteMaker2.note.BulletNote;
import noteMaker2.note.DescNote;
import noteMaker2.note.Note;
import noteMaker2.noteContent.BulletContent;
import noteMaker2.noteContent.DescContent;
import noteMaker2.noteContent.NoteContent;
public class TDD
{
	public static  List<BulletNote> bulletNotes;
	public static List<DescNote> descNotes;
	static Scanner scan=new Scanner(System.in);
	static Console console = System.console(); 
	public static File bulletFile;
	public static File descFile;
	public static List<Note> notes;
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
		createBulletFile();
		createDescFile();

		//printMenu();
		printBulletToFile(bulletFile,bulletNotes);
		readerObj();
		print();
		
	}

	static void print()
	{
		for(BulletNote bulletNote:bulletNotes)
		{
			printBulletToFile(bulletFile,bulletNotes);
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
			printDescToFile(descFile,descNotes);
			
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

	static void createBullet(List<BulletNote> bulletNotes)
	{
		List<String> bulletpoints=new ArrayList<String>();
		int newId=bulletNotes.size()+1;
		System.out.println("Enter title: ");
		String newBulletTitle=console.readLine();
		bulletPointNumber(newId,newBulletTitle,bulletpoints);
		print();
			
	}
	static void bulletPointNumber(int newId,String newBulletTitle,List<String> bulletpoints)
	{
		while(true)
		{
			System.out.println("have bullet points? y or n ");
			char choice=scan.next().charAt(0);
			if(choice=='y')
			{ 
				System.out.println("Enter bullet point: ");
				String newBulletPoint=console.readLine();
				bulletpoints.add(newBulletPoint);
			}
			if(choice=='n')
			{
				break;
			}
			if(choice!='y'&&choice!='n')
			{
				System.out.println("invalid");
			}
		}
		bulletNotes.add(new BulletNote(newId,newBulletTitle,new BulletContent(bulletpoints)));
	}

	static void createDesc(List<DescNote> descNotes)
	{
		int newId=descNotes.size()+1;
		System.out.println("Enter title: ");
		String newDescTitle=console.readLine();
		System.out.println("Enter content : ");
		String newDescLine=console.readLine();
		descNotes.add(new DescNote(newId,newDescTitle,new DescContent(newDescLine)));
		printDesc();
	}

	static void printMenu()
	{
		while(true)
		{
			System.out.println("\nMENU\n1.show  2.Edit  3.Delete  4.create 5.exit");
			int choice=scan.nextInt();
			if(choice==5)
			{
				return;
			}
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

			}
		}
	}

	static void show(int note)
	{
		if(note==1)
		{
			print();
			//readFile(bulletFile);
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
			printBulletToFile(bulletFile,bulletNotes);
		}
		if(note==2)
		{
			updateDesc();
			printDescToFile(descFile,descNotes);
		}
	}

	static void delete(int note)
	{
		if(note==1)
		{
			delete();
			printBulletToFile(bulletFile,bulletNotes);
		}
		if(note==2)
		{
			deleteDesc();
			printDescToFile(descFile,descNotes);
		}
	}
	static void create(int note)
	{
		if(note==1)
		{
			createBullet(bulletNotes);
			printBulletToFile(bulletFile,bulletNotes);
		}
		if(note==2)
		{
			createDesc(descNotes);
			printDescToFile(descFile,descNotes);
		}	
	}

	static void createBulletFile()
	{
		bulletFile=new File("BulletNote.txt");
		try
		{
			if(bulletFile.createNewFile())
			{
				System.out.println("Bullet File created "+bulletFile.getName());
			}
			else
			{
				System.out.println("bullet File already exists");
			}
		}
		catch(IOException e)
		{
			System.out.println("bullet error");
		}
	}

static void createDescFile()
	{
		descFile=new File("Description.txt");
		try
		{
			if(descFile.createNewFile())
			{
				System.out.println("description File created "+descFile.getName());
			}
			else
			{
				System.out.println("desc File already exists");
			}
		}
		catch(IOException e)
		{
			System.out.println("desc error");
		}
	}


	static void readFile(File fileObj)
	{
		BufferedReader reader;
		try 
		{
			reader = new BufferedReader(new FileReader(fileObj));
			String line = reader.readLine();
			while (line != null) 
			{
				System.out.println(line);
				line = reader.readLine();
			}
			reader.close();
		} 
		catch (IOException e) 
		{
				e.printStackTrace();
		}
	}

	static void printBulletToFile(File fileObj,List<BulletNote> bulletNotes)
	{
		try
		{
			PrintWriter writerObj=new PrintWriter(fileObj);
			for(BulletNote bulletNote : bulletNotes)
			{
				writerObj.print(bulletNote.getId()+","+bulletNote.getTitle());
				for(String bulletPoint: ( ( (BulletContent) (bulletNote.getNoteContent()) ).getBulletPoints() )   )
				{
					writerObj.println("," +bulletPoint);
				}
				writerObj.println();
			}
			writerObj.close();
		}	
		catch(IOException e)
		{
			System.out.println("error");
		}
	}
	static void printDescToFile(File fileObj,List<DescNote> descNotes)
	{
		try
		{
			PrintWriter writerObj=new PrintWriter(fileObj);
			for(int i=0;i<descNotes.size();i++)
			{
				writerObj.println("\nid="+descNotes.get(i).getId()+"\t"+"\ntitle="+descNotes.get(i).getTitle());
					writerObj.println("\n ------- \n ");
					writerObj.println(( ( (DescContent) (descNotes.get(i).getNoteContent()) ).getLine() ));
				writerObj.println();
				
			}
			writerObj.close();

		}	
		catch(IOException e)
		{
			System.out.println("error");
		}
		
	}


	static void readerObj()
	{
    String line;
		//ArrayList<Product> products=new ArrayList<Product>();
    try{
    FileReader fileReader = new FileReader("Datas.txt");
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    String[] strings;
    while ((line = bufferedReader.readLine()) != null) 
    {
        strings = line.split(",");
        int id = Integer.parseInt(strings[0]);
         String title = strings[1];
         List<String> content=new ArrayList<String>(); 

         for(int i=2;i<strings.length;i++)
         {
         	content.add(strings[i]);
         }
         BulletContent newBulletContent=new BulletContent(content);
         BulletNote newNote = new BulletNote(id,title,newBulletContent);
         bulletNotes.add(newNote);
        // System.out.println(newNote.getId()+"\t"+newNote.getTitle()+"\t"+((BulletContent)(newNote.getNoteContent())).getBulletPoints());

    }
    fileReader.close();
    PrintWriter printer = null;
          printer = new PrintWriter(new FileWriter("Datas.txt",false));
            printer.flush();
          
            for (BulletNote o : bulletNotes) 
            {
           printer.print(o.getId()+","+o.getTitle());

			for(String bulletpoint:( ( (BulletContent) (o.getNoteContent()) ).getBulletPoints() ) )
			{
				 printer.print(","+bulletpoint);
			}
			printer.println();
            }
            printer.close();
		}
		catch ( Exception e ) 
		{
		    e.printStackTrace();
		}
	}


}
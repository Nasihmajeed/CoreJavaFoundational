package noteMaker.test;
import java.util.Scanner;
import noteMaker.note.Note;
import noteMaker.note.noteContent.NoteContent;
import noteMaker.note.noteContent.BulletContent;
import noteMaker.note.noteContent.DescContent;
import noteMaker.note.BulletNote;
import noteMaker.note.DescriptionNote;
import noteMaker.note.noteContent.BulletContent;
public class TDD
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		NoteContent[] bulletContent=new BulletContent[5];
		NoteContent[] descContent=new DescContent[5];
		Note bulletNote[]=new BulletNote[5];
		Note descriptionNote[]=new DescriptionNote[5];
		System.out.println("enter choice 1.Bullet 2.Desc");
		int note=scan.nextInt();
		if(note==1)
		{
			bulletContent[1]=new BulletContent();
		
			bulletContent[1].setLine("tiger lion");
			bulletNote[1]=new BulletNote("forest",bulletContent[1]);
			System.out.println(bulletNote[1].getTitle()+bulletNote[1].getNoteContent().getLine());

			bulletContent[2]=new BulletContent();
			bulletContent[2].setLine(" topics speeches");
			bulletNote[2]=new BulletNote("headings",bulletContent[2]);
			System.out.println(bulletNote[2].getTitle()+bulletNote[2].getNoteContent().getLine());
		}
		if(note==2)
		{
			descContent[1]=new DescContent();
			descContent[1].setLine(" relatives parents");
			descriptionNote[1]=new DescriptionNote(" house",descContent[1]);
			System.out.println(descriptionNote[1].getTitle()+descriptionNote[1].getNoteContent().getLine());

			descContent[2]=new DescContent();
			descContent[2].setLine(" workers boss");
			descriptionNote[2]=new DescriptionNote(" company",descContent[2]);
			System.out.println(descriptionNote[2].getTitle()+descriptionNote[2].getNoteContent().getLine());
		}
		
		while(true)
		{
			System.out.println("enter choice 1.read 2.exit");
			int choice=scan.nextInt();

			
			switch(choice)
			{
				case 1:
				System.out.println("enter bullet note id to read 1. 2.");
				int id=scan.nextInt();
				if(id==1)
				{
					bulletNote[1].read();
				}
				if(id==2)
				{
					bulletNote[2].read();
				}
				break;

				case 2:
				return;
			}
		}
		
	}
}


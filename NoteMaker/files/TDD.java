package files;
import java.util.Scanner;
import files.notes.DescNoteClass;
import files.notes.content.Content;
import files.notes.BulletClass;
import files.notes.Notes;

public class TDD
{
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		Notes bulletClass=new BulletClass();
		Notes descNoteClass=new DescNoteClass();
		
		Content bulletContent=new Content();
		Content descContent=new Content();
		
		System.out.println("choose the type");
		System.out.println("1.bullet note");
		System.out.println("2.description note");
		int note=scan.nextInt();
		
		if(note==1)
		{
			
			
			 bulletClass.setId(1);
			bulletClass.setTitle("bulletclass");
			bulletClass.setContent(bulletContent);
			System.out.println(bulletClass.getTitle()+" this is de5432qsrewq");
			
			bulletClass.createBulletNote();
			
		}
		if(note==2)
		{
			 descNoteClass.setId(1);
			descNoteClass.setTitle("description class");
			descNoteClass.setContent(descContent);
			System.out.println(descNoteClass.getTitle()+" this is de5432qsrewq");
			
			descNoteClass.createDescNote();

		}
		while(true)
		{
				System.out.println("Enter the choice 1.view  2.create  3.edit  4.delete  5.exit");
				int choice=scan.nextInt();
				switch(choice)
				{
					case 1:
					if(bulletClass.getContent()==bulletContent)
					{
						bulletClass.view();
					}
					if(descNoteClass.getContent()==descContent)
					{
						descNoteClass.view();
					}
					break;
		
					case 2:
					if(bulletClass.getContent()==bulletContent)
					{
						bulletClass.create();
					}
					if(descNoteClass.getContent()==descContent)
					{
						descNoteClass.create();
					}
					
					break;
		
					case 3:
					if(bulletClass.getContent()==bulletContent)
					{
						bulletClass.edit();
					}
					if(descNoteClass.getContent()==descContent)
					{
						descNoteClass.edit();
					}
					break;
		
					case 4:
					if(bulletClass.getContent()==bulletContent)
					{
						bulletClass.delete();
					}
					if(descNoteClass.getContent()==descContent)
					{
						descNoteClass.delete();
					}
					break;
		
					case 5:
					return;
		
				}
		}

		
	}
}
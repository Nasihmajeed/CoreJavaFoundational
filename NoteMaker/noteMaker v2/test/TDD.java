package noteMaker.test;
import java.util.*;
import java.util.ArrayList;
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
		NoteContent bulletContent[]=new BulletContent[5];
		NoteContent descContent[]=new DescContent[5];
		Note bulletNote[]=new BulletNote[5];
		Note descriptionNote[]=new DescriptionNote[5];
		/*System.out.println("enter choice 1.Bullet 2.Desc");
		int note=scan.nextInt();

		if(note==1)
		{*/
			
			ArrayList<String> bulletPoints1= new ArrayList<String>();
			bulletPoints1.add("lion");
			bulletPoints1.add("tiger");

			ArrayList<String> bulletPoints2= new ArrayList<String>();
			bulletPoints2.add("topics");
			bulletPoints2.add("speeches");

 			bulletContent[1]=new BulletContent();
 			((BulletContent)bulletContent[1]).setBulletPoints(bulletPoints1);
 			//System.out.println(((BulletContent)bulletContent[1]).getBulletPoints()); 
    		 bulletNote[1]=new BulletNote("forest",bulletContent[1]);

    		 bulletContent[2]=new BulletContent();
 			((BulletContent)bulletContent[2]).setBulletPoints(bulletPoints2);
 			//System.out.println(((BulletContent)bulletContent[2]).getBulletPoints()); 
    		 bulletNote[2]=new BulletNote("headings",bulletContent[2]);
    		
  
    		 System.out.println("\nBullet Notes");
			 System.out.println(bulletNote[1].getTitle()+"\t"+((BulletContent)(bulletNote[1].getNoteContent())).getBulletPoints());
			  System.out.println(bulletNote[2].getTitle()+((BulletContent)(bulletNote[2].getNoteContent())).getBulletPoints());
					
				   
		/*}
		if(note==2)
		{*/
			 System.out.println("\nDescription Notes");
			descContent[1]=new DescContent();
			((DescContent)descContent[1]).setLine(" relatives parents");
			descriptionNote[1]=new DescriptionNote(" house",descContent[1]);
			System.out.println(descriptionNote[1].getTitle()+((DescContent)(descriptionNote[1].getNoteContent())).getLine());

			descContent[2]=new DescContent();
			((DescContent)descContent[2]).setLine(" workers boss");
			descriptionNote[2]=new DescriptionNote(" company",descContent[2]);
			System.out.println(descriptionNote[2].getTitle()+((DescContent)(descriptionNote[2].getNoteContent())).getLine());
		//}
		while(true)
		{
			System.out.println("\nenter choice 1.create  2.read 3.delete  4.update 5.exit");
			int choice=scan.nextInt();

			switch(choice)
			{
				case 1:
				System.out.println("enter choice to create 1.Bullet note  2.Description note");
				int create=scan.nextInt();
				if(create==1)
				{
					System.out.println("\nenter bullet Notes title:");
					String bullTitle=scan.next();
					System.out.println("\nenter bullet Notes content 1:");
			   		String bullCont1=scan.next();
			   		System.out.println("\nenter bullet Notes content 2:");
			   		String bullCont2=scan.next();

					ArrayList<String> bulletPoints3= new ArrayList<String>();
					bulletPoints3.add(bullCont1);
					bulletPoints3.add(bullCont2);

		 			bulletContent[3]=new BulletContent();
		 			((BulletContent)bulletContent[3]).setBulletPoints(bulletPoints3);
		 			//System.out.println(((BulletContent)bulletContent[1]).getBulletPoints()); 
		    		 bulletNote[3]=new BulletNote(bullTitle,bulletContent[3]);
		    		  System.out.println("\nBullet Notes");
					 System.out.println(bulletNote[1].getTitle()+"\t"+((BulletContent)(bulletNote[1].getNoteContent())).getBulletPoints());
					  System.out.println(bulletNote[2].getTitle()+((BulletContent)(bulletNote[2].getNoteContent())).getBulletPoints());
		    		 System.out.println(bulletNote[3].getTitle()+"\t"+((BulletContent)(bulletNote[3].getNoteContent())).getBulletPoints());
				}
				if(create==2)
				{
				 System.out.println("\nenter Description Notes title:");
				 String descTitle=scan.next();
				 System.out.println("\nenter Description Notes content:");
		   		String descCont=scan.next();
				descContent[3]=new DescContent();
				((DescContent)descContent[3]).setLine(descCont);
				descriptionNote[3]=new DescriptionNote(descTitle,descContent[3]);
				//for(int num=1;num<=descriptionNote.length;num++)
				//{
				System.out.println(descriptionNote[1].getTitle()+((DescContent)(descriptionNote[1].getNoteContent())).getLine());
				System.out.println(descriptionNote[2].getTitle()+((DescContent)(descriptionNote[2].getNoteContent())).getLine());
				System.out.println(descriptionNote[3].getTitle()+((DescContent)(descriptionNote[3].getNoteContent())).getLine());
				//}
				/*	if(createDesc==1)
					{
						
					}
					if(createDesc==2)
					{
						descriptionNote[2].create();
					}*/
					
				}
				break;


				case 2:
				System.out.println("enter choice to read 1.Bullet note  2.Description note");
				int id=scan.nextInt();
				if(id==1)
				{
					System.out.println("enter bullet note id to read 1. 2.");
					int bullet=scan.nextInt();
					if(bullet==1)
					{
						bulletNote[1].read();
					}
					if(bullet==2)
					{
						bulletNote[2].read();
					}
					if(bullet==3)
					{
						bulletNote[3].read();
					}
				}
				if(id==2)
				{
					System.out.println("enter description note id to read 1. 2.");
					int desc=scan.nextInt();
					if(desc==1)
					{
						descriptionNote[1].read();
					}
					if(desc==2)
					{
						descriptionNote[2].read();
					}
					if(desc==3)
					{
						descriptionNote[3].read();
					}
				}
				break;

				case 3:
				System.out.println("enter note to delete 1.Bullet 2.Desc");
				int note=scan.nextInt();
				if(note==1)
				{
					System.out.println("enter bullet note id to delete 1. 2. 3.");
					int deleteBullet=scan.nextInt();
					if(deleteBullet==1)
					{
						bulletNote[1].delete();
					}
					if(deleteBullet==2)
					{
						bulletNote[2].delete();
					}
					if(deleteBullet==3)
					{
						bulletNote[3].delete();
					}
				}
				if(note==2)
				{
					System.out.println("enter desc note id to delete 1. 2.");
					int deleteDesc=scan.nextInt();
					if(deleteDesc==1)
					{
						descriptionNote[1].delete();
					}
					if(deleteDesc==2)
					{
						descriptionNote[2].delete();
					}
					if(deleteDesc==3)
					{
						descriptionNote[3].delete();
					}
					
				}
				break;

				case 4:
				System.out.println("enter note to update 1.Bullet 2.Desc");
				int update=scan.nextInt();
				if(update==1)
				{
					System.out.println("enter bullet note id to update 1. 2. 3.");
					int updateBullet=scan.nextInt();
					if(updateBullet==1)
					{
						bulletNote[1].update();
					}
					if(updateBullet==2)
					{
						bulletNote[2].update();
					}
					if(updateBullet==3)
					{
						bulletNote[3].update();
					}
				}
				if(update==2)
				{
					System.out.println("enter desc note id to update 1. 2. ");
					int updateDesc=scan.nextInt();
					if(updateDesc==1)
					{
						descriptionNote[1].update();
					}
					if(updateDesc==2)
					{
						descriptionNote[2].update();
					}
					if(updateDesc==3)
					{
						descriptionNote[3].update();
					}
					
				}
				break;
		

				case 5:
				return;
			}
		}
		
	}
}

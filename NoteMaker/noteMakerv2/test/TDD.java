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
		System.out.println("enter choice 1.Bullet 2.Desc");
		int note=scan.nextInt();

		if(note==1)
		{
			
			//bulletContent[1]=new BulletContent();
			 //bulletContent[1].setBulletPoints("tiger");
			ArrayList<String> bulletPoints1= new ArrayList<String>();
			bulletPoints1.add("lion");
			bulletPoints1.add("tiger");

			ArrayList<String> bulletPoints2= new ArrayList<String>();
			bulletPoints2.add("topics");
			bulletPoints2.add("speeches");

			//ArrayList<String> bulletPoints = new ArrayList<String>(Arrays.asList("London", "Tokyo", "New York"));
 			bulletContent[1]=new BulletContent();
 			((BulletContent)bulletContent[1]).setBulletPoints(bulletPoints1);
 			//System.out.println(((BulletContent)bulletContent[1]).getBulletPoints()); 
    		 bulletNote[1]=new BulletNote("forest",bulletContent[1]);

    		 bulletContent[2]=new BulletContent();
 			((BulletContent)bulletContent[2]).setBulletPoints(bulletPoints2);
 			//System.out.println(((BulletContent)bulletContent[2]).getBulletPoints()); 
    		 bulletNote[2]=new BulletNote("headings",bulletContent[2]);
    		
  
			//bulletNote[1].bulletContent.setBulletPoints("hhhhh");
			 System.out.println(bulletNote[1].getTitle()+"\t"+((BulletContent)(bulletNote[1].getNoteContent())).getBulletPoints());
			  System.out.println(bulletNote[2].getTitle()+((BulletContent)(bulletNote[2].getNoteContent())).getBulletPoints());
					

		/*  bulletContent[2]=new BulletContent();
			//bulletContent[2].setLine(" topics speeches");
			bulletNote[2]=new BulletNote("headings",bulletContent[2]);
			//System.out.println(bulletNote[2].getTitle()+bulletNote[2].getNoteContent().getLine());*/
				   
		}
		if(note==2)
		{
			descContent[1]=new DescContent();
			((DescContent)descContent[1]).setLine(" relatives parents");
			descriptionNote[1]=new DescriptionNote(" house",descContent[1]);
			System.out.println(descriptionNote[1].getTitle()+((DescContent)(descriptionNote[1].getNoteContent())).getLine());

		/*	descContent[2]=new DescContent();
			descContent[2].setLine(" workers boss");
			descriptionNote[2]=new DescriptionNote(" company",descContent[2]);
			System.out.println(descriptionNote[2].getTitle()+descriptionNote[2].getNoteContent().getLine());*/
		}
		//System.out.println("point entered");
		/*while(true)
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
					//bulletNote[1].read();
				}
				if(id==2)
				{
					//bulletNote[2].read();
				}
				break;

				case 2:
				return;
			}
		}*/
		
	}
}


	
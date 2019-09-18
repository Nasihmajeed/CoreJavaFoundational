package noteMaker.test;
import java.util.*;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.lang.Exception;
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
		
			 File bulletFile=new File("BulletNote.txt");
				try{
						if(bulletFile.createNewFile())
						{
							System.out.println("File created "+bulletFile.getName());
						}
						else
						{
							System.out.println("File already exists");
						}
					}
					catch(IOException e)
					{
						System.out.println("error");
					}


			ArrayList<String> bulletPoints1= new ArrayList<String>();
			bulletPoints1.add("lion");
			bulletPoints1.add("tiger");

			ArrayList<String> bulletPoints2= new ArrayList<String>();
			bulletPoints2.add("topics");
			bulletPoints2.add("speeches");

 			bulletContent[1]=new BulletContent();
 			((BulletContent)bulletContent[1]).setBulletPoints(bulletPoints1);
    		 bulletNote[1]=new BulletNote(1,"forest",bulletContent[1]);

    		 bulletContent[2]=new BulletContent();
 			((BulletContent)bulletContent[2]).setBulletPoints(bulletPoints2);
    		 bulletNote[2]=new BulletNote(2,"headings",bulletContent[2]);
    		
  
    		 System.out.println("\nBullet Notes");
			 System.out.println("\n"+bulletNote[1].getId()+"\t"+bulletNote[1].getTitle()+"\t"+((BulletContent)(bulletNote[1].getNoteContent())).getBulletPoints());
			  System.out.println("\n"+bulletNote[2].getId()+"\t"+bulletNote[2].getTitle()+((BulletContent)(bulletNote[2].getNoteContent())).getBulletPoints());
			

				try{
					FileWriter writerObj=new FileWriter(bulletFile);
					writerObj.write("\nBullet Notes");
					writerObj.write("\n"+bulletNote[1].getId()+"\t"+bulletNote[1].getTitle()+"\t"+((BulletContent)(bulletNote[1].getNoteContent())).getBulletPoints());
					writerObj.write("\n"+bulletNote[2].getId()+"\t"+bulletNote[2].getTitle()+((BulletContent)(bulletNote[2].getNoteContent())).getBulletPoints());
					writerObj.close();
					System.out.println("Success");
				}
				catch(IOException e)
					{
						System.out.println("error");
					}
				   
		
			 File descFile=new File("Description.txt");
				try{
						if(descFile.createNewFile())
						{
							System.out.println("File created "+descFile.getName());
						}
						else
						{
							System.out.println("File already exists");
							
						}
					}
					catch(IOException e)
					{
						System.out.println("error");
					}



			 System.out.println("\nDescription Notes");
			descContent[1]=new DescContent();
			((DescContent)descContent[1]).setLine(" relatives parents");
			descriptionNote[1]=new DescriptionNote(1," house",descContent[1]);
			System.out.println(descriptionNote[1].getId()+"\t"+descriptionNote[1].getTitle()+((DescContent)(descriptionNote[1].getNoteContent())).getLine());

			descContent[2]=new DescContent();
			((DescContent)descContent[2]).setLine(" workers boss");
			descriptionNote[2]=new DescriptionNote(2," company",descContent[2]);
			System.out.println(descriptionNote[2].getId()+"\t"+descriptionNote[2].getTitle()+((DescContent)(descriptionNote[2].getNoteContent())).getLine());
			
			try{
					FileWriter writerObj=new FileWriter(descFile);
					writerObj.write("\nDescription Notes");
					writerObj.write("\n"+descriptionNote[1].getId()+"\t"+descriptionNote[1].getTitle()+((DescContent)(descriptionNote[1].getNoteContent())).getLine());
					writerObj.write("\n"+descriptionNote[2].getId()+"\t"+descriptionNote[2].getTitle()+((DescContent)(descriptionNote[2].getNoteContent())).getLine());
					writerObj.close();
					System.out.println("Success");
				}
				catch(IOException e)
					{
						System.out.println("error");
					}

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
		    		 bulletNote[3]=new BulletNote(3,bullTitle,bulletContent[3]);
		    		  System.out.println("\nBullet Notes");
					 System.out.println(bulletNote[1].getId()+"\t"+bulletNote[1].getTitle()+"\t"+((BulletContent)(bulletNote[1].getNoteContent())).getBulletPoints());
					  System.out.println(bulletNote[2].getId()+"\t"+bulletNote[2].getTitle()+((BulletContent)(bulletNote[2].getNoteContent())).getBulletPoints());
		    		 System.out.println(bulletNote[3].getId()+"\t"+bulletNote[3].getTitle()+"\t"+((BulletContent)(bulletNote[3].getNoteContent())).getBulletPoints());
				
		    		 try{
					FileWriter writerObj=new FileWriter(bulletFile);
					writerObj.write("\nBullet Notes");
					writerObj.write("\n"+bulletNote[1].getId()+"\t"+bulletNote[1].getTitle()+"\t"+((BulletContent)(bulletNote[1].getNoteContent())).getBulletPoints());
					writerObj.write("\n"+bulletNote[2].getId()+"\t"+bulletNote[2].getTitle()+((BulletContent)(bulletNote[2].getNoteContent())).getBulletPoints());
					writerObj.write("\n"+bulletNote[3].getId()+"\t"+bulletNote[3].getTitle()+"\t"+((BulletContent)(bulletNote[3].getNoteContent())).getBulletPoints());
					writerObj.close();
					System.out.println("Success");
				}
				catch(IOException e)
					{
						System.out.println("error");
					}



				}
				if(create==2)
				{
				 System.out.println("\nenter Description Notes title:");
				 String descTitle=scan.next();
				 System.out.println("\nenter Description Notes content:");
		   		String descCont=scan.next();
				descContent[3]=new DescContent();
				((DescContent)descContent[3]).setLine(descCont);
				descriptionNote[3]=new DescriptionNote(3,descTitle,descContent[3]);
				
				System.out.println(descriptionNote[1].getId()+descriptionNote[1].getTitle()+((DescContent)(descriptionNote[1].getNoteContent())).getLine());
				System.out.println(descriptionNote[2].getId()+descriptionNote[2].getTitle()+((DescContent)(descriptionNote[2].getNoteContent())).getLine());
				System.out.println(descriptionNote[3].getId()+descriptionNote[3].getTitle()+((DescContent)(descriptionNote[3].getNoteContent())).getLine());
				

				 try{
					FileWriter writerObj=new FileWriter(descFile);
					writerObj.write("\nDescription Notes");
					writerObj.write("\n"+descriptionNote[1].getId()+descriptionNote[1].getTitle()+((DescContent)(descriptionNote[1].getNoteContent())).getLine());
					writerObj.write("\n"+descriptionNote[2].getId()+descriptionNote[2].getTitle()+((DescContent)(descriptionNote[2].getNoteContent())).getLine());
					writerObj.write("\n"+descriptionNote[3].getId()+descriptionNote[3].getTitle()+((DescContent)(descriptionNote[3].getNoteContent())).getLine());
					writerObj.close();
					System.out.println("Success");
				}
				catch(IOException e)
					{
						System.out.println("error");
					}

					
				}
				break;


				case 2:
				System.out.println("enter choice to read 1.Bullet note  2.Description note");
				int id=scan.nextInt();
				if(id==1)
				{
					bulletNote[1].read();
					
				}
				if(id==2)
				{
					descriptionNote[1].read();
					
				}
				break;

				case 3:
				System.out.println("enter note to delete 1.Bullet 2.Desc");
				int note=scan.nextInt();
				if(note==1)
				{
					System.out.println("enter bullet note id to delete 1. 2. 3. 4.back");
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
					if(deleteBullet==4)
					{
						break;
					}
					
					try{
					FileWriter writerObj=new FileWriter("BulletNote.txt");
					writerObj.write("\nBullet Notes");
					writerObj.write("\n"+bulletNote[1].getId()+"\t"+bulletNote[1].getTitle()+"\t"+((BulletContent)(bulletNote[1].getNoteContent())).getBulletPoints());
					writerObj.write("\n"+bulletNote[2].getId()+"\t"+bulletNote[2].getTitle()+"\t"+((BulletContent)(bulletNote[2].getNoteContent())).getBulletPoints());
					writerObj.write("\n"+bulletNote[3].getId()+"\t"+bulletNote[3].getTitle()+"\t"+((BulletContent)(bulletNote[3].getNoteContent())).getBulletPoints());
					writerObj.close();
				}
				catch(Exception e)
					{
						e.printStackTrace();
					}

				}
				if(note==2)
				{
					System.out.println("enter desc note id to delete 1. 2. 3. 4.back");
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
					if(deleteDesc==4)
					{
						break;
					}

					 try{
					FileWriter writerObj=new FileWriter(descFile);
					writerObj.write("\nDescription notes");
					writerObj.write("\n"+descriptionNote[1].getId()+descriptionNote[1].getTitle()+((DescContent)(descriptionNote[1].getNoteContent())).getLine());
					writerObj.write("\n"+descriptionNote[2].getId()+descriptionNote[2].getTitle()+((DescContent)(descriptionNote[2].getNoteContent())).getLine());
					writerObj.write("\n"+descriptionNote[3].getId()+descriptionNote[3].getTitle()+((DescContent)(descriptionNote[3].getNoteContent())).getLine());
					writerObj.close();
					System.out.println("Success");
				}
				catch(IOException e)
					{
						System.out.println("error");
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

					try{
					FileWriter writerObj=new FileWriter("BulletNote.txt");
					writerObj.write("\nBullet Notes");
					writerObj.write("\n"+bulletNote[1].getId()+"\t"+bulletNote[1].getTitle()+"\t"+((BulletContent)(bulletNote[1].getNoteContent())).getBulletPoints());
					writerObj.write("\n"+bulletNote[2].getId()+"\t"+bulletNote[2].getTitle()+"\t"+((BulletContent)(bulletNote[2].getNoteContent())).getBulletPoints());
					writerObj.close();
				}
				catch(Exception e)
					{
						e.printStackTrace();
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

					 try{
					FileWriter writerObj=new FileWriter(descFile);
					writerObj.write("\nDescription notes");
					writerObj.write("\n"+descriptionNote[1].getId()+descriptionNote[1].getTitle()+((DescContent)(descriptionNote[1].getNoteContent())).getLine());
					writerObj.write("\n"+descriptionNote[2].getId()+descriptionNote[2].getTitle()+((DescContent)(descriptionNote[2].getNoteContent())).getLine());
					writerObj.close();
					System.out.println("Success");
				}
				catch(IOException e)
					{
						System.out.println("error");
					}
					
				}
				break;
		

				case 5:
				return;
			}
		}
		
	}
}

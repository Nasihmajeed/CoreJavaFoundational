package files.notes;
import java.util.Scanner;
import files.notes.content.BulletPoint;
import files.notes.Notes;
import java.io.Console;
public class BulletClass extends Notes
{
	BulletPoint[] bulletPoint=new BulletPoint[7];

	public static Scanner scan=new Scanner(System.in);
	

	public void createBulletNote()
	{
		bulletPoint[1]=new BulletPoint();
		bulletPoint[1].createBullet("hello");

		bulletPoint[2]=new BulletPoint();
		bulletPoint[2].createBullet("world");
		
	}
	public void view()
	{
		for(int j=1;j<=bulletPoint.length-1;j++)
		{
			if(bulletPoint[j]!=null)
			{
				bulletPoint[j].printBulletPoint();
			}						
		}
	}
	public void create()
	{
		
		System.out.println("enter max number of bulletpoints:");
		int max=scan.nextInt();
		//scan.next();
		for(int i=1;i<=max;i++)
		{
			bulletPoint[i+2]=new BulletPoint();
			
			System.out.println("enter line\n");
			String line=scan.next();
			//String line=console.readLine();
			bulletPoint[i+2].createBullet(line);
		}
	}

	public void edit()
	{
		System.out.println("enter bulletpoint number to be edited:");
		int id=scan.nextInt();
		bulletPoint[id]=null;
		bulletPoint[id]=new BulletPoint();
		//scan.next();
		System.out.println("enter edited text:\n");
		String edited=scan.next();
		bulletPoint[id].createBullet(edited);
		view();
	}

	public void delete()
	{
		System.out.println("enter bulletpoint number to be deleted:");
		int id=scan.nextInt();
		bulletPoint[id]=null;
		System.out.println("bulletpoint "+id+ " deleted\n");
		view();

	}
		
		//view();
		//bulletPoint[3].printBulletPoint();

}
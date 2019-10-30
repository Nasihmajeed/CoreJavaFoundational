import java.util.Scanner;
public class Members
{
	String name,email,number,y,n,ch;
	int num;
	public void details(Members[] members)
	{

		Scanner scr=new Scanner(System.in);
		System.out.println("Edit Number ? y/n");
		ch=scr.next();
		if (ch=="y") 
		{
			System.out.println("enter no :");
			num=scr.nextInt();

			for (int i=0;i<members.length;i++) 
			{
				if(members[num]==members[i])
				System.out.println(members[i]);
			}
		}
	}
}
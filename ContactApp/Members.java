import java.util.Scanner;
public class Members
{
	String name,email,number,y,n,ch;
	int num;
	Contactdetail c=new Contactdetail();
	public void details(Members[] members)
	{

		Scanner scr=new Scanner(System.in);
		/*System.out.println("select number");
		ch=scr.next();
		System.out.println(ch);
		if(ch.equals("y")) 
		{*/
			System.out.println("enter no :");
			num=scr.nextInt();

			for (int i=0;i<members.length;i++) 
			{
				if(members[num]==members[i])
				{
				System.out.println("Name   :"+members[i].name);
				System.out.println("Number :"+members[i].number);
				System.out.println("email  :"+members[i].email);
				}
			}
		//}
		System.out.println("Add number ? y/n");
		ch=scr.next();
		System.out.println(ch);
			if(ch.equals("y")) 
			{
				c.details();
			}
		}
		void printdetail()
		{
			c.printdetail();
		}

}

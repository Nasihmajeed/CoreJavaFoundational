import java.util.*;
public class Admin
{
	public void checkAdmin()
	{
		Scanner in = new Scanner(System.in);
		String pass="a2b",password="asd";
		while(!(password.equals("0")))
		{
			System.out.println("Please type your password \n");
			password=in.nextLine();
			if(password.equals(pass))
			{
				System.out.println("Welcome Admin");
				break;
				adminActions();
			}
			else
			{
				System.out.println("!!Invalid Password!! (Type quit to quit)");
				password=in.nextLine();
				if(password.equals("quit"))
					break;
			}
		}
	}
	
}
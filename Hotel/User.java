import java.util.*;
public class User
{
	
	void userDetails()
	{
		Scanner in = new Scanner(System.in);
		String userName;
		System.out.println("Eneter Your Name");
		userName = in.nextLine();
		System.out.println("\nWelcome  to A2B" + userName );
		
	}
}
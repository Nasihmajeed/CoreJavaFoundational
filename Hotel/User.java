import java.util.*;
public class User
{
	String userName;
	void userDetails()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Eneter Your Name");
		userName = in.nextLine();
		System.out.println("\nWelcome  to A2B  " + userName );
		
	}
}
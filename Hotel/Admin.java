import java.util.*;

public class Admin
{
	String admName="Sai Krishna Prasad";
	String username,pwd;
	
	Scanner sc=new Scanner(System.in);
	
	//Admin authentication
	
	public void admAuthenticate()
	{
	System.out.println("Admin Name is "+admName);	
	System.out.println("Please Enter your UserName");
	username=sc.nextLine();
	
	if(username.equals("SaiSKP"))
	 {
		System.out.println("Username is Correct............Enter your Password");
		pwd=sc.nextLine();
		if(pwd.equals("skp@7"))
		       {
				   System.out.println("UserName and Password Verified...U are the Admin...Welcome Sai krishna");
				/*   
				   admOperations();
			   */
			   }
			   else
			   {
				   System.out.println("Incorrect Password ! Please try again");
			   }
	 }
	else
	{
		System.out.println("Sorry..................Username Invalid ! Enter valid Username");
	}
	}
		
//Admin can do CRUD operations		
/*
  public void admOperations()
  {
	  System.out.println("SELECT THE OPERATION U WANT TO PERFORM");
	  System.out.println("1.Add");
	  System.out.println("2.Update/Edit");
	  System.out.println("3.Remove/Delete");
	  System.out.println("View");
	  
  }
*/
}
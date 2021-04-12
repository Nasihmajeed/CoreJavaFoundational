import java.util.*;
import java.util.Scanner;
class Admin
{
    Scanner sc=new Scanner(System.in);
	String aName="Sai Krishna",uname,pwd;

	public void authenticate()
	{

		System.out.println("Enter the Username of the Admin");
		uname=sc.nextLine();
		if(uname.equals("saiskp"))
		{
			System.out.println("Username Authenticated!!!");
			System.out.println("Enter the Admin Password");
			pwd=sc.nextLine();

			if(pwd.equals("sai"))
			{
				System.out.println("Password Perfect !!! Admin name is : "+aName);
			}
			else
			{
				System.out.println("Incorrect Password !!!");
			}
		}
		else
		{
			System.out.println("Username Invalid !!! Try Again !!!");
		}
	}

}
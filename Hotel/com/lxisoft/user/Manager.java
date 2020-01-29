package com.lxisoft.user;
import com.lxisoft.user.*;
import com.lxisoft.hotel.*;
import java.util.Scanner;
public class Manager
{
String username,password;
int f=0;
static Scanner input =new Scanner(System.in);
public void createManager(Menu menu,User[] user,int noOfuser)
	{
		
		
		if(f>0)
		{

		System.out.print("Enter username:");
        username = input.nextLine();
        System.out.print("Enter password:");
        password = input.nextLine();
        if(username.equals("ashik") && password.equals("password"))
        {
            System.out.println("\nWelcome "+this.username);
			System.out.println("\nChoose An option \n1.View Order\n2.Edit Menu");
			int mode=input.nextInt();
			if(mode==1)
			{
				System.out.println("\t___Customer Order____ ");
				int l=0;
				
				for(int i=0;i<noOfuser;i++)
				{
					
					user[i].displayUser(menu);
						
				
				}
				
				if(user[0].name==null)
					{
				 	System.out.println("\n\tsYou dont have any Order____");
				    }
			}
			if(mode==2)
			{
				menu.editMenu();
			}
        }
        else
        {
            System.out.println("\n\tAuthentication Failed");
        }

			
		}	
		if(f==0)
		{
		System.out.print("Enter name:");
        username = input.nextLine();
        System.out.print("Enter password:");
        password = input.nextLine();
		menu.createMenu();
		f++;
		}
		

		
	}



}
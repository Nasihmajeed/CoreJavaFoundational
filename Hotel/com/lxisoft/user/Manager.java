package com.lxisoft.user;
import com.lxisoft.user.*;
import com.lxisoft.hotel.*;
import java.util.Scanner;
public class Manager
{
String name;
int f=0;
static Scanner input =new Scanner(System.in);
public void createManager(Menu menu,User user)
	{
		//int choise;
		//System.out.println("F "+this.f);
		
		if(f>0)
		{
			System.out.println("\nWelcome "+this.name);
			System.out.println("\nChoose An option \n1.View Order\n2.Edit Menu");
			int mode=input.nextInt();
			if(mode==1)
			{
				System.out.println("\t___Customer Order____ ");
				user.displayUser(menu);
			}
			if(mode==2)
			{
				menu.editMenu();
				//System.out.println("\n--DELETED--\n");
			}
		}	
		if(f==0)
		{
		System.out.println("name Of Manager= ");
		name=input.next();
		menu.createMenu();
		f++;
		}
		//while(f==0);

		
	}

public void displayManager()
	{


	}

}
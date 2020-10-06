package com.lxisoft.Hotel;
import com.lxisoft.Admin.Admin;
import com.lxisoft.Menu.Menu;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Hotel 
{
private int n;
public Admin admin=new Admin();
public Menu menu=new Menu();
	public void interFaceprint()
	{
	int choice;
		do
		{
		Scanner scn=new Scanner(System.in);
		System.out.println("Please enter your preferred choice"+"\n");
		System.out.println("Press 1.Menu\t 2.Admin-Console\t "+"\t 3.Exit");
		choice=scn.nextInt();
			if(choice==1)
			{
				menu.addMenu();
				System.out.println("|---------------------------------------|");
				System.out.println("|            The Sky Lounge             |");
				System.out.println("|---------------------------------------|");
				System.out.println("|----------------MENU-------------------|");
				menu.menuPrint();
				//menu.orderFood();
			}
			if(choice==2)
			{
				menu.addMenu();
				System.out.println("|---------------------------------------|");
				System.out.println("|            The Sky Lounge             |");
				System.out.println("|---------------------------------------|");
				System.out.println("|----------------MENU-------------------|");

				menu.menuPrint();
				admin.adminConsole();
			}
		}
		while(choice>3);
	}
}


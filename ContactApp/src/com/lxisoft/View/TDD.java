package com.lxisoft.View;

import java.util.*;


import com.lxisoft.Models.*;
import com.lxisoft.Controllers.*;


public class TDD
{
	public static void main(String[] args) 
	{
		ContactControl control=new ContactControl();
		Scanner sc=new Scanner(System.in);
		
		int loop=0;
		int repeat=0; 
		do
		{
			repeat=0;
			loop=0;
			System.out.println("enter 1 add  2 3  4  ");
			int select=sc.nextInt();
			switch(select)
			{
				case 1: System.out.println("Enter the contact name: ");
						String name=sc.next();
						System.out.println("Enter the phone nmbr: ");
						long no=sc.nextLong();
						control.setNewContact(name,no);
						break;
				case 2: break;
				case 3: break;
				case 4: getAllContacts(control);break;
				default:System.out.println("enter the correct option");
						repeat=1;
			}
			System.out.println("do u want to continue: 1 y or 0 no");
			loop=sc.nextInt();
		}while(loop==1|repeat==1);
	}
	public static void getAllContacts(ContactControl control)
	{
		int length=control.getContactsLength();
		System.out.println(length);
		
	}
	

}
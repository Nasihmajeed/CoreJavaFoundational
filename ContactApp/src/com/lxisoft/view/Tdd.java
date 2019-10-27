package com.lxisoft.view;
import com.lxisoft.controller.ContactController;
import com.lxisoft.model.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Tdd
{
	Scanner sc=new Scanner(System.in);
	ContactController controller=new ContactController();
	
	public static void main(String[] args)
	{
		System.out.print(" \n\n");
		Tdd t=new Tdd();
		t.inputContact();
		t.displayContact();
	}

	public void displayContact()
	{
		int i=1;
		ArrayList<Contact> array=controller.getContact();
		for(Contact contact: array)
		{
			System.out.print("S.No:-"+(i++)+"\t\tName- " +contact.getName());
			System.out.print("\t\tNumber- " + contact.getNumber()+"\n");
		}
	}

	public void inputContact()
	{
		System.out.print("enter the max range of contacts");
		int n=sc.nextInt();
		controller.setContact(n);		
	}

	public String[] scan(int i)
	{
		System.out.print("enter the name and number of "+(i+1)+"st contact");
		String[] temp=new String[2];
		temp[0]=sc.next();
		temp[1]=sc.next();
		return temp;
	}
}


// public static void totalPerson()
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		Person person=new Person();
// 		System.out.println("enter total no of persons ");
// 		person.setTotal((sc.nextInt()));
// 		System.out.println("++++ total no of persons "+person.getTotal());
// 	}
// public void scan()
// 	{
// 		System.out.println("enter the name");
// 		String name=sc.next();
// 		array.set(0).setName(name);
// 		System.out.println("enter the name");
// 		String number=sc.next();
// 		array.set(0).setNumber(number);
// 	}

// 	public void print()
// 	{
// 		System.out.println("name "+array.get(0).getName());
// 		System.out.println("name "+array.get(0).getNumber());
// 	}
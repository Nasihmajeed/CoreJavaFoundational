package com.lxisoft.view;
import com.lxisoft.controller.ContactController;
import com.lxisoft.model.*;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.util.ArrayList;

public class Tdd
{
	Scanner sc=new Scanner(System.in);
	static ContactController controller=new ContactController();
	
	public static void main(String[] args)
	{
		System.out.print(" \n\n");
		Tdd t=new Tdd();
		controller.setContact();
		t.displayContact();
		t.contactOptions();
	}

	public void displayContact()
	{
		int i=1;
		System.out.print("\n THE CONTACT LIST IS \n");
		ArrayList<Contact> array=controller.getContact();
		for(Contact contact: array)
		{
			System.out.print("S.No:-"+(i++)+"\t\tName- " +contact.getName());
			System.out.print("\t\tNumber- " + contact.getNumber()+"\n");
		}
	}

	public int inputContact()
	{
		System.out.print("enter the max range of contacts");
		int n=sc.nextInt();
		return n;		
	}

	public String[] scan(int i)
	{
		System.out.print("enter the name and number of "+(i+1)+"st contact");
		String[] temp=new String[2];
		temp[0]=sc.next();
		temp[1]=sc.next();
		return temp;
	}

	public void contactOptions()
	{
		while(true)
		{
			System.out.println("do you wish to continue y/n");
			char ch=sc.next().charAt(0);
			if(ch!='y')
				break;
			processing();
			System.out.println("\n press for features-->  0-Addition  1-searching  2-deletion  3-display");
			int option=sc.nextInt();
			controller.features(option);
			System.out.println("\n");
		}
		System.out.println("\t\t\t\t THANK YOU");	
	}

	public void processing()
	{
		System.out.print("\t\t Processing");
		for(int z=0;z<6;z++)
		{
			System.out.print("!");
			try
			{
				TimeUnit.MILLISECONDS.sleep(100);
			}
			catch(InterruptedException e)
			{
				System.out.println("Exception occured:"+e);
			}
		}
	}

	public String scanElement()
	{
		System.out.println("enter the name to search/delete");
		String element=sc.next();
		return element;
	}

	public void elementFound(Contact contact,int i)
	{
		System.out.print("Contact present at S.No:-"+(i)+"\t\tName- " +contact.getName());
		System.out.print("\t\tNumber- " + contact.getNumber()+"\n");
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
// public ArrayList<Integer> contactSearch()
// 	{
// 		int i=0,count=0;
// 		ArrayList<Integer> values=new ArrayList<Integer>();
// 		String element=t.scanElement();
// 		for(Contact contact: array)
// 		{
// 			if((contact.getName()).equals(element))
// 			{
// 				values.add(count,i);
// 				t.elementFound(contact,i);
// 				System.out.println("fdsjfdshfdj11"+values.get(count));
// 				++count;
// 			}
// 			++i;
// 		}
// 		for (int k=0;k<values.size();k++)
// 		{
// 			System.out.println("fdsjfdshfdj22"+values.get(k));
// 		}
// 		if(count==0)
// 			System.out.println("Contact not present");
// 		return values;
// 	}

// 	public void contactDelete()
// 	{
// 		ArrayList<Integer> values=contactSearch();
// 		for (int k=0;k<values.size();k++)
// 		{
// 			System.out.println("fdsjfdshfdj333"+values.get(k));
// 			int v=values.get(k+1);
// 			array.remove(v);
// 		}
// 		t.displayContact();
// 	}
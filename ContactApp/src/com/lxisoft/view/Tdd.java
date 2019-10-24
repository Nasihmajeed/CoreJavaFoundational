package com.lxisoft.view;
import com.lxisoft.controllers.*;
import com.lxisoft.models.*;
import java.util.List;
import java.util.ArrayList;

public class Tdd
{
	public static void main(String[] args)
	{
		ContactControl control=new ContactControl();
		List<Contact>contactList=new ArrayList<Contact>();

		contactList=control.getContactDetails();
		for(int i=0;i<contactList.size();i++)
		{
			System.out.println("Name= "+contactList.get(i).getName());
			System.out.println("Number= "+contactList.get(i).getContactNo());
		}
	}
}
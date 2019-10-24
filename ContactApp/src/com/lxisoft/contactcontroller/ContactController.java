package com.lxisoft.contactcontroller;
import com.lxisoft.contactmodel.*;
import java.util.ArrayList;
import java.util.List;
public class ContactController
{
	List <Contact> contactList=new ArrayList<Contact>();
	public List<Contact> getContacts()
	{
		int id=1;
		String[] name={"mehar","ninu","megha","amirtha","meharu"};
		long[] number={90456372,95396006,90481532,96569884,98466423};
		for(int j=0;j<5;j++)
		{
			Contact contact=new Contact();
			contact.setContactId(id);
			contact.setContactName(name[j]);
			contact.setContactNumber(number[j]);
			contactList.add(contact);
			id++;
		}
		return contactList;
	}
}
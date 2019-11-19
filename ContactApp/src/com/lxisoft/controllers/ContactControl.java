package com.lxisoft.controllers;
import java.util.*;
import com.lxisoft.view.*;
import com.lxisoft.models.*;
import com.lxisoft.domain.*;
import com.lxisoft.repository.*;
public class ContactControl
{
    Repository repository=new Repository();
    ContactView view=new ContactView();
    
	public void getContactDetails()
	{     
        List<Contact>contactList=repository.arrayWrite();
        ContactListModel listModel=new ContactListModel();
        for(int i=0;i<contactList.size();i++)
        {
            ContactModel model=new ContactModel();
            model.setId(contactList.get(i).getId());
            model.setName(contactList.get(i).getName());
            listModel.setContactsList(model);
       }
        view.getAllContacts(listModel.getContactsList());
        display();
    }
    public void display()
    {
        int ch=view.display();
        switch(ch)
        {
            case 1:ContactByIdDetails();break;     
            case 2:addDetails();break; 
        }
    }
    public void ContactByIdDetails()
    {
        List<Contact> contactList=repository.arrayWrite();
        String d=view.getContactId();
        Contact c=new Contact();
        for(int i=0;i<contactList.size();i++)
        {
            if((contactList.get(i).getId()).equals(d))
            {
                c=contactList.get(i);
            }
        }
        view.getContactById(c);
    }
    public void addDetails()
    {
    	Contact c=new Contact();
    	c=view.addContact();
        repository.createFile(c);
        repository.readFile();
    }
//     public void selectDetails(int no)
//     {
//         for(int i=0;i<contactList.size();i++)
//         {
//             contactList.get(i);
//         }
//     }
//     public void deleteDetails(int no)
//     {
//         for(int i=0;i<contactList.size();i++)
//     	{
//     		int index=contactList.indexOf(contactList.get(i));
//             if(no==index)
//     		{
//          		contactList.remove(i);
//          	}
//     	}
//         repository.resetFile();
//         for(int i=0;i<contactList.size();i++)
//         {
//             repository.createFile(contactList.get(i));
//         }
//     }
//     public void updateDetails(String contactNo,int no)
//     {
//         Contact c=new Contact();
//   		for(int i=0;i<contactList.size();i++)
//     	{
//     		int index=contactList.indexOf(contactList.get(i));
//             if(no==index)
//     		{
//          		c=contactList.get(i);
//                 c.setContactNo(contactNo);
//                 contactList.set(i,c);     
//          	}
//     	}
//         repository.resetFile();
//         for(int i=0;i<contactList.size();i++)
//         {
//             repository.createFile(contactList.get(i));
//         }
//     }
//     public Contact searchDetails(String name)
//     {
//         Contact c=new Contact();
//         for(int i=0;i<contactList.size();i++)
//         {
//             if(name.equals(contactList.get(i).getName()))
//             {
//                 c=contactList.get(i);
//             }
//         }
//         return c;
//     }
 } 

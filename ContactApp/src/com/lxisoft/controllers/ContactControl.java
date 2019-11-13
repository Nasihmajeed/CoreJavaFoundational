package com.lxisoft.controllers;
import java.util.*;
import com.lxisoft.models.*;
import com.lxisoft.view.*;
import com.lxisoft.repository.*;
public class ContactControl
{
    Repository repository=new Repository();
    ContactView view=new ContactView();
    ContactModel model=new ContactModel();
	public void getContactDetails()
	{
        
       // repository.arrayWrite();
    }
    public Contact viewDetails(int i)
    {
        return repository.getContactList().get(i);
       
    }
    public int getArraySize()
    {
        return repository.getContactListSize();
    }
//     public void addDetails(String name,String contactNo)
//     {
//     	Contact c=new Contact();
//     	c.setName(name);
//     	c.setContactNo(contactNo);
//     	contactList.add(c);
//         repository.createFile(c);
//         repository.readFile();
//     }
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

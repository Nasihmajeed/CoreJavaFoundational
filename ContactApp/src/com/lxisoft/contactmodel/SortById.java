package com.lxisoft.contactmodel;
import java.util.Comparator;
import com.lxisoft.domain.Contact;
public class SortById implements Comparator<Contact>
{
	public int compare(Contact c,Contact c1)
	{
		int x=Integer.parseInt(c.getContactId());
		int y=Integer.parseInt(c1.getContactId());
		return x-y;
	}
}
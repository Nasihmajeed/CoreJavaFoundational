package com.lxisoft.contactmodel;
import java.util.Comparator;
import com.lxisoft.domain.Contact;
public class SortByNumber implements Comparator<Contact>
{
	public int compare(Contact c,Contact c1)
	{
		return c.getContactNumber().compareTo(c1.getContactNumber());
	}
}
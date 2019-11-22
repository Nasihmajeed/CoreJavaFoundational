package com.lxisoft.contactmodel;
import java.util.Comparator;
import com.lxisoft.domain.Contact;
public class SortByName implements Comparator<Contact>
{
	public int compare(Contact c,Contact c1)
	{
		return c.getContactName().compareTo(c1.getContactName());
	}
}
package com.lxisoft.test;

import com.lxisoft.contactapp.view.ContactView;
import com.lxisoft.contactapp.controller.ContactController;
import com.lxisoft.contactapp.model.Contact;
import java.util.*;
public class Tdd
{
	static ContactView view=new ContactView();
	static
	{
		view.getFileInfo();
	}
	public static void main(String []args)
	{
		view.displayContactInfo();
	}
}
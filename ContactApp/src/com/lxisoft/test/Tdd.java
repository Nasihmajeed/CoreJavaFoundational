package com.lxisoft.test;

import com.lxisoft.contactapp.view.*;
import com.lxisoft.contactapp.controller.ContactController;
import com.lxisoft.contactapp.model.Contact;
import java.util.*;
public class Tdd
{
	public static void main(String []args)
	{
		ContactController control=new ContactController();
		control.displayAllcontacts();
	}
}
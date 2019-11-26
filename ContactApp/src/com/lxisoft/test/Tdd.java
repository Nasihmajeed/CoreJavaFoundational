package com.lxisoft.test;

import com.lxisoft.contactapp.view.*;
import com.lxisoft.contactapp.controller.ContactController;
import java.util.*;
/**
 * Tdd the main class.
 */
public class Tdd
{
/**
 * Main method to get All contact Information.
 * @param args  string array.
 */static ContactController control=new ContactController();
	public static void main(String []args)
	{
		/**
		 * object with reference of Contactcontroller class.
		 */
		control=new ContactController();
		
		//control.getAllcontacts();
		control.getAllcontactInfo();
	}
	static{
		control.getDBConnection();
	}
}
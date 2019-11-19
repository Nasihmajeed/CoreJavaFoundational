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
 * @param string array.
 */
	public static void main(String []args)
	{
		/**
		 * object with reference of Contactcontroller class.
		 */
		ContactController control=new ContactController();
		control.getAllcontactInfo();
	}
}
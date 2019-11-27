package com.lxisoft.test;
import com.lxisoft.contactcontroller.*;
import com.lxisoft.repository.*;
/**
 *class TDD for initialising program
 */
public class TDD
{
	/**
	 *main method
	 *@param args argument needed for compiler
	 */
	public static void main(String[] args)
	{
		ContactController control=new ContactController();
		control.getAllContacts();
	} 
	
}
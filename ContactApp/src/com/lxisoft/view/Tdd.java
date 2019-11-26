package com.lxisoft.view;
import com.lxisoft.controller.ContactController;
import com.lxisoft.model.*;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import com.lxisoft.repository.*;
import com.lxisoft.view.View;

/**
 *testing class
 */
public class Tdd
{
	/**
	 *@param args argument needed for compiler
	 */
	public static void main(String[] args)
	{
		ContactController controller=new ContactController();
		controller.allContacts();
		controller.features();
		DbRepository dbRepository=new DbRepository();
		dbRepository.findAll();
	}
}
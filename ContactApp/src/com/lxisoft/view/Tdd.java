package com.lxisoft.view;
import com.lxisoft.controller.ContactController;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.util.ArrayList;
import com.lxisoft.repository.*;

public class Tdd
{	
	public static void main(String[] args)
	{
		ContactController controller=new ContactController();
		ContactView contactview=new ContactView();
		System.out.print(" \n\n");
		controller.setContact();
		contactview.displayContact();
		contactview.contactOptions();
		
	}

}
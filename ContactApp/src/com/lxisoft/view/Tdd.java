package com.lxisoft.view;
import com.lxisoft.controller.ContactController;
import com.lxisoft.model.*;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import com.lxisoft.contactrepository.*;
import com.lxisoft.view.View;

public class Tdd
{
	public static void main(String[] args)
	{
		View view=new View();
		ContactController controller=new ContactController();
		System.out.print(" \n\n");
		view.contactOptions();
	}
}
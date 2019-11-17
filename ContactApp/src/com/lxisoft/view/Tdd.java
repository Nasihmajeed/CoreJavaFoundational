package com.lxisoft.view;
import com.lxisoft.controller.ContactController;
import com.lxisoft.model.*;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import com.lxisoft.repository.*;
import com.lxisoft.view.View;

public class Tdd
{
	public static void main(String[] args)
	{
		ContactController controller=new ContactController();
		controller.allContacts();
		controller.features();
	}
}
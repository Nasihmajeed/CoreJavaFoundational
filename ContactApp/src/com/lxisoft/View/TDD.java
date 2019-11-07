package com.lxisoft.View;

import com.lxisoft.Models.*;
import com.lxisoft.Controllers.*;
import java.util.*;


import com.lxisoft.View.*;

public class TDD 
{
	static View view=new View();
	static boolean backup;
	static
	{
		backup=view.control.initialization();
		if(backup)System.out.println("Contacts restored !!!");
		else System.out.println("No backup details found");	
	}
	public static void main(String[] args)
	{
		view.start();
	}
}


	


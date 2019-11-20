package com.lxisoft.test;

import com.lxisoft.Models.*;
import com.lxisoft.Controllers.*;
import java.util.*;
import com.lxisoft.View.*;
/**
*starting with TDD
*/
public class TDD 
{
	/**
	*main method used to crate new object of control , invoking start method
	*/
	public static void main(String[] args)
	{
		ContactControl control=new ContactControl();
		System.out.println("*******CONTACT APP*******\n");
		control.start();
	}
}

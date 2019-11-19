package com.lxisoft.test;
import com.lxisoft.controllers.*;
import com.lxisoft.models.*;
import com.lxisoft.view.*;
import java.util.*;
public class Tdd
{
	public static void main(String[] args)
	{
		System.out.println("           CONTACT APP\n        *******************");
		ContactControl control=new ContactControl();
		control.getContactDetails();
    }
}
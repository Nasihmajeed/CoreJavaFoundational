package com.lxisoft.test;
import com.lxisoft.controllers.*;
import com.lxisoft.models.*;
import com.lxisoft.view.*;
import java.util.*;
/**
 * class for initialization 
 */
public class Tdd
{
	/**
     *main method 
     */
	/**
 	 * @param args argument need for Compiler
 	 */
	public static void main(String[] args)
	{
		System.out.println("           CONTACT APP\n        *******************");
		ContactControl control=new ContactControl();
		control.getContactDetails();
    }
}
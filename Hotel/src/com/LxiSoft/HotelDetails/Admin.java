package com.LxiSoft.HotelDetails;
import java.util.*;
public class Admin{
	Menu menu = new Menu();
	public void viewMenu(){
		menu.printMenu();
	}
	public void editMenu(){
		menu.getMenu();
		menu.printMenu();
	}
}
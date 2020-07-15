package com.lxisoft.Hotel;
import com.lxisoft.Admin.Admin;
import java.util.Scanner;
public class Item
{
	private String name; //item name
	private int prize; //item prize

	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}

	public void setPrize(int prize)
	{
		this.prize=prize;
	}
	public int getPrize()
	{
		return prize;
	}
}

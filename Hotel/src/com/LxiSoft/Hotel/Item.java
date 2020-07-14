package com.LxiSoft.Hotel;
import com.LxiSoft.Admin.Admin;
import java.util.Scanner;
public class Item
{
	private String name; //item name
	private int prize,itemTotAmount=0;

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


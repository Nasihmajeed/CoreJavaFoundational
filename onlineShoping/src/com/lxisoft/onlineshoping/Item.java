package com.lxisoft.onlineshoping;
import java.util.*;
import java.util.Objects;
public class Item implements Comparable<Item>
{
	private String name;
	private String catogey;
	private int productNo;
	private String feature;
	private int price;
	private int id;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return this.id;
	}
	public void setItemName(String proName)
	{
		this.name=proName;
	}
	public String getItemName()
	{
		return this.name;
	}
	public void setCatogery(String proCatogery)
	{
		this.catogey=proCatogery;
	}
	public String getCatogery()
	{
		return this.catogey;
	}
	public void setFeature(String proFeature)
	{
		this.feature=proFeature;
	}
	public String getFeature()
	{
		return this.feature;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return this.price;
	}


	public int compareTo(Item itm)
	{
		if (this.price==itm.price)
		{
			return 0;	
		}
		else
		{
			return this.price > itm.price ? 1 : -1;
		}
	}
	public boolean equals(Object o) {
        if (this == o)
        {
        	 return true;
        }
       
        if (o == null || getClass() != o.getClass()) 
        {
        	return false;
        }
        Item item = (Item) o;
        return id == item.getId();
    }
    public boolean equals(Object obj)
	{
		if((((Item)obj).name==this.name) && (((Item)obj).catogey==this.catogey) && (((Item)obj).productNo==this.productNo) && (((Item)obj).feature==this.feature)&& (((Item)obj).price==this.price)&& (((Item)obj).id==this.id))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	 
    public int hashCode() {
        return Objects.hash(id);
    }
}
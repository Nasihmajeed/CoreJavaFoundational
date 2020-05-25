package com.lxisoft.market;
import com.lxisoft.market.*;
import java.util.Objects;
import java.util.*; 
import java.lang.*; 
import java.io.*;  
public class Item implements Comparable<Item>
{	
	private int id;
	private String name;
	private int price;	
	public void setId(int id)
	{
		this.id=id;
	}	
	public int getId()
	{
		return this.id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return this.price;
	}
	public int compareTo(Item item) {
        return this.getId() - item.getId();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.getId();
    }
	 
    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

	
}
 

    
   
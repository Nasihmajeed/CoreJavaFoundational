package com.lxisoft.market;
import com.lxisoft.market.*;
import java.util.Objects;
import java.util.*; 
import java.lang.*; 
import java.io.*;  
public class Item implements Comparable<Item>
{	
	private int id;
	private String itemType;
	private int itemPrice;	
	private  int itemQuantity;
	public void setId(int id)
	{
		this.id=id;
	}	
	public int getId()
	{
		return this.id;
	}
	public void setName(String itemType)
	{
		this.itemType=itemType;
	}
	public String getName()
	{
		return this.itemType;
	}
	public void setPrice(int itemPrice)
	{
		this.itemPrice=itemPrice;
	}
	public int getPrice()
	{
		return this.itemPrice;
	}
	public void setQuantity(int itemQuantity)
	{
		this.itemQuantity=itemQuantity;
	}
	public int getQuantity()
	{
		return this.itemQuantity;
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
                ", name='" + itemType + '\'' +
                ", price=" + itemPrice +
                ", quantity=" + itemQuantity +
                '}';
    }

	
}
 

    
   
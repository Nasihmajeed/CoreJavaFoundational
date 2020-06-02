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
    public void guarantiItem()
	{
		System.out.println("\n\n\n      Guarranty Products ");

		Map<Integer,String> map = new HashMap<Integer, String>();
		
		map.put(1,"Eveready Items 10 Month Warranty");
		map.put(3, "Bajaj Items 4yr Warranty");
		map.put(2, "Cello Items 2yr Warranty");
				
		Set<?> set = map.entrySet();
		Iterator<?> itr = set.iterator();
		
		while(itr.hasNext())
		{			
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+"."+entry.getValue());
		}
	}
    

	
}
 

    
   
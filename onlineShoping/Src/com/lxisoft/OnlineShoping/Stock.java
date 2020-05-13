package com.lxisoft.OnlineShoping;
import com.lxisoft.OnlineShoping.Item;
import java.util.*;
public class Stock
{
	ArrayList<Item> product=new ArrayList<Item>();
	Item item;
	final ArrayList<Item> itemDetail()
	{
		ArrayList<String> name=new ArrayList<String>();
		name.add("Nike Sneaker");
		name.add("Adidas Canvas");
		name.add("BabyLips");
		name.add("Maybelline");
		ArrayList<String> catogery=new ArrayList<String>();
		catogery.add("Footwear Shoes");
		catogery.add("Footwear Shoes");
		catogery.add("Cosmetics Lipstick");
		catogery.add("Cosmetics EyeLiner");

		ArrayList<String> feature=new ArrayList<String>();
		feature.add("Color : Bluesh Red \nMeteria : Polister");
		feature.add("Color : Red and Black Standerd \nMeteria : Polister");
		feature.add("* Maybelline Baby Lips Moisturizing Lip Balm \n* Waterproof");
		feature.add("* New Hyper Easy Brush Tip Liquid Liner from Maybelline New York delivers the smoothest glide, fit to your eye \n* Waterproof");

		for (int i=0;i<name.size();i++) 
		{
			item=new Item();
			item.setItemName(name.get(i));
			item.setCatogery(catogery.get(i));
			item.setFeature(feature.get(i));
			product.add(item);
		}
		
		return product;
	}
}
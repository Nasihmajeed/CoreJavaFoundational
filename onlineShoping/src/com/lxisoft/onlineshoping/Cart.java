package com.lxisoft.onlineshoping;
import com.lxisoft.onlineshoping.Item;
import com.lxisoft.onlineshoping.Cart;
import com.lxisoft.onlineshoping.Customer;
import com.lxisoft.repository.Fileoperation;
import java.util.*;
import com.lxisoft.onlineshoping.Displaypage;
import com.lxisoft.onlineshoping.Carted_item;
public class Cart
{
	private List<Item>cartProduct=new ArrayList<Item>();
	private Fileoperation fo=new Fileoperation();
	private Displaypage dp;
	private Carted_item cd;
	private Customer customerDetail;
	private Item product;
	final void cartItem(Item product,Customer customer)throws Exception
	{
		dp=new Displaypage();
		fo.cartProduct(product,customer);
		customerDetail=customer;
		this.product=product;
	}
	final void viewCartItem(Customer customer)throws Exception 
	{
		System.out.println("\n");
		Map cartItem= fo.viewCartProduct(customer,cd);
		System.out.println("   CART products");
		System.out.println(" =================");
		System.out.println("Customer : "+customer.getName());
		for (int i=0;i<cartItem.size();i++) 
		{

				System.out.println("Item : "+cartItem.get(customer.getName()));	
				System.out.println("   Successfully Carted Item ");
				
			System.out.println("\n");
		}
		
	}
	public void checkCustomer()
	{
		Customer g1 = new Customer(); 
        Customer g2 = new Customer(); 
          
        // comparing above created Objects. 
        if(g1.hashCode() == g2.hashCode()) 
        { 
  
            if(g1.equals(g2))
            {
            	System.out.println("Both Objects are equal. "); 
	            System.out.println("g1 hashCode : "+g1.hashCode()); 
	            System.out.println("g2 hashCode : "+g2.hashCode()); 
            } 
                
            else
            {
                System.out.println("Both Objects are not equal. "); 
                   System.out.println("g1 hashCode : "+g1.hashCode()); 
	            System.out.println("g2 hashCode : "+g2.hashCode()); 
            }
      
        } 
        else
        {
        	System.out.println("Both Objects are not equal. ");  
        	   System.out.println("g1 hashCode : "+g1.hashCode()); 
	            System.out.println("g2 hashCode : "+g2.hashCode()); 
        }
        
    
	}
}
package com.lxisoft.OnlineShoping;
import com.lxisoft.OnlineShoping.DisplayPage;
import com.lxisoft.OnlineShoping.User;
public class SignUp
{
	User user;
	ArrayList<User>userDet=new ArrayList<User>();
	final void setUserSignup()
	{
		user=new User();
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter User Name : ");
		String name=scr.next();
		user.setName(name);

		System.out.println("Enter User Password : ");
		String password=scr.next();
		user.setPassword(password);

		System.out.println("Enter User Address : ");
		String address=scr.next();
		user.setAddress(address);

		System.out.println("Enter User Pincode : ");
		int pincode=scr.nextInt();
		user.setPincode(pincode);

		

		
	}
	final User getUserSignup()
	{
		return userDet.add(user);
	}
}
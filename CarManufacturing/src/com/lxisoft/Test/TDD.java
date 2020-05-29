package com.lxisoft.Test;
import com.lxisoft.CarApp.Vehicle;
public class TDD
{
	public static void main(String [] args)
	{
 		Vehicle car=new Vehicle();
 		car.getCarDetails();
 		car.printCarDetails();
		Vehicle owner=new Vehicle();
		owner.getOwnerDetails();
	}
}
package com.LxiSoft.Car;
import java.util.Scanner;
public class Car
{
	Scanner scnr=new Scanner(System.in);
	Owner owner=new Owner();
	 Door door=new Door();
	  	
	Wheel wheel=new Wheel();
	Fuel fuel=new Fuel();
	String car;
	public void carDetail()
	{	
    System.out.println("\t Avilable cars Are \n 1: Benz \n 2: BMW");
		int choice;
		System.out.println("Select your your Car");
		choice=scnr.nextInt();

		
		switch (choice)
		{
			case 1:
			car=("Benz");
			break;

			case 2:
			car=("BMW");
			break;

			default:
			car=("No car available");
			break;
		}
		

}
	public void setOwner()
	{
		System.out.println("Enter owner name : ");
		String name=scnr.nextLine();
		owner.setName(name);
		scnr.nextLine();

		System.out.println("Enter register no : ");
		String regNo=scnr.nextLine();
		owner.setRegNo(regNo);

  door.doorDetails();
  wheel.setWheel();
  fuel.setFuel();
  System.out.println("\tYOUR DREAM CAR Details are");
  System.out.println("\n Owner is : "+owner.getName());
  System.out.println("\n Register number is  : "+owner.getRegNo());

  System.out.println("\n The car is "+car);
  door.printDoor();
  wheel.printWhel();
  fuel.printFuel();
}

}

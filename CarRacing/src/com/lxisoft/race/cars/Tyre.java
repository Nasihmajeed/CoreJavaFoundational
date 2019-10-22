package com.lxisoft.race.cars;
import com.lxisoft.race.cars.*;
public class Tyre{
	String name;
	double traction;
public Tyre(String name,double traction){
	this.name=name;
	this.traction=traction;
}
public void printTyre(){
	 
		System.out.println(("Tyre name - ")+this.name+"\nTraction - "+this.traction);
	 
	
}

}

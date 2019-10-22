package com.lxisoft.race.cars;
import com.lxisoft.race.cars.*;
public class Engine{
	int eno;
	String fuel;
	int cc;
	int hp;
public Engine(String fuel,int eno,int cc,int hp){
	this.fuel=fuel;
	this.eno=eno;
	this.cc=cc;
	this.hp=hp;
}
public void printEngine(){
	System.out.println("Fuel      : "+this.fuel+"\nEngine No : "+this.eno+"\nEngine Capacity :"+this.cc+"\nEngine power : "+this.hp);
}
	
}
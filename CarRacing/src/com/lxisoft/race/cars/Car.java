package com.lxisoft.race.cars;
import com.lxisoft.race.cars.*;
import java.lang.*;
public abstract  class Car{
	Engine e;
	String brand;
	int model;
	int bs=60;
    double power;
 	Tyre[] t=new Tyre[4];

 	Car() {
 		this.fixTyre();
 	}

public Tyre[] fixTyre(){
 
	t[0]=new Tyre("Pirelli",0.5);
	t[1]=new Tyre("Michelin",0.3);
	t[2]=new Tyre("MRF",0.4);
	t[3]=new Tyre("CEAT",0.6);	
	return t; 
}   
public int r(int a){		
	int random=(int)(Math.random()*a);
	return random;
}
public abstract double getPower();
public abstract void printTyre(Tyre[] t);
public abstract void printCar();
}
package com.lxisoft.race.cars;
import com.lxisoft.race.cars.*;
public class Sedan extends Car implements Luxary{	
public Sedan(String brand,int model,Engine e){
	this.brand=brand;
	this.model=model;
	this.e=e;
	//this.t=t;
}
public double getPower(){
	double power=e.cc*e.hp*((t[0].traction+t[1].traction+t[2].traction+t[3].traction)/4);
	power=power/1000;
	return power;
}


public void printCar(){
	System.out.println("\n"+"\nBrand Name - "+this.brand+"\nmodel No.  - "+this.model);
	this.e.printEngine();
	printTyre(fixTyre());
}

public void printTyre(Tyre[] t){
	for(int i=0;i<4;i++){
		System.out.println("Tyre name : "+t[r(i)].name+"\tTraction  : "+t[r(i)].traction);
	}
}
	
} 
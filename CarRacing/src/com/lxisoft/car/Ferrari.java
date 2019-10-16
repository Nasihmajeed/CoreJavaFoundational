package com.lxisoft.car;
import com.lxisoft.car.*;
public class Ferrari extends Car implements Sporty{
public Ferrari(String brand,int cc,int hp,String fuel,float traction){
	this.brand=brand;
	this.cc=cc;
	this.hp=hp;
	this.fuel=fuel;
	this.traction=traction;
      }	

public void carSpec(){
	System.out.println("\nBrand name - "+this.brand+"\nEngine - "+this.cc+"\n hp - "+this.hp+"\nFuel - "+this.fuel);
}
public float speed(){
	float pv=(bs*this.cc/1000*this.hp/100*this.traction/3)/10;
	//System.out.println("practical speed = "+pv);
	return pv;
}
}
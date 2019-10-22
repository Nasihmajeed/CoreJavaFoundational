package com.lxisoft.intern.files;
import java.util.Random;
public class Engine

{
 int cc;
 int engineNo;
 int power;
 String fuel;
 int normalspeed;
 public void setEngineDetails()
 {
 	Random rand = new Random();
 	this.cc = rand.nextInt(4)+1; 
 	this.engineNo = rand.nextInt(100)+1000;
 	this.power = rand.nextInt(9)+2;
    this.normalspeed = rand.nextInt(9)+1;
 	String [] fueltype = {"PETROL","DIESEL","GAS"};
 	int index = rand.nextInt(2)+1;
 	System.out.println("index : "+index);
    fuel = fueltype[index];	
        
 }
 public void getEngineDetails()
 {
 	System.out.println("cubic capacity   : "+cc);
 	System.out.println("Engine no        : "+engineNo);
 	System.out.println("Power of vehicle : "+power);
 	System.out.println("Fuel Type        : "+fuel);
 	System.out.println("Normal Speed     : "+normalspeed);

 }
}
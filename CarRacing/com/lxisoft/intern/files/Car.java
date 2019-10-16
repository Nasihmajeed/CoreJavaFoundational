package com.lxisoft.intern.files;
import java.util.*;
import java.io.*;
public  class Car extends Vehicle

{
	    ArrayList <Vehicle> vehiclelist = new ArrayList <Vehicle>();
        static BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        static Scanner in = new Scanner(System.in);
        
   public void createCar()
   {
   	    Vehicle a = new Dodge("       DODGE ","petrol",2,120,1000,"MRF",60);
        Vehicle b = new Lamborgini("\n      lamborgini","petrol",2,125,1001,"CEAT",68);
      	Vehicle c = new Bmwm3("\n       BMW M3","petrol",1,112,1025,"YOKOMO",58);
      	Vehicle d = new Benz("\n      BENZ","diesel", 2,120,1036,"BRIDGESTONE",50);
        Vehicle e = new Audi("\n      Audi ","petrol",1,118,1052,"APPOLO",59);
        Vehicle f = new Zen("\n      ZEN","petrol",1,80,1084,"MRF",35);
        Vehicle g = new Esteem("\n      ESTEEM","petrol",1,90,1096,"CEAT",41);
        Vehicle h = new Baleno("\n      BALENO","diesel",1,100,1045,"YOKOMO",39);
        Vehicle i = new Swift("\n      SWIFT","diesel", 1,100,1055,"BRIDGESTONE",42);
        Vehicle j = new Alto("\n      ALTO ","petrol",1,80,1152,"APPOLO",30);
           vehiclelist.add(a);
           vehiclelist.add(b);
           vehiclelist.add(c);
           vehiclelist.add(d);
           vehiclelist.add(e);
           vehiclelist.add(f);
           vehiclelist.add(g);
           vehiclelist.add(h);
           vehiclelist.add(i);
           vehiclelist.add(j);
           displayCarDetails();
           startRace();
   }     
   public void displayCarDetails()
   {
   	for(int i=0;i<vehiclelist.size();i++)
   	{
   		System.out.println(vehiclelist.get(i).getName()+"\nFuel type :"+vehiclelist.get(i).getFuel()+"\nPower    :"+vehiclelist.get(i).getPower()+"\nTyre brand:"+vehiclelist.get(i).getTyre());
  
    }
   }
   public void startRace()
   {double d=0; 
    for(int j=0;j<vehiclelist.size();j++)
    {
     d = (vehiclelist.get(j).getCc()*vehiclelist.get(j).getPower()*vehiclelist.get(j).getVelocity());
     System.out.println("\nTime Taken "+vehiclelist.get(j).getName()+" : "+d);
      if(d==17000.0)
      System.out.println("\t\t\t\t\tRANK 1:"+"\t\t\t\t\t\t\t\t"+vehiclelist.get(1).getName());
    if(d==14400.0)
       System.out.println("\t\t\t\t\tRANK 2:"+"\t\t\t\t\t\t"+vehiclelist.get(0).getName());
    } 
  
   }
}
package com.lxisoft.test;
import com.lxisoft.CarRace.*;

public class Tdd
{ 
 public static void main (String args[])
 {
   System.out.println("		............LXI CAR RACING............ \n	");
   
   Racetrack race = new Racetrack();
   
   Car[] cars =race.register();
   race.reset();
   
   race.ranklist();
   
    
 }
	
}
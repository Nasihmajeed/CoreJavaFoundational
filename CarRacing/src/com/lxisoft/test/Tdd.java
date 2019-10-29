package com.lxisoft.test;
import com.lxisoft.CarRace.*;
import java.util.Scanner;
public class Tdd
{ 
 public static void main (String args[])
 {
   System.out.println("		............*****LXI CAR RACING*****............ \n	");
   
   Racetrack race = new Racetrack();
   
   race.register();
   race.onmark();
   System.out.println("-----------enter the choice for Ranklisting---------\n 1 = Rank by Time \n 2 = Rank by Distance");
   int n;
   Scanner read = new Scanner(System.in);
   n=read.nextInt();
   switch(n)
   {
     case 1 : race.rankspeed(); break;
     case 2 : race.rankdistance();break;
     default : System.out.println("Invalid choice");
   }
   //race.rankspeed();
   //race.rankdistance();
   
 }
	
}
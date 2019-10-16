
package com.lxisoft.car.test;
import com.lxisoft.car.*;
public class Tdd{
public static void main(String[] args) {
	System.out.println("\n\n\t----------Formula 1----------");
   Track t=new Track();
	t.printCar(t.carSpecs());
	t.carRace(t.carSpecs());
}
}
package com.lxisoft.race.cars;
import com.lxisoft.race.cars.*;
import java.lang.*;
public class Track{
	Car[] c=new Car[10];
	int distance=1608;
public Car[] startCar(){
c[0]=new Hatchback("BMW \t ",2014,new Engine("Petrol",20141,3300,435));
c[1]=new Hatchback("Dodge\t",1969,new Engine("Diesel",20121,3400,420));
c[2]=new Hatchback("Ford\t ",1970,new Engine("Diesel",20321,3600,450));
c[3]=new Hatchback("GM \t\t  ",2012,new Engine("Petrol",20751,3500,430));
c[4]=new Hatchback("Benz\t ",2016,new Engine("Diesel",10141,3450,425));
c[5]=new Sedan("Toyota\t  ",2015,new Engine("Petrol",20151,3200,410));
c[6]=new Sedan("Bently\t  ",2015,new Engine("Petrol",20331,3350,430)); 
c[7]=new Sedan("RangeRover\t ",2015,new Engine("Petrol",20351,3300,415));
c[8]=new Sedan("Austion Martin",2015,new Engine("Petrol",20251,3250,405));
c[9]=new Sedan("Porche\t  ",2015,new Engine("Petrol",20151,3425,430));
return c;
}
public void printCars(Car[] c){
	System.out.println("\n\t\t---FORMULA 1---"); 

	for(int i=0;i<c.length;i++){
		System.out.println("\n\t---"+c[i].brand+" Ready to RACE-------");
		c[i].printCar();

	}
	raceCar();
	raceCar(distance);
		
     }
     public int r(int a){		
	int random=(int)(Math.random()*a);
	return random;
}


public void raceCar(){
	System.out.println("\n\t\t---RANK LIST [BY MAX SPEED]---"); 
	Car temp=null;
	for(int i=0;i<c.length;i++){
		 for(int j=i+1;j<c.length;j++){
					if((int)c[i].getPower()<(int)c[j].getPower()){
						temp=c[i];
						c[i]=c[j];
						c[j]=temp;
						}
					}
		
					System.out.println("Car Brand : "+c[i].brand+"\t"+"\t\t cc - "+c[i].e.cc+"\tCar Speed : "+(int)c[i].getPower()+" kmph");
	}

  }
 public void raceCar(double d){
	System.out.println("\n\t\t---RANK LIST [BY MIN TIME]---");
	Car temp=null;
	for(int i=0;i<c.length;i++){
		 for(int j=i+1;j<c.length;j++){
					if(this.distance/(int)c[i].getPower()<this.distance/(int)c[j].getPower()){
						temp=c[i];
						c[i]=c[j];
						c[j]=temp;
						}
					}
		
					System.out.println("Car Brand : "+c[i].brand+"\t"+"\t\t cc - "+c[i].e.cc+"\tTime Required : "+this.distance/c[i].getPower()+" Hr");
	}

  }
   
				
		}



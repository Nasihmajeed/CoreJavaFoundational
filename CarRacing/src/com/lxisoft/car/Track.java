package com.lxisoft.car ;
import com.lxisoft.car.* ;
import java.util.*;
import java.lang.*;
public class Track{
public Lambo l=new Lambo("Lamborgini",4500,700,"Disel",r(10)+2);
public Ferrari f=new Ferrari("Ferrari",4300,680,"Disel",r(10)+1);
public Bugatti b=new Bugatti("Bugatti",4400,650,"Disel",r(10)+1);
public Bmw bm=new Bmw("Bmw",4200,645,"Disel",r(10)+1);
public Audi a=new Audi("Audi",4100,640,"petro",r(10)+1);
public Skoda s=new Skoda("Skoda",3600,635,"Disel",r(10)+1);
public Luxus lux=new Luxus("Luxus",3900,630,"petrol",r(10)+1);
public Toyota t=new Toyota("Toyota",3800,625,"Disel",r(10)+1);
public Nissan n=new Nissan("Nissan",3850,620,"petrol",r(10)+1);
public Tata ta=new Tata("Tata",3000,600,"Disel",r(10)+1);

public int r(int a){
	int x=(int)(Math.random()*a);
	return x;
}
public Car[] carSpecs(){
	Car[] car=new Car[10];
	car[0]=l;
	car[1]=f;
	car[2]=b;
	car[3]=bm;
	car[4]=a;
	car[5]=s;
	car[6]=lux;
	car[7]=t;
	car[8]=n;
	car[9]=ta;
	return car;
}
public void printCar(Car[] car){
	for(int i=0;i<car.length;i++){
		System.out.println("\n\n\t-----------"+car[i].brand+"---------Ready to Race-------");
		car[i].carSpec();

		//car[i].speed();
		}


}
public void carRace(Car[] car){
	 System.out.println("\n\t\t---RANK LIST---");
			Car temp=null;
			for(int i=0;i<car.length;i++)
			{	 
				for(int j=i+1;j<car.length;j++){
					if(car[i].speed()<car[j].speed()){
						temp=car[i];
						car[i]=car[j];
						car[j]=temp;
						}
					}
					System.out.println("\n\t"+car[i].brand+"\tTop Speed = "+car[i].speed());
				}
				
		}

}















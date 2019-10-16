package com.Lxisoft.Animalgame;
import com.Lxisoft.Animalgame.*;
import java.lang.*;
public class Deer extends Animal implements Herbivores{
public Deer(int strg,String name){
	this.strg=strg;
	this.name=name;
	}
Position p=new Position();
int x=p.x;
int y=p.y;
public void print(){
	System.out.println("\n"+name);
	    }
public void eat(){
	System.out.println("\n Deer eat grass");
}
public int r(int a){		
	int r=(int)(Math.random()*a);
	return r;
}

public void escape(){
	int luck=r(10);
	if(luck<=5){
		System.out.println(this.strg/2);
	}
	else{
		System.out.println(this.name+" is runaway");
	}		 
 }

}
 
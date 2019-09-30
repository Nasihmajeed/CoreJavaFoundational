package com.Lxisoft.Animalgame;
import com.Lxisoft.Animalgame.*;
import java.lang.*;
public class Deer extends Animal implements Herbivores{
public Deer(int strg,String name,int x,int y){
	this.strg=strg;
	this.name=name;
	this.x=x;
	this.y=y;
	}
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
		System.out.println(this.name+" is dead");
	}
	else{
		System.out.println(this.name+" is runaway");
	}		 
 }
/*public void animalRange(){
	//int[][] range=new int[r(10)][r(10)];
	int x=r(10);
	int y=r(10);
    }*/
}
 
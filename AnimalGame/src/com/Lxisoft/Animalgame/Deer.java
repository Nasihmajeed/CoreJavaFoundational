package com.Lxisoft.Animalgame;
import com.Lxisoft.Animalgame.*;
public class Deer extends Animal implements Herbivores{
public Deer(int strg,String name){
	this.strg=strg;
	this.name=name;
	}
public void print(){
	System.out.println(""+name);
	    }
public void escape(){
	if(luck<=5){
		System.out.println(this.name+" is dead");
	}
	else{
		System.out.println(this.name+" is runaway");
	}		 
 }
}
 
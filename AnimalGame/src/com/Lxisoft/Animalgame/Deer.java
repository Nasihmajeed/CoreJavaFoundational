package com.Lxisoft.Animalgame;
import com.Lxisoft.Animalgame.Deer;
public class Deer extends Animal implements Carnivores{
public Deer(int strg,String name){
	this.strg=strg;
	this.name=name;
	}
public void print(){
	System.out.println(""+name);
	    }
public Animal escape(Animal anim){
	if(anim.strg<this.strg){
		return this;
	}
	else{
		return anim;
	}		 
 }
}
 
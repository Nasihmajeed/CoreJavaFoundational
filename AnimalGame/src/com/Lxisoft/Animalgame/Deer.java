package com.Lxisoft.Animalgame;
import com.Lxisoft.Animalgame.Deer;
public class Deer extends Animal{
public Deer(int strg,String name){
	this.strg=strg;
	this.name=name;
	}
public void print(){
	System.out.println(""+name);
	    }
public Animal fight(Animal anim){
	if(anim.strg<this.strg){
		//System.out.println(this.name" beat "+anim.name);
		return this;
	}
	else{
		//System.out.println(anim.name" beat "+this.name);
		return anim;
	}		 
 }
}
 
package com.Lxisoft.Animalgame;
import java.util.*;
public class Lion extends Animal{
public Lion(int strg,String name){
	this.strg=strg;
	this.name=name;
	}
public void print(){
	System.out.println(""+this.name);
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
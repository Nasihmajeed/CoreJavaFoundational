 package com.Lxisoft.Animalgame;
import com.Lxisoft.Animalgame.*;
public class Tiger extends Animal implements Carnivores{
public Tiger(int strg,String name){
	 this.strg=strg;
	 this.name=name;
	}
public void print(){
	System.out.println(""+name);
	    } 
public Animal fight(Animal anim){
	if(anim.strg<this.strg){ 
		return this;
	}
	else{
		return anim;
	 }		 
  }
}
    
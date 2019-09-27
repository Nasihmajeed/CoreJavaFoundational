package com.Lxisoft.Animalgame;
import java.util.*;
import com.Lxisoft.Animalgame.*;
public class Lion extends Animal implements Carnivores{
public Lion(int strg,String name){
	this.strg=strg;
	this.name=name;
	}
public void print(){
	System.out.println(""+this.name);
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
package com.Lxisoft.Animalgame;
import java.util.*;
import com.Lxisoft.Animalgame.*;
public class Lion extends Animal implements Carnivores{
public Lion(int strg,String name){
	this.strg=strg;
	this.name=name;
	}
Position p=new Position();
int x=p.x;
int y=p.y;
public void print(){
	System.out.println("\n"+this.name);
	} 
public void eat(){
	System.out.println("\n Lion eat meet");
}
public int r(int a){		
	int r=(int)(Math.random()*a);
	return r;
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

package com.Lxisoft.Animalgame;
import java.util.*;
import com.Lxisoft.Animalgame.*;
public class Lion extends Animal implements Carnivores{
public Lion(int strg,String name,int x,int y){
	this.strg=strg;
	this.name=name;
	this.x=x;
	this.y=y;
	}
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
/*public void animalRange(){
	int[][] range=new int[r(10)][r(10)];
	System.out.println(range);
int x=r(10);
int y=r(10);

    }*/
}

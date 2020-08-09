package com.lxisoft.forest;
public class  Lion extends Animal implements Carnivoros{
	public void printCarnivores(){
		System.out.println("CARNIVOROS");
	}
	
	public void eat(){
		System.out.println("Eat Enemy");
	}
	
}
package com.lxisoft.forest;
import java.util.Scanner;
import java.util.ArrayList;
public  class Animal {

	Scanner scanner=new Scanner(System.in);

	private String animalName;
	public void setAnimalName(String a){
		this.animalName=a;
	}

	public String getAnimalName(){
		return animalName;
	}

	private int animalStrength;
	public void setAnimalStrength(int a){
		this.animalStrength=a;
	}
	public int getAnimalStrength(){
		return animalStrength;
	}


	 public String animalType;
	 private void setAnimalNameTpe(String a){
	 	this.animalType=a;
	 }
	 public String getAnimalType(){
	 	return animalType;
	 }


	
}
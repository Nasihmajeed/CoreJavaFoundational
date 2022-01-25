package com.lxisoft.factors;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.*;
import java.lang.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.lxisoft.*;
import com.lxisoft.game.Animal;
import com.lxisoft.game.Forest;
public class FileRepository{


public File myObj = new File("Animal.csv");

	public void createFile() {
		try {
		
		if (myObj.createNewFile()) {
		  System.out.println("File created: " + myObj.getName());
		} else {
		  System.out.println(myObj.getName() + " File already exists.");
		}
   } catch (IOException e) {
		System.out.println("An error occurred.");
		e.printStackTrace();
   }



}
        

public void writeToFile(){
try {
	FileWriter writer = new FileWriter(myObj);
	writer.write("Bengal-Tiger 7 7 7 True ,Cutey-Rabbitr 7 7 7 True ,Little-Deer 7 7 7 True ,Cunning-Fox 7 7 7 True ,King-Lion 7 7 7 True ,Indian-Elephant 7 7 7 True ,Angry-LeoPard 7 7 7 True ,Hungry-Guar 7 7 7 True ,Lazy-Crocodile 7 7 7 True ,Indian-Rhinoceros 7 7 7 True ");

	writer.close();
	System.out.println("Data successfully Entered!");
} catch (IOException e) {
	System.out.println("An error occured.");
	e.printStackTrace();
}
}

public  List<Animal> readFile(){
	try {
		Scanner myReader = new Scanner(myObj);
		while(myReader.hasNextLine()){
			String line = myReader.nextLine();
			System.out.println(line);
			String[] arrOfStr = line.split(",");
			
			String type = arrOfStr[0];//create name: lion, 5
        Constructor<?> constructor = Class.forName("com.lxisoft.animals."+type).getConstructor(String.class, Integer.TYPE,Integer.TYPE,Integer.TYPE,Boolean.TYPE);
        Object o = constructor.newInstance(arrOfStr[1],Integer.parseInt(arrOfStr[2]) ,Integer.parseInt(arrOfStr[3]) ,Integer.parseInt(arrOfStr[4]) ,Boolean.parseBoolean(arrOfStr[5]));
		
        System.out.println(o);
			
			//System.out.println(arrOfStr.length);
			//System.out.println(arrOfStr);
			Animal c = (Animal) o;
			List<Animal> animals = new ArrayList<>();
			animals.add(c);
			
			//System.out.println(animals);
			return animals;
		
		}
		myReader.close();
	} catch (FileNotFoundException e) {
		System.out.println("An error occured.");
		e.printStackTrace();
	}
	catch (ClassNotFoundException ex){
		System.out.println("you have an error");
		System.out.println(ex);
	}
	catch (NoSuchMethodException exp){
		System.out.println("exception occured!");
		System.out.println(exp);
	}
	catch (InvocationTargetException expt){
		System.out.println(expt);
	}
	catch (InstantiationException expti){
		System.out.println(expti);
	}
	catch (IllegalAccessException exc){
		System.out.println(exc);
	}
	catch (IllegalArgumentException excp){
		System.out.println("IllegalArgumentException occured.");
		System.out.println(excp);
	}
	return null;
}


public void showFileInfo(){
	if(myObj.exists()){
		System.out.println("File Name : " +myObj.getName() );
		System.out.println("Absolute Path : " + myObj.getAbsolutePath());
		System.out.println("Writeable : " + myObj.canWrite());
		System.out.println("Readable : " + myObj.canRead());
	}else{
		System.out.println("File doesn't exist");
	}
}







}



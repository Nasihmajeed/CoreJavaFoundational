package com.lxisoft.factors;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.*;
import java.lang.*;
import com.lxisoft.*;
import com.lxisoft.game.Forest;

import java.util.List;
import java.util.ArrayList;
public class FileRepository{


	File myObj = new File("Animal.csv");

	public void createFile() {
		try {
		
		if (myObj.createNewFile()) {
		  System.out.println("File created: " + myObj.getName());
		} else {
		  System.out.println(" File already exists.");
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

public void readFile(){
	try {
		Scanner myReader = new Scanner(myObj);
		while(myReader.hasNextLine()){
			String line = myReader.nextLine();
			//System.out.println(line);
			String[] arrOfStr = line.split(",", 10);
 
        for (String a : arrOfStr)
            System.out.println(a);
			
		}
		myReader.close();
	} catch (FileNotFoundException e) {
		System.out.println("An error occured.");
		e.printStackTrace();
	}
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



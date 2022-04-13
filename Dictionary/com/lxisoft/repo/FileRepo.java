package com.lxisoft.repo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lxisoft.dictionary.Words;

public class FileRepo {
     
     public  File myObj = new File("com/resources/Words.csv");

     public void createFile() {
	
		try {
		
		if (myObj.createNewFile()) {
		  System.out.println("File created : " + myObj.getName());
		} else {
		  System.out.println(myObj.getName() + "File already exists .");
		}
   } catch (IOException e) {
		System.out.println(" An error occurred in file creation!!. ");
		e.printStackTrace();
   }
   }



   public  List<Words> readFile(){
	
	List<Words> wordsList = new ArrayList<>();
	try {
		Scanner myReader = new Scanner(myObj);
		while(myReader.hasNextLine()){
			String line = myReader.nextLine();
	
			String[] arrOfStr = line.split(",");
			
			String type = arrOfStr[0];
        Constructor<?> constructor = Class.forName("com.lxisoft.words."+type).getConstructor(String.class, String.class,String.class,String.class);
        Object object = constructor.newInstance(arrOfStr[1],arrOfStr[2] ,arrOfStr[3] ,arrOfStr[4]);

			Words word = (Words) object;
			
			wordsList.add(word);

		}
		myReader.close();
	} catch (FileNotFoundException e) {
		System.out.println(" An error occurred in file. ");
		e.printStackTrace();
	}
	catch (ClassNotFoundException ex){
		System.out.println("you have an error ,please cheack it!");
		System.out.println(ex);
	}
	catch (NoSuchMethodException exp){
		System.out.println("exception occured! ");
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

return wordsList;
}






}

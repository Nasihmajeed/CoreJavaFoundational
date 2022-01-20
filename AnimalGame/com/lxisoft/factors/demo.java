package com.lxisoft.factors;

import java.io.*;
import java.io.FileReader; 
import java.util.Scanner;
import com.lxisoft.game.Forest;
import java.io.Writer; 
import com.lxisoft.game.*;
import com.opencsv.CSVWriter;
import java.util.List;
import java.util.ArrayList;
public class FileRepository {
public void createFile(){
	File file = new File("output.csv");
	try {
	file.createNewFile();	
	System.out.println("file created.");
	} catch (Exception e) {
		System.out.println(e);
	}

}
public void writer(){
	//Instantiating the CSVWriter class
	
	
	CSVWriter writer = new CSVWriter(new FileWriter("output.csv"));
	//Writing data to a csv file
	String line1[] = {"id", "name", "salary", "start_date", "dept"};
	String line2[] = {"1", "Krishna", "2548", "2012-01-01", "IT"};
	String line3[] = {"2", "Vishnu", "4522", "2013-02-26", "Operations"};
	String line4[] = {"3", "Raja", "3021", "2016-10-10", "HR"};
	String line5[] = {"4", "Raghav", "6988", "2012-01-01", "IT"};
	//Instantiating the List Object
	List list = new ArrayList();
	list.add(line1);
	list.add(line2);
	list.add(line3);
	list.add(line4);
	list.add(line5);
	//Writing data to the csv file
	writer.writeAll(list);
	writer.flush();
	System.out.println("Data entered");

 }

}














"Bengal-Tiger",7,7,7,True
",7,7,7,True
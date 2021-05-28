package com.lxisoft.scripts;

import java.io.*;
import java.util.*;

import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

import com.lxisoft.cast.*;


public class Script
{
	
final String romance="E:\\MovieScriptProject\\src\\com\\lxisoft\\scripts\\RomanticScr.txt";
final String emotional= "E:\\MovieScriptProject\\src\\com\\lxisoft\\scripts\\EmotionalScr.txt";
final String comedy= "E:\\MovieScriptProject\\src\\com\\lxisoft\\scripts\\ComedyScr.txt";

Actors act=new Actors();


int n;    //line number
String line;

public void selectScript(int genre)
{
	switch(genre)
	{



		
		RandomAccessFile raf = new RandomAccessFile("file.txt","r"); 
		
    //above 'r' means open in read only mode
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
	
    String cur_line = "";
	
    while((cur_line=raf.readLine())!=null)
    {
    arrayList.add(raf.getFilePointer());
    }
	
    //Print the 32 line
    //Seeks the file to the particular location from where our '32' line starts
    raf.seek(raf.seek(arrayList.get(8)));
	
    System.out.println(raf.readLine());
	
    raf.close();
	
	}
}
		
}

       //Method-1

try (BufferedReader reader = Files.newBufferedReader(
        Paths.get("file.txt"), StandardCharsets.UTF_8)) {
    List<String> line = reader.lines()
                              .skip(31)
                              .limit(1)
                              .collect(Collectors.toList());

    line.stream().forEach(System.out::println);
}


     // Method-2

RandomAccessFile raf = new RandomAccessFile("myFile.txt","r"); 
    //above 'r' means open in read only mode
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    String cur_line = "";
    while((cur_line=raf.readLine())!=null)
    {
    arrayList.add(raf.getFilePointer());
    }
    //Print the 32 line
    //Seeks the file to the particular location from where our '32' line starts
    raf.seek(raf.seek(arrayList.get(31));
    System.out.println(raf.readLine());
    raf.close();
	
	
	
	//To read a specific line
	
	import java.nio.file.Files;

import java.nio.file.Paths;

public class FileWork 
{

    public static void main(String[] args) throws IOException {

        String line = Files.readAllLines(Paths.get("D:/abc.txt")).get(1);

        System.out.println(line);  
    }

}



//you can use the skip() function to skip the lines from begining.

public static void readFile(String filePath, long lineNum) {
    List<String> list = new ArrayList<>();
    long totalLines, startLine = 0;

    try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
        totalLines = Files.lines(Paths.get(filePath)).count();
        startLine = totalLines - lineNum;
        // Stream<String> line32 = lines.skip(((startLine)+1));

        list = lines.skip(startLine).collect(Collectors.toList());
        // lines.forEach(list::add);
    } catch (IOException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
    }

    list.forEach(System.out::println);

}






}
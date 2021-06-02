//you can use the skip() function to skip the lines from begining.

import java.io.*;
import java.nio.*;
import java .util.*;

public class F3{
public static void main(String[] args){


public static void readFile(String filePath, long lineNum) {
    
	List<String> list = new ArrayList<>();
    
	long totalLines, startLine = 0;

    try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
		
        totalLines = Files.lines(Paths.get(filePath)).count();
		
        startLine = totalLines - lineNum;
        // Stream<String> line32 = lines.skip(((startLine)+1));

        list = lines.skip(startLine).collect(Collectors.toList());
        // lines.forEach(list::add);
    } 
	catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    list.forEach(System.out::println);

}	
	
}


		
}
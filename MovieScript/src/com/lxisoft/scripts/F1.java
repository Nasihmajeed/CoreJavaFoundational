import java.io.*;
import java.util.*;

import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

//Reading from the file using RandomAccessFile Class

public class F1
{
	public static void main(String[] args)
	{
		try{
		RandomAccessFile raf = new RandomAccessFile("E:\\rough folder\\file.txt","r"); 	
		
		 //above 'r' means open in read only mode
    ArrayList<Long> arrayList = new ArrayList<Long>();
	
    String cur_line = "";
	
    while((cur_line=raf.readLine())!=null)
    {
    arrayList.add(raf.getFilePointer());
    }
	
    //Print the 8th line
    //Seeks the file to the particular location from where our '8th' line starts
    raf.seek((arrayList.get(8)));
	
    System.out.println(raf.readLine());
	
    raf.close();
		}
		
		catch(IOException e)
		{		 
	    e.printStackTrace();
		}
		
    
	 }
}
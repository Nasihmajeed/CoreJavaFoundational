import java.io.*;
import java.util.*;

import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class F
{
	public static void main()
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
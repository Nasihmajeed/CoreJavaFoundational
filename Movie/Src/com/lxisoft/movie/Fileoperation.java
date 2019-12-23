package com.lxisoft.movie;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Fileoperation
{
	public String[] operation()
	{
		 String[] data=null;
		String[] csvFile ={"../version..2/com/lxisoft/movie/Hero.csv","../version..2/com/lxisoft/movie/Comedian.csv","../version..2/com/lxisoft/movie/Villain.csv","../version..2/com/lxisoft/movie/Heroin.csv"};
        String line = "";
       try{
       	for (int i=0;i<1;i++)
       	{
          BufferedReader br = new BufferedReader(new FileReader(csvFile[i]));
          
            while ((line = br.readLine()) != null) 
            {
                data = line.split(",");
               
            }
             System.out.println(data[i]);
        }
           }
    		catch (FileNotFoundException e)
          	{
            	e.printStackTrace();
        	} 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        return data;      
	}
}

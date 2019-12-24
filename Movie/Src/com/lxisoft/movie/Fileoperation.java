package com.lxisoft.movie;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Fileoperation
{
	public String operation(int randdialogue)
	{
		 String[] data=new String[10];
		String[] csvFile ={"../version..2/com/lxisoft/movie/Hero.csv","../version..2/com/lxisoft/movie/Comedian.csv","../version..2/com/lxisoft/movie/Villain.csv","../version..2/com/lxisoft/movie/Heroin.csv"};
        String line = "";
       try{
	       	
	          BufferedReader br = new BufferedReader(new FileReader(csvFile[randdialogue]));
	          int i=0;
	            while ((line = br.readLine()) != null) 
	            {
	               String[] datas= line.split(","); 
	              data[i++]=datas[0];
	              
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
        return data[randdialogue];      
	}
}

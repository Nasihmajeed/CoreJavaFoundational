package com.lxisoft.movie;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Fileoperation
{
	public void operation()
	{
		String csvFile = "../version..2/com/lxisoft/movie/Dialogue.csv";
        String line = "";
       try{

          BufferedReader br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) 
            {
                String[] data = line.split(",");
                System.out.println(data[0]+":"+data[1]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }       
	}
}
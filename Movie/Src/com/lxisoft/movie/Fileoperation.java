package com.lxisoft.movie;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Fileoperation
{
	public void operation()
	{
		String[] csvFile ={"../version..2/com/lxisoft/movie/Hero.csv","../version..2/com/lxisoft/movie/Comedian.csv","../version..2/com/lxisoft/movie/Villain.csv","../version..2/com/lxisoft/movie/Heroin.csv"};
        String line = "";
       try{
       	for (int i=0;i<csvFile.length;i++) 
       	{
       		
          BufferedReader br = new BufferedReader(new FileReader(csvFile[i]));
            while ((line = br.readLine()) != null) 
            {
                String[] data = line.split(",");
                System.out.println(data[0]+":"+data[1]);
            }
        }
          } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }       
	}
}
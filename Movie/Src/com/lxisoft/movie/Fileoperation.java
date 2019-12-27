package com.lxisoft.movie;
import java.io.BufferedReader;
import java.io.*;
import java.util.*;

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
	public void writeIntoFile()
	{
        String[] csvFile ={"../version..2/com/lxisoft/movie/Hero.csv","../version..2/com/lxisoft/movie/Comedian.csv","../version..2/com/lxisoft/movie/Villain.csv","../version..2/com/lxisoft/movie/Heroin.csv"};
        FileWriter fr = null;
        BufferedWriter br = null;

        Scanner scr=new Scanner(System.in);
		System.out.println("select the actor \n 1 : Hero \n 2 : Villain \n 3 : Heroin \n 4 : Comedian");
        int number=scr.nextInt();

		System.out.println("No of dialogue");
		int noOfLines=scr.nextInt();

		String[] dialogues=new String[noOfLines+1];
		for (int i=0;i<noOfLines;i++) 
		{
			System.out.println("Dialogue :"+i);
			 dialogues[i]=scr.next();
		}

        System.out.println("");

        try{
            fr = new FileWriter(csvFile[--number],true);
            br = new BufferedWriter(fr);
            
            for(int i = noOfLines,j=0; i>0; i--,j++)
            {
            	System.out.println(dialogues[j]);
                br.write(dialogues[j]+",");
            }
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            try 
            {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            
        }
    }
}
}

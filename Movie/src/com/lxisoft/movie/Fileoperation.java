package com.lxisoft.movie;
import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class Fileoperation
{
    String[] datas;
	public String operation(int actordia)
	{
		String[] data=new String[10];
        String line = "";
       try{
	       	   //String csvFile = "../version..2/com/lxisoft/movie/Dialogue.csv";
               String[] csvFile ={"../version..2/com/lxisoft/movie/Hero.csv","../version..2/com/lxisoft/movie/Comedian.csv","../version..2/com/lxisoft/movie/Villain.csv","../version..2/com/lxisoft/movie/Heroin.csv"};
            for (int i=0;i<csvFile.length;i++) 
            {
    	       BufferedReader br = new BufferedReader(new FileReader(csvFile[actordia]));
    	       
	           while ((line = br.readLine()) != null)
	           {

                 
    	         datas = line.split(","); 
                  
    	               /*data[i++]=datas[1];*/
                   
	           }
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
        
        int randVar=(int)(Math.random()*4);
        return datas[randVar];     
	}
	public void writeIntoFile()
    {
       
        String csvFile="../version..2/com/lxisoft/movie/Dialogue.csv";
        String line = "";   
        FileWriter fr = null;
        BufferedWriter br = null;
        Scanner scr=new Scanner(System.in);
        System.out.println("select the actor \n 1 : Hero \n 2 : Comedian \n 3 : Villain \n 4 : Heroin \n 5 : Dialogue");
        int number=scr.nextInt();

        ArrayList<String>actordia=new ArrayList<String>();
        actordia.add("Hero");
        actordia.add("Comedian");
        actordia.add("Villain");
        actordia.add("Heroin");
        actordia.add("Dialogue");

        System.out.println("No of dialogue");
        int noOfLines=scr.nextInt();

        String[] dialogues=new String[noOfLines+1];
        String[] data=new String[10];
        for (int i=0;i<noOfLines;i++) 
        {
            System.out.println("Dialogue :"+(i+1));
            dialogues[i]=scr.next();
            
        }
        try{
            fr = new FileWriter(csvFile,true);
            br = new BufferedWriter(fr);
                
            for (int i=0;i<noOfLines ;i++) 
            {     
                br.write(actordia.get(--number)+","+dialogues[i]+"\n");    
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
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }   
        }
    }
    public void editDialogue()
    {
        
        Scanner scr=new Scanner(System.in);
        System.out.println("select the actor \n 1 : Hero \n 2 : Comedian \n 3 : Villain \n 4 : Heroin \n 5 : Dialogue");
        int number=scr.nextInt();
        
        ArrayList<String>actordia=new ArrayList<String>();
        actordia.add("Hero");
        actordia.add("Comedian");
        actordia.add("Villain");
        actordia.add("Heroin");
        actordia.add("Dialogue");

        String[] data=new String[10];
        String line = "";
       try{
               String csvFile = "../version..2/com/lxisoft/movie/Dialogue.csv";
               BufferedReader br = new BufferedReader(new FileReader(csvFile));
               int i=0;
               while ((line = br.readLine()) != null)
               { 
                   String[] datas= line.split(","); 
                   if(actordia.equals(datas[0]))
                   {
                       data[i++]=datas[1];
                       System.out.println(data[i]);
                   }
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
        } 
}
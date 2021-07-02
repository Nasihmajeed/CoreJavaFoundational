package com.lxisoft.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class SceneSetting 
{
    int i=0;
    
    public void printComedyScene()
    {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("J:\\Work\\CoreJava\\CoreJavaFoundational\\MovieScript\\MovieScript\\src\\com\\lxisoft\\repository\\comedyScenes.csv"));
            String s;
            while((s = reader.readLine()) !=null)
            {
                System.out.print("\n");
                this.slowprint(s, 10);
            }
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public void printRomanticScene()
    {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("J:\\Work\\CoreJava\\CoreJavaFoundational\\MovieScript\\MovieScript\\src\\com\\lxisoft\\repository\\romanticScenes.csv"));
            String s;
            while((s = reader.readLine()) !=null)
            {
                System.out.print("\n");
                this.slowprint(s, 10);
            }
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public void printThrillerScene()
    {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("J:\\Work\\CoreJava\\CoreJavaFoundational\\MovieScript\\MovieScript\\src\\com\\lxisoft\\repository\\thrillerScenes.csv"));
            String s;
            while((s = reader.readLine()) !=null)
            {
                System.out.print("\n");
                this.slowprint(s, 10);
            }
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void printEmotionalScene()
    {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("J:\\Work\\CoreJava\\CoreJavaFoundational\\MovieScript\\MovieScript\\src\\com\\lxisoft\\repository\\emotionalScenes.csv"));
            String s;
            while((s = reader.readLine()) !=null)
            {
                System.out.print("\n");
                this.slowprint(s, 10);
            }
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public String slowprint(String scene,long delay)
    {
		for(int i=0; i<scene.length();i++)
        {
		    System.out.print(scene.charAt(i)); 
			try
            {
				Thread.sleep(delay);
			}
			catch(InterruptedException e)
            {
				e.printStackTrace();
			}
		}
		return scene;
	}
}

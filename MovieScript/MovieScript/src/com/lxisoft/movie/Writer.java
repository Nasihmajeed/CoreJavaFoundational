package com.lxisoft.movie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Writer 
{
    public void printComedyScene()
    {
        System.out.print("\n\n>> Comedy Scene <<\n\n");
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("J:\\Work\\CoreJava\\CoreJavaFoundational\\MovieScript\\MovieScript\\src\\com\\lxisoft\\story\\script\\comedyScenes.csv"));
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
        System.out.print("\n\n>> Romantic Scene <<\n\n");
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("J:\\Work\\CoreJava\\CoreJavaFoundational\\MovieScript\\MovieScript\\src\\com\\lxisoft\\story\\script\\romanticScenes.csv"));
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
        System.out.print("\n\n>> Thriller Scene <<\n\n");
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("J:\\Work\\CoreJava\\CoreJavaFoundational\\MovieScript\\MovieScript\\src\\com\\lxisoft\\story\\script\\thrillerScenes.csv"));
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
        System.out.print("\n\n>> Emotional Scene <<\n\n");
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("J:\\Work\\CoreJava\\CoreJavaFoundational\\MovieScript\\MovieScript\\src\\com\\lxisoft\\story\\script\\emotionalScenes.csv"));
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

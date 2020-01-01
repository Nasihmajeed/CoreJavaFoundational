package com.lxisoft.movie;
import java.util.ArrayList;
import java.io.File;
public class Movie 
{
	String name="dark knight";
	String director = "christopher nolan";
	String producer = "warner bros";
	Script script=new Script();
	public ArrayList<Actor> actor=new ArrayList<Actor>();

	public void display()
	{
		System.out.println("movie name : "+name+"\ndirector : "+director+"\nproducer : "+producer);
		System.out.println("**************************************");
		System.out.println("scene no 1\n-----------");
		fileCreation();
		conversation();
		
	}
	public void fileCreation()
	{
		File villan=new File("D:\\lxi\\java\\my Git\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\villanDialogue.txt");
		File comedian=new File("D:\\lxi\\java\\my Git\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\comedianDialogue.txt");	
		if(villan.exists())
		{
			System.out.println("file"+villan.getName()+"already exixts");
		}
		
		if(comedian.exists())
		{
			System.out.println("file"+comedian.getName()+"already exixts");
		
		}
	
		script.comedianDialogue();
		script.villanDialogue();
		script.writeToFile(villan,script.v.villan);
		script.writeToFile(comedian,script.c.comedian);
		ArrayList<Dialogue> readArray1= script.readFromFile(villan);
		ArrayList<Dialogue> readArray2= script.readFromFile(comedian);
		for(Dialogue d1: readArray1)
		{
			System.out.println(d1.dialogue);
		}
		for(Dialogue d2: readArray2)
		{
			System.out.println(d2.dialogue);
		}

	}
	public void conversation()
	{
		int size1=(script.c.comedian.size());
		int size2=(script.v.villan.size());
		for (int i=0;i<size1;i++)
		{
			actor.add(new Comedian());
		}
		for (int i=0;i<size2;i++)
		{
			actor.add(new Villan());
		}
		

	}
}
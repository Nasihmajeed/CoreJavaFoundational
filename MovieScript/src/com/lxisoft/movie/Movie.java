package com.lxisoft.movie;
import java.util.ArrayList;
import java.io.File;
public class Movie 
{
	String name="dark knight";
	String director = "christopher nolan";
	String producer = "warner bros";
	Script script=new Script();

	public void display()
	{
		System.out.println("movie name : "+name+"\ndirector : "+director+"\nproducer : "+producer);
		System.out.println("**************************************");
		System.out.println("scene no 1\n-----------");
		fileCreation();
		
	}
	public void fileCreation()
	{
		File villan=new File("D:\\lxi\\java\\my Git\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\villanDialogue.txt");
		File comedian=new File("D:\\lxi\\java\\my Git\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\comedianDialogue.txt");
		script.comedianDialogue();
		script.villanDialogue();
		script.writeToFile(villan,script.villan);
		script.writeToFile(comedian,script.comedian);
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

}
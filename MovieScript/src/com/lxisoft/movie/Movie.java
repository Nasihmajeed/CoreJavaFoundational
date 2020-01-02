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
		
		
	}
	public void fileCreation()
	{
		File villan=new File("D:\\lxi\\java\\my Git\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\villanDialogue.txt");
		File comedian=new File("D:\\lxi\\java\\my Git\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\comedianDialogue.txt");	
		if(villan.exists())
		{
			System.out.println("file "+villan.getName()+" already exixts");
		}
		
		if(comedian.exists())
		{
			System.out.println("file "+comedian.getName()+" already exixts");
		
		}
	
		script.comedianDialogue();
		script.villanDialogue();
		script.writeToFile(villan,script.v.villan);
		script.writeToFile(comedian,script.c.comedian);
		conversation(villan,comedian);
	}
	public void conversation(File a,File b)
	{
		int size1=(script.c.comedian.size());
		int size2=(script.v.villan.size());
		int size3=(script.c.comedian.size())+(script.v.villan.size());
		for (int i=0;i<size1;i++)
		{
			actor.add(new Comedian());
		}
		for (int i=0;i<size2;i++)
		{
			actor.add(new Villan());
		}
		ArrayList<Dialogue> readArray1= script.readFromFile(b);
		ArrayList<Dialogue> readArray2= script.readFromFile(a);
		for (int i=0;i<size1;i++)
		{

		int random1=(int) (Math.random()*actor.size());
		if(actor.get(random1)instanceof Comedy)
		{
			
			int comedianRandom=(int) (Math.random()*readArray1.size());
			System.out.println("comedian : "+readArray1.get(comedianRandom).dialogue);
			System.out.println("villan : "+readArray2.get(comedianRandom).dialogue);
		}
		else if(actor.get(random1)instanceof Villanism)
		{
			int villanRandom=(int) (Math.random()*readArray2.size());
			System.out.println("villan : "+readArray2.get(villanRandom).dialogue);
			System.out.println("comedian : "+readArray1.get(villanRandom).dialogue);
		}

	}}
}
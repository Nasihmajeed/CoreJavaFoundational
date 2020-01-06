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
		File villanQns=new File("D:\\lxi\\java\\my Git\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\villanQns.txt");
		File comedianQns=new File("D:\\lxi\\java\\my Git\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\comedianQns.txt");
		File villanAns=new File("D:\\lxi\\java\\my Git\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\villanAns.txt");
		File comedianAns=new File("D:\\lxi\\java\\my Git\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\file\\comedianAns.txt");	
		 if(villanAns.exists()&&villanQns.exists()&&comedianAns.exists()&&comedianQns.exists())
		 {
		 	conversation(villanQns,comedianQns,villanAns,comedianAns);
		 }
		 else {
		
		script.comedianDialogue();
		script.villanDialogue();
		ArrayList<Dialogue> random1=commonDialogue();
		 for(int i=0;i<random1.size();i++)
			{
		int random2=(int)(Math.random()*random1.size());
		System.out.println("comedian : "+ random1.get(random2).dialogue);
		System.out.println("villan : "+ random1.get(random2).dialogue);
			}}
		// script.writeToFile(villanQns,script.v.villanQns);
		// script.writeToFile(comedianQns,script.c.comedianQns);
		// script.writeToFile(villanAns,script.v.villanAns);
		// script.writeToFile(comedianAns,script.c.comedianAns);
		// conversation(villanQns,comedianQns,villanAns,comedianAns);

	}
	public void conversation(File a,File b,File c,File d)
	{
		// int size1=(script.c.comedian.size());
		// int size2=(script.v.villan.size());
		// int size3=(script.c.comedian.size())+(script.v.villan.size());
		actor.add(new Comedian());
		actor.add(new Villan());
		ArrayList<Dialogue> readArray1= script.readFromFile(b);
		ArrayList<Dialogue> readArray2= script.readFromFile(a);
		ArrayList<Dialogue> readArray3= script.readFromFile(c);
		ArrayList<Dialogue> readArray4= script.readFromFile(d);
		// System.out.println("readArray1.size() : "+readArray1.size());
		// System.out.println("readArray2.size() : "+readArray2.size());
		// System.out.println("readArray3.size() : "+readArray3.size());
		// System.out.println("readArray4.size() : "+readArray4.size());
		int x=readArray1.size()+readArray4.size();
		while(x>0)
		{
	
		int random1=(int) (Math.random()*actor.size());
		if(actor.get(random1)instanceof Comedy)
		{
			
			int comedianRandom=(int) (Math.random()*readArray1.size());
			if(readArray1.get(comedianRandom).same==true)
			{
			System.out.println("comedian : "+readArray1.get(comedianRandom).dialogue);
			System.out.println("villan : "+readArray3.get(comedianRandom).dialogue);
			readArray1.get(comedianRandom).same=false;
			x--;
			}
			try
 			{
 				if(readArray1.get(comedianRandom).same!=true)
 				{
 					MyEx ex=new MyEx(" same dialogue exception");
 					throw ex;
 				}}
 				catch(MyEx e)
 				{
 					e.printStackTrace();
 				}
		}
		else if(actor.get(random1)instanceof Villanism)
		{
			int villanRandom=(int) (Math.random()*readArray2.size());
			if(readArray2.get(villanRandom).same==true)
			{
			System.out.println("villan : "+readArray2.get(villanRandom).dialogue);
			System.out.println("comedian : "+readArray4.get(villanRandom).dialogue);
			readArray2.get(villanRandom).same=false;
			x--;
		}
		}

	}}
	public ArrayList<Dialogue> commonDialogue()
	{
	  ArrayList<Dialogue> commonD =new ArrayList<Dialogue>();
		for(int i=0;i<4;i++)
		{
		commonD.add(new Dialogue());
		}
			commonD.get(0).dialogue="hai";
			commonD.get(1).dialogue="hello";
			commonD.get(2).dialogue="how are you?";
			commonD.get(3).dialogue="i am fine";
			return commonD;

	}
}
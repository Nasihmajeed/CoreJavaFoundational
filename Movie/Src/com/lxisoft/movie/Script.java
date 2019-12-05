package com.lxisoft.movie;
import com.lxisoft.movie.Script;
public class Script
{	
	String[] cdialouge;
	String[] vdialouge;
	public String[] setdialouge1()
	{ 
		cdialouge=new String[2];
		
		String dialouge1="Play for winnig not for begining";
		cdialouge[0]=dialouge1;
		String dialouge2="shut up thanos you die";
		cdialouge[1]=dialouge2;
		return cdialouge;
	}
	public String[] setdialouge2()
	{
		vdialouge=new String[2];
		String dialouge3="I just want to help you";
		vdialouge[0]=dialouge3;
		String dialouge4="ill kill you insect";
		vdialouge[1]=dialouge4;
		return vdialouge;
	}
}

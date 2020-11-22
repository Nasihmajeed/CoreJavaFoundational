package com.Lxisoft.LibraryApp;
import com.Lxisoft.LibraryApp.*;


public class Book 
{
	private String name;
	private String author;
	private int code;
	private String publishers;
	private String genere;
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;

	}

	public void setAuthor(String author)
	{
		this.author = author;
	}
	public String getAuthor()
	{
		return author;
	}


	public void setCode(int code)
	{
		this.code = code;
	}
	public int getCode()
	{
		return code;
	}


	public void setPublishers(String publishers)
	{
		this.publishers = publishers;
	}
	public String getPublishers()
	{
		return publishers;
	}


	public void setGenere(String genere)
	{
		this.genere=genere;
	}
	public String getGenere()
	{
		return genere;
	}
	 /*public void dispalyDetails( ArrayList<Book> books)
	 {	
	 	
	 	for(int i=0; i<books.size(); i++)
	 	{
	 		if (books.get(i).getGenere(i) .equals("novel") )
	 		{
	 			details.displayNovelDetails();
	 		}
	 		else if(books.get(i).getGenere(i) .equals("science"))
	 		{
	 			details.displayScienceDetails();		
	 		}
	 		else if(books.get(i).getGenere(i) .equals("magazine"))
	 		{
	 			details.displayMagazineDetails();		
	 		}
	 	
	 	else
	 	{
	 		System.out.println("");
	 	}*/
	}
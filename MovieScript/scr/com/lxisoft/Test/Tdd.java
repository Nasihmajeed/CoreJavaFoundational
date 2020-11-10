package com.lxisoft.Test;    
import com.lxisoft.Movie.Movie;
import java.io.File;
import java.io.IOException;
public class Tdd
{
	public static void main(String[] arg)
	{
		Movie movie = new Movie();
		movie.movieDetails();
		movie.playList();
		File file = new File("D:\\program\\java\\CoreJavaFoundational\\MovieScript\\scr\\com\\lxisoft\\File\\file.txt");
		try
		{
			if(file.createNewFile())
			{
				System.out.print("file go created");
			}
			else
			{
				System.out.print("file not created");
			}
		}
			catch(IOException e)
			{
				e.printStackTrace();
			}
	}
}

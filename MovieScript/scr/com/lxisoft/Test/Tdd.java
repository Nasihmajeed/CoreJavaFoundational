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
				System.out.print("\n file got created ");
			}
			else
			{
				System.out.print("\n file got created ");
			}
		}
			catch(IOException e)
			{
				e.printStackTrace();
			}
	}
}

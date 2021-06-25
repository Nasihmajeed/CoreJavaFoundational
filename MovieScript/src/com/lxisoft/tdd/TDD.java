package com.lxisoft.tdd;

import com.lxisoft.movie.*;
import com.lxisoft.cast.*;
import com.lxisoft.direction.*;
import com.lxisoft.scripts.*;

public class TDD
{
public static void main(String[] args)
{

Movie movie=new Movie();
Script scr=new Script();

movie.movieTitle();
movie.begin();


if(movie.getMovieGenre().equals("Romantic"))
{
scr.startMovie(1);	
}

else if(movie.getMovieGenre().equals("Emotional"))
{
scr.startMovie(2);	
}

else if(movie.getMovieGenre().equals("Comedy"))
{
scr.startMovie(3);	
}

else if(movie.getMovieGenre().equals("Action"))
{
scr.startMovie(4);	
}


movie.getMovieDetails();

}
}

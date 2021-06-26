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
Script script=new Script();

movie.movieTitle();
movie.setMovieDetails();
script.receiveAndPrintDetailsOfCharacters();

if(movie.getMovieGenre().equals("Romantic"))
{
script.startMovie(1);	
}

else if(movie.getMovieGenre().equals("Emotional"))
{
script.startMovie(2);	
}

else if(movie.getMovieGenre().equals("Comedy"))
{
script.startMovie(3);	
}

else if(movie.getMovieGenre().equals("Action"))
{
script.startMovie(4);	
}


}
}

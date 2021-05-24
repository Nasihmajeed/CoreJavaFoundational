package com.lxisoft.movie;

import java.util.*;

public class Rating
{
	
	Random rand=new Random();
	
	Float imdb;
	
	
	
	public void setRating(Float rating)
	{
		imdb=7+rand.nextFloat();
	}
	
	
	
	public Float getRating()
	{
		return imdb;
	}
}
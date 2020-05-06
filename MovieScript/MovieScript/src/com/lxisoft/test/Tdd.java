package com.lxisoft.test;

import com.lxisoft.movie.MovieHouse;
import com.lxisoft.movie.MyEx;

public class Tdd {

	public static void main(String[] args) {
		MovieHouse mh = new MovieHouse ();
		try {
			mh.start();
		} catch (MyEx e) {
			
			e.printStackTrace();
		}
		
	}

}

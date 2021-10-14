package com.lxisoft.director;

import java.util.*;
import java.util.Map.Entry;

import com.lxisoft.cast.Cast;

public class Director 
{
    Cast casting = new Cast();
    String directorName;
    Scanner scan = new Scanner(System.in);

    public void setCast(ArrayList<Entry<String, String>> cast)
    {
		System.out.print("Director Name		: ");
        directorName=scan.next();
        casting.setCast(cast);
    }
}

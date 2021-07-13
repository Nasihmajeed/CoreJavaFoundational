package com.lxisoft.about;
import java.util.*;
public enum Genere
{
	Comedy,Romantic,Thriller,Emotional;
	static Genere [] geners=Genere.values();
	public static Genere getGenere(int i)
	{
		return geners[i];
	}
	
}
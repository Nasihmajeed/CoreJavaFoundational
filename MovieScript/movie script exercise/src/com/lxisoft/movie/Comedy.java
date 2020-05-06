package com.lxisoft.movie;

public class Comedy extends Dialogue implements Comic {
	
	public static String movie="hang over";
	public static String writer="spillburg";
	
	public Dialogue[]com=new Dialogue[5];
	public Dialogue[] comedy()
	{
	for(int i=0;i<com.length;i++)
	{
		com[i]=new Dialogue();
	}
	com[0].dialogue="comedian 1: can i tell you a comedy";
	com[1].dialogue="comedian 2: no you cant";
	com[2].dialogue="comedian 1: i already said it";
	com[3].dialogue="comedian 2: i know !!!!!!!!";
	return com;
}

}

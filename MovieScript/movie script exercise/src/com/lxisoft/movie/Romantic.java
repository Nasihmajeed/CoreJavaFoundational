package com.lxisoft.movie;

public class Romantic extends Dialogue implements Romance{
	public static String movie="roja";
	public static String writer="mani";
	
	public Dialogue[]rom=new Dialogue[5];
	public Dialogue[] romantic()
	{
	for(int i=0;i<rom.length;i++)
	{
		rom[i]=new Dialogue();
	}
	rom[0].dialogue="hero: my love ....";
	rom[1].dialogue="heroine: yes love ....";
	rom[2].dialogue="hero: i love you";
	rom[3].dialogue="heroine: i love you too";
	return rom;
}
}

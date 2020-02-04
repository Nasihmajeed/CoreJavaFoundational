package com.lxisoft.test;
import com.lxisoft.forest.Forest;
public class Tdd
{
	public static void main(String[] args) 
	{
		System.out.println("*****ANIMAL GAME*****");
		System.out.println("----------------------");

		Forest forest = new Forest();
		forest.createForest();
	}
}
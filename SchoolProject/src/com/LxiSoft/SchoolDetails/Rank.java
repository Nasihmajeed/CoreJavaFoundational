package com.LxiSoft.SchoolDetails;
import java.util.*;
public class Rank{
	int mark;
	public void getMarks(){
		Scanner s = new Scanner(System.in);
		System.out.println("\t---->Enter Mark Details<----\t");
		System.out.println("Enter the Mark ");
		this.mark = s.nextInt();
		s.nextLine();
	}
	public void printMarks(){
		System.out.println("\t---->Mark Details<----\t");
		System.out.println("Marks\t: "+this.mark);
		
	}
}
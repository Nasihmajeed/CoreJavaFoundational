package com.LxiSoft.SchoolDetails;
import java.util.*;
public class Marks{
	int mark;
	int total = 0;
	public void getMarks(){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Mark ");
		this.mark = s.nextInt();
		s.nextLine();
	}
	public void printMarks(){
		
		System.out.println("Marks\t: "+this.mark);	
	}
}
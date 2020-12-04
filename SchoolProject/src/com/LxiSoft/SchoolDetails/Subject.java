package com.LxiSoft.SchoolDetails;
import java.util.*;
public class Subject{
	String subject;/* = "Maths";
	String subject2 = "Science";
	String subject3 = "English";*/
	int mark;
	//int total=0;
	//int rank;
	public void getMarks(){
		//for(int i=0; i<3; i++){
		Scanner s = new Scanner(System.in);
		//System.out.println("Enter the  Subject");
		//this.subject = s.nextLine();
		System.out.println("Enter the Mark of  Subject");
		this.mark = s.nextInt();
		s.nextLine();
		//}
	}
	
	public void printMarks(){
		//int total = 0;
		//for(int i=0; i<3; i++){
		System.out.println("Subject \t: "+this.subject);
		System.out.println("Mark    \t: "+this.mark);
		//total = total+this.mark;
		//}
		//System.out.println("Total   \t: "+total);
	}
}
	


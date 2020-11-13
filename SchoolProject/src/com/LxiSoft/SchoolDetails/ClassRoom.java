package com.LxiSoft.SchoolDetails;
import java.util.*;
public class ClassRoom{
	String division;
	int standard;
	Scanner s = new Scanner(System.in);
	Teacher teacher = new Teacher();
	Student student = new Student();
	ClassRoom[] c;
	public void classDetails(int n){
		c = new ClassRoom[n];
		for(int i=0; i<n; i++){
			c[i] = new ClassRoom();
			System.out.println("Enter which standard ");
		    c[i].standard = s.nextInt();
		    s.nextLine();
		    System.out.println("Enter the division ");
		    c[i].division = s.nextLine();
		    teacher.teacherDetails();
		    student.studentDetails();
		}
	}
}
package com.School;

public class TDD {

    public static void main(String[] args) {
		School s = new School();
           
		for (int i = 0; i < 3; i++) {
			ClassRoom c = new ClassRoom("CLASSROOM",i+1,"A");
			s.c[i] = c;
           
           
                 // Teacher t = new Teacher("TEACHER","SUBJECT","phoneNumber");
                //  s.c[i].t[i]=t;
           
           }
		
		s.inputDetails();
		s.printDetails();

	}

}
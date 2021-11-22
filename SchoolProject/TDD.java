package com.School;

public class TDD {

	public static void main(String[] args) {
		School s = new School();
		for (int i = 0; i < 3; i++) {
			ClassRoom c = new ClassRoom();
			s.c[i] = c;
		}
		s.inputDetails();
		s.printDetails();
		

	}

}

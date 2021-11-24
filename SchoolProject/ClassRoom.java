package com.school;

public class ClassRoom {

	int seats;
	String standard;
	String division;
	Student[] students;
	Teacher classTeacher;

	ClassRoom(int seats, String standard, String division, Student[] students, Teacher classTeacher) {
		this.seats = seats;
		this.standard = standard;
		this.division = division;
		this.students = students;
		this.classTeacher = classTeacher;
	}

	public void printDetails() {
		System.out.println(standard + " " + division + "\n====================================");
		System.out.println("Number of seats: " + seats);
		System.out.println("\nClass Teacher\n-----------------------");
		classTeacher.printDetails();
		System.out.println("\nStudents\n-----------------------");
		for (int i = 0; i < students.length; i++) {
			students[i].printDetails();
		}
		System.out.println();
	}
}

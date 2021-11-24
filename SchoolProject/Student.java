package com.school;

public class Student {
	String name;
	int rollNo;

	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public void printDetails() {
		System.out.println("Student Name: " + name + "\nRoll Number: " + rollNo);
	}
}

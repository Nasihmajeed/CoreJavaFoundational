package com.school;

public class Teacher {
	String name;
	String subject;
	long phoneNo;

	public Teacher(String name, String subject, long phoneNo) {
		this.name = name;
		this.subject = subject;
		this.phoneNo = phoneNo;
	}

	public void printDetails() {
		System.out.println("Teacher Name: " + name + "\nSubject: " + subject + "\nPhone Number: " + phoneNo);
	}

}
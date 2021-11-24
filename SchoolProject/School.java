package com.school;

public class School {
	String name;
	String address;
	long phoneNo;
	ClassRoom classRooms[];

	public void inputDetails() {
		name = "LXI SCHOOL";
		address = "GANDHI SEVA BHAVAN,PATHIRIPALA,PALAKKAD,678507";
		phoneNo = 9876543210l;
	}

	public void printDetails() {
		System.out.println("School Name: " + name + "\nSchool Address: " + address + "\nPhone Number: " + phoneNo + "\n");
		for (int i = 0; i < classRooms.length; i++) {
			classRooms[i].printDetails();
		}
	}
}
